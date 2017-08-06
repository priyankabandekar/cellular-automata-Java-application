/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.ca;

/**
  *NUID 001671309
 * @author priyanka bandekar
 * @author priya
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CACanvas extends Canvas {

    public CAGeneration n= new CAGeneration();
    public int MAXGEN= 1;
    public int loop= 1;
    public int rulenum= 0;
    public boolean done=false;
    
	public CACanvas() {
            n.restart();
           for(int l=0;l<100;l++)
        {
            n.gen();
        }
         for(int l=0;l<100;l++)
        {
            n.gen1();
        }
             for(int l=0;l<100;l++)
        {
            n.gen2();
        }
                      
            
	}

	public CACanvas(GraphicsConfiguration arg0) {
		super(arg0);
	}
	
    @Override
	public void paint(Graphics g) {
             
		drawCA(g);
	}
       
	
    private void drawCA(Graphics g) { 
    	Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
         Dimension size = getSize();
    	g2d.fillRect(0, 0,size.width, size.height);
         for(int i=0; i<loop; i++)
      { 
          for (int j=0; j<64; j++){
              if( rulenum==0){
             if(n.cel[i][j]==1)
             {
                 g2d.setColor(Color.DARK_GRAY);
                 
             }
             else{
                 g2d.setColor(Color.WHITE);
             }}
              if( rulenum==1){
             if(n.cel1[i][j]==1)
             {
                 g2d.setColor(Color.BLACK);
                 
             }
             else{
                 g2d.setColor(Color.WHITE);
             }}
              if( rulenum==2){
             if(n.cel2[i][j]==1)
             {
                 g2d.setColor(Color.WHITE);
                 
             }
             else{
                 g2d.setColor(Color.LIGHT_GRAY);
             }}
              
             g2d.fillRect(80+j*11,60+i*11, 10, 10);   
          } 
      }
    
   if(loop < MAXGEN&&done==false){
       loop++;
       try{
          Thread.sleep(100);
          }
          catch(Exception e){}
       repaint();
   }
    }
    public void stopagain(){
        done=true;
    }
    
    
    public void startagain(int no, String s){
        rulenum = no;
        done=false;
        MAXGEN= Integer.parseInt(s);
       if (MAXGEN > 35)
        {
            MAXGEN= 35;
        }
        loop=1;
        repaint();
    }

}
