package applet;

import java.applet.*;

import java.awt.*;

import java.awt.Graphics;

public class partial  extends java.applet.Applet{

	



	    public void paint(Graphics g) {

	        g.drawRect(20,20,60,60);

	        g.setColor(Color.blue);

	        g.fillRect(20,40,60,20);

	        g.setColor(Color.red);

	        g.fillRect(20,60,60,20);

	        g.setColor(Color.green);

		       	       

	        

	    }



}