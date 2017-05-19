import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class Sierpinski extends Canvas
{
    public void paint( Graphics g )
    {
        Random r = new Random();
        int x = 512;
        int y = 382;
        int x1 = 512;
        int y1 = 109;
        int x2 = 146;
        int y2 = 654;
        int x3 = 876;
        int y3 = 654;
        int num;
        int dx = 0;
        int dy = 0;

        
        for(int i = 0; i < 50000; i++){
        	g.drawLine(x,y,x,y);
            num = 1 + r.nextInt(3);
            if(num == 1){
                dx = x - x1;
                dy = y - y1;
            }
            if(num == 2){
                dx = x - x2;
                dy = y - y2;
            }
            if(num == 3){
                dx = x - x3;
                dy = y - y3;
            }
            x = x - dx/2;
            y = y - dy/2;
        }
        g.drawString("Sierpinski Triangle", 462, 484);
    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame("Sierpinski");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new Sierpinski() );
        win.setVisible(true);
    }
}