package LapSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_1_Dialog {
    public static void main(String[] args) {
        String str = javax.swing.JOptionPane.showInputDialog(null, "Enter the mark:");
        double mark = Double.parseDouble(str);
        if (mark >= 50) {
            javax.swing.JOptionPane.showMessageDialog(null, "PASS");
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(null, "FAIL");
        }
    }
}
