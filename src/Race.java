import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Race extends JFrame {
    private JLabel backLabel;
    private JLabel charLab;

    private JTextArea alert;
    private  JButton button;
    private  JButton button1;
    private  JTextField text;
    private  int charX;
    private double kec=2;

    Mobil mobil = new Mobil();
    public Race(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImage = new ImageIcon("src/img/wallp.jpg");
        backLabel = new JLabel((backImage));
        backLabel.setBounds(0,0,1440, 700);
        add(backLabel);

        ImageIcon charImage = new ImageIcon(Mobil.getGambar());
        charLab = new JLabel(charImage);
        setCharX(0);
        charLab.setBounds(0,520, 107,50);
        backLabel.add(charLab);

        button = new JButton("Mulai");
        button.setBounds(1300, 600, 100,30);
        backLabel.add(button);
        setUpButtonListeners();

        text = new JTextField();
        text.setBounds(1000, 600, 100, 30);
        backLabel.add(text);

        button1 = new JButton("GO");
        button1.setBounds(1120, 600, 70,30);
        backLabel.add(button1);
        setUpSpeed();

        alert = new JTextArea();
        alert.setBounds(1300, 30, 130, 20);
        backLabel.add(alert);

        JTextArea speedMax = new JTextArea();
        speedMax.setBounds(700, 30, 200, 20);
        speedMax.setText("kecepatan maksimal 130 km/jam");
        backLabel.add(speedMax);

        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }

    public void setCharX(int charX) {
        this.charX = charX;
    }

    public int getCharX() {
        return charX;
    }

    public void setUpButtonListeners(){
        ActionListener buttonListeners = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run();
            }
        };
        button.addActionListener(buttonListeners);
    }

    public void run(){
        Timer timer = new Timer(20, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (charX<1440){
                    charX+=kec;
                    charLab.setBounds(charX,520, 107,50);
                }
                repaint();
            }
        });
        timer.start();
    };

    public void setUpSpeed(){
        ActionListener btnSpeed = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double add = Double.parseDouble(text.getText());
                if (mobil.tambahKecepatan(add)){
                    setKec(mobil.getKecepatan()/20);
                } else{
                    alert.setText("The Speed is Maximum");
                };
            }
        };
        button1.addActionListener(btnSpeed);
    }

    public void setKec(double kec) {
        this.kec = kec;
    }
}