package Paintings;

public class GlassCanvas extends Canvas implements ipaint{
	public GlassCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		// TODO Auto-generated constructor stub
	}

	public void paint()
	{
		if(typeOfPaint.equals("glass"))
		{
			System.out.println("Can Paint"+canvasSize);
		}
		else
		{
			System.out.println("Can't Paint.It is different type of Canvas");
		}
	}

}
