package LapSheet_Solution.PAGE_03;
import java.util.Scanner;
public class Question_3_Consol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Fahrenheit, Celsius;
        System.out.println("Enter a value in Fahrenheit");
        Fahrenheit = s.nextDouble();
        Celsius =  (5.0/9.0) * (Fahrenheit - 32);
        System.out.println(Fahrenheit+" in Fahrenheit = "+Celsius+" in Celsius");
    }
}