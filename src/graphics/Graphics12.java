
package graphics;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;

import javax.swing.JFrame;

class gui12 extends JFrame{ 
                 
     public gui12(){
        this.setTitle("Graphic");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
 }
 @Override
        public void paint(Graphics g){
            Insets in=getInsets();
                 int left = in.left;
                 int  top = in.top;
                 
                String data[] ={"php","c#","java","js","Python"};
                int s[]={200,260,330,190,120};
                
                int x=left*3;
                 int width = this.getWidth();
                 int widthBar= (int)Math.round( width/data.length);
                super.paint(g);
              
               g.drawLine(left, top+500, width, top+500);
               Random r=new Random();
                for(int i=0;i<data.length;i++){
                   g.setColor( new Color( r.nextInt(255),r.nextInt(255),r.nextInt(255) ) );
                   g.fillRect(x, top+500-s[i],Math.round(widthBar/2) ,s[i]);
                    g.setColor(Color.blue);
                   g.drawString(s[i]+"%", x+5,(top+500-s[i]-10));
                  
                   g.drawString(data[i], x,top+500+20);
                   x+=widthBar;
                }
                 
       }
        
        
      
           

           
       } 


public class Graphics12 {

      public static void main(String[] args) {
      new gui12();
     }
    
}

