package applet;





import java.awt.*;  



import java.applet.*;  

  

  

public class image extends Applet{



  

  Image picto;  

  

  public void init() {  

    picto = getImage(getCodeBase(),"Desert.jpg");  

  }  

    

  public void paint(Graphics g) {  

    g.drawImage(picto, 60,60, this);  

  }  

 

}