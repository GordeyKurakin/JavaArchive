import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas
{
    public void paint( Graphics g )
    {
        Color myc = new Color(250,30,0);// Each component has a value from 0-255
        g.setColor(Color.green);
        g.fillOval(500,370,150,150);
    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo2: Arcs and Colors");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add( canvas );
        win.setVisible(true);
    }
}