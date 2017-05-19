import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		// Draws a smiling face on the screen, where the point (x,y) is
		//  the upper-left corner of a box containing the face.

		// draw circle for the head
		g.setColor(Color.yellow);
					  //50,20 
		g.fillOval(x,y,275,275);
		// draw eyes
		g.setColor(Color.blue);
		g.fillOval(x+70,y+70,50,50);
		g.fillOval(x+160,y+70,50,50);
		// draw mouth
		g.setColor(Color.red);
		g.drawArc(x+85,y+120,100,100,180,180);
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}
