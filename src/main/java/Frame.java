import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    Frame(){

        this.setTitle("Labirynt");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,800);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("Images/delone logo 32x32.png");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(0x5b0474));
    }

}
