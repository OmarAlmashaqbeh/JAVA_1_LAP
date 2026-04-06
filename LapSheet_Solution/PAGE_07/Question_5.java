package LapSheet_Solution.PAGE_07;
import java.util.Scanner;
public class Question_5 {
    public static char getGrade(int mark) {
        switch(mark / 10) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            case 5:
                return 'E';
        }
        return 'F';
    }
    public static double calculateAverage(double sum, int num) {
        double average = sum/num;
        return average;
    }
    public static String getResult(int mark) {
        return (mark >= 50)? "PASS" : "FAIL";
    }
    public static void printResult(int mark) {
        if (getResult(mark).equals("PASS")) {
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
        while (true) {
            System.out.println("Enter a mark or enter -1 to stop");
            mark = s.nextInt();
            if (mark == -1) {
                break;
            }
            System.out.println(getGrade(mark));
            printResult(mark);
            sum += mark;
            num++;
        }
        if (num == 0) {
            System.out.println("No marks entered.");
        }
        else {
            System.out.println("The average of entered marks = " + calculateAverage(sum, num));
        }
    }
}