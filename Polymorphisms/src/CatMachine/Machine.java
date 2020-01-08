package CatMachine;

public class Machine {
	private float energyReserve;
	private float energy;
	private float remainingEnergy;
	private float totalenergy;
	public Machine(float energyReserve, float energy, float remainingEnergy, float totalenergy) {
		super();
		this.energyReserve = energyReserve;
		this.energy = energy;
		this.remainingEnergy = remainingEnergy;
		this.totalenergy = totalenergy;
	}
	public float getEnergyReserve() {
		return energyReserve;
	}
	public void setEnergyReserve(float energyReserve) {
		this.energyReserve = energyReserve;
	}
	public float getEnergy() {
		return energy;
	}
	public void setEnergy(float energy) {
		this.energy = energy;
	}
	public float getRemainingEnergy() {
		return remainingEnergy;
	}
	public void setRemainingEnergy(float remainingEnergy) {
		this.remainingEnergy = remainingEnergy;
	}
	public float getTotalenergy() {
		return totalenergy;
	}
	public void setTotalenergy(float totalenergy) {
		this.totalenergy = totalenergy;
	}
	public void addEnergy(float energyReserve2,float energy2) {
		float totalEnergy = energyReserve2+energy2;
		System.out.println("Total Energy : "+totalEnergy);
	}
	public void runfan(float remainingEnergy, float totalEnergy) {
		float tenergy = totalEnergy - remainingEnergy;
		System.out.println("Run Fan for Remaining Energy :"+tenergy);
	}
}
