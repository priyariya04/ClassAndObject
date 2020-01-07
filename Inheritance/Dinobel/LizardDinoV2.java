package Dinobel;

public class LizardDinoV2 extends LizardDino {
	protected String abilityname;
	protected String abilitydescription;
	public LizardDinoV2(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
			int noofclaw, int nooflegs, boolean canrun, String abilityname, String abilitydescription) {
		super(species, consumptiontype, canbreathfire, hasheatresistance, noofclaw, nooflegs, canrun);
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
