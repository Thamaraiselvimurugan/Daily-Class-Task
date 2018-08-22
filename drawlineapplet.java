package applet;



/*

	Draw Line in Applet Window Example 

	This java example shows how to draw lines in an applet window using 

	drawLine method of Graphics class. 

*/

 

/*

<applet code="DrawLineExample" width=200 height=200>

</applet>

*/

 

 

import java.applet.Applet;

import java.awt.*; 

import java.awt.event.*; 

 

public class DrawLineExample extends Applet{

 

	public void paint(Graphics g){

		

		/*

		 * to draw line in an applet window use,

		 * void drawLine(int x1,int y1, int x2, int y2)

		 * method.

		 * 

		 * This method draws a line between (x1,y1) and (x2,y2)

		 * coordinates in a current color.

		 */

		

		//this will draw a line between (10,10) and (50,50) coordinates. 

		g.drawLine(100,100,500,500);



		Color customColor = new Color(128,0,128);

		 g.setColor(customColor);

		 

		//draw vertical line

		g.drawLine(10,50,10,100);

		

		//draw horizontal line

		g.drawLine(10,10,50,10);

	}

}