package LapSheet_Solution.PAGE_04;
import java.util.Scanner;
public class Question_2_Consol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        if (num >= 0) {
            if (num%2 == 0) {
                System.out.println(num + " is positive and even");
            }
            else {
                System.out.println(num + " is positive and odd");
            }
        }
        else {
            if (num%2 == 0) {
                System.out.println(num + " is negative and even");
            }
            else {
                System.out.println(num + " is negative and odd");
            }
        }
    }
}