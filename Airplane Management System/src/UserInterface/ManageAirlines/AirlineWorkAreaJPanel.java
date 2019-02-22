/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.AirlineDirectory;
import Business.Airliners;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author riya
 */
public class AirlineWorkAreaJPanel extends javax.swing.JPanel {

  JPanel userProcessContainer;
  Airliners a;
    
     public AirlineWorkAreaJPanel(JPanel userProcessContainer,  Airliners a) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.a=a;
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (FLLIGHT SCHEDULE)");

        managePButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePButton.setText("Manage Flight Schedule >>");
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 210, Short.MAX_VALUE)
                    .addComponent(managePButton)
                    .addGap(0, 235, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(373, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 135, Short.MAX_VALUE)
                    .addComponent(managePButton)
                    .addGap(0, 285, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed
        // TODO add your handling code here:
        ManageFlightScheduleJPanel mpcjp = new ManageFlightScheduleJPanel(userProcessContainer, a);
        userProcessContainer.add("ManageProductCatalogJPanel",mpcjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
}
