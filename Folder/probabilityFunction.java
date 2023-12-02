package Folder;

import javax.swing.*;

public class probabilityFunction extends JFrame {
    private JPanel contentPane;
    private JButton btnNextPage;

    public probabilityFunction() {

        btnNextPage.addActionListener(e -> onNext());

        //WINDOW SETTINGS
        this.setContentPane(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Probability Calculator");
        this.setResizable(false);
        this.setSize(720,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void onNext() {

    }

    public static void main(String[] args) {
        new probabilityFunction();
    }
}
