import javax.swing.*;

public class tester {
    public static void main(String[] args) {
        savingsAccount account = new savingsAccount();
        savingsAccount account2 = new savingsAccount();

        JOptionPane.showMessageDialog(null,account.toString());
        JOptionPane.showMessageDialog(null,account2.toString());

    }
}
