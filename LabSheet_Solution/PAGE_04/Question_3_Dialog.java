package LabSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_3_Dialog {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Enter a number:");
        int num = Integer.parseInt(str);
        if (num%5 == 0 && num%6 == 0) {
            JOptionPane.showMessageDialog(null, num +" is divisible by both 5 and 6");
        }
        else if (num%5 == 0 || num%6 == 0) {
            JOptionPane.showMessageDialog(null, num +" is divisible by either 5 or 6");
        }
        else if (num%5 == 0 ^ num%6 == 0) {
            JOptionPane.showMessageDialog(null, num +" is divisible by either 5 or 6 but not both");
        }
    }
}