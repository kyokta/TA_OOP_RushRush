package UI;

import Vehicles.Bus.Bus_4;
import Vehicles.Kendaraan;
import Vehicles.Mobil.Mobil_3;
import Vehicles.Motor.Motor_2;
import Vehicles.Truk.Truk_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Race_4 extends JFrame{
    private JLabel backLabel, charLab1,charLab2, charLab3, charLab4;
    private  int charX1, charX2, charX3, charX4;
    private double kec=2;
    public static ArrayList<Integer> gorace = new ArrayList<>();
    private Kendaraan kend1, kend2, kend3, kend4;

    public Race_4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImage = new ImageIcon("src/img/wallp-2.png");
        backLabel = new JLabel((backImage));
        backLabel.setBounds(0,0,1440, 730);
        add(backLabel);

        ParentRace.addDict();

        this.kend1 = ParentRace.dict.get(gorace.get(0));
        this.kend2 = ParentRace.dict.get(gorace.get(1));
        this.kend3 = ParentRace.dict.get(gorace.get(2));
        this.kend4 = ParentRace.dict.get(gorace.get(3));

        ImageIcon charImage = new ImageIcon(kend1.getGambar());
        charLab1 = new JLabel(charImage);
        setCharX1(0);
        charLab1.setBounds(0, kend1.getY(), 107,50);
        backLabel.add(charLab1);

        ImageIcon charImage2 = new ImageIcon(kend2.getGambar());
        charLab2 = new JLabel(charImage2);
        setCharX2(0);
        charLab2.setBounds(0, kend2.getY(), 107,50);
        backLabel.add(charLab2);

        ImageIcon charImage3 = new ImageIcon(kend3.getGambar());
        charLab3 = new JLabel(charImage3);
        setCharX3(0);
        charLab3.setBounds(0, kend3.getY(), 107,50);
        backLabel.add(charLab3);

        ImageIcon charImage4 = new ImageIcon(kend4.getGambar());
        charLab4 = new JLabel(charImage4);
        setCharX4(0);
        charLab4.setBounds(0, kend4.getY(), 107,50);
        backLabel.add(charLab4);

        setUpSpeed();

        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }
    public void setCharX1(int charX1) {
        this.charX1= charX1;
    }
    public void setCharX2(int charX2) {this.charX2 = charX2;}
    public void setCharX3(int charX3) {this.charX3 = charX3;}
    public void setCharX4(int charX4) {this.charX4 = charX4;}

    public void run(){
        Timer timer = new Timer(20, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (charX1<1440 || charX2<1440 || charX3<1440 || charX4<1440){
                    charX1+=kend1.getKec();
                    charLab1.setBounds(charX1, kend1.getY(), 107,50);
                    charX2+=kend2.getKec();
                    charLab2.setBounds(charX2, kend2.getY(), 107,50);
                    charX3+=kend3.getKec();
                    charLab3.setBounds(charX3, kend3.getY(), 107,50);
                    charX4+=kend4.getKec();
                    charLab4.setBounds(charX4, kend4.getY(), 107,50);
                }
                repaint();
            }
        });
        timer.start();
    };
    public void setUpSpeed(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode){
                    case KeyEvent.VK_A:
                        kend1.upKec();
                        break;
                    case KeyEvent.VK_Q:
                        kend1.downKec();
                        break;
                    case KeyEvent.VK_C:
                        kend2.upKec();
                        break;
                    case KeyEvent.VK_X:
                        kend2.downKec();
                        break;
                    case KeyEvent.VK_M:
                        kend3.upKec();
                        break;
                    case KeyEvent.VK_N:
                        kend3.downKec();
                        break;
                    case KeyEvent.VK_P:
                        kend4.upKec();
                        break;
                    case KeyEvent.VK_L:
                        kend4.downKec();
                        break;
                    default:
                        break;
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        run();
    }
}
