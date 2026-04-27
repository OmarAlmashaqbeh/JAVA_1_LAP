package ExtraSheet_Solution;
import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((j + 1) % 2);
                }
                else {
                    System.out.print(j % 2);
                }
            }
            System.out.print("\n");
        }
    }
}