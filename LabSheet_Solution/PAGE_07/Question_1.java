package LabSheet_Solution.PAGE_07;
import java.util.Scanner;
public class Question_1 {
    public static char getGrade(double mark) {
        switch((int)mark / 10) {
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
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mark:");
        double mark = s.nextDouble();
        System.out.println(getGrade(mark));
    }
}