import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class BoringTriangle extends Canvas
{
    public void paint( Graphics g )
    {
        Polygon tri = new Polygon();
        tri.addPoint(100, 100);
        tri.addPoint(100, 300);
        tri.addPoint(200, 300);
        
        g.setColor(Color.magenta);
        g.fillPolygon(tri);

        Polygon hex = new Polygon();
                
        // use trig to make a regular hexagon
        int radius = 100; // pixels
        int xCenter = 200;
        int yCenter = 500;
        for ( double ang = 0; ang<2*Math.PI; ang=ang+(2*Math.PI)/6.0)
        {
            double xDelta = radius * Math.cos(ang);
            double yDelta = -radius * Math.sin(ang);
            hex.addPoint(xCenter+(int)xDelta, yCenter+(int)yDelta);
        }
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Polygon Demo");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new BoringTriangle() );
        win.setVisible(true);
    }
	// it change position or form
}