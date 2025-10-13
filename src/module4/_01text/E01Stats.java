package module4._01text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class E01Stats {

    /*
     * Exercise: The below code reads in a series of doubles from a file and prints them.
     * Modify this code to find the maximum, minimum, average, and count of the values
     * read in from the file.
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // Code for setting up Scanner with a file
        JFileChooser chooser = new JFileChooser("datafiles");
        chooser.showOpenDialog(null);
        File f = new File(chooser.getSelectedFile().getPath());
        Scanner in = new Scanner(f); // making Scanner with a File

        // Initialize statistics variables
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        int count = 0;

        // Read all doubles from the file
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            System.out.println(value); // Optional: print each value

            // Update stats
            if (value > max) max = value;
            if (value < min) min = value;
            sum += value;
            count++;
        }

        // Avoid division by zero
        if (count > 0) {
            double avg = sum / count;
            System.out.println("\nCount: " + count);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Average: " + avg);
        } else {
            System.out.println("No numbers found in file.");
        }

        in.close();
    }
}
