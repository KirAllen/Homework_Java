package test;
import java.util.Arrays;


public class task1 {
    public static void main(String[] args) {

    int[] array = {11,52,69,74,92,43,35,5,8,63,2,3};
    
    Arrays.sort(array);

    System.out.println("Min element is " + array[0]);
    System.out.println("Max element is " + array[array.length-1]);

    }
}
