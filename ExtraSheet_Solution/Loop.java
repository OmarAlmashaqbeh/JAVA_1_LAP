package ExtraSheet_Solution;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of t:");
        int t = s.nextInt();
        int num1 = 1, num2 = 1, next = 1;
            System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <=t; i++) {
            next = num1 + num2;
            System.out.print(next + " ");
            num1 = num2;
            num2 = next;
        }
        System.out.println("\n" + t + "th value of series is: " + (next));
    }
}