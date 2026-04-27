package LabSheet_Solution.PAGE_03;
import javax.swing.JOptionPane;
public class Question_2_Dialog {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Enter the character");
        char ch = str.charAt(0);
        JOptionPane.showMessageDialog(null, "The Ascii code of \'"+(ch)+"\' is "+(int)ch);
    }
}