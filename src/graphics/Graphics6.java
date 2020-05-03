package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

class gui6 extends JFrame{  
   
     public gui6(){
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
                
                  
                 g.setColor(Color.black);
                 g.fillRect(left, top+70, 600, 80);
                 g.setColor(Color.white); 
                 g.fillRect(left, top+140, 600, 80);
                 g.setColor(Color.green);
                 g.fillRect(left, top+200, 600, 80);
                 
                 int xx= (int)  Math.round( Math.sqrt( Math.pow(240, 2) - Math.pow(0.5*240,2) ) );
                 System.out.println(xx);
                 int x[]={left,left,xx},
                     y[]={top+70,top+280,190};
                 g.setColor(Color.red);
                 g.fillPolygon(x,y,3);
                
       }
}

public class Graphics6 {

      public static void main(String[] args) {
      new gui6();
     }
    
}