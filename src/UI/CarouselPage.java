package UI;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CarouselPage extends JFrame {

    private JLabel imageLabel;
    private String[] imagePaths = {"src/img/race1440.png","src/img/wall-sumplayer.png"};
    private int currentIndex = 0;
    private JPanel backgroundPanel;
    private JLabel label_Next;
    private JLabel label_Prev;
    private JButton btnNewButton;
    private JButton Pilih1;
    private JButton Pilih2;
    private JButton Pilih3;
    private JButton Pilih4;
    private JButton Pilih5;
    private JButton Pilih6;
    private JButton Pilih7;
    private JButton Pilih8;


    public CarouselPage() {
        setTitle("Image Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        setContentPane(mainPanel);

        // Create a panel for the background image
        backgroundPanel = new JPanel();
        mainPanel.add(backgroundPanel, BorderLayout.CENTER);

        // Create a panel for the image slider
        JPanel imagePanel = new JPanel();
        imagePanel.setBounds(400, 169, 650, 400);
        imageLabel = new JLabel();
        backgroundPanel.setLayout(null);
        JLabel BG_label = new JLabel();

        // Create a panel for the background image baru
        ImageIcon imageIcon1 = new ImageIcon("src/img/vehicles-menu.jpeg");
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
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih1.setBounds(50, 144, 100, 40);
        imageLabel.add(Pilih1);

        Pilih2 = new JButton("Pilih2");
        Pilih2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih2.setBounds(200, 144, 100, 40);
        imageLabel.add(Pilih2);

        Pilih3 = new JButton("Pilih3");
        Pilih3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih3.setBounds(350, 144, 100, 40);
        imageLabel.add(Pilih3);

        Pilih4 = new JButton("Pilih4");
        Pilih4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih4.setBounds(500, 144, 100, 40);
        imageLabel.add(Pilih4);


        Pilih5 = new JButton("Pilih5");
        Pilih5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih5.setBounds(50, 325, 100, 40);
        imageLabel.add(Pilih5);

        Pilih6 = new JButton("Pilih6");
        Pilih2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih6.setBounds(200, 325, 100, 40);
        imageLabel.add(Pilih6);

        Pilih7 = new JButton("Pilih7");
        Pilih7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih7.setBounds(350, 325, 100, 40);
        imageLabel.add(Pilih7);

        Pilih8 = new JButton("Pilih8");
        Pilih8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
        Pilih8.setBounds(500, 325, 100, 40);
        imageLabel.add(Pilih8);


        //---


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
                updateImage();
            }
        });

        label_Next.setBounds(1140, 321, 150, 100);
        ImageIcon imageIconNext = new ImageIcon("src/img/right-arrow.png");
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
                updateImage();
            }
        });
        label_Prev.setBounds(169, 321, 150, 100);
        ImageIcon imageIconPrev = new ImageIcon("src/img/left-arrow.png");
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {


            @Override
            public void run() {
                CarouselPage imageSlider = new CarouselPage();
                imageSlider.setVisible(true);
            }
        });
    }
}




//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class CobaCarousol extends JFrame {
//    private JPanel imagePanel;
//    private JButton previousButton;
//    private JButton nextButton;
//    private JButton button;
//    private int currentIndex;
//
//    private String[] imagePaths = {
//            "src/img/wallp-carousel.png",
//            "src/img/wallp-carousel.png",
//            "src/img/wallp-carousel.png"
//    };
//
//    public CobaCarousol() {
//        currentIndex = 0;
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("Image Carousel");
//        setPreferredSize(new Dimension(1920, 700));
//        setLayout(new BorderLayout());
//
//        imagePanel = new JPanel();
//        imagePanel.setBackground(Color.BLACK);
//        add(imagePanel, BorderLayout.CENTER);
//
//        previousButton = new JButton("<");
//        previousButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex = (currentIndex - 1 + imagePaths.length) % imagePaths.length;
//                updateImage();
//            }
//        });
//
//        nextButton = new JButton(">");
//        nextButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex = (currentIndex + 1) % imagePaths.length;
//                updateImage();
//            }
//        });
//
//        JPanel buttonPanel = new JPanel(new BorderLayout());
//        buttonPanel.add(previousButton, BorderLayout.WEST);
//        buttonPanel.add(nextButton, BorderLayout.EAST);
//        add(buttonPanel, BorderLayout.SOUTH);
//
//        updateImage();
//
//        button = new JButton();
//        ImageIcon buttonIcon = new ImageIcon("src/img/play-button.png");
//        button.setIcon(buttonIcon);
//        button.setBounds(200, 50, buttonIcon.getIconWidth(), buttonIcon.getIconHeight());
//        button.setOpaque(false);
//        button.setContentAreaFilled(false);
//        button.setBorderPainted(false);
//        imagePanel.add(button);
//    }
//
//    private void updateImage() {
//        String imagePath = imagePaths[currentIndex];
//        ImageIcon imageIcon = new ImageIcon(imagePath);
//        Image image = imageIcon.getImage();
//
//        // Check if the imagePanel has been properly initialized and has non-zero dimensions
//        if (imagePanel.getWidth() > 0 && imagePanel.getHeight() > 0) {
//            Image scaledImage = image.getScaledInstance(imagePanel.getWidth(), imagePanel.getHeight(), Image.SCALE_SMOOTH);
//            imageIcon = new ImageIcon(scaledImage);
//        }
//
//        JLabel imageLabel = new JLabel();
//        imageLabel.setIcon(imageIcon);
//        imagePanel.removeAll();
//        imagePanel.add(imageLabel);
//        imagePanel.revalidate();
//        imagePanel.repaint();
//    }
//
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                CobaCarousol carouselPage = new CobaCarousol();
//                carouselPage.pack();
//                carouselPage.setVisible(true);
//            }
//        });
//    }
//}
