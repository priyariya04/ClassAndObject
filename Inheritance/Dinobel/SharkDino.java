package Dinobel;

public class SharkDino extends LavaDino{
	protected int nooffins;
	protected int noofgills;
	protected boolean canswim;


	public SharkDino(String species, String consumptiontype, boolean canBreathFire1, boolean hasHeatResistance1,
	int nooffins, int noofgills, boolean canswim) {
	super(species, consumptiontype, canBreathFire1, hasHeatResistance1);
	this.nooffins = nooffins;
	this.noofgills = noofgills;
	this.canswim = canswim;
	}


	public int getNooffins() {
		return nooffins;
	}


	public void setNooffins(int nooffins) {
		this.nooffins = nooffins;
	}


	public int getNoofgills() {
		return noofgills;
	}


	public void setNoofgills(int noofgills) {
		this.noofgills = noofgills;
	}


	public boolean isCanswim() {
		return canswim;
	}


	public void setCanswim(boolean canswim) {
		this.canswim = canswim;
	}
	public void displaysddetails()
	{
	System.out.println("Dino species details about LavaDino");
	if(canBreatheFire==true)
	{
	System.out.println(species+" breath fire");
	}
	else {
	System.out.println(species+" can't breath fire");
	}
	if(hasHeatResistance==true)
	{
	System.out.println("It is Resistent to heat ");
	}
	else {
	System.out.println("It is not Resistent to heat ");
	}
	
	if(canswim==true)
	{
	System.out.println("It can swim ");
	}
	else {
	System.out.println("It can't swim ");
	}
	
	}
}
