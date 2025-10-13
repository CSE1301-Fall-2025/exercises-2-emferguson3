package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E06MouseFollower {

    /*
     * Exercise: Use the StdDraw API to draw a point on the canvas that follows the mouse. 
     * To do this, you will need to acquire the coordinates of the mouse, 
     * then draw something at that point.
     * 
     * Once you get it working, experiment with the timings to see
     * if you can get the image to "lag" behind the mouse.
     */
    public static void main(String[] args) {

        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(0.02);  // make the point big enough to see

        double x = 0.5;
        double y = 0.5;

        while (true) {
            StdDraw.clear();

            // --- Render one frame of animation ---
            // Get current mouse coordinates
            double targetX = StdDraw.mouseX();
            double targetY = StdDraw.mouseY();

            // Smoothly move toward the mouse position (creates a "lag" effect)
            double speed = 0.1; // smaller values = more lag
            x += speed * (targetX - x);
            y += speed * (targetY - y);

            // Draw the follower
            StdDraw.point(x, y);

            // --- End of frame ---
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}
