package UI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class player extends JFrame {
    private JLabel backgroundImage;
    private JTextField playersum;
    private JButton button;
    private JButton button2p;
    private JButton button3p;
    private JButton button4p;

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

        button2p = new JButton();
        ImageIcon Icon2p = new ImageIcon("src/img/2P.png");
        button2p.setIcon(Icon2p);
        button2p.setBounds(400, 300, Icon2p.getIconWidth(), Icon2p.getIconHeight());
        button2p.setOpaque(false);
        button2p.setContentAreaFilled(false);
        button2p.setBorderPainted(false);
        backgroundImage.add(button2p);

        button3p = new JButton();
        ImageIcon Icon3p = new ImageIcon("src/img/3P.png");
        button3p.setIcon(Icon3p);
        button3p.setBounds(685, 300, Icon3p.getIconWidth(), Icon3p.getIconHeight());
        button3p.setOpaque(false);
        button3p.setContentAreaFilled(false);
        button3p.setBorderPainted(false);
        backgroundImage.add(button3p);

        button4p = new JButton();
        ImageIcon Icon4p = new ImageIcon("src/img/4P.png");
        button4p.setIcon(Icon4p);
        button4p.setBounds(970, 300, Icon4p.getIconWidth(), Icon4p.getIconHeight());
        button4p.setOpaque(false);
        button4p.setContentAreaFilled(false);
        button4p.setBorderPainted(false);
        backgroundImage.add(button4p);

        button2p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Race_2();
            }
        });

        button3p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Race_3();
            }
        });

        button4p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Race_4();
            }
        });

        setVisible(true);
    }
}
