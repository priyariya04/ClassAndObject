package Expo;

public class BlackMarket extends Expo implements iTrade{
	
	private String listOfPaintings;

	public BlackMarket(String typeOfPaintings, int wr, int gr, int orp, String listOfPaintings) {
		super(typeOfPaintings, wr, gr, orp);
		this.listOfPaintings = listOfPaintings;
	}

	public String getListOfPaintings() {
		return listOfPaintings;
	}

	public void setListOfPaintings(String listOfPaintings) {
		this.listOfPaintings = listOfPaintings;
	}
	public float buypainting()
	{
		float rate=(float) (gr*2.5);
		return rate;
		
	}
	public float sellpainting()
	{
		float rate=(float) (gr*1.25);
		return rate;
		
	}

}
