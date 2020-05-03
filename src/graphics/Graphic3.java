/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JFrame;

 class gui3 extends JFrame{
 
     public gui3(){
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

//          g.setColor(new Color(255,0,0)); 
//          g.drawString("khaled Elbrdawell",left+10, top+10);
//           g.drawLine(left+100, top+100, left+400, top+400);
//         
            for(int i = 0 ; i<50000;i++){
                 Random rand=new Random();
               int x = rand.nextInt(800);
                int y = rand.nextInt(500);
                 g.setColor( randColor() );
                 g.drawLine(x,y,x+1,y+1);
               
            }
//              
//              g.drawRect(100, 100, 200, 200);
//              g.setColor(Color.yellow);
//              g.fillRect(310, 100, 200, 200);
//             
//                 g.drawOval(left+10, top+10, 140, 200);
//                   
//                g.fillOval(top, top, top, top);

//                  g.fillRect(left, top, 800, 500);  
//                  g.setColor(Color.white);
//                  g.fillRect(left+200, top+30, 400, 400);
//                  g.setColor(Color.red);   
//                  g.fillOval(left+200, top+30, 100, 100);              
//                  g.fillOval(left+200, top+30+300, 100, 100);
//                  g.fillOval(left+200+150, top+30+150, 100, 100);
//                  g.fillOval(left+200+300, top+30, 100, 100);
//                  g.fillOval(left+200+300, top+30+300, 100, 100);

    }
        
         public Color randColor(){
            Random rand=new Random();
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
            return new Color(r,g,b);
        }
    
}

public class Graphic3 {
     public static void main(String[] args) {
        new gui3();
    }
}
