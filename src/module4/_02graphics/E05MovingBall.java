package module4._02graphics;

import java.awt.Color;

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		double ballX = Math.random();
		double ballVelocity = Math.random()*0.005;
		double ballY = Math.random();
		double ballYVelocity = 0.005;

		double playerX = 0.5;
		double playerY = 0.5;
		double playerSpeed = 0.01;

		long lastPointGiven = System.currentTimeMillis();
		
		int score = 0;

		StdDraw.setPenRadius(0.05);
		
		//infinite!
		while (true) {
			
			//Clear the canvas
			StdDraw.clear();
			
			//Update the ball position (of all moving objects)
			ballX = ballX + ballVelocity;
			ballY = ballY + ballYVelocity;
			if(ballX > 1 || ballX <0) { //too far right or left
				ballVelocity = -ballVelocity; //bounce
			} 
			if(ballY > 1 || ballY <0) { //too far right or left
				ballYVelocity = -ballYVelocity; //bounce
			} 
			if(StdDraw.isKeyPressed(KeyEvent.VK_W)){ //up
				playerY += playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_S)){ //up
				playerY -= playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_A)){ //up
				playerX -= playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_D)){ //up
				playerX += playerSpeed;
			}

			//draw on canvas and also pause
			StdDraw.setPenColor(Color.RED);
			StdDraw.point(ballX, ballY);
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.point(playerX, playerY);
			StdDraw.text(0.5,0.1,"Score: " + score);
			//pause to make the animation smooth
			
			StdDraw.show();
			StdDraw.pause(10); //10 milliseconds

			long now = System.currentTimeMillis();
			if(now - lastPointGiven>1000){//one second elapsed
				score++;
				lastPointGiven = now;
			}

			double distance = Math.sqrt(Math.pow(playerX - ballX,2)+Math.pow(playerY-ballY,2));		
			if(distance <0.05) { //collision
				playerX = 0.5;
				playerY = 0.5;
				score = 0;

			}	
		}
	}
}
