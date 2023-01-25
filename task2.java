package test;
import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;;


public class task2 {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int year; 
        System.out.println("Enter the yaer: ");
        year  = vvod.nextInt();
        if (year % 400 == 0 && year % 100 == 0) 
        System.out.println("Количество дней в году 366");
        else if (year % 4 == 0 && year % 100 > 0)
        System.out.println("Количество дней в году 366");
        else if (year % 100 == 0)
        System.out.println("Количество дней в году 365");
        else 
        System.out.println("Количество дней в году 365");



    }

}
