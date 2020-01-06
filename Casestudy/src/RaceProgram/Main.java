package RaceProgram;

import java.util.Scanner;


public class Main {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LapManager manager = new LapManager();
		RaceManager rmanager = new RaceManager();
		Scanner sc = new Scanner(System.in);
		//sc.close();
		int n=sc.nextInt();
		
		byte lapNo ;
		byte throwsMade;
		String fastestPlayer;
		float fastestTime;
		
		byte raceNo ;
		byte noOfLaps;
		String winningPlayer;
		LapManager lapManager = null;
		
		Lap l[] = new Lap[n];
		Race r[] = new Race[n];
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter Lap Number");
		lapNo=sc.nextByte();
		System.out.println("Enter Maximum throws");
		throwsMade=sc.nextByte();
		System.out.println("Enter Player name");
		fastestPlayer=sc.next();
		System.out.println("Enter  Best time");
		fastestTime=sc.nextFloat();
		
		System.out.println("Enter Race Number");
		raceNo=sc.nextByte();
		System.out.println("Enter Number of Laps");
		noOfLaps=sc.nextByte();
		System.out.println("Enter Winning Player name");
		winningPlayer=sc.next();

		
		l[i]=new Lap(lapNo,throwsMade,fastestPlayer,fastestTime);
		
		r[i] =  new Race(raceNo,noOfLaps,winningPlayer,lapManager);

		}
		manager.displayAllLaps(l);
		manager.displayFastestInLap(l,(byte)103);
		manager.displayMaximumThrows(l);
		rmanager.displayAllRaceDetails(r);
		rmanager.displayRacesWonBy(r, String);
	}

}
