package LapSheet_Solution.PAGE_04;
import java.util.Scanner;
public class Question_1_Consol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mark");
        double mark=s.nextInt();
        if (mark >= 50) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
    }
}