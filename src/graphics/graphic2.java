
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JFrame;
    
class gui2 extends JFrame implements ActionListener{  
     int i=10;
     Timer time;

     public gui2(){
        time=new Timer(200,this);
        time.start();
        this.setTitle("Graphic");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
 }
 

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         if( i<200 ){
             getGraphics().drawOval(300-i, 300-i, 2*i, 2*i);
             i+=10;
         }else{
             repaint();
             i=10;
         }
    }
        
       

}
public class graphic2 {
     public static void main(String[] args) {
        new gui2();
    }
}
