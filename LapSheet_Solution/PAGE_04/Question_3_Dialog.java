package LapSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_3_Dialog {
    public static void main(String[] args) {
        String str = javax.swing.JOptionPane.showInputDialog(null, "Enter a number:");
        int num = Integer.parseInt(str);
        if (num%5 == 0 && num%6 == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, num +" is divisible by both 5 and 6");
        }
        else if (num%5 == 0 || num%6 == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, num +" is divisible by either 5 or 6");
        }
        else if (num%5 == 0 ^ num%6 == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, num +" is divisible by either 5 or 6 but not both");
        }
    }
}