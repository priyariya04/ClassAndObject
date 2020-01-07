package Dinobel;

public class SharkDinoV3 extends SharkDinoV2 {
	protected String superPowerName;
	protected String superPowerDescription;
	public SharkDinoV3(String species, String consumptiontype, boolean canBreathFire1, boolean hasHeatResistance1,
			int nooffins, int noofgills, boolean canswim, String abilityname, String abilitydescription,
			String superPowerName, String superPowerDescription) {
		super(species, consumptiontype, canBreathFire1, hasHeatResistance1, nooffins, noofgills, canswim, abilityname,
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
