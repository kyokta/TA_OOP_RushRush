package UI;

import Vehicles.Bus.Bus_4;
import Vehicles.Kendaraan;
import Vehicles.Mobil.Mobil_1;
import Vehicles.Mobil.Mobil_2;
import Vehicles.Mobil.Mobil_3;
import Vehicles.Motor.Motor_1;
import Vehicles.Motor.Motor_2;
import Vehicles.Truk.Truk_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Race_2 extends JFrame{
    private JLabel backLabel, charLab1, charLab2;
    private  int charX1, charX2;
    public static ArrayList<Integer> gorace = new ArrayList<>();
    private Kendaraan kend1;
    private Kendaraan kend2;


    public Race_2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ParentRace.addDict();

        this.kend1 = ParentRace.dict.get(gorace.get(0));
        this.kend2 = ParentRace.dict.get(gorace.get(1));

        ImageIcon backImage = new ImageIcon("src/img/wallp-2.png");
        backLabel = new JLabel((backImage));
        backLabel.setBounds(0,0,1440, 730);
        add(backLabel);

        ImageIcon charImage3 = new ImageIcon(kend1.getGambar());
        charLab1 = new JLabel(charImage3);
        setCharX1(0);
        charLab1.setBounds(0, kend1.getY(), 107,50);
        backLabel.add(charLab1);

        ImageIcon charImage4 = new ImageIcon(kend2.getGambar());
        charLab2 = new JLabel(charImage4);
        setCharX2(0);
        charLab2.setBounds(0, kend2.getY(), 107,50);
        backLabel.add(charLab2);

        setUpSpeed();

        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }
    public void setCharX1(int charXMotor) {
        this.charX1= charXMotor;
    }
    public void setCharX2(int charXMobil) {
        this.charX1 = charXMobil;
    }

    public void run(){
        Timer timer = new Timer(20, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (charX1<1440 || charX2<1440){
                    charX1+=kend1.getKec();
                    charLab1.setBounds(charX1, kend1.getY(), 107,50);
                    charX2+=kend2.getKec();
                    charLab2.setBounds(charX2, kend2.getY(), 107,50);
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
