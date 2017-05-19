import javax.swing.*;

public class BoringWindow extends JFrame
{
	public static void main(String[] args)
	{
		JFrame f = new BoringWindow();
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);	
		f.setSize(800, 800);	
		f.setVisible(true);	
	}
}