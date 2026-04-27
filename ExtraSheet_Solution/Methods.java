package ExtraSheet_Solution;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter the number:");
        num = s.nextInt();
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum is " + sum);
    }
}
