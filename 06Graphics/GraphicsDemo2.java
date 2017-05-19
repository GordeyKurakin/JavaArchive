import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo2 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.black);


        g.setColor(Color.red);
        g.fillArc(50,50,400,400,45,270); // chomp
        g.setColor(Color.pink);
        g.fillArc(400,150,200,200,225,270);
        
        // custom colors
        Color myOrange = new Color(230,92,0); // amount of red, green, blue in the color
                                              // Each component has a value from 0-255
    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo2: Arcs and Colors");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo2 canvas = new GraphicsDemo2();
        win.add( canvas );
        win.setVisible(true);
    }
}