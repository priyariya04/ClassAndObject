package BusBooking;

public class TicketBooking {
	private int npass;
	private int price;
	private boolean sleeper;
	private boolean ac;
	private boolean wifi;
	private int nchild;
	public TicketBooking(int npass, int price, boolean sleeper, boolean ac , boolean wifi, int nchild) {
		super();
		this.npass = npass;
		this.price = price;
		this.sleeper = sleeper;
		this.ac = ac;
		this.wifi = wifi;
		this.nchild = nchild;
		
	}
	public int getNpass() {
		return npass;
	}
	public void setNpass(int npass) {
		this.npass = npass;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isSleeper() {
		return sleeper;
	}
	public void setSleeper(boolean sleeper) {
		this.sleeper = sleeper;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public int getNchild() {
		return nchild;
	}
	public void setNchild(int nchild) {
		this.nchild = nchild;
	}
	
	
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public void bookTicket(int npass, int price) {
		int total = npass * price;
		System.out.println("Total Amount : passenger and price"+total);
	}
	
	public void bookTicket(int npass,int price, boolean sleeper, boolean ac) {
		int tot = 0;
		int total = npass * price;
		if(sleeper == true)
		{
			tot = total + 250;
		}
		if(ac ==true)
		{
			tot = total + 350;
		}
		System.out.println("Total amount : passenger and price and ac or sleeper "+tot);
	}
	
	public void bookTicket(int npass, int price, boolean sleeper, boolean ac , boolean wifi)
	{
		int tot = 0;
		int total = npass * price;
		if(sleeper == true)
		{
			tot = total +250;
		}
		if(ac ==true)
		{
			tot = total + 350;
		}
		if(wifi ==true)
		{
			tot = total + 250;
		}
		System.out.println("Total amount : passenger and price and ac or sleeper or wifi"+tot);
	}
	
}
