package LapSheet_Solution.PAGE_03;
import javax.swing.JOptionPane;
public class Question_3_Dialog {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Enter a value in Fahrenheit");
        double Fahrenheit = Double.parseDouble(str), Celsius;
        Celsius =  (5.0/9.0) * (Fahrenheit - 32);
        JOptionPane.showMessageDialog(null, Fahrenheit+" in Fahrenheit = "+Celsius+" in Celsius");
    }
}