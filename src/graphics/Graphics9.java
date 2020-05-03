package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

class gui9 extends JFrame implements ActionListener{  
     int x=0,xc=0,yc=0;
     Timer t=new Timer(20,this);
     public gui9(){
        this.setTitle("Graphic");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        t.start();
 }
 @Override
        public void paint(Graphics g){
                super.paint(g);
                 Insets in=getInsets();
                 int left = in.left;
                 int  top = in.top;
                 
                  xc=200+left ;
                  yc=250+top;
                 g.drawLine(left, yc, 600, yc);
                 g.drawLine(xc, top, xc, 400);
                 
                
       }
        
     

    @Override
    public void actionPerformed(ActionEvent ae) {
        Graphics g = getGraphics();
            if(x<=90){
                     int y = (int) Math.round( 90*Math.sin( x * Math.PI / 180) ) ;   
                     g.setColor(Color.red);
                     g.drawLine(xc+x, yc-y, xc+x, yc-y);
                     g.setColor(Color.GREEN);
                     g.drawLine(xc+180-x, yc-y, xc+180-x, yc-y);
                     g.setColor(Color.darkGray);
                     g.drawLine(xc+180+x, yc+y, xc+180+x, yc+y);
                     g.setColor(Color.MAGENTA);
                     g.drawLine(xc+360-x, yc+y, xc+360-x, yc+y);
                    x++;
           }else{
               t.stop();
           }
               

    }
}

public class Graphics9 {

      public static void main(String[] args) {
      new gui9();
     }
    
}

