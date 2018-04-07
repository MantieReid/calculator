package mymathcal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import java.text.DecimalFormat;

public class Calculator extends javax.swing.JFrame {    
     JButton buttons[] =  new JButton[23];
       
    public Calculator() {
        initComponents();
      
     //set up buttons to be in array

       buttons[0] =  NumberZero;
       buttons[1] =  Number1;
       buttons[2] =  Number2;
       buttons[3] = Number3;
       buttons[4] = Number4;
       buttons[5] = Number5;
       buttons[6] = Number6;
       buttons[7] = Number7;
       buttons[8] = Number8;
       buttons[9] = Number9;
       buttons[10] = minus;
       buttons[11] = times;
       buttons[12] = Add;
       buttons[13] = Divide;
       buttons[14] = Clear;
       buttons[15] = backspace;
       buttons[16] = decimial;
       buttons[17] = Equals;
      
       
      
    }

    
    double answer = 0, parsedText;
    boolean equalPressed = false;
    boolean cleared = true; //denotes if the program has recently been cleared/started
                            //and no number buttons have been pressed yet.
    int calculation = 0;
    
    ///the core of the program. It does the math. The case will be excuted if called upon. 
    public double calculate(int operation, double num1, double num2)
    {
        double ans = 0;
        switch(operation)
        {      
                case 1: // addition 
                ans = (num1 + num2);
                break;
                
                case 2: // subtraction
                ans = (num1 - num2);
                break;
                
                case 3: // Mutiplication
                ans = (num1 * num2);
                break;
                
                case 4: // division
                ans = num1 / num2;
                break;
        }

        return ans;
    }
    
   
   
   //method to change the colors of the buttons and Jpanels to a matrix look
   public  void Changecolorstomatrixtheme()
   {
      
       for(int i = 0; i < buttons.length; i++)
       {
           buttons[i].setBackground(Color.black);
           buttons[i].setForeground(Color.green);
           jPanel2.setBackground(Color.BLACK);
           jPanel2.setForeground(Color.GREEN);
           jTextField1.setForeground(Color.GREEN);
           jTextField1.setBackground(Color.BLACK);
         
           
           
       }
       
   }
   
   
   
   
   //method that resets all variables 
    public void clear()
    {
        jTextField1.setText(""); //Clear Textbox.
        
        //reset all variables.
        answer = 0;
        parsedText = 0;
        equalPressed = false;
        calculation = 0;
        cleared = true;
    }
    
