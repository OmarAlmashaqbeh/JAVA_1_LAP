package LabSheet_Solution.PAGE_05;
import javax.swing.JOptionPane;
public class Question_2 {
    public static void main(String[] args) {
        String even=" ", odd=" ";
        for (int i=1; i<=50; i++) {
            if (i%2 == 0) {
                even+=i + " ";
            }
            else {
                odd+=i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "Even numbers from 1 to 50:" + even);
        JOptionPane.showMessageDialog(null, "Odd numbers from 1 to 50:" + odd);
    }
}