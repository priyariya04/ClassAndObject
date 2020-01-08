package Machine;

import java.util.StringTokenizer;

public class Machine {
	private int coalPieces;
	private float hairStrand;
	private String coalMsg;
	public Machine(int coalPieces, float hairStrand, String coalMsg) {
		super();
		this.coalPieces = coalPieces;
		this.hairStrand = hairStrand;
		this.coalMsg = coalMsg;
	}
	public int getCoalPieces() {
		return coalPieces;
	}
	public void setCoalPieces(int coalPieces) {
		this.coalPieces = coalPieces;
	}
	public float getHairStrand() {
		return hairStrand;
	}
	public void setHairStrand(float hairStrand) {
		this.hairStrand = hairStrand;
	}
	public String getCoalMsg() {
		return coalMsg;
	}
	public void setCoalMsg(String coalMsg) {
		this.coalMsg = coalMsg;
	}
	public void produceShoePolish()
	{
		if(coalPieces>=5)
		{
			int total = coalPieces/5;
			total = coalPieces + (total*100);
			System.out.println(total);
		}
		else
		{
			System.out.println(coalPieces);
		}
		if(hairStrand>9.83)
		{
			float totalhair = (float) hairStrand/5;
			totalhair = hairStrand + (totalhair*100);
			System.out.println(totalhair);
		}
		else
		{
			System.out.println(hairStrand);
		}
		String str[] = coalMsg.split("\\s+");
		
		System.out.println(str.length);
	    
	    
		int count = 0,i;
		for(i=0;i< str.length;i++)
		{
			if("coal" .equals(str[i]))
			{
				count++;
				System.out.println(count);
			}
			if(count<2) {
				float total = count/2;
				System.out.println(total*100 +"ml");
			}
			else
			{
				System.out.println("No coal words");
			}
		}
		
		
	}
	
		}

