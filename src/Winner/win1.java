package Winner;

import UI.Carousel.CarouselPage;
import UI.player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class win1 extends JFrame {
    private JLabel background;
    private JButton button;

    public win1(){
        setTitle("Winner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImg = new ImageIcon("src/img/player 1.png");
        background = new JLabel(backImg);
        background.setBounds(0, 0, 1920, 700);
        add(background);

        button = new JButton();
        ImageIcon buttonIcon = new ImageIcon("src/img/OK.png");
        button.setIcon(buttonIcon);
        button.setBounds(730, 530, buttonIcon.getIconWidth(), buttonIcon.getIconHeight());
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