    //automatic generated code. 
    //try not to touch this
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        Equals = new javax.swing.JButton();
        Number6 = new javax.swing.JButton();
        Number5 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        Number1 = new javax.swing.JButton();
        Number4 = new javax.swing.JButton();
        Number9 = new javax.swing.JButton();
        times = new javax.swing.JButton();
        Number3 = new javax.swing.JButton();
        NumberZero = new javax.swing.JButton();
        Number7 = new javax.swing.JButton();
        Number2 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Number8 = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        decimial = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jFrame1.setMinimumSize(new java.awt.Dimension(252, 252));
        jFrame1.setResizable(false);

        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(252, 252));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(252, 252));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(252, 252));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("\tAbout\n\n\tMade By \n\n\tMantie Reid II \n\n\tCasey\n\n");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setMaximumSize(new java.awt.Dimension(252, 252));
        jTextArea2.setMinimumSize(new java.awt.Dimension(252, 252));
        jTextArea2.setPreferredSize(new java.awt.Dimension(338, 185));
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setResizable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(java.awt.Color.black);
        setForeground(java.awt.Color.cyan);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Equals.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        Number6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number6.setText("6");
        Number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number6ActionPerformed(evt);
            }
        });

        Number5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number5.setText("5");
        Number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number5ActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        minus.setText("-");
        minus.setMaximumSize(new java.awt.Dimension(45, 33));
        minus.setMinimumSize(new java.awt.Dimension(45, 33));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        Number1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number1.setText("1");
        Number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number1ActionPerformed(evt);
            }
        });

        Number4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number4.setText("4");
        Number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number4ActionPerformed(evt);
            }
        });

        Number9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number9.setText("9");
        Number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number9ActionPerformed(evt);
            }
        });

        times.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        times.setText("*");
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        Number3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number3.setText("3");
        Number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number3ActionPerformed(evt);
            }
        });

        NumberZero.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        NumberZero.setText("0");
        NumberZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberZeroActionPerformed(evt);
            }
        });

        Number7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number7.setText("7");
        Number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number7ActionPerformed(evt);
            }
        });

        Number2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number2.setText("2");
        Number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number2ActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Add.setText("+");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Number8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number8.setText("8");
        Number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number8ActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backspace.setText("<---");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        decimial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        decimial.setText(".");
        decimial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimialActionPerformed(evt);
            }
        });

        Divide.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumberZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(decimial, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Number5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Number6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Number2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Number3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Number8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Number9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(times, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decimial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenuBar2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        jMenuBar2.setBorder(new javax.swing.border.MatteBorder(null));

        jMenu3.setText("About");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
   //does x clear button is pressed 
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        //clear text and reset all variables
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    
       
    //does x when  add button is pressed 
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        
        
        
        try
        {
            //we should never do any calculations if this throws an error, as it will
            //only throw an error when doing weird things like pressing two operation
            //buttons in a row.
            parsedText = Double.parseDouble(jTextField1.getText()); //parsed text is whatever in the textfield. 
            //Converts the string in the field to a double

            //only run if there was not a recent answer generated by hitting equals
            if (equalPressed == false){
                
                //this only happens right after a clear or the begining of the program
                if(calculation == 0)
                {
                 answer = parsedText;
                }
                //otherwise, run calculations as normal
                else
                {
                    answer = calculate(calculation, answer, parsedText); // does the math 
                }   
                equalPressed = false;
            }
        }
        catch (NumberFormatException e) {}
        
        calculation = 1; //refers to case 1 addtion  
        jTextField1.setText(""); // clears text field
        equalPressed = false;
    }//GEN-LAST:event_AddActionPerformed
    
    
        //does x when  minus button is pressed 

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        //adds a negative symbol if the program was just started/cleared,
        //and if no number buttons have been pressed.
        if (cleared == true) 
        {
            jTextField1.setText("-");
        }
        
        //otherwise, do what the other 3 operation buttons do
        else
        {
            try
            {
                //we should never do any calculations if this throws an error, as it will
                //only throw an error when doing weird things like pressing two operation
                //buttons in a row.
                parsedText = Double.parseDouble(jTextField1.getText());
                
                //only run if there was not a recent answer generated by hitting equals
                if (equalPressed == false){
                    //this only happens right after a clear or the begining of the program
                    if(calculation == 0)
                    {
                     answer = parsedText;
                    }
                    //otherwise, run calculations as normal
                    else
                    {
                        answer = calculate(calculation, answer, parsedText);
                    }   
                    equalPressed = false;
                }
            }
            catch (NumberFormatException e) {}
            
            calculation = 2; //refers to case 2 subtraction  
            jTextField1.setText(""); // clears text field
            equalPressed = false;
        }
    }//GEN-LAST:event_minusActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        try
        {
            //we should never do any calculations if this throws an error, as it will
            //only throw an error when doing weird things like pressing two operation
            //buttons in a row.
            parsedText = Double.parseDouble(jTextField1.getText());

            //only run if there was not a recent answer generated by hitting equals
            if (equalPressed == false){
                //this only happens right after a clear or the begining of the program
                if(calculation == 0)
                {
                 answer = parsedText;
                }
                //otherwise, run calculations as normal
                else
                {
                    answer = calculate(calculation, answer, parsedText);
                }   
                equalPressed = false;
            }
        }
        catch (NumberFormatException e) {}
            
        calculation = 3; //refers to case 3 multiplication 
        jTextField1.setText(""); // clears text field
        equalPressed = false;
    }//GEN-LAST:event_timesActionPerformed
    
    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        try
        {
            //we should never do any calculations if this throws an error, as it will
            //only throw an error when doing weird things like pressing two operation
            //buttons in a row.
            parsedText = Double.parseDouble(jTextField1.getText());

            //only run if there was not a recent answer generated by hitting equals
            if (equalPressed == false){
                //this only happens right after a clear or the begining of the program
                if(calculation == 0)
                {
                 answer = parsedText;
                }
                //otherwise, run calculations as normal
                else
                {
                    answer = calculate(calculation, answer, parsedText);
                }   
                equalPressed = false;
            }
        }
        catch (NumberFormatException e) {}
        
        calculation = 4; //refers to case 4 division 
        jTextField1.setText(""); // clears text field
        equalPressed = false;
    }//GEN-LAST:event_DivideActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
        if (equalPressed == false) {
            parsedText = Double.parseDouble(jTextField1.getText());
        }
        
        //dont do anything if there is no calculations to do
        if (calculation != 0)
        {
            answer = calculate(calculation, answer, parsedText);
            
            jTextField1.setText(Double.toString(answer)); //converets double to string. 
            
            equalPressed = true;
        }
    }//GEN-LAST:event_EqualsActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        if (equalPressed == false)
        {
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
        }
    }//GEN-LAST:event_backspaceActionPerformed

 	private void decimialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimialActionPerformed
        if (equalPressed == false)
        {
            //check if text box is empty
            if (jTextField1.getText().length() == 0 ){
            jTextField1.setText("0.");
            }
            
            String temp = jTextField1.getText() + ".";
            //check to make sure the modified string is a number elsewise
            if (Double.isNaN(Double.parseDouble(temp)) == false){
            jTextField1.setText(temp);
            }
        }
        else
        {
            //reset if an answer was just generated
            clear();
            
            jTextField1.setText("0.");
        }
        
        //a decimal symbol has been inserted, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_decimialActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Number Buttons">
    private void Number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number7ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "7"); //sets text field to 7 and places it next to number placed on screen.
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number7ActionPerformed

    private void Number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number9ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "9"); //sets text field to 9 and places it next to number placed on screen.
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number9ActionPerformed

    private void Number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number8ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "8"); //sets text field to 8 and places it next to number placed on screen.
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number8ActionPerformed

    private void Number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number4ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "4");
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number4ActionPerformed

    private void Number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number5ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "5");
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number5ActionPerformed

    private void Number6ActionPerformed(java.awt.event.ActionEvent evt) {
        if (equalPressed == true){clear();} //reset if an answer was just generated
        
        jTextField1.setText(jTextField1.getText() + "6");
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }

    private void Number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number1ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "1"); //sets text field to one and places it next to number placed on screen.
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number1ActionPerformed

    private void Number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number2ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "2"); //sets text field to two and places it next to number that is on the screen
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number2ActionPerformed

    private void Number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number3ActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "3"); //sets text field 3 four and places it next to number placed on screen.
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_Number3ActionPerformed

    private void NumberZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberZeroActionPerformed
        if (equalPressed == true){clear();} //reset if an answer was just generated
     
        //dont add extra zeroes if the current text is zero
        if (jTextField1.getText().equals("0") == false)
        {
            jTextField1.setText(jTextField1.getText() + "0"); //sets text field to 0 and places it next to number placed on screen.
        }
        
        //a number button has been pressed, we cant insert the negative symbol for sure now
        cleared = false;
    }//GEN-LAST:event_NumberZeroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jFrame1.setVisible(true); //makes it visible
        //jFrame1.setSize(jFrame1.getPreferredSize()); //sets size to perffred size(or elese it will pop up as a small window)
        jFrame1.setResizable(false); // makes it not resizable
    }//GEN-LAST:event_jMenuItem1ActionPerformed
	// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="More Generated Code">
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
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton decimial;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minus;
    private javax.swing.JButton times;
    // End of variables declaration//GEN-END:variables
}   //</editor-fold>
