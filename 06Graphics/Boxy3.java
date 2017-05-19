import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 250, 325, 50, 30 );
		drawBox( window, Color.GREEN,  500, 292, 30, 40 );
		drawBox( window, Color.RED, 100, 50, 50, 50 );
		drawBox( window, Color.BLACK,  300, 120, 60, 200 );
		drawBox( window, Color.CYAN, 25, 50, 10, 70 );
		drawBox( window, Color.GRAY,  450, 220, 60, 150 );
		drawBox( window, Color.BLUE, 200, 300, 50, 30 );
		drawBox( window, Color.MAGENTA,  400, 220, 30, 150 );

		// draw six more boxes -- different colors, different places, different sizes
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		// add code to draw a WxH box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,w,h);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,h-20);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
