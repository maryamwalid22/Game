/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maryamcraftshooting;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JPanel;
////
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

 
public class Board extends JPanel implements ActionListener {
    
    private Craft craft;
    private Timer timer;
    
    public Board(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.WHITE);
        craft=new Craft(); 
        timer=new Timer(5,this);
        timer.start();
    }
     public void paint(Graphics g){
     super.paint(g);
     Graphics2D g2D=(Graphics2D)g;
     g2D.drawImage(craft.getImage(),craft.getx(),craft.gety(),this);
     g.dispose();
             }
     
     public void actionPerformed(ActionEvent e){
         craft.move();
         repaint();
     }
     private class TAdapter extends KeyAdapter{
         public void keyPressed(KeyEvent e){
             craft.keyPressed(e);
         }
          public void keyReleased(KeyEvent e){
             craft.keyReleased(e);
         }
         
     }
}
