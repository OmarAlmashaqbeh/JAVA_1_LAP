package LabSheet_Solution.PAGE_08;
import javax.swing.JOptionPane;
public class Question_1 {
    public static int calculateRightAnswer(int num1, int num2) {
        return (num1 + num2);
    }
    public static boolean checkAnswer(int num1, int num2, int num3) {
        return (calculateRightAnswer(num1, num2) == num3);
    }
    public static void main(String[] args) {
        int num1 = 1 + (int)(10*Math.random());
        int num2 = 1 + (int)(10*Math.random());
        String str = JOptionPane.showInputDialog(null, "What is the result of "+ num1 + " + "+ num2 +" ???!!!!", "Guess??!!!", JOptionPane.QUESTION_MESSAGE);
        int num3 = Integer.parseInt(str);
        if (checkAnswer(num1, num2, num3)) {
            JOptionPane.showMessageDialog(null, "WOW!!! Right!!!", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry!!! Wrong", "Result", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Random Numbers: " + num1 + " and " + num2, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}