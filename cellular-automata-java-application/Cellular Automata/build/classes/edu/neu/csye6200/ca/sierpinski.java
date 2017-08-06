/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.ca;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

/**
 *NUID 001671309
 * @author priyanka bandekar
 */
public class sierpinski{
    protected JFrame frame1 = new JFrame();   
    protected JPanel thePanel = new JPanel();
    private JLabel label1= null;
    private JLabel label2= null;
    private JTextField txtgen = new JTextField("Max Value 35", 15);
    private JButton button1 = null;
    private JButton button2 = null;
    private JComboBox ruless = null;
    private CACanvas cacanvas= null;
    String[] shows={"Rule 90","Rule 1", "Rule 2"};
    int no=0;
     public CAGeneration n= new CAGeneration();
    public sierpinski()
    {
      
        cacanvas = new CACanvas();
        frame1.setSize(900, 600);
        
        cacanvas.setPreferredSize(new Dimension(700, 680));
     
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("CELLULAR AUTOMATA");
        
        //JScrollBar scroll = new JScrollBar(cacanvas,ScrollBarConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       // frame1.add(scroll, BorderLayout.CENTER);
         //scroll.validate();
        
         label1 = new JLabel("Select the Rule:");
         thePanel.add(label1);
         ruless = new JComboBox(shows);
         ruless.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //no =ruless.getSelectedIndex(); 
                Object selected = ruless.getSelectedItem();
                if(selected.toString().equals("Rule 90"))
                no=0;
                else if(selected.toString().equals("Rule 1"))
                   no=1;
                   
                else if(selected.toString().equals("Rule 2"))
                   no=2;
                

            }  
        });
         ruless.setMaximumRowCount(3);
         ruless.setLightWeightPopupEnabled(false);
         thePanel.add(ruless);
         
        
         label2 = new JLabel("Enter The Number Of Generations:");
         thePanel.add(label2);
         
         
         txtgen.addFocusListener(new java.awt.event.FocusAdapter() {

            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                txtgen.selectAll();
            }

            });
          
         thePanel.add(txtgen);
         txtgen.setHorizontalAlignment(SwingConstants.RIGHT);
         txtgen.requestFocus();
          
         button1 = new JButton("Start");
         button1.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s =txtgen.getText();
                start(no,s);
            }
        });
         thePanel.add(button1);
         button2 = new JButton("Stop");
         button2.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                stop();
            } 
        });
        
         thePanel.add(button2);
         
         frame1.setLayout(new BorderLayout());
         frame1.add(thePanel, BorderLayout.NORTH);
                 
	 frame1.add(cacanvas, BorderLayout.CENTER);
         frame1.setVisible(true);
        
       }
    
     public static void main(String[] args) {
           new sierpinski();
           
  }
     private void stop(){
     cacanvas.stopagain();
     }
      private void start(int no, String s) {
               cacanvas.startagain(no,s);
            }
    
}
