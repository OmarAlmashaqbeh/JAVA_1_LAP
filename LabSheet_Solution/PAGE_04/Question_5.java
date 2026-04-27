package LabSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_5 {
    public static void main(String[] args) {
        int num1, num2, ch;
        String str1 = JOptionPane.showInputDialog(null, "Enter the first number");
        num1 = Integer.parseInt(str1);
        String str2 = JOptionPane.showInputDialog(null, "Enter the second number");
        num2 = Integer.parseInt(str2);
        String str3 = JOptionPane.showInputDialog(null, "Enter the mathematical operation");
        ch = str3.charAt(0);
        switch (ch) {
            case '+':
                JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + ((double) num1 / num2));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                }
                break;
                case '%':
                if (num2 != 0) {
                    JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + (num1 % num2));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                }
            default:
                JOptionPane.showMessageDialog(null, "Invalid operation");
        }
    }
}