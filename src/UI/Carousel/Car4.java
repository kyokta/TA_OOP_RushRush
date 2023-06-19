package UI.Carousel;

import UI.Race.Race_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Car4 extends JFrame {

    private JLabel imageLabel;
    private String[] imagePaths = {"src/img/img+card (4).png","src/img/img+card (5).png"};
    private int currentIndex = 0;
    private JPanel backgroundPanel;
    private JLabel label_Next, label_Prev;
    private JButton btnNewButton;
    private int indexTombolBantu=8; //Baru
    private int indexTombolTekan=0;//Baru
    private JButton Pilih1, Pilih2, Pilih3, Pilih4, Pilih5, Pilih6, Pilih7, Pilih8, button;
    public Car4() {
        setTitle("Image Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        setContentPane(mainPanel);

        // Create a panel for the background image
        backgroundPanel = new JPanel();
        mainPanel.add(backgroundPanel, BorderLayout.CENTER);

        button = new JButton();
        ImageIcon buttonIcon = new ImageIcon("src/img/play-button.png");
        button.setIcon(buttonIcon);
        button.setBounds(600, 550, buttonIcon.getIconWidth(), buttonIcon.getIconHeight());
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        backgroundPanel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Race_4();
            }
        });

        // Create a panel for the image slider
        JPanel imagePanel = new JPanel();
        imagePanel.setBounds(400, 169, 650, 400);
        imageLabel = new JLabel();
        backgroundPanel.setLayout(null);
        JLabel BG_label = new JLabel();

        // Create a panel for the background image baru
        ImageIcon imageIcon1 = new ImageIcon("src/img/vehicles-menu(1).png");
        Image image2 = imageIcon1.getImage().getScaledInstance(1440, 700, Image.SCALE_SMOOTH);
        imageIcon1 = new ImageIcon(image2);
        BG_label.setIcon(imageIcon1);
        BG_label.setHorizontalAlignment(SwingConstants.CENTER);
        BG_label.setVerticalAlignment(SwingConstants.CENTER);
        BG_label.setBounds(0, 0, 1370, 661);
        backgroundPanel.add(BG_label);

        //tampil awal
        ImageIcon imageIcon = new ImageIcon(imagePaths[0]);
        Image image = imageIcon.getImage().getScaledInstance(650, 400, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);

        imageLabel.setIcon(imageIcon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
        //----

        //Tombol Dalam label-------------
        Pilih1 = new JButton("Pilih1");
        Pilih1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-8;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih1.setBounds(50, 144, 100, 40);
        imageLabel.add(Pilih1);


        Pilih2 = new JButton("Pilih2");
        Pilih2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-7;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih2.setBounds(200, 144, 100, 40);
        imageLabel.add(Pilih2);


        Pilih3 = new JButton("Pilih3");
        Pilih3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-6;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih3.setBounds(350, 144, 100, 40);
        imageLabel.add(Pilih3);

        Pilih4 = new JButton("Pilih4");
        Pilih4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-5;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih4.setBounds(500, 144, 100, 40);
        imageLabel.add(Pilih4);


        Pilih5 = new JButton("Pilih5");
        Pilih5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-4;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih5.setBounds(50, 325, 100, 40);
        imageLabel.add(Pilih5);

        Pilih6 = new JButton("Pilih6");
        Pilih6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-3;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih6.setBounds(200, 325, 100, 40);
        imageLabel.add(Pilih6);

        Pilih7 = new JButton("Pilih7");
        Pilih7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-2;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });

        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih7.setBounds(350, 325, 100, 40);
        imageLabel.add(Pilih7);

        Pilih8 = new JButton("Pilih8");
        Pilih8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexTombolTekan=indexTombolBantu-1;//Baru
                System.out.println(indexTombolTekan);//Baru
                Race_4.gorace.add(indexTombolTekan);
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih8.setBounds(500, 325, 100, 40);
        imageLabel.add(Pilih8);

        imagePanel.add(imageLabel);
        BG_label.add(imagePanel);
        label_Next = new JLabel();
        label_Next.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                currentIndex++;
                if (currentIndex >= imagePaths.length) {
                    currentIndex = 0;
                }
                //Baru=======================================================================
                if(currentIndex==0) {
                    indexTombolBantu=8;
                }else {
                    indexTombolBantu=indexTombolBantu*(currentIndex+1);
                }
                //==========================================================================

                updateImage();
            }
        });

        label_Next.setBounds(1140, 321, 150, 100);
        ImageIcon imageIconNext = new ImageIcon("src/img/right.png");
        Image imageNext = imageIconNext.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        imageIconNext = new ImageIcon(imageNext);
        label_Next.setIcon(imageIconNext);
        label_Next.setHorizontalAlignment(SwingConstants.CENTER);
        label_Next.setVerticalAlignment(SwingConstants.CENTER);
        BG_label.add(label_Next);

        label_Prev = new JLabel();
        label_Prev.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                currentIndex--;
                if (currentIndex < 0) {
                    currentIndex = imagePaths.length - 1;
                }

                //Baru=======================================================================
                if(currentIndex==0) {
                    indexTombolBantu=8;
                }else {
                    indexTombolBantu=indexTombolBantu*(currentIndex+1);
                }
                //==========================================================================

                updateImage();
            }
        });
        label_Prev.setBounds(169, 321, 150, 100);
        ImageIcon imageIconPrev = new ImageIcon("src/img/left.png");
        Image imagePrev = imageIconPrev.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        imageIconPrev = new ImageIcon(imagePrev);
        label_Prev.setIcon(imageIconPrev);
        label_Prev.setHorizontalAlignment(SwingConstants.CENTER);
        label_Prev.setVerticalAlignment(SwingConstants.CENTER);
        BG_label.add(label_Prev);
    }


    private void updateImage() {
        ImageIcon imageIcon = new ImageIcon(imagePaths[currentIndex]);
        Image image = imageIcon.getImage().getScaledInstance(650, 400, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
    }

    public void start() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Car4 imageSlider = new Car4();
                imageSlider.setVisible(true);
            }
        });
    }
}