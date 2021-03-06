/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class Car extends javax.swing.JFrame {

    /**
     * Creates new form Car
     */
    //the car class is created as an object in my GUI
  
  
    
    public Car() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Accelerate = new javax.swing.JButton();
        Brake = new javax.swing.JButton();
        instructions = new javax.swing.JLabel();
        Color = new javax.swing.JComboBox<>();
        model = new javax.swing.JComboBox<>();
        make = new javax.swing.JComboBox<>();
        theMake = new javax.swing.JLabel();
        theModel = new javax.swing.JLabel();
        theColor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Created by Angelica Jones");

        Accelerate.setText("Accelerate");
        Accelerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccelerateActionPerformed(evt);
            }
        });

        Brake.setText("Brake");
        Brake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrakeActionPerformed(evt);
            }
        });

        instructions.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instructions.setText("Let's talk about cars! Pick your make, model and color. Then press accelerate to increase your speed or brake to decrease it.");

        Color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "White", "Blue", "Black", "Purple" }));
        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });

        model.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camry", "Tahoe", "Jeep", "Camaro", "Impala" }));
        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });

        make.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        make.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Chevrolet", "Ford", "Honda", "Dodge" }));
        make.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeActionPerformed(evt);
            }
        });

        theMake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theMake.setText("Make");

        theModel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theModel.setText("Model");

        theColor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theColor.setText("Color");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(Accelerate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(Brake, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(instructions))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(theMake)
                                .addGap(200, 200, 200)
                                .addComponent(theModel)))
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(theColor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(instructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(theMake)
                    .addComponent(theModel)
                    .addComponent(theColor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Accelerate, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Brake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccelerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccelerateActionPerformed
        // TODO add your handling code here:
       String model = (String)this.model.getSelectedItem();
       String make = (String)this.make.getSelectedItem();
       String myColor = (String)this.Color.getSelectedItem();
       String speed = this.jLabel2.getText();
       //creating objects for all the attributes in my car class
       
               
        
    //call the car classs and create a new object
        
        CarClass vehicle = new CarClass(model, myColor, make);
        
        String theMake = vehicle.getMake();
        String theModel = vehicle.getModel();
        String theColor = vehicle.getColor();
        
        
                
        
        int oldSpeed = Integer.parseInt(speed);
        vehicle.setSpeed(oldSpeed);
        int fast = vehicle.accelerate();
        this.jLabel2.setText(Integer.toString(0));
        this.jLabel2.setText("Your speed is " + Integer.toString(fast));
        //Juana suggested I use a label to display my speed instead of a textfield because the user can enter whatever they wantand crash my code.
        
       
       
        
    }//GEN-LAST:event_AccelerateActionPerformed

    private void BrakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrakeActionPerformed
       String model = (String)this.model.getSelectedItem();
       String make = (String)this.make.getSelectedItem();
       String myColor = (String)this.Color.getSelectedItem();
       String speed = this.jLabel2.getText();
       //creating objects for all the attributes in my car class
               
        
    //call the car classs and create a new object
        
        CarClass vehicle = new CarClass(model, myColor, make);
        
        //creating objects and printing them to the label
        int oldSpeed = Integer.parseInt(speed);
        vehicle.setSpeed(oldSpeed);
        int slow = vehicle.brake();
        this.jLabel2.setText("Your speed is " + Integer.toString(slow));
    }//GEN-LAST:event_BrakeActionPerformed

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorActionPerformed

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
       
    }//GEN-LAST:event_modelActionPerformed

    private void makeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accelerate;
    private javax.swing.JButton Brake;
    private javax.swing.JComboBox<String> Color;
    private javax.swing.JLabel instructions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> make;
    private javax.swing.JComboBox<String> model;
    private javax.swing.JLabel theColor;
    private javax.swing.JLabel theMake;
    private javax.swing.JLabel theModel;
    // End of variables declaration//GEN-END:variables
}
