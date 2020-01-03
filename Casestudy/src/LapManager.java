package Lap;


public class LapManager {

	public void displayAllLaps(Lap[] lapList)    
	{
	System.out.println("Lap number\tMaxmimum throws\tPlayer Name\tTiming\n");
	for(Lap m:lapList)
	{
	System.out.println(String.format("%-10s\t%-10s\t%-20s\t%-20s",m.lapNo,m.throwsMade,m.fastestPlayer,m.fastestTime));

	}
	}
	
	public void  displayFastestInLap(Lap[] lapList,byte lapNo)

	{
	float max=1000,maa=0;
	String fastestPlayer = null;

	for(Lap m:lapList)
	{
	  if((max<m.fastestTime))
	  {
	  maa=m.fastestTime;
	  fastestPlayer=m.fastestPlayer;
	  
	  }
	 }
	
	System.out.println("\nFastest Player :"+fastestPlayer+"\nFastest time :"+maa+"\n\n");
	}

	                                             
	    public void displayMaximumThrows(Lap[] laplist)
	    {
	    byte max=0;

	for(Lap m:laplist)
	{
	  if((max<m.throwsMade))
	  {
	  max=m.throwsMade;
	  }
	}
	System.out.println("Max throws :"+max);

	} 


}
