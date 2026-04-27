package LabSheet_Solution.PAGE_05;
import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println(num+" is not a prime number");
        }
    }
}