package com.java.basics.introduction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener {

    JButton btnRed, btnGreen, btnBlue;

    public ColorChanger() {
        super("Background Color Changer");

        btnRed = new JButton("Red");
        btnGreen = new JButton("Green");
        btnBlue = new JButton("Blue");

        btnRed.addActionListener(this);
        btnGreen.addActionListener(this);
        btnBlue.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(btnRed);
        panel.add(btnGreen);
        panel.add(btnBlue);

        add(panel, BorderLayout.SOUTH);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRed) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == btnGreen) {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == btnBlue) {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}
