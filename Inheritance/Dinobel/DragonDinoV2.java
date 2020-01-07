package Dinobel;

public class DragonDinoV2 extends DragonDino{
	protected String abilityname;
	protected String abilitydescription;

	public DragonDinoV2(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
	int noofwings, int noofscales, boolean canfly, String abilityname, String abilitydescription) {
	super(species, consumptiontype, canbreathfire, hasheatresistance, noofwings, noofscales, canfly);
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
	public void displaydinoability()
	{
	System.out.println("Ability Name:"+abilityname);
	System.out.println("Ability Description:"+abilitydescription);
	}
}
