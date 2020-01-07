package Dinobel;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Dinosaur \n2.Lava Dinosaur \n3.Dragon Dianosaur \n4.Shark Dinosaur"
				+ "\n5.Lizard Dino \n6.Dragon Dinosur V2 \n7.Shark Dinosur V2 \n8.Lizard Dinosur V2 \n9. Dragon Dinosur V3"
				+ "\n10. Shark Dinosur V3 \n11. Lizard Dinosur V3");
		System.out.println("Enter type: ");
		int n = sc.nextInt();
		System.out.println("Enter species:");
		String species=sc.next();
		System.out.println("Enter Consumption:");
		String consumptiontype=sc.next();
		
		switch(n)
		{
		case 1:
				
				Dinosaur d=new Dinosaur(species,consumptiontype);
				d.displaydinodetails();
		break;
		case 2:
			System.out.println("Is breath Fire : ");
			boolean canBreathFire = sc.nextBoolean();
			System.out.println();
			System.out.println("Has Heat Resistance : ");
			boolean hasHeatResistance = sc.nextBoolean();
			LavaDino ld=new LavaDino(species,consumptiontype,canBreathFire,hasHeatResistance);
			ld.displaylavadinodetails();
		break;
		case 3:
			System.out.println("Is breath Fire : ");
			boolean canBreathFire1 = sc.nextBoolean();
			System.out.println();
			System.out.println("Has Heat Resistance : ");
			boolean hasHeatResistance1 = sc.nextBoolean();
			System.out.println("Enter no.of wings : ");
			int numberOfWings = sc.nextInt();
			System.out.println("Enter no.of Scales : ");
			int numberOfScales = sc.nextInt();
			System.out.println("Can Fly : ");
			boolean canfly = sc.hasNextBoolean();
			DragonDino dd=new DragonDino(species,consumptiontype,canBreathFire1,hasHeatResistance1,numberOfWings,numberOfScales,canfly);
			dd.displaydddetails();
		break;
		case 4:
			System.out.println("Breathes fire (t/f) :");
			boolean canBreathFire2=sc.nextBoolean();
			System.out.println("Is heat Resistence (t/f):");
			boolean hasHeatResistance2=sc.nextBoolean();
			System.out.println("Enter no of wings:");
			int noOfWings2=sc.nextInt();
			System.out.println("Enter no of Scales:");
			int noOfScales2=sc.nextInt();
			System.out.println("Can fly (t/f):");
			boolean canfly2=sc.nextBoolean();
			System.out.println("Enter no of Fins:");
			int nooffins=sc.nextInt();
			System.out.println("Enter no of gills:");
			int noofgills=sc.nextInt();
			System.out.println("Can Swim (t/f):");
			boolean canswim=sc.nextBoolean();
			SharkDino sd=new SharkDino(species,consumptiontype,canBreathFire2,hasHeatResistance2,noOfWings2,noOfScales2,canswim);
			sd.displaysddetails();
		break;
		case 5:

			System.out.println("Is breath fire: ");
			boolean canbreathfire3=sc.nextBoolean();
			System.out.println("Has heat Resistence: ");
			boolean hasheatresistance3=sc.nextBoolean();
			System.out.println("Enter no of claws:");
			int noofclaw=sc.nextInt();
			System.out.println("Enter no of legs:");
			int nooflegs=sc.nextInt();
			System.out.println("Can Run:");
			boolean canrun=sc.nextBoolean();
			LizardDino lzd=new LizardDino(species,consumptiontype,canbreathfire3,hasheatresistance3,noofclaw,nooflegs,canrun);
			lzd.displayldinodetails();
		break;
		case 6:
			System.out.println("Breathes fire:");
			boolean canbreathfire4=sc.nextBoolean();

			System.out.println("Enter no of wings:");
			int noofwings4=sc.nextInt();
			System.out.println("Is heat Resistence:");
			boolean hasheatresistance4=sc.nextBoolean();
			System.out.println("Enter no of Scales:");
			int noofscales4=sc.nextInt();
			System.out.println("Can fly:");
			boolean canfly4=sc.nextBoolean();
			System.out.println("Enter the ability name:");
			String abilityname=sc.next();
			System.out.println("Enter ability Description:");
			String abilitydescription=sc.next();
			DragonDinoV2 dd2=new DragonDinoV2(species,consumptiontype,canbreathfire4,hasheatresistance4,noofwings4,noofscales4,canfly4,
			abilityname,abilitydescription);
			dd2.displaydinoability();
		break;
		case 7:
			System.out.println("Breathes fire:");
			boolean canbreathfire5=sc.nextBoolean();

			System.out.println("Enter no of wings:");
			int noofwings5=sc.nextInt();
			System.out.println("Is heat Resistence:");
			boolean hasheatresistance5=sc.nextBoolean();
			System.out.println("Enter no of Scales:");
			int noofscales5=sc.nextInt();
			System.out.println("Can fly:");
			boolean canfly5=sc.nextBoolean();
			System.out.println("Enter the ability name:");
			String abilityname1=sc.next();
			System.out.println("Enter ability Description:");
			String abilitydescription1=sc.next();
			SharkDinoV2 sd2=new SharkDinoV2(species,consumptiontype,canbreathfire5,hasheatresistance5,noofwings5,noofscales5,canfly5,
			abilityname1,abilitydescription1);
			sd2.displayDinoAbility();
		break;
		case 8:
			System.out.println("Breathes fire:");
			boolean canbreathfire6=sc.nextBoolean();

			System.out.println("Enter no of wings:");
			int noofwings6=sc.nextInt();
			System.out.println("Is heat Resistence:");
			boolean hasheatresistance6=sc.nextBoolean();
			System.out.println("Enter no of Scales:");
			int noofscales6=sc.nextInt();
			System.out.println("Can fly:");
			boolean canfly6=sc.nextBoolean();
			System.out.println("Enter the ability name:");
			String abilityname2=sc.next();
			System.out.println("Enter ability Description:");
			String abilitydescription2=sc.next();
			LizardDinoV2 ld2=new LizardDinoV2(species,consumptiontype,canbreathfire6,hasheatresistance6,noofwings6,noofscales6,
					canfly6,abilityname2,abilitydescription2);
			ld2.displayDinoAbility();
		break;
		case 9:
			System.out.println("Breathes fire:");
			boolean canbreathfire7=sc.nextBoolean();

			System.out.println("Enter no of wings:");
			int noofwings7=sc.nextInt();
			System.out.println("Is heat Resistence:");
			boolean hasheatresistance7=sc.nextBoolean();
			System.out.println("Enter no of Scales:");
			int noofscales7=sc.nextInt();
			System.out.println("Can fly:");
			boolean canfly7=sc.nextBoolean();
			System.out.println("Enter the ability name:");
			System.out.println("Enter the super power name:");
			String superPowerName=sc.next();
			System.out.println("Enter super power Description:");
			String superPowerDescription=sc.next();
			DragonDinoV3 dd3=new DragonDinoV3(species,consumptiontype,canbreathfire7,hasheatresistance7,noofwings7,noofscales7,
					canfly7,superPowerName,superPowerDescription);
			dd3.displayDinoSuperPower();
		break;
		case 10:
			System.out.println("Breathes fire:");
			boolean canbreathfire8=sc.nextBoolean();

			System.out.println("Enter no of wings:");
			int noofwings8=sc.nextInt();
			System.out.println("Is heat Resistence:");
			boolean hasheatresistance8=sc.nextBoolean();
			System.out.println("Enter no of Scales:");
			int noofscales8=sc.nextInt();
			System.out.println("Can fly:");
			boolean canfly8=sc.nextBoolean();
			System.out.println("Enter the ability name:");
			String abilityname3=sc.next();
			System.out.println("Enter ability Description:");
			String abilitydescription3=sc.next();
			System.out.println("Enter the super power name:");
			String superPowerName1=sc.next();
			System.out.println("Enter super power Description:");
			String superPowerDescription1=sc.next();
			LizardDinoV3 ld3=new LizardDinoV3(species,consumptiontype,canbreathfire8,hasheatresistance8,noofwings8,noofscales8,
					canfly8,superPowerName1,superPowerDescription1, abilityname3, abilitydescription3);
			ld3.displayDinoSuperPower();
		break;
		case 11:
			System.out.println("Breathes fire:");
			boolean canbreathfire9=sc.nextBoolean();

			System.out.println("Enter no of wings:");
			int noofwings9=sc.nextInt();
			System.out.println("Is heat Resistence:");
			boolean hasheatresistance9=sc.nextBoolean();
			System.out.println("Enter no of Scales:");
			int noofscales9=sc.nextInt();
			System.out.println("Can fly:");
			boolean canfly9=sc.nextBoolean();
			System.out.println("Enter the ability name:");
			String abilityname4=sc.next();
			System.out.println("Enter ability Description:");
			String abilitydescription4=sc.next();
			System.out.println("Enter the super power name:");
			String superPowerName2=sc.next();
			System.out.println("Enter super power Description:");
			String superPowerDescription2=sc.next();
			SharkDinoV3 sd3=new SharkDinoV3(species,consumptiontype,canbreathfire9,hasheatresistance9,noofwings9,noofscales9,
					canfly9,superPowerName2,superPowerDescription2, abilityname4, abilitydescription4);
			sd3.displayDinoSuperPower();
		break;
	}

}
}
