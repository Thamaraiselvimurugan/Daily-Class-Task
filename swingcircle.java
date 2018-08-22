import javax.swing.*;

import java.awt.*;

import java.awt.geom.*;



class circle extends JFrame{



    public circle(){

        JPanel panel=new JPanel();

        getContentPane().add(panel);

        setSize(450,450);

      

    }



    public void paint(Graphics g) {

        super.paint(g);  // fixes the immediate problem.

        Graphics2D g2 = (Graphics2D) g;

        

        g.drawRoundRect(40, 160, 90, 90, 200, 200);

        // using drawOval()

g.drawArc(150, 160, 90, 90,180,180);

g.drawLine(150,205,240,205);

       // using drawArc()



g.drawArc(270, 160, 90, 90, 0, 180);



g.drawLine(270,205,360,205);



    }



    public static void main(String []args){

        circle s=new circle();

        s.setVisible(true);

    }

}