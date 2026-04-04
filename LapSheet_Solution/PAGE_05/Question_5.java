package LapSheet_Solution.PAGE_05;
import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int n = s.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " = " + factorial);
    }
}