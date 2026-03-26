package LapSheet_Solution.PAGE_04;
import java.util.Scanner;
public class Question_3_Consol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num%5 == 0 && num%6 == 0) {
            System.out.println(num +" is divisible by both 5 and 6");
        }
        else if (num%5 == 0 || num%6 == 0) {
            System.out.println(num +" is divisible by either 5 or 6");
        }
        else if (num%5 == 0 ^ num%6 == 0) {
            System.out.println(num +" is divisible by either 5 or 6 but not both");
        }
    }
}