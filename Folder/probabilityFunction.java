package Folder;

import javax.swing.*;
import java.awt.event.*;

public class probabilityFunction extends JFrame {
    private JPanel contentPane;

    public probabilityFunction() {

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

    public static void main(String[] args) {
        new probabilityFunction();
    }
}
