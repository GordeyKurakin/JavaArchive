import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class MotivationalPoster extends Canvas
{
	Image motivationalFace;

	
	public MotivationalPoster() throws Exception
	{
		motivationalFace = ImageIO.read( new File("TepesI.jpg") );
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
	}
	
	public void paint( Graphics g )
	{
		g.setColor( Color.black );
		g.fillRect(0, 0 , 1024, 768);
		g.drawImage(motivationalFace,350,0,this);
		g.setColor( Color.red );
		g.setFont(new Font("Times New Roman", Font.PLAIN, 105));
		g.drawString("V", 285, 510);
		g.setFont(new Font("Times New Roman", Font.PLAIN, 65));
		g.drawString("LAD III TEPE", 365, 484);
		g.drawLine(365, 494, 735, 494);
		g.setFont(new Font("Times New Roman", Font.PLAIN, 105));
		g.drawString("S", 735, 510);
		g.setColor( Color.white );
		g.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		g.drawString("Alone protected his country from one of the biggest and strongest empires at that time.", 35, 545);
		g.drawString("The most brutal ruler in history.", 35, 570);
		g.drawString("Known as the oldest Batman...", 35, 600);


		
		// And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.

	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("MotivationalPoster");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new MotivationalPoster() );
		win.setVisible(true);
	}


}