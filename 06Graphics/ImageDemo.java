import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageDemo extends Canvas
{
	Image coolFace, awesomeFace;

	
	public ImageDemo() throws Exception
	{
		coolFace = ImageIO.read( new File("mitch.png") );
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
		awesomeFace = ImageIO.read( new File("Yauzah.JPEG") );
	}
	
	public void paint( Graphics g )
	{
		g.setColor( Color.black );
		g.fillRect(0, 0 , 1024, 768);
		g.drawImage(awesomeFace,100,200,this);
		g.drawImage(coolFace,100,100,this);
		g.setColor( Color.white );
		g.setFont(new Font("Times New Roman", Font.PLAIN, 65));
		g.drawString("When you came for Gallifreyan's soul.", 50, 484);
		
		// And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.
		g.setColor( Color.yellow );
		g.drawOval(88,88,70,25);

	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Image Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ImageDemo() );
		win.setVisible(true);
	}


}