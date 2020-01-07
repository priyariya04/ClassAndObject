package Dinobel;

public class LizardDinoV3 extends LizardDinoV2{
	protected String superPowerName;
	protected String superPowerDescription;
	public LizardDinoV3(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
			int noofclaw, int nooflegs, boolean canrun, String abilityname, String abilitydescription,
			String superPowerName, String superPowerDescription) {
		super(species, consumptiontype, canbreathfire, hasheatresistance, noofclaw, nooflegs, canrun, abilityname,
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
