package UI;


import Vehicles.Kendaraan;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Race_2 extends JFrame{
    private JLabel backLabel, charLab1, charLab2, meteor1, meteor2, meteor3;
    private  int charX1, charX2;
    public static ArrayList<Integer> gorace = new ArrayList<>();
    private Kendaraan kend1;
    private Kendaraan kend2;

    private Boolean status_kend1 = true;
    private Boolean status_kend2 = true;

    public static int y1,y2,y3;
    private int x1=400,x2=800,x3=1200;
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
        getMeteor();
        run2();
        int left = kend1.getY()+50;
        int right = kend1.getY()-50;
        if (y1>left && y1<right){
            charLab1.setVisible(false);
        }
        setUpSpeed();

        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }

    public void setStatus_kend1(Boolean status_kend1) {
        this.status_kend1 = status_kend1;
    }

    public void setStatus_kend2(Boolean status_kend2) {
        this.status_kend2 = status_kend2;
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
                if (charX1<1440 && charX2<1440){
                    charX1+=kend1.getKec();
                    charLab1.setBounds(charX1, kend1.getY(), 107,50);
                    stop(charLab1, charX1, kend1);
                    charX2+=kend2.getKec();
                    charLab2.setBounds(charX2, kend2.getY(), 107,50);
                    stop(charLab2, charX2, kend2);
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
    public void getMeteor() {
        ImageIcon meteor22 = new ImageIcon("src/img/meteor.png");
        meteor1 = new JLabel(meteor22);
        meteor1.setBounds(400, 0, 80, 160);
        backLabel.add(meteor1);
        ImageIcon meteor44 = new ImageIcon("src/img/meteor.png");
        meteor2 = new JLabel(meteor44);
        meteor2.setBounds(800, 0, 80, 200);
        backLabel.add(meteor2);
        ImageIcon meteor66 = new ImageIcon("src/img/meteor.png");
        meteor3 = new JLabel(meteor66);
        meteor3.setBounds(1200, 0, 80, 160);
        backLabel.add(meteor3);
    }

    public void run2() {
        Timer timer2 = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int tb1 = 5, tb2 = 8, tb3 = 7;
                int initialY1 = 0, initialY2 = 0, initialY3 = 0;
                int maxY=700;
                Race_2.y1 += tb1;
                Race_2.y2 += tb2;
                Race_2.y3 += tb3;

                // Reset y coordinates if they exceed the specified range
                if (Race_2.y1 > maxY)
                    Race_2.y1 = initialY1;
                if (Race_2.y2 > maxY)
                    Race_2.y2 = initialY2;
                if (Race_2.y3 > maxY)
                    Race_2.y3 = initialY3;

                meteor1.setBounds(x1, Race_2.y1, 80, 160);
                meteor2.setBounds(x2, Race_2.y2, 80, 160);
                meteor3.setBounds(x3, Race_2.y3, 80, 160);

                repaint();
            }
        });
        timer2.start();
}
public void stop(JLabel gambar, int y, Kendaraan obj){
        int meteor1_x =  x1+20;
        int meteror1_x_ = x1-20;

        int meteor2_x =  x2+20;
        int meteror2_x_ = x2-20;

        int meteor3_x =  x3+20;
        int meteror3_x_ = x3-20;

        int meteor1_y00 = Race_2.y1+20;
        int meteor1_y0 = Race_2.y1-20;

        int meteor2_y00 = Race_2.y1+20;
        int meteor2_y0 = Race_2.y1-20;

        int meteor3_y00 = Race_2.y1+20;
        int meteor3_y0 = Race_2.y1-20;
        if (y<meteor1_x && y>meteror1_x_ && obj.getY()<meteor1_y00 && obj.getY()>meteor1_y0){
            gambar.setVisible(false);
        } else if (y<meteor2_x && y>meteror2_x_ && obj.getY()<meteor2_y00 && obj.getY()>meteor2_y0){
            gambar.setVisible(false);
        } else if (y<meteor3_x && y>meteror3_x_ && obj.getY()<meteor3_y00 && obj.getY()>meteor3_y0){
            gambar.setVisible(false);
        };
}

}
