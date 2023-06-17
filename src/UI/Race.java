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
    private JLabel backLabel;
    private JLabel charLabBus;
    private JLabel charLabTruk;
    private JLabel charLabMotor;
    private JLabel charLabMobil;
    private JLabel alert;

//    private  JButton button;
//    private  JButton button1;
//    private  JTextField text;
    private  int charXBus;
    private  int charXTruk;
    private int charXMotor;
    private int charXMobil;
    private double kec=2;
    private static ArrayList<Kendaraan> gorace = new ArrayList<>();

    Bus_4 bus = new Bus_4();
    Truk_1 truk = new Truk_1();
    Motor_2 motor = new Motor_2();
    Mobil_3 mobil = new Mobil_3();

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

//        button = new JButton("Mulai");
//        button.setBounds(1300, 600, 100,30);
//        backLabel.add(button);
//        setUpButtonListeners();

//        text = new JTextField();
//        text.setBounds(1000, 600, 100, 30);
//        backLabel.add(text);
//
//        button1 = new JButton("GO");
//        button1.setBounds(1120, 600, 70,30);
//        backLabel.add(button1);
//        setUpSpeed();

        setUpSpeed();
        alert = new JLabel();
        alert.setBounds(1300, 30, 130, 20);
        backLabel.add(alert);

//        JLabel speedMax = new JLabel();
//        speedMax.setBounds(700, 30, 200, 20);
//        String x = String.valueOf(mobil.getKecepatanMaksimal());
//        speedMax.setText("Kecepatan Maksimal: " + x);
//        backLabel.add(speedMax);

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

//    public int getCharX() {
//        return charX;
//    }

//    public void setUpButtonListeners(){
//        ActionListener buttonListeners = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                run();
//            }
//        };
//        button.addActionListener(buttonListeners);
//    }

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


//    public void setUpSpeed(){
//        ActionListener btnSpeed = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                double add = Double.parseDouble(text.getText());
//                if (mobil.tambahKecepatan(add)){
//                    setKec(mobil.getKecepatan()/20);
//                } else{
//                    alert.setText("The Speed is Maximum");
//                };
//            }
//        };
//        button1.addActionListener(btnSpeed);
//    }

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

    public static ArrayList<Kendaraan> getGorace() {
        return gorace;
    }

}

