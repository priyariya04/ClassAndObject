package Paintings;

public class OilCanvas extends Canvas implements ipaint {
	public OilCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		// TODO Auto-generated constructor stub
	}

	public void paint()
	{
		
		if(typeOfPaint.equals("oil"))
		{
			System.out.println("Can Paint"+canvasSize);
		}
		else
		{
			System.out.println("Can't Paint");
		}
	}
}
