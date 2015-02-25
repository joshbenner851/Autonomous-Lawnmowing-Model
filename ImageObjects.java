import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ImageObjects extends JFrame  {
	
	private Image spiral = null;
	private Image face = null;
	public void ImageObjects(){
		JPanel p = new JPanel();
		 JButton b = new JButton();
		 p.add(b);
		 add(p);
		 b.addActionListener(new ActionListener() {
		 
	    public void actionPerformed(ActionEvent e)
	    {
	        //Execute when button is pressed
	    	JOptionPane.showMessageDialog(null, "he touched the butt ;)");
	    	
	    }
	});
	}
//	public void paint(Graphics g){
//		this.setSize(640, 480);
//		if(spiral==null)
//			spiral = getImage("circle.png");
//			face = getImage("face.png");
//		Graphics2D g2 = (Graphics2D)g;
//		g2.drawImage(spiral, 100, 200, 288, 162, this);
//		g2.drawImage(face, 25, 25, 288, 162, this);
//	}
//	
		
//	public Image getImage(String path)
//	{
//		Image tempImage = null;
//		try {
//		    URL imageURL = ImageObjects.class.getResource(path);
//		    tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
//			}
//		catch (Exception e) {
//			System.out.println("An error occured " + e.getMessage());
//		}
//		return tempImage;
//	}
	public static void main(String[] args){
		ImageObjects r = new ImageObjects();
		r.setDefaultCloseOperation(EXIT_ON_CLOSE);
		r.setVisible(true);
		r.setSize(640, 640);
		//r.pack();
		r.setTitle("Tutorial");
		
	}
}

