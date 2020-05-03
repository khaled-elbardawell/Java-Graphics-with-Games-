  

package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

class gui5 extends JFrame{  
   
     public gui5(){
        this.setTitle("Graphic");
        this.setSize(600, 600);
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
                Random r=new Random();
                for(int i=0;i<100;i++){
                    int x= r.nextInt(600);
                    int y= r.nextInt(600);
                    int l= r.nextInt(200);
                    calc(left+x,top+y,l);
                }
       }
        
        public void calc(int x,int y,int len){
            
            Graphics g = getGraphics();
            
            int x1=(int)Math.round(x-(0.5*len));
            int x2=(int)Math.round(x+(0.5*len));
            
            int b= (int)Math.round( Math.sqrt( Math.pow(len,2) - Math.pow( (0.5*len),2) ) );
            
            int y1=(int)Math.round(b+y);
            int y2=(int)Math.round(b+y);

            int xx[]={x,x1,x2},
            yy[]={y,y1,y2};
                    Random r=new Random();
                    int R= r.nextInt(255);
                    int G= r.nextInt(255);
                    int B= r.nextInt(255);
                    g.setColor( new Color(R,G,B) );
                    g.fillPolygon(xx,yy,xx.length);
            
        }
        

}

public class Graphics5 {

  
    public static void main(String[] args) {
      new gui5();
    }
    
}





