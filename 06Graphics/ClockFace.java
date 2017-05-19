import java.awt.*;
import javax.swing.JFrame;

class ClockFace extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		window.setFont(new Font("Arial", Font.PLAIN, 30));
		window.drawOval(50,20,275,275);
		window.drawLine(60,157,187,157);
		window.drawLine(80,120,187,157);
		window.drawString("9", 60, 172);
		window.drawString("3", 300, 172);
		window.drawString("6", 180, 290);
		window.drawString("12", 170, 50);
		window.drawString("10", 70, 125);
		window.drawString("11", 110, 75);
		window.drawString("1", 250, 75);
		window.drawString("2", 285, 125);
		window.drawString("4", 285, 225);
		window.drawString("5", 250, 270);
		window.drawString("6", 180, 290);
		window.drawString("7", 110, 270);
		window.drawString("8", 70, 225);
		window.drawString("12", 170, 50);
		window.drawString("9", 60, 172);
		window.drawString("3", 300, 172);
		window.drawString("6", 180, 290);
		window.drawString("12", 170, 50);

		// draw six more boxes -- different colors, different places, different sizes
	}
	public static void main( String[] args )
	{
		Canvas canvas = new ClockFace();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
