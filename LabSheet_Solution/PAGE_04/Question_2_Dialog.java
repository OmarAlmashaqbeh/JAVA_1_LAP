package LabSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_2_Dialog {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Enter a number:");
        int num = Integer.parseInt(str);
        if (num >= 0) {
            if (num%2 == 0) {
                JOptionPane.showMessageDialog(null, num + " is positive and even");
            }
            else {
                JOptionPane.showMessageDialog(null, num + " is positive and odd");
            }
        }
        else {
            if (num%2 == 0) {
                JOptionPane.showMessageDialog(null, num + " is negative and even");
            }
            else {
                JOptionPane.showMessageDialog(null, num + " is negative and odd");
            }
        }
    }
}