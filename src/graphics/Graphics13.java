
package graphics;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
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

class gui13 extends JFrame implements ActionListener,KeyListener{ 
         int countX=0,countY=0,r=0,tran=3,rev=0,speed=0,slow=0,leftW,topW; 
         JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
         JPanel p1,p2;
         Timer t=new Timer(10,this);
     public gui13(){
        this.setTitle("Graphic");
        this.setLayout(null);
                 p2 = new JPanel(null);
                 p2.setBackground(Color.white);
                 
                 p2.setBounds(0,450, 800, 150);
                 
                 p1 = new JPanel(null);
                 p1.setBackground(Color.white);
                 p1.setBounds(0,0, 800, 450);
                 add(p1);
                
                 b1=new JButton("top");
                 b1.setBounds(40, 20, 100, 20);
                 p2.add(b1);
                 b1.addActionListener(this);
                 
                 b2=new JButton("left");
                 b2.setBounds(160, 20, 100, 20);
                 p2.add(b2);
                 b2.addActionListener(this);
                 
                 
                  b3=new JButton("right");
                  b3.setBounds(280, 20, 100, 20);
                  p2.add(b3);
                  b3.addActionListener(this);
                  
                  b4=new JButton("bottom");
                   b4.setBounds(400, 20, 100, 20);
                  p2.add(b4);
                  b4.addActionListener(this);
                  
                   b5=new JButton("stop");
                   b5.setBounds(520, 20, 100, 20);
                  p2.add(b5);
                  b5.addActionListener(this);
                  
                  
                   b6=new JButton("run");
                   b6.setBounds(640, 20, 100, 20);
                  p2.add(b6);
                  b6.addActionListener(this);
                  add(p2);
                   
                  b7=new JButton("reverse");
                  b7.setBounds(250, 50, 100, 20);
                  p2.add(b7);
                  b7.addActionListener(this);
                  add(p2);
                   
                   b8=new JButton("speed");
                   b8.setBounds(370, 50, 100, 20);
                   p2.add(b8);
                   b8.addActionListener(this);
                   add(p2);
                   p2.setBackground(Color.gray);
                    
                    b9=new JButton("slow");
                    b9.setBounds(490, 50, 100, 20);
                    p2.add(b9);
                    b9.addActionListener(this);
                    add(p2);
                    
                    this.addKeyListener(this);
                    this.setFocusable(true);
                    this.setFocusTraversalKeysEnabled(false);
                    
                this.setSize(800, 600);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                this.setVisible(true);
               t.start();
 }
 @Override
        public void paint(Graphics g){
            super.paint(g);
                Insets in=getInsets();
                 int left = in.left;
                 int  top = in.top;
                 leftW=left;
                 topW=top;
                    g.translate(countX, countY);
                    Graphics2D g2d=(Graphics2D) g;
                    g2d.rotate( -r*(Math.PI/180),left+90, top+55 );
                    g.setColor(Color.red);
                 
                    g.fillRect(left+40, top+40, 100, 25);
                 
                 int x[] = {left+50,left+60,left+95,left+105},
                 y[] = {top+40,top+10,top+10,top+40} ;
                 g.setColor(Color.black);
                 g.drawPolyline(x, y, 4);
                 g.drawLine(left+80, top+10, left+80, top+40);
                 g.fillOval(left+50, top+55, 25, 25);
                 g.fillOval(left+90, top+55, 25, 25);
                 
       }

        public void eventRun(ActionEvent e){
                             repaint();

        if(countX< -(leftW+35) || countX >800-(150) || countY>340 || countY<0){
            JOptionPane.showMessageDialog(null, "Loss!!");
            countX=0;
            countY=0;
            r=0;
            tran=3;
            rev=0;
            speed=0;
            return;
        }
                 if(t.isRunning()){
                        if( rev == 0){
                         if( tran == 0 ){ // left
                         countX--;
                         countX -=speed;
                        
                     }else if( tran == 1){ // bottom
                         countY++;
                         countY +=speed;
                     }else if( tran == 2 ){ // top
                          countY--;
                          countY -=speed;
                     }else if( tran == 3){ // right

                         countX ++;
                         countX +=speed;
                     }
                     }else{
                          if( tran == 0 ){ // left
                         countX ++;
                         countX +=speed;
                         
                                  }else if( tran == 1){ // bottom
                                     countY--;
                                    countY -=speed;
                                  }else if( tran == 2 ){ // top
                                       countY++;
                                      countY +=speed;
                                  }else if( tran == 3){ // right
                                      countX--;
                                      countX -=speed;
                                  }
                     }

                      if(e.getSource() == b1){ // top
                         tran=2; 
                         r=90;
                         rev=0;
                      }else  if(e.getSource() == b2){ // left
                          rev=0;
                          tran=0; 
                          r=180;
                      }else if(e.getSource() == b3){ // right
                           tran=3; 
                           r=0;
                           rev=0;
                      }else if(e.getSource() == b4){ // bottom
                           tran=1; 
                           r=270;
                           rev=0;
                      }else if(e.getSource() == b5){ // stop
                          t.stop();
                          rev=0;
                      }else  if(e.getSource() == b7){ // reverse
                          rev=1;
                      }else  if(e.getSource() == b8){ // speed
                          speed+=3;
                      }else  if(e.getSource() == b9){ // slwo
                         
                      }   

                 }
                  if(e.getSource() == b6){ // run
                        t.start();
                        rev=0;
                   }
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
      eventRun(e);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
         
                 System.out.println(ke.getSource());
      if( ke.getKeyCode() == KeyEvent.VK_UP ){
                          tran=2; 
                           r=90;
                          rev=0;
                          System.out.println("up");
      }else  if( ke.getKeyCode() == KeyEvent.VK_DOWN ){
                           tran=1; 
                           r=270;
                           rev=0;
                            System.out.println("Down");
      }else  if( ke.getKeyCode() == KeyEvent.VK_LEFT ){
                          rev=0;
                          tran=0; 
                          r=180;
                           System.out.println("left");
      }else  if( ke.getKeyCode() == KeyEvent.VK_RIGHT ){
                           tran=3; 
                           r=0;
                           rev=0;
                            System.out.println("right");
      }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        System.out.println("Relesed");
        keyPressed( ke);
    }
        
        
      
           

           
       } 


public class Graphics13 {

      public static void main(String[] args) {
      new gui13();
     }
    
}


