package LabSheet_Solution.PAGE_07;
import java.util.Scanner;
public class Question_4 {
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
    public static void printResult(double average) {
        if (getResult(average).equals("PASS")) {
            System.out.println("Congratulations!!! You Passed!!!");
        }
        else {
            System.out.println("Sorry!!! You Failed!!!");
        }
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
            printResult(calculateAverage(sum, num));
        }
    }
}