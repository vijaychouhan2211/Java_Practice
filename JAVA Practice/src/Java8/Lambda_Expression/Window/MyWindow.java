package Java8.Lambda_Expression.Window;

import javax.swing.*;
import java.awt.*;

public class MyWindow {
    public static void main(String[] args) {

        //window: object JFrame
        JFrame frame = new JFrame("Custom window");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        //create button and JFrame
        JButton button = new JButton("Press Me");

        button.addActionListener (e -> {
                System.out.println("Button pressed");
                JOptionPane.showMessageDialog(null, "Button pressed");
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
