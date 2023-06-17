package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import Vehicles.*;
import Vehicles.Mobil.Mobil;
import Vehicles.Mobil.*;
import Vehicles.Bus.*;
import Vehicles.Motor.*;
import Vehicles.Truk.*;
import UI.player;

public class Race extends JFrame {
    private JLabel backLabel, charLabBus,charLabTruk, charLabMotor, charLabMobil;
    private  int charXBus, charXTruk, charXMotor, charXMobil;
    private double kec=2;
    private static ArrayList<Kendaraan> gorace = new ArrayList<>();
    Bus_4 bus = new Bus_4();
    Truk_1 truk = new Truk_1();
    Motor_2 motor = new Motor_2();
    Mobil_3 mobil = new Mobil_3();
    private JLabel meteor1,meteor2,meteor3,meteor4,meteor5,meteor6;
    private int y1, y2, y3, y4, y5, y6;
    private int y11, y22, y33, y44, y55, y66;

    public Race(){
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

        ImageIcon charImage4 = new ImageIcon(mobil.getGambar());
        charLabMobil = new JLabel(charImage4);
        setCharXMobil(0);
        charLabMobil.setBounds(0, mobil.getY(), 107,50);
        backLabel.add(charLabMobil);

        setUpSpeed();

        getMeteor();
        run2();
        run3();
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
    public void getMeteor(){
        ImageIcon meteor11 = new ImageIcon("src/img/meteor.png");
        meteor1 = new JLabel(meteor11);
        meteor1.setBounds(200, 0, 80, 160);
        backLabel.add(meteor1);
        ImageIcon meteor22 = new ImageIcon("src/img/meteor.png");
        meteor2 = new JLabel(meteor22);
        meteor2.setBounds(400, 0, 80, 160);
        backLabel.add(meteor2 );
        ImageIcon meteor33 = new ImageIcon("src/img/meteor.png");
        meteor3 = new JLabel(meteor33);
        meteor3.setBounds(600, 0, 80, 160);
        backLabel.add(meteor3);
        ImageIcon meteor44 = new ImageIcon("src/img/meteor.png");
        meteor4= new JLabel(meteor44);
        meteor4.setBounds(800, 0, 80, 200);
        backLabel.add(meteor4);
        ImageIcon meteor55 = new ImageIcon("src/img/meteor.png");
        meteor5 = new JLabel(meteor55);
        meteor5.setBounds(100, 0, 80, 160);
        backLabel.add(meteor5);
        ImageIcon meteor66 = new ImageIcon("src/img/meteor.png");
        meteor6= new JLabel(meteor66);
        meteor6.setBounds(1200, 0, 80, 160);
        backLabel.add(meteor6);
    }
    public void run2(){

        Timer timer2 = new Timer(40, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int tb1=5,tb2=8, tb3=7, tb4=7, tb5=5, tb6 = 10;
                meteor1.setBounds(200, y1+=tb1, 107, 50);
                meteor2.setBounds(400, y2+=tb2, 107, 50);
                meteor3.setBounds(600, y3+=tb3, 107, 50);
                meteor4.setBounds(800, y4+=tb4, 107, 50);
                meteor5.setBounds(100, y5+=tb5, 107, 50);
                meteor6.setBounds(1200, y6+=tb6, 107, 50);
                repaint();
            }
        });
        timer2.start();
    }
    public void run3(){
        Timer timer3 = new Timer(40, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int tb1=2,tb2=3, tb3=9, tb4=5, tb5=8, tb6 = 4;
                meteor1.setBounds(200, y11+=tb1, 107, 50);
                meteor2.setBounds(400, y22+=tb2, 107, 50);
                meteor3.setBounds(600, y33+=tb3, 107, 50);
                meteor4.setBounds(800, y44+=tb4, 107, 50);
                meteor5.setBounds(100, y55+=tb5, 107, 50);
                meteor6.setBounds(1200, y66+=tb6, 107, 50);
                repaint();
            }
        });
        timer3.start();
    }
    public static ArrayList<Kendaraan> getGorace() {
        return gorace;
    }

}

