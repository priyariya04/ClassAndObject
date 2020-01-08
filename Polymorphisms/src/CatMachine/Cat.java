package CatMachine;

public class Cat {
	private float jumpHeight;
	private int distanceStrolled;
	private String soundsMade;
	public Cat(float jumpHeight, int distanceStrolled, String soundsMade) {
		super();
		this.jumpHeight = jumpHeight;
		this.distanceStrolled = distanceStrolled;
		this.soundsMade = soundsMade;
	}
	public float getJumpHeight() {
		return jumpHeight;
	}
	public void setJumpHeight(float jumpHeight) {
		this.jumpHeight = jumpHeight;
	}
	public int getDistanceStrolled() {
		return distanceStrolled;
	}
	public void setDistanceStrolled(int distanceStrolled) {
		this.distanceStrolled = distanceStrolled;
	}
	public String getSoundsMade() {
		return soundsMade;
	}
	public void setSoundsMade(String soundsMade) {
		this.soundsMade = soundsMade;
	}
	public void generateEnergy()
	{
		if(jumpHeight>=10.75)
		{
			float total = (float) (jumpHeight/10.75);
			total = (float) (jumpHeight +(total*7.2)); 
			System.out.println(total+" jouls for every 10.75m jouls");
		}
		else
		{
			System.out.println("Jump Height "+jumpHeight);
		}
		if(distanceStrolled>=172)
		{
			float dtotal = (float) (distanceStrolled/9.83);
			dtotal = (float) (distanceStrolled +(dtotal*12.35));
			System.out.println("Distance Strolled for "+dtotal+" jouls");
		}
		else
		{
			System.out.println("Distance Strolled :"+distanceStrolled);
		}
		String str[] = soundsMade.split(" ");
		int count =0;
		for(int i=0;i<str.length;i++) {
			if("memow".contentEquals(str[i]))
				count++;
		}
		if(count>27) {
			float total = count/5;
			System.out.println(total * 15 +"jouls for every 5 'memow'");
		}
		else
		{
			System.out.println("There is no word 'memow'");
		}
	}

}
