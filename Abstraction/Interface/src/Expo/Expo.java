package Expo;

public class Expo {
	
	protected String typeOfPaintings;
	protected int wr,gr,orp;
	public Expo(String typeOfPaintings, int wr, int gr, int orp) {
		super();
		this.typeOfPaintings = typeOfPaintings;
		this.wr = wr;
		this.gr = gr;
		this.orp = orp;
	}
	public String getTypeOfPaintings() {
		return typeOfPaintings;
	}
	public void setTypeOfPaintings(String typeOfPaintings) {
		this.typeOfPaintings = typeOfPaintings;
	}
	public int getWr() {
		return wr;
	}
	public void setWr(int wr) {
		this.wr = wr;
	}
	public int getGr() {
		return gr;
	}
	public void setGr(int gr) {
		this.gr = gr;
	}
	public int getOr() {
		return orp;
	}
	public void setOr(int orp) {
		this.orp = orp;
	}
		

}
