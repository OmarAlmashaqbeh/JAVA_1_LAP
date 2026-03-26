package LapSheet_Solution.PAGE_03;
import  java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the marks");
        int mark1 = s.nextInt();
        int mark2 = s.nextInt();
        int mark3 = s.nextInt();
        int avg = (mark1 + mark2 + mark3)/3;
        System.out.println("The average is: " + avg);
    }
}