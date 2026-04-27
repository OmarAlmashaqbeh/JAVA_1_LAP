package ExtraSheet_Solution;
import javax.swing.JOptionPane;
public class Selection_Statements {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Enter a single character to determine if it is a vowel or a consonant");
        if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                JOptionPane.showMessageDialog(null, "The character is a vowel.");
            }
            else {
                JOptionPane.showMessageDialog(null, "The character is a consonant.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "error message", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}