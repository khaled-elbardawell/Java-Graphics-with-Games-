
package graphics;


import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JFrame;

class gui8 extends JFrame{  
     
     public gui8(){
        this.setTitle("Graphic");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
 }
 @Override
        public void paint(Graphics g){
                super.paint(g);
                 Insets in=getInsets();
                 int left = in.left;
                 int  top = in.top;
                 
                 int xc=200+left , yc=250+top;
                 g.drawLine(left, yc, 600, yc);
                 g.drawLine(xc, top, xc, 400);
                 
                 
                 for(int x=0;x<=360;x++){
                     int y = (int) Math.round( 90*Math.sin( x * Math.PI / 180) ) ;
                     System.out.println("x "+x+" y "+y);
                     g.drawLine(xc+x, yc-y, xc+x, yc-y);
                 }
                 
                 
       }
        
      
           

           
       } 


public class Graphics8 {

      public static void main(String[] args) {
      new gui8();
     }
    
}
