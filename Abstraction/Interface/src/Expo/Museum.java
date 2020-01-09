package Expo;

public class Museum extends  Expo implements iTrade{
	
	private String listOfPaintings;

	public Museum(String typeOfPaintings, int wr, int gr, int orp, String listOfPaintings) {
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
		float rate=(float) (orp*1.5);
		return 0;
		
		
	}
	public float sellpainting()
	{
		float rate=(float) (orp*1.25);
		return rate;
		
	}


}
