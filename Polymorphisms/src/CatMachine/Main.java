package CatMachine;

import java.util.Scanner;
public class Main {
	private static float totalEnergy;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Energy Reserve : ");
		float energyReserve = m.nextFloat();
		System.out.println("Enter Energy : ");
		float energy = m.nextFloat();
		System.out.println("Enter Remainig Energy : ");
		float remainingEnergy = m.nextFloat();
		System.out.println("Enter Jump Height : ");
		float jumpHeight = m.nextFloat();
		System.out.println("Enter Distance Enrolled : ");
		int distanceStrolled = m.nextInt();
		System.out.println("Enter Sound String : ");
		String soundsMade = m.next();
		
		Machine ma = new Machine(energyReserve,energy,remainingEnergy, jumpHeight);
		ma.addEnergy(energyReserve, energy);
		ma.runfan(remainingEnergy, totalEnergy);
		Cat c = new Cat(jumpHeight,distanceStrolled,soundsMade);
		c.generateEnergy();
	}

}
