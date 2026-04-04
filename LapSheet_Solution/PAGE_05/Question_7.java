package LapSheet_Solution.PAGE_05;
import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=0, mark;
        double average, sum=0;
        System.out.println("Enter the marks");
        mark = s.nextInt();
        while (mark >= 0) {
            sum += mark;
            num++;
            System.out.println("Enter a mark or enter any negative value to stop");
            mark = s.nextInt();
        }
        if (num > 0) {
            average = sum / num;
            System.out.println("The average is " + average);
        } else {
            System.out.println("No marks were entered.");
        }
    }
}