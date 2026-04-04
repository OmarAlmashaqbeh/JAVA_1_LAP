package EXTRA;
import java.util.Scanner;
public class ex_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 1, count = 0;
        boolean isPrime = true;
        while (true) {
            isPrime = true;
            num = s.nextInt();
            if (num < 1) {
                break;
            }
            if (num < 2) {
                isPrime = false;
            }
            else {
                for (int i = 2; i*i <= num; i++) {
                    if (num%i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        System.out.println("Total prime numbers entered: "+count);
    }
}