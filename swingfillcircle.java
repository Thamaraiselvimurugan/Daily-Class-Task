import javax.swing.*;

import java.awt.*;

import java.awt.geom.*;



class circlefill extends JFrame{



    public circlefill(){

        JPanel panel=new JPanel();

        getContentPane().add(panel);

        setSize(450,450);

      

    }



    public void paint(Graphics g) {

        super.paint(g);  // fixes the immediate problem.

        Graphics2D g2 = (Graphics2D) g;

        g.setColor(Color.yellow);	                 // using drawRoundRect()

        g.fillRoundRect(40, 160, 90, 90, 200, 200);



        g.setColor(Color.green);               // using drawOval()

        g.fillArc(150, 160, 90, 90,0,180);

    			                // using drawArc()



        g.setColor(Color.blue);

        g.fillArc(270, 160, 90, 90, 180, 180);



    }



    public static void main(String []args){

    	circlefill s=new circlefill();

        s.setVisible(true);

    }

}