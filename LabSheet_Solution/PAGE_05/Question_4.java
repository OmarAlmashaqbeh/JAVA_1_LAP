package LabSheet_Solution.PAGE_05;
import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = s.nextInt();
        long sum=0;
        for (int i=1; i <= n; i++) {
            sum += i*i*i;
        }
        System.out.println("The sum of cubes of first " + n + " natural numbers is: " + sum);
    }
}