import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

        public class patata extends JFrame{
        //the pictures
        ImageIcon guy = new ImageIcon("/home/student/ggomez/eclipse/Cosos_Juego/src/Aragorn.png");
        JLabel pn = new JLabel(guy);
        JPanel panel = new JPanel();

        patata(){
            super("Photuris Lucicrescens");

            //Important
            setSize(700,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(panel);
            setVisible(true);
            JLabel im = new JLabel(new ImageIcon("/home/student/ggomez/eclipse/Cosos_Juego/src/Aragorn.png"));
            Image customIcon = Toolkit.getDefaultToolkit().getImage("/home/student/ggomez/eclipse/Cosos_Juego/src/Aragorn.png");
            setIconImage(customIcon);
            panel.add(im);
            add(pn);
            setVisible(true);
        }
        }
