/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymathcal;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;

/**
 *
 * @author gunzs
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     * 
     */
    
    
    
    double num,ans;
    int calulcation;
    
    public Calculator() {
        initComponents();
        On.setEnabled(false); //on button disable 
    }
    
    public  void  arithmetic_operation()
    {
        switch(calulcation)
        {
            case 1: //addition 
                ans = num + Double.parseDouble(jTextField1.getText()); //converts string to double
                //alllows for it to be added to. 
                jTextField1.setText(Double.toString(ans)); //converets double to string. 
                break;
                
                case 2: //subtraction
                ans = num - Double.parseDouble(jTextField1.getText()); //converts string to double. 
                jTextField1.setText(Double.toString(ans)); //converets double to string. 
                break;
                
                 case 3: // Mutiplication
                ans = num * Double.parseDouble(jTextField1.getText()); //converts string to double. 
                jTextField1.setText(Double.toString(ans)); //converets double to string. 
                break;
                
                
                  case 4: // division
                ans = num / Double.parseDouble(jTextField1.getText()); //converts string to double. 
                jTextField1.setText(Double.toString(ans)); //converets double to string. 
                break;
                
        }
    }
    
    
    JButton buttonlist[] = new JButton[23]; //array to hold all of the buttons in a collection.
    //Every single Button except for the on and off buttons.
    
    public  void testchangecolors() {
        
       for(int i = 0; i < 22; i++)
       {
           buttonlist[i].setBackground(Color.red);
       }
   }
    
   
    
    
    
    
    //Method that enables all buttons, Except for the on and off buttons. 
    public void enable()
    {
      On.setEnabled(true);//on button eanbled
      off.setEnabled(true);//on button eanbled, in order to renable...
      decimial.setEnabled(true);

      
      //for loop that goes through each button in the array and enables it. 
      for(int i = 0; i < 23; i+=1)
          
      {
          buttonlist[i].setEnabled(true);
      }
      
       On.setEnabled(false); //on button disable 
      
// Commented out, No longer needed. 

// Better to use Array to diasble all buttons. 

//     jTextField1.setEnabled(true); //diasbles the textfield
//        Number1.setEnabled(true);
//        Number2.setEnabled(true);
//        Number3.setEnabled(true);
//        Number4.setEnabled(true);
//        Number5.setEnabled(true);
//        Number6.setEnabled(true);
//        Number7.setEnabled(true);
//        Number8.setEnabled(true);
//        Number9.setEnabled(true);
//        NumberZero.setEnabled(true);
//        Add.setEnabled(true);
//        minus.setEnabled(true);
//        //minus.setEnabled(false);
//        Divide.setEnabled(true);
//        times.setEnabled(true);
//        Equals.setEnabled(true);
//        Clear.setEnabled(true);
//        backspace.setEnabled(true);
//        decimial.setEnabled(true);
//       

        
    }
    


  
    
   

    //method that disables the buttons. Except for the on button
    public void disable()
    {
         On.setEnabled(true);//on button eanbled, in order to renable...
         decimial.setEnabled(false);
        for(int i = 0; i < 23; i++)
          
      {
          buttonlist[i].setEnabled(false);
      }
      
       

 //No longer needed, Its better to use an array. Much more shorter and easier.        
//        jTextField1.setEnabled(false); //diasbles the textfield
//        Number1.setEnabled(false);
//        Number2.setEnabled(false);
//        Number3.setEnabled(false);
//        Number4.setEnabled(false);
//        Number5.setEnabled(false);
//        Number6.setEnabled(false);
//        Number7.setEnabled(false);
//        Number8.setEnabled(false);
//        Number9.setEnabled(false);
//        NumberZero.setEnabled(false);
//        Add.setEnabled(false);
//        minus.setEnabled(false);
//        //minus.setEnabled(false);
//        Divide.setEnabled(false);
//        times.setEnabled(false);
//        Equals.setEnabled(false);
//        Clear.setEnabled(false);
//        backspace.setEnabled(false);
//        decimial.setEnabled(false);
//        
        
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        On = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        Clear = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Number7 = new javax.swing.JButton();
        Number9 = new javax.swing.JButton();
        Number8 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        Number4 = new javax.swing.JButton();
        Number5 = new javax.swing.JButton();
        Number6 = new javax.swing.JButton();
        times = new javax.swing.JButton();
        Number1 = new javax.swing.JButton();
        Number2 = new javax.swing.JButton();
        Number3 = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        NumberZero = new javax.swing.JButton();
        decimial = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(On);
        On.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        On.setText("ON");
        On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnActionPerformed(evt);
            }
        });

        buttonGroup1.add(off);
        off.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonlist[16] = Clear;
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonlist[15] = backspace;
        backspace.setText("<---");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonlist[14] = Add;
        Add.setText("+");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Number7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[7] = Number7;
        Number7.setText("7");
        Number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number7ActionPerformed(evt);
            }
        });

        Number9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[9] = Number9;
        Number9.setText("9");
        Number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number9ActionPerformed(evt);
            }
        });

        Number8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[8] = Number8;
        Number8.setText("8");
        Number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number8ActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[10] = minus;
        minus.setText("-");
        minus.setMaximumSize(new java.awt.Dimension(45, 33));
        minus.setMinimumSize(new java.awt.Dimension(45, 33));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        Number4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[4] = Number4;
        Number4.setText("4");
        Number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number4ActionPerformed(evt);
            }
        });

        Number5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[5] = Number5;
        Number5.setText("5");
        Number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number5ActionPerformed(evt);
            }
        });

        Number6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[6] = Number6;
        Number6.setText("6");
        Number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number6ActionPerformed(evt);
            }
        });

        times.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[11] = times;
        times.setText("*");
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        Number1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[1] = Number1;
        Number1.setText("1");
        Number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number1ActionPerformed(evt);
            }
        });

        Number2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[2] = Number2;
        Number2.setText("2");
        Number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number2ActionPerformed(evt);
            }
        });

        Number3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[3] = Number3;
        Number3.setText("3");
        Number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number3ActionPerformed(evt);
            }
        });

        Divide.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[12] = Divide;
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        NumberZero.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[0] = NumberZero;
        NumberZero.setText("0");
        NumberZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberZeroActionPerformed(evt);
            }
        });

        decimial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[21] = decimial;
        decimial.setText(".");
        decimial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimialActionPerformed(evt);
            }
        });

        Equals.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonlist[13] = Equals;
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mantie Reid II");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(off)
                            .addComponent(On)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Number7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Number4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Number1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NumberZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Number5)
                                        .addGap(18, 18, 18)
                                        .addComponent(Number6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Number8)
                                        .addGap(18, 18, 18)
                                        .addComponent(Number9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Number2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Number3)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(times, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decimial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(On)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(off))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(backspace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(Add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decimial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(""); //sets textbox to Nothing.
        //removes all text from the text box. 
        
    }//GEN-LAST:event_ClearActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        // TODO add your handling code here:
        disable();// disables all buttons, except for on button.
        
        
    }//GEN-LAST:event_offActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
         //jTextField1.setText(Double.toString(ans)); //converets double to string. 
         num = Double.parseDouble(jTextField1.getText());
         calulcation = 1; //refers to case 1 addtion 
         jTextField1.setText(""); // clears text field
        // jLabel1.setText(num + "+"); //sets text with num and +
         
         

    }//GEN-LAST:event_AddActionPerformed

    private void Number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number7ActionPerformed
        // TODO add your handling code here:
     jTextField1.setText(jTextField1.getText() + "7"); //sets text field to 7 and places it next to number placed on screen.

    }//GEN-LAST:event_Number7ActionPerformed

    private void Number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number9ActionPerformed
        // TODO add your handling code here:
  jTextField1.setText(jTextField1.getText() + "9"); //sets text field to 9 and places it next to number placed on screen.

    }//GEN-LAST:event_Number9ActionPerformed

    private void Number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number8ActionPerformed
        // TODO add your handling code here:
     jTextField1.setText(jTextField1.getText() + "8"); //sets text field to 8 and places it next to number placed on screen.

    }//GEN-LAST:event_Number8ActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
     num = Double.parseDouble(jTextField1.getText());
         calulcation = 2; //refers to case 2 subtration  
         jTextField1.setText(""); // clears text field
        // jLabel1.setText(num + "-"); //sets text with num and -
    }//GEN-LAST:event_minusActionPerformed

    private void OnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnActionPerformed
        // TODO add your handling code here:
        enable(); //enables all buutons. 
    }//GEN-LAST:event_OnActionPerformed

    private void Number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number4ActionPerformed
        // TODO add your handling code here:
      jTextField1.setText(jTextField1.getText() + "4"); 
