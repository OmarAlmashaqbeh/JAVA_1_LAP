package LapSheet_Solution.PAGE_03;
import javax.swing.JOptionPane;
import java.math.*;
public class Question_4_Dialog {
    public static void main(String[] args) {
        String str = javax.swing.JOptionPane.showInputDialog(null, "Enter the radius of the circle:");
        final double pi = 3.14;
        double r = Double.parseDouble(str);
        double area = pi*Math.pow(r, 2.0);
        javax.swing.JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);
    }
}