/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliners;
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageFlightScheduleJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
 Airliners a;
    public ManageFlightScheduleJPanel(JPanel userProcessContainer, Airliners a) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.a =a ;
        AirlineNameTextField.setText(a.getAirlineName());
        refreshTable();
    }

    public void refreshTable() 
    {
        int rowCount = FlightListCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)FlightListCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
    
        for(Flight f : a.getFlightSchedule())
        {
            Object row[] = new Object[5];
            row[0] = f;
            row[1] = f.getFlightNumber();
            row[2] = f.getSource();
            row[3] = f.getDestination();
            row[4] = f.getPrice();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AirlineNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightListCatalog = new javax.swing.JTable();
        viewPButton = new javax.swing.JButton();
        createPButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        delButton5 = new javax.swing.JButton();
        searchFlight = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Flight Catalog");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("AIRLINE NAME :");

        AirlineNameTextField.setEditable(false);
        AirlineNameTextField.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        AirlineNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AirlineNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        AirlineNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineNameTextFieldActionPerformed(evt);
            }
        });

        FlightListCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FLIGHT ID", "FLIGHT NUMBER", "SOURCE", "DESTINATION", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FlightListCatalog);

        viewPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewPButton.setText("View Flight Detail >>");
        viewPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPButtonActionPerformed(evt);
            }
        });

        createPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createPButton.setText("Create Flight >>");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });

        delButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delButton5.setText("Delete Flight(s)");
        delButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButton5ActionPerformed(evt);
            }
        });

        searchFlight.setText("SEARCH");
        searchFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(AirlineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(createPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewPButton, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                            .addComponent(backButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AirlineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delButton5)
                    .addComponent(viewPButton))
                .addGap(9, 9, 9)
                .addComponent(createPButton)
                .addGap(19, 19, 19)
                .addComponent(backButton4)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AirlineNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlineNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlineNameTextFieldActionPerformed

    private void viewPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPButtonActionPerformed
        // TODO add your handling code here:
        int row = FlightListCatalog.getSelectedRow();
        if(row<0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight f = (Flight)FlightListCatalog.getValueAt(row, 0);
        ViewFlightDetailJPanel vpdjp = new ViewFlightDetailJPanel(userProcessContainer, f);
        userProcessContainer.add("ViewProductDetailJPanelSupplier", vpdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPButtonActionPerformed

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed
        CreateNewFlightJPanel cnpjp = new CreateNewFlightJPanel(userProcessContainer, a);
        userProcessContainer.add("SupplierWorkAreaJPanel",cnpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed

    private void delButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButton5ActionPerformed
        // TODO add your handling code here:
        int row = FlightListCatalog.getSelectedRow();
        if(row<0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight f = (Flight)FlightListCatalog.getValueAt(row, 0);
        a.removeProduct(f);
        refreshTable();
    }//GEN-LAST:event_delButton5ActionPerformed

    private void searchFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFlightActionPerformed
        // TODO add your handling code here:
        SearchForFlightJPanel s = new SearchForFlightJPanel(userProcessContainer, a);
        userProcessContainer.add("SearchForProductJPanel", s);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_searchFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AirlineNameTextField;
    private javax.swing.JTable FlightListCatalog;
    private javax.swing.JButton backButton4;
    private javax.swing.JButton createPButton;
    private javax.swing.JButton delButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchFlight;
    private javax.swing.JButton viewPButton;
    // End of variables declaration//GEN-END:variables
}
