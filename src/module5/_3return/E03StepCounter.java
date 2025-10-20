package module5._3return;

public class E03StepCounter {

    // add convertToMiles method here
    public static double convertToMiles(int steps) {
        // 2000 steps = 1 mile
        return steps / 2000.0;
    }

    public static void main(String[] args) {
        System.out.println("500 steps is equal to " + convertToMiles(500) + " miles");
        System.out.println("2000 steps is equal to " + convertToMiles(2000) + " miles");
        System.out.println("3000 steps is equal to " + convertToMiles(3000) + " miles");
    }
}