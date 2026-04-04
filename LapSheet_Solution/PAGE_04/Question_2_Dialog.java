package LapSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_2_Dialog {
    public static void main(String[] args) {
        String str = javax.swing.JOptionPane.showInputDialog(null, "Enter a number:");
        int num = Integer.parseInt(str);
        if (num >= 0) {
            if (num%2 == 0) {
                javax.swing.JOptionPane.showMessageDialog(null, num + " is positive and even");
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(null, num + " is positive and odd");
            }
        }
        else {
            if (num%2 == 0) {
                javax.swing.JOptionPane.showMessageDialog(null, num + " is negative and even");
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(null, num + " is negative and odd");
            }
        }
    }
}