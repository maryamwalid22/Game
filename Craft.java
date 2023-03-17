/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maryamcraftshooting;
import java.awt.Image;
 
 
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
/**
 *
 * @author ALMWUSHOOR
 */
public class Craft {
    private int x,y;
    private int dx,dy;
    private Image image;
    public Craft(){
        ImageIcon i=new ImageIcon("craft.png");
        image=i.getImage();
        x=100;
        y=100;
    }
    public void move(){
        x+=dx;
        y+=dy;
    }
    public int getx(){
        return x;
    }
     public int gety(){
        return y;
    }
    
   public Image getImage(){
       return image;
   }
   public void keyPressed(KeyEvent e){
       int key=e.getKeyCode();
       if(key==KeyEvent.VK_LEFT){
           dx=-1;
       }
        if(key==KeyEvent.VK_RIGHT){
           dx=1;
       }
        if(key==KeyEvent.VK_UP){
           dy=-1;
       } 
         if(key==KeyEvent.VK_DOWN){
           dy=1;
       }
   } 
   
    public void keyReleased(KeyEvent e){
       int key=e.getKeyCode();
       if(key==KeyEvent.VK_LEFT){
           dx=0;
       }
        if(key==KeyEvent.VK_RIGHT){
           dx=0;
       }
        if(key==KeyEvent.VK_UP){
           dy=0;
       } 
         if(key==KeyEvent.VK_DOWN){
           dy=0;
       }
   } 
   
   
}
