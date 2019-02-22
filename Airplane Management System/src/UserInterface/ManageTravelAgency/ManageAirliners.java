/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import Business.AirlineDirectory;
import Business.Airliners;
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riya
 */
public class ManageAirliners extends javax.swing.JPanel {
 JPanel userProcessContainer;
    private AirlineDirectory airlineDirectory;
    
    public ManageAirliners(JPanel userProcessContainer, AirlineDirectory airlineDirectory) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.airlineDirectory=airlineDirectory;
        refreshTable();
    }

     public void refreshTable()
    {
        int rowCount = tblFlight.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblFlight.getModel();
        for(int i = rowCount - 1; i >=0; i--)
        {
            model.removeRow(i);
        }
        
        for(Airliners s : airlineDirectory.getAirlineDirectory()) 
        {
            Object row[] = new Object[1];
            row[0] = s;
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlight = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ViewManageAirlines = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        jLabel1.setText("Manage Airlines");

        tblFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "AIRLINE NAME"
            }
        ));
        jScrollPane1.setViewportView(tblFlight);

        jButton1.setText("ADD AIRLINE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ViewManageAirlines.setText("VIEW AIRLINE ");
        ViewManageAirlines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewManageAirlinesActionPerformed(evt);
            }
        });

        Remove.setText("REMOVE");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewManageAirlines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Remove)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Remove))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewManageAirlines)
                    .addComponent(Back))
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         AddAirline as = new AddAirline(userProcessContainer, airlineDirectory);
        userProcessContainer.add("AddSupplier", as);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViewManageAirlinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewManageAirlinesActionPerformed
        // TODO add your handling code here:
        int row = tblFlight.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Airliners a = (Airliners)tblFlight.getValueAt(row, 0);
        ViewAirline vs = new ViewAirline(userProcessContainer, a);
        userProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewManageAirlinesActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
     int row = tblFlight.getSelectedRow();  
        if(row<0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
      Airliners a = (Airliners)tblFlight.getValueAt(row, 0);
      airlineDirectory.removeAirliner(a);
      refreshTable();
      
    }//GEN-LAST:event_RemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Remove;
    private javax.swing.JButton ViewManageAirlines;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlight;
    // End of variables declaration//GEN-END:variables
}
