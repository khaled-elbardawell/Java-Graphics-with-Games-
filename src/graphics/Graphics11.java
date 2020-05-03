package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

class gui11 extends JFrame implements ActionListener{  
     
     Insets in=getInsets();
     int left = in.left;
     int  top = in.top;
     
     int b1=left+0,b2=550+left,stop=0,xc=left+250;
     Timer t=new Timer(10,this);
     public gui11(){
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
                    
                         g.setColor(Color.yellow);
                         g.fillOval(b1,175,50,50);
                         
                         g.setColor(Color.red);
                         g.fillOval(b2,175,50,50);
                     
      
       }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(stop == 0){
             if(b1<= (250+left) ){
                  b1+=5;
                  b2-=5;
                  repaint();
             }else{
                 stop =1;
             } 
         }
                 

         
         if(stop == 1){
                 if(b2 != (550+left) ){
                     b1-=5;
                     b2+=5;
                    repaint();
             }else{
                 stop =0;
             } 
          

         }
         

    }
     
          
           

           
       } 

   


public class Graphics11 {

      public static void main(String[] args) {
      new gui11();
     }
    
}



