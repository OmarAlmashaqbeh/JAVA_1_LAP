package LapSheet_Solution.PAGE_03;
import java.util.Scanner;
import java.math.*;
public class Question_4_consol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("Enter the radius of the circle:");
        double r = s.nextDouble();
        double area = pi*Math.pow(r, 2.0);
        System.out.println("The area of the circle is: " + area);
    }   
}