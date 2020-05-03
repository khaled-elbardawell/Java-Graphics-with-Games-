
package graphics;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class gui14 extends JFrame implements ActionListener,KeyListener{ 
         Random r=new Random();
         int ballX=340,ballY=520,ballDirX=-1,ballDirY=-2,playerX=310,widthBox=r.nextInt(600),heightBox=r.nextInt(400),score=0;
         boolean play=false;
         int map[][]=new int[4][6];


         JPanel p1;
         Timer t=new Timer(8,this);
     public gui14(){
        this.setTitle("Graphic");
        this.setLayout(null);
                 p1 = new JPanel(null);
                 p1.setBackground(Color.black);
                 p1.setBounds(0,0, 800, 600);
                 add(p1);
             
                    this.addKeyListener(this);
                    this.setFocusable(true);
                    this.setFocusTraversalKeysEnabled(true);

                    this.setSize(700, 600);
                    this.setLocationRelativeTo(null);
                    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.setResizable(false);
                    this.setVisible(true);
                
                
              
 }
 @Override
        public void paint(Graphics g){
                super.paint(g);
                
                 g.setColor(Color.yellow);
                 g.fillOval(ballX, ballY, 20, 20);
                 g.setColor(Color.green);
                 g.fillRect(playerX,550,100,8);
                 
                 
                 g.setColor(Color.red);
                 g.fillRect(widthBox, heightBox, 100, 20);

                 
       }

        
    @Override
    public void actionPerformed(ActionEvent e) {
             
                Insets in=getInsets(); 
                 int left = in.left;
                 int  top = in.top;
         
        
               
       if(play){
           if(((ballX >= widthBox && ballX <= widthBox+100) && (ballY >= heightBox && ballY <= heightBox+20) )){
               score++;
               JOptionPane.showMessageDialog(null,"Score: "+score+" \n Nice !!");
               ballX=120;ballY=350;ballDirX=-1;ballDirY=-2;playerX=310;
               widthBox=RandomX(); 
               heightBox=RandomY();
           }
               if((ballX >= playerX && ballX <= playerX+100) && (ballY==530)  ){
                   ballDirY=-ballDirY;  

               }
           ballX +=ballDirX;
           ballY +=ballDirY;
           if(ballX <left+0){
               ballDirX=-ballDirX;
           }
           if(ballY <top+0){
              ballDirY=-ballDirY; 
           }
           if(ballX >670+left){
               ballDirX=-ballDirX;
           }
            if(ballY >560){
              JOptionPane.showMessageDialog(null,"Score: "+score+" \n Game Over !!");
               ballX=120;ballY=350;ballDirX=-1;ballDirY=-2;playerX=310;score=0;
               widthBox=RandomX(); 
               heightBox=RandomY();
           }
           
       }
        
      repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
          t.start();  
          play=true;
          if(ke.getKeyCode() == KeyEvent.VK_RIGHT ){
              if(  playerX >= 590 ){
                   playerX=590;     
              }else{
                  playerX+=20;
             }
          }
          if(ke.getKeyCode() == KeyEvent.VK_LEFT ){

              if(  playerX <= 10 ){
                   playerX=10;     
              }else{
                  playerX-=20;
               }
            }
          
    }

    @Override
    public void keyReleased(KeyEvent ke) {
     
    }
        
      public int RandomX(){
          return r.nextInt(600);
      }
      
      public int RandomY(){
          return r.nextInt(500);
      }  
           
       } 


public class Graphics14 {

      public static void main(String[] args) {
      new gui14();
     }
    
}
