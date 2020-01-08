package Paintings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		System.out.println("Enter type of paint");
		String typeOfPaint = m.next();
		System.out.println("Enter Canvas Size");
		int canvasSize = m.nextInt();
		System.out.println("Enter the choice : ");
		System.out.println("1.Water Canvas \n2.Glass Canvas \n3.Oil Canvas");
		int n = m.nextInt();
		ipaint c = new Canvas(typeOfPaint,canvasSize);
		c.paint();
		switch(n)
		{
		case 1 : 
			RegularCanvas rc = new RegularCanvas(typeOfPaint,canvasSize);
			rc.paint();
		break;
		case 2 :
			GlassCanvas gc = new GlassCanvas(typeOfPaint,canvasSize);
			gc.paint();
			break;
		case 3 :
			OilCanvas oc = new OilCanvas(typeOfPaint,canvasSize);
			oc.paint();
			break;
		}
		
		
	}

}
