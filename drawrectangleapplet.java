package applet;





/*

	Draw Rectangle & Square in Applet Window Example 

	This java example shows how to draw rectangles and squares in an applet 

	window using drawRect method of Graphics class. 

*/

 

/*

<applet code="DrawRectanglesExample" width=200 height=200>

</applet>

*/

 

 

import java.awt.Color;



import java.applet.Applet;

import java.awt.Graphics;

import java.awt.*; 

import java.awt.event.*; 

 

public class Rectt extends Applet{

 

	public void paint(Graphics g){

		

		/*

		 * to draw rectangle in an applet window use,

		 * void drawRect(int x1,int y1, int width, int height)

		 * method.

		 * 

		 * This method draws a rectangle of specified width and

		 * height at (x1,y1) 

		 */

		

		//this will draw a rectangle of width 50 & height 100 at (10,10)

		g.drawRect(10,10,50,100);

		

		/*

		 * If you speficy same width and height, the drawRect method

		 * will draw a square!

		 */

		

		//this will draw a square

		g.drawRect(100,100,50,50);



		 g.setColor(Color.red);

	}

}