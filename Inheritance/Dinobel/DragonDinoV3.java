package Dinobel;

public class DragonDinoV3 extends DragonDinoV2{
	protected String superPowerName;
	protected String superPowerDescription;
	public DragonDinoV3(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
			int noofwings, int noofscales, boolean canfly, String abilityname, String abilitydescription) {
		super(species, consumptiontype, canbreathfire, hasheatresistance, noofwings, noofscales, canfly, abilityname,
				abilitydescription);
		this.superPowerName = superPowerName;
		this.superPowerDescription = superPowerDescription;
	}
	public String getSuperPowerName() {
		return superPowerName;
	}
	public void setSuperPowerName(String superPowerName) {
		this.superPowerName = superPowerName;
	}
	public String getSuperPowerDescription() {
		return superPowerDescription;
	}
	public void setSuperPowerDescription(String superPowerDescription) {
		this.superPowerDescription = superPowerDescription;
	}
	public void displayDinoSuperPower() {
		System.out.println("Super Power Name:"+superPowerName);
		System.out.println("Super Power Description:"+superPowerDescription);
	}
	
}
