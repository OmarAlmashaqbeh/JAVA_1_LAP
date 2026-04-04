package LapSheet_Solution.PAGE_04;
import javax.swing.JOptionPane;
public class Question_4 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Enter the salary");
        double Bas_Salary = Double.parseDouble(str);
        double Net_Salary;
        if (Bas_Salary > 1000) {
            Net_Salary = Bas_Salary - Bas_Salary*0.18;
        }
        else if (500 <= Bas_Salary && Bas_Salary <= 1000) {
            Net_Salary = Bas_Salary - Bas_Salary*0.12;
        }
        else {
            Net_Salary = Bas_Salary - Bas_Salary*0.08;
        }
        JOptionPane.showMessageDialog(null, "Net Salary is: " + Net_Salary, "Net Salary", JOptionPane.PLAIN_MESSAGE);
    }
}