package LabSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_1_Dialog {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Enter the mark:");
        double mark = Double.parseDouble(str);
        if (mark >= 50) {
            JOptionPane.showMessageDialog(null, "PASS");
        }
        else {
            JOptionPane.showMessageDialog(null, "FAIL");
        }
    }
}
