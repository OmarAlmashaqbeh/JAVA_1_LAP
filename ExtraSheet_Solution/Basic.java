package ExtraSheet_Solution;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = s.nextInt();
        int years = minutes / (365 * 24 * 60);
        int days = (minutes / (24 * 60)) % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}