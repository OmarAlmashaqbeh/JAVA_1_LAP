package LapSheet_Solution.PAGE_03;
import java.util.Scanner;
public class Question_2_Consol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = s.next().charAt(0);
        System.out.println("The Ascii code of \'"+(ch)+"\' is "+(int)ch);
    }
}