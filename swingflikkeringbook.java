import javax.swing.JFrame;

import javax.swing.ImageIcon;

import javax.swing.JLabel;

class img1 extends Thread

{

	

		



		@Override

		public void run() {

			// TODO Auto-generated method stub

			JFrame frame = new JFrame();

			  ImageIcon icon = new ImageIcon("Desert.jpg");

			  JLabel label = new JLabel(icon);

			  frame.add(label);

			  

			  try

		        {

		            Thread.sleep(1000);

		        }

		        catch (Exception e)

		        {

		            System.out.println("Thread  interrupted.");

		        }

				

			  frame.pack();

			  frame.setSize(1000, 1000);

			  frame.setVisible(true);	

			  

			 }  

		

	

}

class img2 extends Thread

{

   



	@Override

	public void run() {

		// TODO Auto-generated method stub

		JFrame frame = new JFrame();

		  ImageIcon icon = new ImageIcon("Tulip.jpg");

		  JLabel label = new JLabel(icon);

		  frame.add(label);

		  

		  frame.pack();

		  frame.setSize(1000, 1000);

		  frame.setVisible(true);	  



	}  



}

public class flikkerbook

{

	public static void main(String args[])

	{

		img1 a = new img1();



		img2 b = new img2();

	

		a.start();

		

		b.start();

	}



}

