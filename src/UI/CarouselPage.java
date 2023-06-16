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
    private String[] imagePaths = {"src/img/card-car.png", "src/img/card-motor.png","src/img/card-truck.png"};
    private int currentIndex = 0;
    private JPanel backgroundPanel;
    private JLabel label_Next;
    private JLabel label_Prev;


    public CarouselPage() {
        setTitle("Image Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 700);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        setContentPane(mainPanel);

        // Create a panel for the background image
        backgroundPanel = new JPanel()
//        {
//           @Override
//           protected void paintComponent(Graphics g) {
//               super.paintComponent(g);
//               ImageIcon backgroundIcon = new ImageIcon("D://Install/eclipse/Coba GUI/src/Tampil/png.png");
//                Image background = backgroundIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
//               g.drawImage(background, 0, 0, null);
//            }
//        }
        ;
        mainPanel.add(backgroundPanel, BorderLayout.CENTER);



        // Create a panel for the image slider
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBounds(400, 169, 650, 400);
        imageLabel = new JLabel();
        backgroundPanel.setLayout(null);
        JLabel BG_label = new JLabel();

        // Create a panel for the background image baru (bg nempel di label)
        ImageIcon imageIcon1 = new ImageIcon("src/img/vehicles-menu.jpeg");
        Image image2 = imageIcon1.getImage().getScaledInstance(1370, 661, Image.SCALE_SMOOTH);
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

        imagePanel.add(imageLabel, BorderLayout.NORTH);
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
//public class CarouselPage extends JFrame {
//    private JLabel imageLabel;
//    private JButton previousButton;
//    private JButton nextButton;
//    private String[] imagePaths = {"src/img/card-car.png", "src/img/card-motor.png", "src/img/card-truck.png"};
//    private int currentIndex = 0;
//    private Image backgroundImage;
//
//    public CarouselPage() {
//        setTitle("Image Slider");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(1440, 700);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BorderLayout());
//        setContentPane(mainPanel);
//
//        // Create a layered pane for the image slider
//        JLayeredPane imagePanel = new JLayeredPane();
//        imagePanel.setLayout(new BorderLayout());
//
//        ImageIcon backgroundImageIcon = new ImageIcon("src/img/wall-awal.png");
//        JLabel backgroundLabel = new JLabel(backgroundImageIcon);
//        backgroundLabel.setBounds(0, 0, backgroundImageIcon.getIconWidth(), backgroundImageIcon.getIconHeight());
//        imagePanel.add(backgroundLabel, Integer.valueOf(0));
//
//        imageLabel = new JLabel();
//        previousButton = new JButton("Previous");
//        nextButton = new JButton("Next");
//
//        previousButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex--;
//                if (currentIndex < 0) {
//                    currentIndex = imagePaths.length - 1;
//                }
//                updateImage();
//            }
//        });
//
//        nextButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex++;
//                if (currentIndex >= imagePaths.length) {
//                    currentIndex = 0;
//                }
//                updateImage();
//            }
//        });
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(previousButton);
//        buttonPanel.add(nextButton);
//
//        imagePanel.add(imageLabel, BorderLayout.CENTER);
//        imagePanel.add(buttonPanel, BorderLayout.SOUTH);
//
//        mainPanel.add(imagePanel, BorderLayout.CENTER);
//    }
//
//    private void updateImage() {
//        ImageIcon imageIcon = new ImageIcon(imagePaths[currentIndex]);
//        Image image = imageIcon.getImage().getScaledInstance(874, 446, Image.SCALE_DEFAULT);
//        imageIcon = new ImageIcon(image);
//        imageLabel.setIcon(imageIcon);
//
//        imageLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
//        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
//
//        JLayeredPane layeredPane = (JLayeredPane) imageLabel.getParent();
//        layeredPane.setLayer(imageLabel, Integer.valueOf(1));
//    }
//
//    public void setBackgroundImage(Image image) {
//        this.backgroundImage = image;
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        if (backgroundImage != null) {
//            g.drawImage(backgroundImage, 0, 0, this);
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                CarouselPage imageSlider = new CarouselPage();
//
//                // Load the background image
//                Image backgroundImage = new ImageIcon("src/img/wall-awal.png").getImage();
//                imageSlider.setBackgroundImage(backgroundImage);
//
//                imageSlider.setVisible(true);
//            }
//        });
//    }
//}



//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class CarouselPage extends JFrame {
//    private JLabel imageLabel;
//    private JButton previousButton;
//    private JButton nextButton;
//    private String[] imagePaths = {"src/img/card-car.png", "src/img/card-motor.png", "src/img/card-truck.png"};
//    private int currentIndex = 0;
//    private Image backgroundImage;
//
//    public CarouselPage() {
//        setTitle("Image Slider");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(1440, 700);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BorderLayout());
//        setContentPane(mainPanel);
//
//        // Create a panel for the image slider
//        JPanel imagePanel = new JPanel(new BorderLayout());
//        imagePanel.setPreferredSize(new Dimension(874, 446));
////        imagePanel.setOpaque(false);
//
//        imageLabel = new JLabel();
//        previousButton = new JButton("Previous");
//        nextButton = new JButton("Next");
//
//        previousButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex--;
//                if (currentIndex < 0) {
//                    currentIndex = imagePaths.length - 1;
//                }
//                updateImage();
//            }
//        });
//
//        nextButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex++;
//                if (currentIndex >= imagePaths.length) {
//                    currentIndex = 0;
//                }
//                updateImage();
//            }
//        });
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(previousButton);
//        buttonPanel.add(nextButton);
//
//        imagePanel.add(imageLabel, BorderLayout.CENTER);
//        imagePanel.add(buttonPanel, BorderLayout.SOUTH);
//
//        mainPanel.add(imagePanel, BorderLayout.CENTER);
//    }
//
//    private void updateImage() {
//        ImageIcon imageIcon = new ImageIcon(imagePaths[currentIndex]);
//        Image image = imageIcon.getImage().getScaledInstance(874, 446, Image.SCALE_DEFAULT);
//        imageIcon = new ImageIcon(image);
//        imageLabel.setIcon(imageIcon);
//
//        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
//    }
//
//    public void setBackgroundImage(Image image) {
//        this.backgroundImage = image;
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        if (backgroundImage != null) {
//            g.drawImage(backgroundImage, 0, 0, this);
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                CarouselPage imageSlider = new CarouselPage();
//
//                // Load the background image
//                Image backgroundImage = new ImageIcon("src/img/wall-awal.png").getImage();
//                imageSlider.setBackgroundImage(backgroundImage);
//
//                imageSlider.setVisible(true);
//            }
//        });
//    }
//}


// nearly
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class CarouselPage extends JFrame {
//    private JLabel imageLabel;
//    private JButton previousButton;
//    private JButton nextButton;
//    private String[] imagePaths = {"src/img/card-car.png", "src/img/card-motor.png", "src/img/card-truck.png"};
//    private int currentIndex = 0;
//    private JPanel backgroundPanel;
//
//
//    public CarouselPage() {
//        setTitle("Image Slider");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(1440, 700);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BorderLayout());
//        setContentPane(mainPanel);
//
//        // Create a panel for the background image
//        JPanel backgroundPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                ImageIcon backgroundIcon = new ImageIcon("src/img/wallp-2.png");
//                Image background = backgroundIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
//                g.drawImage(background, 0, 0, null);
//            }
//        };
//        backgroundPanel.setLayout(new BorderLayout());
//        mainPanel.add(backgroundPanel, BorderLayout.CENTER);
//
////        backgroundPanel = new JPanel();
////        backgroundPanel.setBackground(Color.BLACK);
////        add(backgroundPanel, BorderLayout.CENTER);
//
//        // Create a panel for the image slider
//        JPanel imagePanel = new JPanel(new BorderLayout());
//        imageLabel = new JLabel();
//        previousButton = new JButton("Previous");
//        nextButton = new JButton("Next");
//
//        previousButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex--;
//                if (currentIndex < 0) {
//                    currentIndex = imagePaths.length - 1;
//                }
//                updateImage();
//            }
//        });
//
//        nextButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex++;
//                if (currentIndex >= imagePaths.length) {
//                    currentIndex = 0;
//                }
//                updateImage();
//            }
//        });
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(previousButton);
//        buttonPanel.add(nextButton);
//
//        imagePanel.add(imageLabel, BorderLayout.CENTER);
//        imagePanel.add(buttonPanel, BorderLayout.SOUTH);
//
//        backgroundPanel.add(imagePanel, BorderLayout.CENTER);
//    }
//
//    private void updateImage() {
//        ImageIcon imageIcon = new ImageIcon(imagePaths[currentIndex]);
//        Image image = imageIcon.getImage().getScaledInstance(874, 446, Image.SCALE_DEFAULT);
//        imageIcon = new ImageIcon(image);
//        imageLabel.setIcon(imageIcon);
//
//        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                CarouselPage imageSlider = new CarouselPage();
//                imageSlider.setVisible(true);
//            }
//        });
//    }
//}


//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class CarouselPage extends JFrame {
//    private JPanel backgroundPanel;
//    private JPanel carouselPanel;
//    private CardLayout cardLayout;
//    private JButton previousButton;
//    private JButton nextButton;
//    private int currentPageIndex;
//
//    private Color[] pageColors = {
//            Color.RED,
//            Color.GREEN,
//            Color.BLUE
//    };

//
//    public CarouselPage() {
//        currentPageIndex = 0;
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("Carousel");
//        setPreferredSize(new Dimension(600, 400));
//
//        backgroundPanel = new JPanel();
//        backgroundPanel.setBackground(Color.BLACK);
//        add(backgroundPanel, BorderLayout.CENTER);
//
//        carouselPanel = new JPanel(new CardLayout());
//        carouselPanel.setOpaque(false);
//        backgroundPanel.add(carouselPanel);
//
//        for (Color color : pageColors) {
//            JPanel pagePanel = new JPanel();
//            pagePanel.setBackground(color);
//            carouselPanel.add(pagePanel);
//        }
//
//        previousButton = new JButton("Previous");
//        nextButton = new JButton("Next");
//
//        previousButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentPageIndex = (currentPageIndex - 1 + pageColors.length) % pageColors.length;
//                cardLayout.previous(carouselPanel);
//            }
//        });
//
//        nextButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentPageIndex = (currentPageIndex + 1) % pageColors.length;
//                cardLayout.next(carouselPanel);
//            }
//        });
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(previousButton);
//        buttonPanel.add(nextButton);
//        add(buttonPanel, BorderLayout.SOUTH);
//
//        cardLayout = (CardLayout) carouselPanel.getLayout();
//        cardLayout.show(carouselPanel, String.valueOf(currentPageIndex));
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                CarouselPage carouselPage = new CarouselPage();
//                carouselPage.pack();
//                carouselPage.setVisible(true);
//            }
//        });
//    }
//}

//package UI;
//
//import java.awt.Image;
//import java.io.File;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.ImageIcon;
//
//public class CarouselPage extends javax.swing.JFrame {
//    public CarouselPage() {
//        initComponents();
//        show(position);
//    }
//
//    int position = 0;
//
//    public String[] takeImage() {
//        File f = new File(getClass().getResource("/src/img/").getFile());
//        String[] Images = f.list();
//        return Images;
//    }
//
//    public void show(int index) {
//        String[] Images = takeImage();
//        String img = Images[index];
//        ImageIcon icon = new ImageIcon(getClass().getResource("/src/img/" + img));
//        Image image = icon.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
//        label1.setIcon(new ImageIcon(image));
//    }
//
//    private void nextMousePressed(java.awt.event.MouseEvent evt) throws InterruptedException {
//        Thread.sleep(300);
//        position = (position + 1) % takeImage().length;
//        show(position);
//    }
//
//    private void previousMousePressed(java.awt.event.MouseEvent evt) throws InterruptedException {
//        Thread.sleep(300);
//        position = (position - 1 + takeImage().length) % takeImage().length;
//        show(position);
//    }
//
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CarouselPage().setVisible(true);
//            }
//        });
//    }
//
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel label1;
//    private javax.swing.JLabel next;
//    private javax.swing.JLabel previous;
//
//    // You need to define the initComponents() method manually or with a GUI builder
//    private void initComponents() {
//        // Your component initialization code goes here
//        // ...
//
//        // Assuming you have next and previous buttons, you can add the following code to initialize their functionality
//        next.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mousePressed(java.awt.event.MouseEvent evt) {
//                try {
//                    nextMousePressed(evt);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(CarouselPage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//
//        previous.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mousePressed(java.awt.event.MouseEvent evt) {
//                try {
//                    previousMousePressed(evt);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(CarouselPage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }
//}


//
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel label1;
//    private javax.swing.JLabel next;
//    private javax.swing.JLabel previous;
//}







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
