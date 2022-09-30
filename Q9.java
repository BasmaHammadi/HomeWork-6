import javax.swing.*;
import java.awt.*;

public class Q9 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Rectangle");
        frame.setSize(500,500);
        frame.setLocation(550,200);
        TwoSquareComponent component=new  TwoSquareComponent();
        frame.add(component);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class  TwoSquareComponent extends JComponent {
    protected void paintComponent(Graphics g) {
        Rectangle rectangle1=new Rectangle(0,0,375,375);
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fill(rectangle1);
       g2.setColor(Color.black);
        int x=0;
        int y=0;
        for (int i = 1; i <= 64; i++) {
            Rectangle rectangle2=new Rectangle(x,y,25,25);
            g2.fill(rectangle2);
            x=x+50;
            if(i%8==0) {
             x=0;
            y=y+50;}
        }
    }
}
