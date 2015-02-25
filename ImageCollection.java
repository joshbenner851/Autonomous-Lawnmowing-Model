import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
public class ImageCollection extends {

	public ImageCollection(){
		JPanel panel = new JPanel();
		
	}
	Color[] Color2  = {Color.red,Color.green,Color.blue, Color.black, Color.cyan, Color.yellow,Color.LIGHT_GRAY,Color.magenta,Color.orange,Color.pink};
		public void drawRects(Graphics g){
		for(int x=0;x<10;x++){
			g.drawRect(10, 10, 10, 10);
		}
	}
		public class RectangleComponent extends JComponent{
			private int xLeft;
			private int yTop;
			public RectangleComponent()
			{
			    xLeft = (int)(Math.random()*100);
			    yTop = (int)(Math.random()*100);
			}
			public void paintComponent(Graphics g)
			{
			    Graphics2D g2 = (Graphics2D) g;
			    Rectangle rec = new Rectangle(xLeft, yTop, 20, 40);
			    g2.draw(rec);
			}
	private Image collection = null;
	public static void Main(String args){
		//builds arraylist of images, must be 10 images in it
	ArrayList <Image> images = new ArrayList<Image>();
	for(int x=9;x>=0;x--){
		//creates random index, possible indexes decrease as images are removed
		int a = (int)(Math.random()*images.size());
		//outprinting image- should display image
		//next button will start process over again, displaying a new image
		System.out.println(images.get(a));
		//removes image
		images.remove(a);
		
	}
	
	
}
}
