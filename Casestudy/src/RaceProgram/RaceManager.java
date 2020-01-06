package RaceProgram;

public class RaceManager {
	public void displayAllRaceDetails(Race[] raceList) {
		System.out.println("Race number\tNumber Of Laps\tPlayer Name\tLap Manager\n");
		for(Race m:raceList)
		{
		System.out.println(m.raceNo+"\t"+m.noOfLaps+"\t"+m.winningPlayer+"\t"+m.lapManager);

		}
		
		
	}
	public void displayRaceswithLaps(Race[] raceList , byte noOfLaps) {
		
	}
public void displayRacesWonBy(Race[] raceList, String wonBy) {
	System.out.println("Winning Player Name\t");
	for(Race m:raceList)
	{
	System.out.println(m.winningPlayer+"\t");

	}
	
	
}
	
public void displayLapsForRace(Race[] raceList, byte raceNo) {
	
	
}

}
