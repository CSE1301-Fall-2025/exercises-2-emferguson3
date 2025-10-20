package module5._5exercises;

public class minMax {
public static void main(String [] args){
    double [] array = new double[5];
    for(int i = 0; i<array.length; i++){
        array[i] = Math.random();
    }
    System.out.println(max(array));
}
    public static double max(double [] array){
        double max = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]>max)
            max = array[i];
        }
        return max;
    }
}
