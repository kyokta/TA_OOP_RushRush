package UI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class player extends JFrame {
    private JLabel backgroundImage;
    private JTextField playersum;
    private JButton button;

    public player(){
        setTitle("PlayerSum Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImg = new ImageIcon("src/img/wall-sumplayer.png");
        backgroundImage = new JLabel(backImg);
        backgroundImage.setBounds(0, 0, 1920, 700);
        add(backgroundImage);

        playersum = new JTextField();
        playersum.setBounds(540, 290, 450, 40);
        backgroundImage.add(playersum);


        button = new JButton();
        ImageIcon buttonIcon = new ImageIcon("src/img/play-button.png");
        button.setIcon(buttonIcon);
        button.setBounds(650, 450, buttonIcon.getIconWidth(), buttonIcon.getIconHeight());
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        backgroundImage.add(button);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Race();
            }
        });

        setVisible(true);
    }
}
