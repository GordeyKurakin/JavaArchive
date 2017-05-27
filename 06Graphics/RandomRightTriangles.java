import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class RandomRightTriangles extends Canvas
{
    public void paint( Graphics g )
    {
        Random r = new Random();
        int x, y, red, green, blue;

        Color mycolor;
        for(int i = 0; i < 500; i++){
        	red = 1 + r.nextInt(255);
            green = 1 + r.nextInt(255);
            blue = 1 + r.nextInt(255);
            mycolor = new Color(red,green,blue);
            g.setColor(mycolor);
	        Polygon tri = new Polygon();
	        x = 1 + r.nextInt(924);
            y = 1 + r.nextInt(668);
	        tri.addPoint(x, y);
	        tri.addPoint(x, y+50);
	        tri.addPoint(x+50, y+50);
	        g.fillPolygon(tri);	        
        }
    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame("RandomRightTriangles");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new RandomRightTriangles() );
        win.setVisible(true);
    }
	// it change position or form
}