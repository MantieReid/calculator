package mymathcal;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;

public class Calculator extends javax.swing.JFrame {
    /**
     * Creates new form Calculator
     * 
     */
    double num = 0, parsedText;
    boolean ansGenerated = false;
    int calculation = 0;
    
    public Calculator() {
        initComponents();
    }
    
    
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
                ans = (num1 / num2);
                break;
        }   
        return ans;
    }
    
    public void clear()
    {
        jTextField1.setText(""); //Clear Textbox.
        
        //Clear all variables.
        num = 0;
        parsedText = 0;
        ansGenerated = false;
        calculation = 0;
    }
    
    //JButton buttonlist[] = new JButton[23]; //array to hold all of the buttons in a collection.
    //Every single Button except for the on and off buttons.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backspace.setText("<---");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Add.setText("+");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Number7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number7.setText("7");
        Number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number7ActionPerformed(evt);
            }
        });

        Number9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number9.setText("9");
        Number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number9ActionPerformed(evt);
            }
        });

        Number8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number8.setText("8");
        Number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number8ActionPerformed(evt);
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

        Number4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number4.setText("4");
        Number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number4ActionPerformed(evt);
            }
        });

        Number5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number5.setText("5");
        Number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number5ActionPerformed(evt);
            }
        });

        Number6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number6.setText("6");
        Number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number6ActionPerformed(evt);
            }
        });

        times.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        times.setText("*");
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        Number1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number1.setText("1");
        Number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number1ActionPerformed(evt);
            }
        });

        Number2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number2.setText("2");
        Number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number2ActionPerformed(evt);
            }
        });

        Number3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Number3.setText("3");
        Number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number3ActionPerformed(evt);
            }
        });

        Divide.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        NumberZero.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        NumberZero.setText("0");
        NumberZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberZeroActionPerformed(evt);
            }
        });

        decimial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        decimial.setText(".");
        decimial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimialActionPerformed(evt);
            }
        });

        Equals.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Number7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Number4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Number1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumberZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(backspace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decimial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        //clear text and reset all variables
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
         parsedText = Double.parseDouble(jTextField1.getText());
         
         //only run if there was not a recent answer generated by hitting equals
         if (ansGenerated == false){
            //this only happens right after a clear or the begining of the program
            if(calculation == 0)
            {
                num = parsedText;
            }
            //otherwise, run calculations as normal
            else
            {
            num = calculate(calculation, num, parsedText);
            }   
            ansGenerated = false;
         }

         calculation = 1; //refers to case 1 addtion  
         jTextField1.setText(""); // clears text field
    }//GEN-LAST:event_AddActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
         parsedText = Double.parseDouble(jTextField1.getText());
         
         
         //this only happens right after a clear or the begining of the program
         if(calculation == 0)
         {
             num = parsedText;
         }
         //otherwise, run calculations as normal
         else
         {
            num = calculate(calculation, num, parsedText);
         }
         
         calculation = 2; //refers to case 2 subtraction  
         jTextField1.setText(""); // clears text field
         ansGenerated = false;
    }//GEN-LAST:event_minusActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
         parsedText = Double.parseDouble(jTextField1.getText());
         
         //this only happens right after a clear or the begining of the program
         if(calculation == 0)
         {
             num = parsedText;
         }
         //otherwise, run calculations as normal
         else
         {
            num = calculate(calculation, num, parsedText);
         }
         
         calculation = 3; //refers to case 3 multiplication 
         jTextField1.setText(""); // clears text field
         ansGenerated = false;
    }//GEN-LAST:event_timesActionPerformed
    
    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
         parsedText = Double.parseDouble(jTextField1.getText());
         
         //this only happens right after a clear or the begining of the program
         if(calculation == 0)
         {
             num = parsedText;
         }
         //otherwise, run calculations as normal
         else
         {
            num = calculate(calculation, num, parsedText);
         }
         
         calculation = 4; //refers to case 4 division 
         jTextField1.setText(""); // clears text field
         ansGenerated = false;
    }//GEN-LAST:event_DivideActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Number Buttons">
    private void Number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number7ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "7"); //sets text field to 7 and places it next to number placed on screen.
    }//GEN-LAST:event_Number7ActionPerformed

    private void Number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number9ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "9"); //sets text field to 9 and places it next to number placed on screen.
    }//GEN-LAST:event_Number9ActionPerformed

    private void Number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number8ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "8"); //sets text field to 8 and places it next to number placed on screen.
    }//GEN-LAST:event_Number8ActionPerformed

    private void Number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number4ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_Number4ActionPerformed

    private void Number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number5ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_Number5ActionPerformed

    private void Number6ActionPerformed(java.awt.event.ActionEvent evt) {
        if (ansGenerated == true){clear();} //reset if an answer was just generated
        
        jTextField1.setText(jTextField1.getText() + "6");
    }

    private void Number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number1ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "1"); //sets text field to one and places it next to number placed on screen.
    
    }//GEN-LAST:event_Number1ActionPerformed

    private void Number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number2ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "2"); //sets text field to two and places it next to number that is on the screen
    }//GEN-LAST:event_Number2ActionPerformed

    private void Number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number3ActionPerformed
        if (ansGenerated == true){clear();} //reset if an answer was just generated
     
        jTextField1.setText(jTextField1.getText() + "3"); //sets text field 3 four and places it next to number placed on screen.
    }//GEN-LAST:event_Number3ActionPerformed

    private void NumberZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberZeroActionPerformed
     if (ansGenerated == true){clear();} //reset if an answer was just generated
     
     //dont add extra zeroes if the current text is zero
     if (jTextField1.getText().equals("0") == false)
     {
        jTextField1.setText(jTextField1.getText() + "0"); //sets text field to 0 and places it next to number placed on screen.
     }
    }//GEN-LAST:event_NumberZeroActionPerformed
// </editor-fold> 
    
    private void decimialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimialActionPerformed
        if (ansGenerated == false)
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
    }//GEN-LAST:event_decimialActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
        if (ansGenerated == false) {
            parsedText = Double.parseDouble(jTextField1.getText());
        }
        
        //dont do anything if there is no calculations to do
        if (calculation != 0)
        {
            num = calculate(calculation, num, parsedText);
            jTextField1.setText(Double.toString(num)); //converets double to string. 
            ansGenerated = true;
        }
    }//GEN-LAST:event_EqualsActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        if (ansGenerated == false)
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minus;
    private javax.swing.JButton times;
    // End of variables declaration//GEN-END:variables
}   //</editor-fold>
