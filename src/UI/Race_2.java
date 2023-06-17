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

public class Race_2 extends JFrame{

    private JLabel backLabel, charLabBus,charLabTruk, charLabMotor, charLabMobil;
    private  int charXBus, charXTruk, charXMotor, charXMobil;
    private double kec=2;
    private static ArrayList<Kendaraan> gorace = new ArrayList<>();

    Motor_2 motor = new Motor_2();
    Mobil_3 mobil = new Mobil_3();

    public Race_2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImage = new ImageIcon("src/img/wallp-2.png");
        backLabel = new JLabel((backImage));
        backLabel.setBounds(0,0,1440, 730);
        add(backLabel);

        ImageIcon charImage3 = new ImageIcon(motor.getGambar());
        charLabMotor = new JLabel(charImage3);
        setCharXMotor(0);
        charLabMotor.setBounds(0, motor.getY(), 107,50);
        backLabel.add(charLabMotor);

        ImageIcon charImage4 = new ImageIcon(mobil.getGambar());
        charLabMobil = new JLabel(charImage4);
        setCharXMobil(0);
        charLabMobil.setBounds(0, mobil.getY(), 107,50);
        backLabel.add(charLabMobil);

        setUpSpeed();

        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }
    public void setCharXBus(int charXBus) {
        this.charXBus= charXBus;
    }
    public void setCharX2Truk(int charXTruk) {this.charXTruk = charXTruk;}
    public void setCharXMotor(int charXMotor) {
        this.charXMotor = charXMotor;
    }
    public void setCharXMobil(int charXMobil) {
        this.charXMobil = charXMobil;
    }

    public void run(){
        Timer timer = new Timer(20, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (charXBus<1440 || charXTruk<1440 || charXMotor<1440){
                    charXMotor+=motor.getKec();
                    charLabMotor.setBounds(charXMotor, motor.getY(), 107,50);
                    charXMobil+=mobil.getKec();
                    charLabMobil.setBounds(charXMobil, mobil.getY(), 107,50);
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
                    case KeyEvent.VK_M:
                        motor.upKec();
                        break;
                    case KeyEvent.VK_N:
                        motor.downKec();
                        break;
                    case KeyEvent.VK_P:
                        mobil.upKec();
                        break;
                    case KeyEvent.VK_L:
                        mobil.downKec();
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
