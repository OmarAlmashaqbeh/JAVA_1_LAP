package LabSheet_Solution.PAGE_07;
import java.util.Scanner;
public class Question_3 {
    public static double calculateAverage(double sum, int num) {
        double average = sum/num;
        return average;
    }
    public static String getResult(double average) {
        if (average >= 50) {
            return "PASS";
        }
        return "FAIL";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mark, num = 0;
        double sum = 0;
        while(true) {
            System.out.println("Enter a mark or enter -1 to stop");
            mark = s.nextInt();
            if (mark == -1) {
                break;
            }
            sum += mark;
            num++;
        }
        if (num == 0) {
            System.out.println("No marks entered.");
        } else {
            System.out.println(getResult(calculateAverage(sum, num)));
        }
    }
}