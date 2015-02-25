import java.util.ArrayList;
import java.util.Scanner;


public class ImageCoordinates {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Double> X = new ArrayList<Double>();
		ArrayList<Double> Y = new ArrayList<Double>();
		System.out.println("Beginning coordinate plotting");
		while(s.nextDouble()!=-1){
			System.out.println("Enter a beginning X-Coordinate");
			System.out.println("Enter a beginnning Y-Coordinate");
			double x = s.nextDouble();
			double y = s.nextDouble();
			X.add(x);
			Y.add(y);
			System.out.println("Enter an end X-Coordinate");
			System.out.println("Enter an end Y-Coordinate");
			 x = s.nextDouble();
			 y = s.nextDouble();
			X.add(x);
			Y.add(y);
		}
		System.out.print(X);
		
		
			
		}
		

	}
	
	

}
