/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.ca;

/**
 *NUID 001671309
 * @author priyanka bandekar
 */
public class CARule{
    
    
    
   public int Rules(int a, int b, int c){
        int[] rules = {0,1,0,1,1,0,1,0};//rule 90
       if (a == 1 && b == 1 && c == 1) { return rules[0]; }
    if (a == 1 && b == 1 && c == 0) { return rules[1]; }
    if (a == 1 && b == 0 && c == 1) { return rules[2]; }
    if (a == 1 && b == 0 && c == 0) { return rules[3]; }
    if (a == 0 && b == 1 && c == 1) { return rules[4]; }
    if (a == 0 && b == 1 && c == 0) { return rules[5]; }
    if (a == 0 && b == 0 && c == 1) { return rules[6]; }
    if (a == 0 && b == 0 && c == 0) { return rules[7]; }
    return 0;
  }
    
    public int Rules1(int a, int b, int c){
        int[] rules1 = {1,1,1,1,1,1,1,1};
       if (a == 1 && b == 1 && c == 1) { return 1;}//return rules1[0]; }
    if (a == 1 && b == 1 && c == 0) { return 1;}//{ return rules1[1]; }
    if (a == 1 && b == 0 && c == 1) { return 1;}//{ return rules1[2]; }
    if (a == 1 && b == 0 && c == 0) { return 1;}//{ return rules1[3]; }
    if (a == 0 && b == 1 && c == 1) { return 1;}//{ return rules1[4]; }
    if (a == 0 && b == 1 && c == 0) { return 1;}//{ return rules1[5]; }
    if (a == 0 && b == 0 && c == 1) { return 1;}//{ return rules1[6]; }
    if (a == 0 && b == 0 && c == 0) { return 1;}//{ return rules1[7]; }
    return 0;
  }
     public int Rules2(int a, int b, int c){
        int[] rules2 = {0,0,0,0,0,0,0,0};
       if (a == 1 && b == 1 && c == 1) { return rules2[0]; }
    if (a == 1 && b == 1 && c == 0) { return rules2[1]; }
    if (a == 1 && b == 0 && c == 1) { return rules2[2]; }
    if (a == 1 && b == 0 && c == 0) { return rules2[3]; }
    if (a == 0 && b == 1 && c == 1) { return rules2[4]; }
    if (a == 0 && b == 1 && c == 0) { return rules2[5]; }
    if (a == 0 && b == 0 && c == 1) { return rules2[6]; }
    if (a == 0 && b == 0 && c == 0) { return rules2[7]; }
    return 0;
  }
}
