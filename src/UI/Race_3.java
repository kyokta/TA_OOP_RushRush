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

public class Race_3 extends JFrame{
    private JLabel backLabel, charLabBus,charLabTruk, charLabMotor, charLabMobil;
    private  int charXBus, charXTruk, charXMotor, charXMobil;
    private double kec=2;
    private static ArrayList<Kendaraan> gorace = new ArrayList<>();
    Bus_4 bus = new Bus_4();
    Truk_1 truk = new Truk_1();
    Motor_2 motor = new Motor_2();

    public Race_3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backImage = new ImageIcon("src/img/wallp-2.png");
        backLabel = new JLabel((backImage));
        backLabel.setBounds(0,0,1440, 730);
        add(backLabel);

        ImageIcon charImage = new ImageIcon(bus.getGambar());
        charLabBus = new JLabel(charImage);
        setCharXBus(0);
        charLabBus.setBounds(0, bus.getY(), 107,50);
        backLabel.add(charLabBus);

        ImageIcon charImage2 = new ImageIcon(truk.getGambar());
        charLabTruk = new JLabel(charImage2);
        setCharX2Truk(0);
        charLabTruk.setBounds(0, truk.getY(), 107,50);
        backLabel.add(charLabTruk);

        ImageIcon charImage3 = new ImageIcon(motor.getGambar());
        charLabMotor = new JLabel(charImage3);
        setCharXMotor(0);
        charLabMotor.setBounds(0, motor.getY(), 107,50);
        backLabel.add(charLabMotor);


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
                    charXBus+=bus.getKec();
                    charLabBus.setBounds(charXBus, bus.getY(), 107,50);
                    charXTruk+=truk.getKec();
                    charLabTruk.setBounds(charXTruk, truk.getY(), 107,50);
                    charXMotor+=motor.getKec();
                    charLabMotor.setBounds(charXMotor, motor.getY(), 107,50);
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
                        bus.upKec();
                        break;
                    case KeyEvent.VK_Q:
                        bus.downKec();
                        break;
                    case KeyEvent.VK_C:
                        truk.upKec();
                        break;
                    case KeyEvent.VK_X:
                        truk.downKec();
                        break;
                    case KeyEvent.VK_M:
                        motor.upKec();
                        break;
                    case KeyEvent.VK_N:
                        motor.downKec();
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
