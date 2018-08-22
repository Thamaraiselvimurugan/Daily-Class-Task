import java.awt.Graphics;

import javax.swing.JFrame;

import javax.swing.JPanel;



public class rectagle extends JPanel {

   public static void main(String[] a) {

      JFrame f = new JFrame();

      f.setSize(400, 400);

      f.add(new rectagle());

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      f.setVisible(true);

   }

   public void paint(Graphics g) {



	   g.drawRect (100,100,300,300);



   }

}