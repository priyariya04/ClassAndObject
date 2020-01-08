package Paintings;

public class RegularCanvas extends Canvas implements ipaint{
	
	public RegularCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		// TODO Auto-generated constructor stub
		
	}

	public void paint()
	{
		if(typeOfPaint.equals("water"))
		{
			System.out.println("Can Paint"+canvasSize);
		}
		else
		{
			System.out.println("Can't Paint");
		}
	}
}
