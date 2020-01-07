package Dinobel;

public class DragonDino extends LavaDino{
	protected int numberOfWings;
	protected int numberOfScales;
	protected boolean canfly;
	public DragonDino(String species, String consumptiontype, boolean canBreathFire, boolean hasHeatResistance,
			int numberOfWings, int numberOfScales, boolean canfly) {
		super(species, consumptiontype, canBreathFire, hasHeatResistance);
		this.numberOfWings = numberOfWings;
		this.numberOfScales = numberOfScales;
		this.canfly = canfly;
	}
	public int getNumberOfWings() {
		return numberOfWings;
	}
	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}
	public int getNumberOfScales() {
		return numberOfScales;
	}
	public void setNumberOfScales(int numberOfScales) {
		this.numberOfScales = numberOfScales;
	}
	public boolean isCanfly() {
		return canfly;
	}
	public void setCanfly(boolean canfly) {
		this.canfly = canfly;
	}
	
	public void displaydddetails()
	{
		if(canBreatheFire==true)
		{
			System.out.println(species+" breath fire");
		}
		else
		{
			System.out.println(species+" can't breath fire");
		}
		if(hasHeatResistance==true)
		{
			System.out.println("It is Resistant to heat");
		}
		else
		{
			System.out.println("Not resistant to heat");
		}
		if(canfly==true)
		{
			System.out.println(species+" can fly");
		}
		else
		{
			System.out.println(species+" is can't fly");
		}
	}
}
