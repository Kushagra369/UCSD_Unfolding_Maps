package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setup()
	{
		size(600, 400);
		background(90, 140, 200);
		
	}
	
	public void draw()
	{
		fill(255, 255, 0);
		ellipse(300, 200, 400, 400);
		fill(0, 0, 0);
		ellipse(200, 150, 50, 70);
		ellipse(400, 150, 50, 70);
		
		arc(300, 250, 100, 100, 0, PI);
	}
}
