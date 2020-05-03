  
package graphics;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

class gui7 extends JFrame implements ActionListener{  
     int i=0;
     Timer t=new Timer(200,this);
     public gui7(){
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
       }
        
       public void calc(int xc,int yc,int len,Graphics g){
           if(i<=360){
               int x1 = xc+ (int) Math.round( Math.cos( i* Math.PI /180  ) *len );
               int y1 = yc+ (int) Math.round( Math.sin( i* Math.PI /180  ) *len );
           
               int x2 =  xc+(int) Math.round( Math.cos( (i+60)* Math.PI /180  ) *len );
               int y2 = yc+ (int) Math.round( Math.sin( (i+60) * Math.PI /180  ) *len );
               g.drawLine(x1, y1, x2, y2);
               i+=60;
           }else{
               t.stop();
           }
          
           

           
       } 

    @Override
    public void actionPerformed(ActionEvent ae) {
                Graphics g=getGraphics();
                Insets in=getInsets();
                int left = in.left;
                int  top = in.top;
                calc(300+left,200+top,100, g);
                System.out.println("Running");

    }
}

public class graphics7 {

      public static void main(String[] args) {
      new gui7();
     }
    
}


