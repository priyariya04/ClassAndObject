package Expo;

public class ArtExpo extends Expo implements iTrade{

	private String listOfPaintings;

	public ArtExpo(String typeOfPaintings, int wr, int gr, int orp, String listOfPaintings) {
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
		float rate=(float) (wr*2.5);
		return rate;
		
	}
	public float sellpainting()
	{
		float rate=(float) (wr*1.25);
		return rate;
		
	}

}