//sets text field to four and places it next to number placed on screen.
//testchangecolors(); //It works!

    }//GEN-LAST:event_Number4ActionPerformed

    private void Number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number5ActionPerformed
        // TODO add your handling code here:
     jTextField1.setText(jTextField1.getText() + "5"); //sets text field to five and places it next to number placed on screen.

    }//GEN-LAST:event_Number5ActionPerformed

    private void Number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number6ActionPerformed
        // TODO add your handling code here:
     jTextField1.setText(jTextField1.getText() + "6"); //sets text field to six and places it next to number placed on screen.

    }//GEN-LAST:event_Number6ActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        // TODO add your handling code here:
 num = Double.parseDouble(jTextField1.getText());
         calulcation = 3; //refers to case mutpily
         jTextField1.setText(""); // clears text field
         //jLabel1.setText(num + "*"); //sets text with num  and *
        
    }//GEN-LAST:event_timesActionPerformed

    private void Number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "1"); //sets text field to one and places it next to number placed on screen.
    
    }//GEN-LAST:event_Number1ActionPerformed

    private void Number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "2"); //sets text field to two and places it next to number that is on the screen
    }//GEN-LAST:event_Number2ActionPerformed

    private void Number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number3ActionPerformed
        // TODO add your handling code here:
 jTextField1.setText(jTextField1.getText() + "3"); //sets text field 3 four and places it next to number placed on screen.

    }//GEN-LAST:event_Number3ActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        // TODO add your handling code here:
         num = Double.parseDouble(jTextField1.getText());
         calulcation = 4; //refers to case 4 division
         jTextField1.setText(""); // clears text field
         //jLabel1.setText(num + "/"); //sets text with num and /
      
    }//GEN-LAST:event_DivideActionPerformed

    private void NumberZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberZeroActionPerformed
        // TODO add your handling code here:
     jTextField1.setText(jTextField1.getText() + "0"); //sets text field to 0 and places it next to number placed on screen.

    }//GEN-LAST:event_NumberZeroActionPerformed

    private void decimialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimialActionPerformed
        // TODO add your handling code here:
      jTextField1.setText(jTextField1.getText() + "."); //sets text field to . and places it next to number placed on screen.

    }//GEN-LAST:event_decimialActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
        arithmetic_operation();
       // jLabel1.setText("");
    }//GEN-LAST:event_EqualsActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        // TODO add your handling code here:
        int length = jTextField1.getText().length();//gets length of the string 
        int number = jTextField1.getText().length() -1;  //subtracts one from the string
        String store;
        
        if(length > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            //String builder creates empty String builder, which is used to store strings. 
            //back is object of stringbuuilder.
            back.deleteCharAt(number); //used to dekete a single a character from a spefcic postion. 
            store=back.toString();
            jTextField1.setText(store);
            
            
            
            
        }
    }//GEN-LAST:event_backspaceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Number1;
    private javax.swing.JButton Number2;
    private javax.swing.JButton Number3;
    private javax.swing.JButton Number4;
    private javax.swing.JButton Number5;
    private javax.swing.JButton Number6;
    private javax.swing.JButton Number7;
    private javax.swing.JButton Number8;
    private javax.swing.JButton Number9;
    private javax.swing.JButton NumberZero;
    private javax.swing.JRadioButton On;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton decimial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minus;
    private javax.swing.JRadioButton off;
    private javax.swing.JButton times;
    // End of variables declaration//GEN-END:variables
}
