package src.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame=new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());



        //button on frame
        JButton button=new JButton("CLick Me");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button clicked");
//                JOptionPane.showMessageDialog(null,"Button Clicked");
//            }
//        });

        button.addActionListener((ActionEvent e)->{
                System.out.println("Button clicked");
                JOptionPane.showMessageDialog(null,"Button Clicked");
            });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
