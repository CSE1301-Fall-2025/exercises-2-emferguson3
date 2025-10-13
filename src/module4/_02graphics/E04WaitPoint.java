package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E04WaitPoint {

    /*
     * Exercise: Use the StdDraw API to complete the code one
     * step at a time.
     */
    public static void main(String[] args) {
        // wait for the mouse to be pressed
        while (!StdDraw.isMousePressed()) {
            // busy-wait; could sleep a tiny bit, but StdDraw programs often busy-wait
            // (avoid heavy work here)
        }

        // here, the mouse has been pressed

        // wait for the mouse to be released
        while (StdDraw.isMousePressed()) {
            // still pressed, wait
        }

        // here the mouse is released
        // capture the mouse location at release
        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();

        // draw a point at the location of the mouse
        StdDraw.setPenRadius(0.02);   // make the point visible
        StdDraw.point(x, y);
        StdDraw.setPenRadius();       // reset to default

        // here, wait until a 'q' (or 'Q') has been typed
        while (true) {
            if (StdDraw.hasNextKeyTyped()) {
                char c = StdDraw.nextKeyTyped();
                if (c == 'q' || c == 'Q') {
                    break;
                }
            }
            // optional small pause to reduce busy-wait CPU (not required)
            // try { Thread.sleep(10); } catch (InterruptedException e) {}
        }

        StdDraw.text(0.5, 0.5, "Farewell!");
    }

}
