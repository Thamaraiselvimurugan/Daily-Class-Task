import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JFrame;

import javax.swing.JPanel;



public class partialfill extends JPanel {

   public static void main(String[] a) {

      JFrame f = new JFrame();

      f.setSize(400, 400);

      f.add(new partialfill());

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      f.setVisible(true);

   }

   public void paint(Graphics g) {

	  

	   g.setColor (new Color(128,0,128)); 

	   g.fillRect (100,100,400,400);

	   

	 



	   g.setColor (Color.red); 

	   g.fillRect (100,200,400,200);

	   

   }

}