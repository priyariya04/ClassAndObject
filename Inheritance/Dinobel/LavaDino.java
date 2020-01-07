package Dinobel;

public class LavaDino extends Dinosaur {
	protected boolean canBreatheFire;
	protected boolean hasHeatResistance;
	
	public LavaDino(String species, String consumptiontype, boolean canBreatheFire, boolean hasHeatResistance) {
		super(species, consumptiontype);
		this.canBreatheFire = canBreatheFire;
		this.hasHeatResistance = hasHeatResistance;
		}

	public boolean isCanBreatheFire() {
		return canBreatheFire;
	}

	public void setCanBreatheFire(boolean canBreatheFire) {
		this.canBreatheFire = canBreatheFire;
	}

	public boolean isHasHeatResistance() {
		return hasHeatResistance;
	}

	public void setHasHeatResistance(boolean hasHeatResistance) {
		this.hasHeatResistance = hasHeatResistance;
	}
	public void displaylavadinodetails()
	{
	System.out.println("Dino Report");
	if(canBreatheFire==true)
	{
		System.out.println(species+"Breath Fire ");
	}
	else
	{
		System.out.println(species +"Can't Breadth Fire");
		 
	}
	if(hasHeatResistance==true)
	{
		System.out.println("Resistance to heat");
	}
	else
	{
		System.out.println("Not Resistance heat");
	}
		
	
	
	}

}
