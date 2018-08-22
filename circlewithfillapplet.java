package applet;





import java.awt.Color;

import java.awt.Graphics;

import java.applet.Applet;    

public class circle1 extends Applet

{

  public void paint (Graphics g)

  {		

      g.setColor(Color.yellow);	                 // using drawRoundRect()

    g.fillRoundRect(40, 160, 90, 90, 200, 200);



    g.setColor(Color.green);               // using drawOval()

    g.fillArc(150, 160, 90, 90,0,180);

			                // using drawArc()



    g.setColor(Color.blue);

    g.fillArc(270, 160, 90, 90, 180, 180);

  }

}

