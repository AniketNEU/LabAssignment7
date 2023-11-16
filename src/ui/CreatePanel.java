/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import util.DatabaseConnector;

/**
 *
 * @author anikettiwari
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private JPanel bottomPanel;
    
    public CreatePanel(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        NameTextfield = new javax.swing.JTextField();
        AgeTextField = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        NameTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameTextfieldFocusLost(evt);
            }
        });
        NameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextfieldActionPerformed(evt);
            }
        });

        AgeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AgeTextFieldFocusLost(evt);
            }
        });

        TitleLabel.setText("USER REGISTRATION FORM");

        nameLabel.setText("Name");
        nameLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameLabelFocusLost(evt);
            }
        });

        ageLabel.setText("Age");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameTextfield)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(145, 145, 145))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(TitleLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(submitButton)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(TitleLabel)
                .addGap(72, 72, 72)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(67, 67, 67)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextfieldActionPerformed

    private void nameLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameLabelFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nameLabelFocusLost

    private void NameTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextfieldFocusLost
        // TODO add your handling code here:
        String name = NameTextfield.getText();
         if(!isValidName(name)){
            JOptionPane.showMessageDialog(this, "Please enter a valid name", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            NameTextfield.requestFocus();
        }
    }//GEN-LAST:event_NameTextfieldFocusLost

    private void AgeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AgeTextFieldFocusLost
        // TODO add your handling code here:
        String ageText = AgeTextField.getText();
        if (!isValidInteger(ageText)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer for age.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            AgeTextField.requestFocus();
        }
    }//GEN-LAST:event_AgeTextFieldFocusLost

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        User newUser = new User();
        try{
            newUser.setAge(Integer.parseInt(AgeTextField.getText()));
            newUser.setName(NameTextfield.getText());
            DatabaseConnector.addUser(newUser);
            
            cleanup();
            JOptionPane.showMessageDialog(this, "User is successfully registered","Registration successful", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private boolean isValidName(String name){
        return name.matches("^[A-Za-z]*$");
    }
    
    private boolean isValidInteger(String input) {
    if (input == null || input.trim().isEmpty()) {
        return true;
    }
    
    

    try {
        int value = Integer.parseInt(input);
        if (value >= 0) {
            return true; 
        } else {
            return false; 
        }
    } catch (NumberFormatException e) {
        return false; 
    }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JTextField NameTextfield;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables

    private void cleanup() {
        NameTextfield.setText("");
        AgeTextField.setText("");
    }
}
