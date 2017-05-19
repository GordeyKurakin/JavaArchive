import java.awt.*;
import javax.swing.JFrame;

class SmilingFace extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		window.setColor(Color.yellow);
		window.fillOval(50,20,275,275);
		window.setColor(Color.blue);
		window.fillOval(120,90,50,50);
		window.fillOval(210,90,50,50);
		window.setColor(Color.red);
		window.drawArc(135,140,100,100,180,180);
		// draw six more boxes -- different colors, different places, different sizes// labels
		/*window.setColor(Color.black);
		window.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
			window.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
			window.drawString( String.valueOf(Y), 28, Y );
		// lines
		window.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
			window.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
			window.drawLine(0,Y,799,Y);    // vertical
		}*/
	}
	public static void main( String[] args )
	{
		Canvas canvas = new SmilingFace();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
