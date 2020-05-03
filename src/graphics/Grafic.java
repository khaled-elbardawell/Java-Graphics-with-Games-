
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;
import javax.swing.JFrame;

class gui extends JFrame{  
    
     public gui(){
        this.setTitle("Graphic");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
 }
 @Override
        public void paint(Graphics g){
                super.paint(g);
//           dimitions
                Insets in=getInsets();
                int left = in.left;
                int top = in.top;

//           main
                g.setColor(Color.CYAN);   
                g.fillRect(left, top, 600, 450);
           
//          sun
                g.setColor(Color.yellow); 
                g.fillArc(left-100, top-100, 200, 200, 270, 90);

//          body man 
                g.setColor(Color.white); 
                g.fillOval(left+175, 300, 250, 150);
                
                g.setColor(Color.white); 
                g.fillOval(left+215, 205, 170, 100);
                
                g.setColor(Color.black); 
                g.drawLine(left+220, 255,130 ,200 );
                
                g.setColor(Color.black); 
                g.drawLine(left+380, 255,500 ,255 );
                
//          head man      
                 g.setColor(Color.white); 
                 g.fillOval(left+250, 110, 100, 100);
                
                 g.setColor(Color.black);   
                 g.fillRect(left+260, 85, 80, 35);
                 
                 g.fillOval(left+270, 140, 12, 12);
                 g.fillOval(left+310, 140, 12, 12);
                 
                 g.drawArc(left+278,160,40,30,180,180);
           
//           footer
               g.setColor(new Color(64,71,204)); 
               g.fillRect(left, 450, 600, 150);

       }
        
       

}

public class Grafic {

  
    public static void main(String[] args) {
      new gui();
      new gui8();
      new gui9();
      new gui10();
      new gui11();
      new gui2();new gui3();new gui4();new gui5();new gui6();new gui7();new gui12();new gui13();new gui14();
      
    }
    
}





