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

//        String add = playersum.getText();
        setUpSpeed();
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (add=="2"){
//                    dispose();
//                    new Race_2();
//                } else if (add=="3") {
//                    dispose();
//                    new Race_3();
//                } else if (add=="4") {
//                    dispose();
//                    new Race_4();
//                }
//            }
//        });
        setVisible(true);
    }
    public void setUpSpeed(){
        ActionListener btnSpeed = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String add = playersum.getText();
                if (add.equals("2")){
                    dispose();




                    new Race_2();
                } else if (add.equals("3")) {
                    dispose();





                    new Race_3();
                } else if (add.equals("4")) {
                    dispose();
                    new Race_4();
                } else{
                    dispose();
                    new Race();
                }
            }
        };
        button.addActionListener(btnSpeed);
    }
}
