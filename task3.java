package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task3 {
    public static void main(String[] args) {

        int[] array = {3,2,2,3};
        int val = 3;
        int tmp = 0;
        System.out.println(array);
        for (int i = 1; i <= array.length-1; i++)
        {
            if (array[i-1] == val)
            tmp = array[i-1];
            array[i-1] = array[i];
            array[i] = tmp;
            System.out.println(array);
        }
    
        }
}
