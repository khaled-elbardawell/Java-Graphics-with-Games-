package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

class gui10 extends JFrame implements ActionListener{  
     int i=0;
     Timer t=new Timer(200,this);
     public gui10(){
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
                 Random r=new Random();
                 for(int i=0;i<40;i++){
                  g.setColor(new Color( (int)r.nextInt(255),(int)r.nextInt(255),(int)r.nextInt(255)));
                  g.fillOval( (int)r.nextInt(600) ,(int) r.nextInt(400), 50, 50 );
                 }
        
       }

    @Override
    public void actionPerformed(ActionEvent ae) {
       repaint();
    }
      
          
           

           
       } 

   


public class Graphics10 {

      public static void main(String[] args) {
      new gui10();
     }
    
}

