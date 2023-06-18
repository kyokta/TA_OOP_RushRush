package UI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Core.Model;

public class LoginPage extends JFrame {
    private JLabel backgroundImage;
    private JTextField username;
    private JPasswordField password;
    private JButton button;

    public LoginPage(){
        setTitle("Login Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImg = new ImageIcon("src/img/wall_login_page.png");
        backgroundImage = new JLabel(backImg);
        backgroundImage.setBounds(0, 0, 1920, 700);
        add(backgroundImage);

        username = new JTextField();
        username.setBounds(540, 290, 450, 40);
        backgroundImage.add(username);

        password = new JPasswordField();
        password.setBounds(540, 380, 450, 40);
        backgroundImage.add(password);


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
                Model pass = new Model();
                String pass_now = new String(password.getPassword());
                String pass_cur = pass.getPassword(username.getText());
                if (pass_now.equals(pass_cur)) {
                    dispose();
                    new Instruction();
                } else {
                    JOptionPane.showMessageDialog(null, "Login gagal! Silakan coba lagi.");
                }
            }
        });

        setVisible(true);
    }
}
