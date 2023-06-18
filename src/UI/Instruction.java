package UI;

import Core.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Instruction extends JFrame {
    private JLabel background;
    private JButton button;

    public Instruction(){
        setTitle("Login Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImg = new ImageIcon("src/img/instruction.png");
        background = new JLabel(backImg);
        background.setBounds(0, 0, 1440, 700);
        add(background);

        button = new JButton();
        ImageIcon buttonIcon = new ImageIcon("src/img/nextbutton.png");
        button.setIcon(buttonIcon);
        button.setBounds(1150, 520, buttonIcon.getIconWidth(), buttonIcon.getIconHeight());
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        background.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new player();
            }
        });

        setVisible(true);
    }
}
