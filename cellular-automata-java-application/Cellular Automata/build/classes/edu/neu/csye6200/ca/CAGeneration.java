/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.ca;

import java.awt.Graphics;
import java.util.Arrays;


/**
 *NUID 001671309
 * @author priyanka bandekar
 */
public class CAGeneration {
   
     CACell c = new CACell();
      CACell c1 = new CACell();
       CACell c2 = new CACell();
      CARule r = new CARule();
     // CACanvas v = new CACanvas();
      int k=1;
      int g=1;
      int m=1;
      int[][] cel = new int [1000][1000];// rule 1
      int[][] cel1 = new int [1000][1000];//rule2
      int[][] cel2 = new int [1000][1000];//rule 3
      int[] nextgen = new int[c.cells.length];
      int[] nextgen1 = new int[c1.cells.length];
      int[] nextgen2 = new int[c2.cells.length];
        
      public CAGeneration(){}
      
      
  public void gen()//rule 90
    {

    int left;
    int right ;
    for (int i = 0; i < c.cells.length; i++) 
    {
        if(i-1 < 0)
        {
            left=0;
        }
        else{
              left = c.cells[i-1]; 
        }
      int me = c.cells[i];
      if(i+1 > 63)
      {
            right=0;
      }
      else
      {
             right = c.cells[i+1];
      }
      nextgen[i] = r.Rules(left,me,right); 
    }

         System.arraycopy(nextgen, 0, c.cells, 0, c.cells.length); 
         System.arraycopy(nextgen, 0, cel[k], 0, c.cells.length);
      k++;
    }
  
   public void gen1()
    {
    int left;
    int right ;
    for (int i = 0; i < c1.cells.length; i++) 
    {
        if((i-1) < 0)
        {
            left=0;
        }
        else
        {
              left = c1.cells[i-1]; 
        }
      int me = c1.cells[i];
      if((i+1) > 63)
      {
            right=0;
      }
      else
      {
             right = c1.cells[i+1];
      }
      nextgen1[i] = r.Rules1(left,me,right);
      
    }
         System.arraycopy(nextgen1, 0, c1.cells, 0, c1.cells.length); 
         System.arraycopy(nextgen1, 0, cel1[g], 0, c1.cells.length);
      g++;
    }
   
    public void gen2()
    {   
    int left;
    int right ;
    for (int i = 0; i < c2.cells.length; i++) {
        if(i-1 < 0){
            left=0;
        }
        else{
              left = c2.cells[i-1]; 
        }
      int me = c2.cells[i];
      if(i+1 > 63){
            right=0;
        }
        else{
             right = c2.cells[i+1];
      }
      nextgen2[i] = r.Rules2(left,me,right);
    }
         System.arraycopy(nextgen2, 0, c2.cells, 0, c2.cells.length); 
         System.arraycopy(nextgen2, 0, cel2[m], 0, c2.cells.length);
      m++;
    }
     
  
  public void restart(){    
      for (int i = 0; i <64 ; i++) {
      c.cells[i] = 0;
    }
    c.cells[c.cells.length/2] = 1;    // We arbitrarily start with just the middle cell having a state of "1"
    
    for(int i = 0; i < c.cells.length; i++) 
    {
      cel[0][i] = c.cells[i];
      cel1[0][i]=c.cells[i];
            cel2[0][i]=c.cells[i];
    }
  
  }         
}
  
    