
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

class gui4 extends JFrame implements ActionListener{  
   
    Timer t;
    int x,y,deg=0,xc=300,yc=300,r=100;
     Insets in=getInsets();
        int left = in.left;
       int  top = in.top;
     public gui4(){
         t=new Timer(20,this);
         t.start();
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
//           dimitions
               xc+=left;
               yc+=top;
             

       }
        



    @Override
    public void actionPerformed(ActionEvent ae) {
        deg++;
        if(deg<=360 ){
        Graphics g = getGraphics();
                 if(0<=deg&& deg<=45){
                     g.setColor(Color.red);
                 }else if(46<=deg&& deg<=90){
                     g.setColor(Color.green);
                 }else if(91<=deg&& deg<=135){
                     g.setColor(Color.CYAN);
                 }else if(136<=deg&& deg<=180){
                     g.setColor(Color.ORANGE);
                 }else if(181<=deg&& deg<=225){
                     g.setColor(Color.BLUE);
                 }else if(226<=deg&& deg<=270){
                     g.setColor(Color.black);
                 }else if(271<=deg&& deg<=330){
                     g.setColor(Color.PINK);
                 }else if(331<=deg&& deg<=360){
                     g.setColor(Color.magenta);
                 }
              
                 x  =  (int) Math.round(r* Math.cos(deg*Math.PI/180) ) ;
                 y  =  (int) Math.round( r*Math.sin(deg*Math.PI/180)  );
                
                 g.fillOval(x+xc, yc+y, 2, 2);
              
      }else{
          t.stop();
      }
    
    }
        
       

}

public class Graphic4 {

  
    public static void main(String[] args) {
      new gui4();
    }
    
}





