package Expo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		System.out.println("Enter type of paint(water/glass/oil): ");
		String typeofpaint = m.next();
		System.out.println("Enter the water painting rate:");
		int wr = m.nextInt();
		System.out.println("Enter the glass painting rate:");
		int gr = m.nextInt();
		System.out.println("Enter the oilr painting rate:");
		int orp = m.nextInt();
		if(typeofpaint.equalsIgnoreCase("water"))
		{
			System.out.println("Enter buy/sell painting");
			String listOfPaintings = m.next();
			ArtExpo ae=new ArtExpo(typeofpaint,orp,wr,gr,listOfPaintings);
			if(listOfPaintings.equalsIgnoreCase("buy"))
			{
				ae.buypainting();
			}
			else if(listOfPaintings.equalsIgnoreCase("sell"))
			{
				ae.sellpainting();
			}
		}
		else if(typeofpaint.equalsIgnoreCase("glass"))
		{
			System.out.println("Enter buy/sell painting");
			String listOfPaintings = m.next();
			BlackMarket ae=new BlackMarket(typeofpaint,orp,wr,gr,listOfPaintings);
			if(listOfPaintings.equalsIgnoreCase("buy"))
			{
				ae.buypainting();
			}
			else if(listOfPaintings.equalsIgnoreCase("sell"))
			{
				ae.sellpainting();
			}
		}
		else if(typeofpaint.equalsIgnoreCase("oil"))
		{
			System.out.println("Enter buy/sell painting");
			String listOfPaintings = m.next();
			Museum ae=new Museum(typeofpaint,orp,wr,gr,listOfPaintings);
			if(listOfPaintings.equalsIgnoreCase("buy"))
			{
				ae.buypainting();
				//System.out.println(rate);
			}
			else if(listOfPaintings.equalsIgnoreCase("sell"))
			{
				ae.sellpainting();
			}
		}

	}

}
