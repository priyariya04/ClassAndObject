package Dinobel;

public class SharkDinoV2 extends SharkDino{
	protected String abilityname;
	protected String abilitydescription;
	public SharkDinoV2(String species, String consumptiontype, boolean canBreathFire1, boolean hasHeatResistance1,
			int nooffins, int noofgills, boolean canswim, String abilityname, String abilitydescription) {
		super(species, consumptiontype, canBreathFire1, hasHeatResistance1, nooffins, noofgills, canswim);
		this.abilityname = abilityname;
		this.abilitydescription = abilitydescription;
	}
	public String getAbilityname() {
		return abilityname;
	}
	public void setAbilityname(String abilityname) {
		this.abilityname = abilityname;
	}
	public String getAbilitydescription() {
		return abilitydescription;
	}
	public void setAbilitydescription(String abilitydescription) {
		this.abilitydescription = abilitydescription;
	}
	public void displayDinoAbility()
	{
	System.out.println("Ability Name:"+abilityname);
	System.out.println("Ability Description:"+abilitydescription);
	}
}
