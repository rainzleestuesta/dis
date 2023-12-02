package Folder;

import javax.swing.*;
import java.awt.*;

public class probabilityFunction extends JFrame {
    private JPanel cardPanel;
    private JButton btnNextPage;
    private JPanel panel1;
    private JPanel panel2;

    CardLayout cl = new CardLayout();
    public probabilityFunction() {
        cardPanel.setLayout(cl);
        btnNextPage.addActionListener(e -> onNext());


        cardPanel.add(panel1, "Card1");
        cardPanel.add(panel2, "Card2");
        cl.show(cardPanel, "LAYOUT");

        //WINDOW SETTINGS
        this.add(cardPanel);
        this.setContentPane(cardPanel);
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
        cl.show(cardPanel, "Card2");
    }

    public static void main(String[] args) {
        new probabilityFunction();
    }
}
