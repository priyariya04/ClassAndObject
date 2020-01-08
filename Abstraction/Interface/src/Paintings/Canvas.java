package Paintings;

public class Canvas implements ipaint{
	protected String typeOfPaint;
	protected int canvasSize;
	
	public Canvas(String typeOfPaint, int canvasSize) {
		super();
		this.typeOfPaint = typeOfPaint;
		this.canvasSize = canvasSize;
	}
	public String getTypeOfPaint() {
		return typeOfPaint;
	}
	public void setTypeOfPaint(String typeOfPaint) {
		this.typeOfPaint = typeOfPaint;
	}
	public int getCanvasSize() {
		return canvasSize;
	}
	public void setCanvasSize(int canvasSize) {
		this.canvasSize = canvasSize;
	}
	public void paint()
	{
		
		System.out.println("Type Of Paint :"+this.getTypeOfPaint());
		System.out.println("Canvas Size : "+this.getCanvasSize());
	}
}
