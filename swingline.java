import javax.swing.*;

import java.awt.*;

import java.awt.geom.*;



class line extends JFrame{



    public line(){

        JPanel panel=new JPanel();

        getContentPane().add(panel);

        setSize(450,450);

      

    }



    public void paint(Graphics g) {

        super.paint(g);  // fixes the immediate problem.

        Graphics2D g2 = (Graphics2D) g;

        g.setColor (new Color(128,0,128));

        Line2D lin = new Line2D.Float(1, 1, 450, 450);

        g2.draw(lin);



    }



    public static void main(String []args){

        line s=new line();

        s.setVisible(true);

    }

}