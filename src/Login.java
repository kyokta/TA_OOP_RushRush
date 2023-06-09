import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel backgroundImage;
    //    private JTextField username;
//    private JPasswordField password;
    private JButton button;

    public Login(){
        setTitle("Login Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImg = new ImageIcon("src/img/wall-login.png");
        backgroundImage = new JLabel(backImg);
        backgroundImage.setBounds(0, 0, 1920, 700);
        add(backgroundImage);

        button = new JButton();
        ImageIcon buttonIcon = new ImageIcon("src/img/play-button.png");
        button.setIcon(buttonIcon);
        button.setBounds(100, 400, buttonIcon.getIconWidth(), buttonIcon.getIconHeight());
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
