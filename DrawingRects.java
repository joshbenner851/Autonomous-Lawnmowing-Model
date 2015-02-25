import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawingRects extends JPanel {
	//draw |_- than \ than half circle down
		//draw lines from | to \
		//draw lines from | to half circle
		//find length of all lines drawn inside shape
		//find length traveled to turn and go
		//x location, y loc, how wide, how tall
	public void paint(Graphics g) {
		
		//find slope - use to calculate position 
		ArrayList <Integer> Xpos = new ArrayList<Integer>();
		ArrayList <Integer> Ypos = new ArrayList<Integer>();

		//contain all the x and y coordinates for horizontal lines
		ArrayList <Integer> HorizXOutline = new ArrayList<Integer>();
		ArrayList <Integer> HorizYOutline = new ArrayList<Integer>();
		//contain all x any y points for veritical lines
		ArrayList <Integer> VertOutlineX = new ArrayList<Integer>();
		ArrayList <Integer> VertOutlineY = new ArrayList<Integer>();
		//contain all x and y points of postive and pos diag lines
		ArrayList <Integer> PosDiagOutlineX = new ArrayList<Integer>();
		ArrayList <Integer> PosDiagOutlineY = new ArrayList<Integer>();
		//contain all x and y points of postive and neg diag lines
		ArrayList <Integer> NegDiagOutlineX = new ArrayList<Integer>();
		ArrayList <Integer> NegDiagOutlineY = new ArrayList<Integer>();

		g.setColor(Color.green);
		//adding outer shape x coord
		Xpos.add(100);Xpos.add(100);Xpos.add(100);Xpos.add(200);
		Xpos.add(200);Xpos.add(300);Xpos.add(100);Xpos.add(200);
		Xpos.add(300);Xpos.add(400);Xpos.add(300);Xpos.add(350);
		Xpos.add(400);Xpos.add(350);Xpos.add(300);Xpos.add(350);
		Xpos.add(400);Xpos.add(350);Xpos.add(200);Xpos.add(300);//Xpos.add(120);Xpos.add(120);
		System.out.println(Xpos.size());
		//g.drawArc(100, 10, 200, 200, 0, 360);
		//adding outer shape y coord
		Ypos.add(100);Ypos.add(10);Ypos.add(10);Ypos.add(10);
		Ypos.add(10);Ypos.add(110);Ypos.add(100);Ypos.add(200);
		Ypos.add(300);Ypos.add(300);Ypos.add(300);Ypos.add(180);
		Ypos.add(300);Ypos.add(180);Ypos.add(300);Ypos.add(420);
		Ypos.add(300);Ypos.add(420);Ypos.add(200);Ypos.add(110);//Ypos.add(100);Ypos.add(10);
		for(int x =0;x<Xpos.size();x+=2){
			g.drawLine(Xpos.get(x), Ypos.get(x), Xpos.get(x+1), Ypos.get(x+1));
			if(Ypos.get(x)==Ypos.get(x+1)){
				HorizXOutline.add(x);HorizXOutline.add(x+1);
				HorizYOutline.add(x);HorizYOutline.add(x+1);
				g.drawLine(Xpos.get(x),Ypos.get(x)+20,Xpos.get(x+1),Ypos.get(x+1)+20);
			}
			else if(Xpos.get(x)==Xpos.get(x+1)){
				VertOutlineX.add(x);VertOutlineX.add(x+1);
				VertOutlineY.add(x);VertOutlineY.add(x+1);
				g.drawLine(Xpos.get(x)+20,Ypos.get(x),Xpos.get(x+1)+20,Ypos.get(x+1));
			}
			if((Ypos.get(x+1)-Ypos.get(x))!=0)
			{
				int slope = (Xpos.get(x)-Xpos.get(x+1))/(Ypos.get(x+1)-Ypos.get(x));
				if(slope<0){
					NegDiagOutlineX.add(x);NegDiagOutlineX.add(x+1);
					NegDiagOutlineY.add(x);NegDiagOutlineY.add(x+1);
					if(Xpos.get(x)<=100){
						g.drawLine(Xpos.get(x),Ypos.get(x)-20,Xpos.get(x+1)+10,Ypos.get(x+1)-10);
					}
					else{
					g.drawLine(Xpos.get(x),Ypos.get(x)+20,Xpos.get(x+1)-10,Ypos.get(x+1)+10);
					}
				}
				else if(slope>0){
					PosDiagOutlineX.add(x);PosDiagOutlineX.add(x+1);
					PosDiagOutlineY.add(x);PosDiagOutlineY.add(x+1);
					g.drawLine(Xpos.get(x)-10,Ypos.get(x)-10,Xpos.get(x+1)-10,Ypos.get(x+1)-10);
				}
			}
		}
		
//	    for(int x = 0;x<=120;x+=10){
//	    	//change in x-3900/-13 = Xpos
//	    	int xpos1 = (int)(350 +(x/10)*(-50/11));
//	    	int xpos2 = (int)(350+(x/10)*(50/11));
//	    	int ypos = 180+x;
//	    	g.setColor(Color.red);
//	    	g.drawLine(xpos1, ypos, xpos2, ypos);
//	    	Xpos.add(xpos1);Ypos.add(ypos);Xpos.add(xpos2);Ypos.add(ypos);
//	    }
//	   // g.setColor(Color.blue);
//	   ////.drawRect(200, 100, 100, 100);
//	   // g.setColor(Color.red);
//	    double slope = (300-200)/(110-10);
//	    int y = (int) (100-slope*20);
//	   // g.drawRect(220, 130-y, 100, 100);
//	    for(int x = 20;x<=100;x+=10){
//	    	//Y=slope*x+0    :  (Y)/slope = X where Y = interval of 20
//	    	int ypos = (int)(x/slope)+190;
//	    	g.drawLine(100, x, ypos, x);
//	    	Xpos.add(100);Ypos.add(x);Xpos.add(ypos);Ypos.add(x);
//	    }
	   // g.drawLine(300, 100, 200, 200);
//	    for(int x = 100;x<=200;x+=10){
//	    	double circleypos =  200+ Math.sqrt((200-x)*100);
//	    	g.drawLine(x, x, (int)(circleypos), x);
//	    	
//	    }
	    double totalDist=0;
	    for(int x=0; x<Xpos.size();x+=2){
	    int xd = Xpos.get(x+1)-Xpos.get(x); xd = xd*xd;
	    int yd = Ypos.get(x+1)-Ypos.get(x); yd = yd*yd;
	    int distance  = (int) (Math.sqrt(xd+yd));
	    totalDist +=distance;
	    System.out.println("The length of this line is" + distance + " and the total distance as of now is " + totalDist);
	  }
	}
	
	public static void main(String [] args){
		DrawingRects r = new DrawingRects();
		Scanner s = new Scanner(System.in);
		String input = s.next();
		while(input!="done"){
		System.out.println("Please continue to enter input");
		String a = s.next();
		if(a.equals("done")){
			break;
		}
		}
		if(input.equals("done")){
		JFrame j = new JFrame();
		j.setSize(600,600);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.add(r);
		}
	}

	}

