package UI;
import java.io.File;

public class CarouselPage extends javax.swing.JFrame {
//    public CarouselPage(){
//        initComponents();
//    }
//    public String[] takeImage(){
//        File f = new File(getClass().getResource("").getFile());
//        String[] Image = f.list();
//    }
}

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
