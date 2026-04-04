package LapSheet_Solution.PAGE_05;
import javax.swing.JOptionPane;
public class Question_3 {
    public static void main(String[] args) {
        int num1, num2;
        String numbers = " ";
        String str = JOptionPane.showInputDialog("Enter the first number:");
        num1 = Integer.parseInt(str);
        str = JOptionPane.showInputDialog("Enter the second number:");
        num2 = Integer.parseInt(str);
        if (num1 > num2) {
            int x = num1;
            num1 = num2;
            num2 = x;
        }
        for (int i = num1; i <= num2; i++) {
            if (i%2 != 0 && i%5 == 0) {
                numbers += i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "Odd numbers between " + num1 + " and " + num2 + " that are divisible by 5:" + numbers);
    }
}