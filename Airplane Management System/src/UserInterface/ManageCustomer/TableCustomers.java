/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.AirlineDirectory;
import Business.Airliners;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.Seat;
import static UserInterface.ManageAirlines.CreateNewFlightJPanel.convertToString;
import UserInterface.ManageAirlines.ManageFlightScheduleJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riya
 */
public class TableCustomers extends javax.swing.JPanel {
 
    JPanel userProcessContainer;
    private AirlineDirectory airlineDirectory;
    private CustomerDirectory customerDirectory;
    Flight f;
    public TableCustomers() {
        initComponents();
    }

    TableCustomers(JPanel userProcessContainer, Flight f, AirlineDirectory airlineDirectory, CustomerDirectory customerDirectory) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.airlineDirectory = airlineDirectory;
        this.customerDirectory = customerDirectory;
        this.f = f;
        refreshTable();
        Seatsavailable.setText(Integer.toString(f.getCount()));;
       flighttxt.setText(f.getFlightNumber());
       flighttxtsource.setText(f.getSource());
       flighttxtdest.setText(f.getDestination());
       flightprice.setText(Double.toString(f.getPrice()));
     
    }
    public void refreshTable()
    {
        int rowCount = Customertbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)Customertbl.getModel();
        for(int i = rowCount - 1; i >=0; i--)
        {
            model.removeRow(i);
        }
        
       Seat s = customerDirectory.getSeat();
      // String[] abc = s.getSeatsSelection();
        ArrayList<String> seats1 = s.getSeatsSelection1();
       for(String i: seats1)
       {
            Object row[] = new Object[1];
            row[0] = i;
            model.addRow(row);
           
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Customertbl = new javax.swing.JTable();
        BACK = new javax.swing.JButton();
        SelectSeatButton = new javax.swing.JButton();
        showSelectedSeat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Seatsavailable = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        flighttxt = new javax.swing.JTextField();
        flighttxtsource = new javax.swing.JTextField();
        flighttxtdest = new javax.swing.JTextField();
        flightprice = new javax.swing.JTextField();
        custName = new javax.swing.JTextField();
        custPhone = new javax.swing.JTextField();
        BOOK = new javax.swing.JButton();

        Customertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "SEATS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Customertbl);

        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        SelectSeatButton.setText("SELECT");
        SelectSeatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectSeatButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("SELECTED SEAT :");

        jLabel1.setText("Seats Available :");

        Seatsavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatsavailableActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Book Flight for the Customer");

        jLabel2.setText("Flight Number:");

        jLabel3.setText("Source: ");

        jLabel5.setText("Destination:");

        jLabel7.setText("Price");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Customer Details");

        jLabel11.setText("Name:");

        jLabel13.setText("Phone");

        flighttxtsource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flighttxtsourceActionPerformed(evt);
            }
        });

        BOOK.setText("BOOK");
        BOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1)
                                    .addComponent(BACK)
                                    .addComponent(SelectSeatButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Seatsavailable)
                                    .addComponent(showSelectedSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(flightprice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(flighttxtdest, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(flighttxtsource, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(flighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13))
                                        .addGap(120, 120, 120)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(custPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(531, 531, 531)
                        .addComponent(BOOK)))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Seatsavailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(SelectSeatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(showSelectedSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BACK)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(flighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(flighttxtsource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(flighttxtdest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(flightprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(custPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addComponent(BOOK)
                        .addContainerGap(119, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SelectSeatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectSeatButtonActionPerformed
        // TODO add your handling code here:
     
     f.decerement();
     Seatsavailable.setText(Integer.toString(f.getCount()));
     int row = Customertbl.getSelectedRow();
     String s = (String)Customertbl.getValueAt(row, 0);
     customerDirectory.getSeat().removeSeat(s);
     refreshTable();
    }//GEN-LAST:event_SelectSeatButtonActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        
//        int row = Customertbl.getSelectedRow();
//        if(row<0) 
//        {
//            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        String s = (String)Customertbl.getValueAt(row, 0);
//        customerDirectory.getSeat().removeSeat(s);
//        refreshTable();
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BACKActionPerformed

    private void SeatsavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatsavailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeatsavailableActionPerformed

    private void flighttxtsourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flighttxtsourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flighttxtsourceActionPerformed

    private void BOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKActionPerformed
        // TODO add your handling code here:
        
        Customer c = customerDirectory.addCustomer();
        c.setCustomerName(custName.getText());
        c.setCustomerPhoneNum(Integer.parseInt(custPhone.getText()));
        
        JOptionPane.showMessageDialog(null, "Flight Booked Successfully");
    }//GEN-LAST:event_BOOKActionPerformed
//private void backAction() 
//  {
//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        ViewBestFlightDealsJPanel v = (ViewBestFlightDealsJPanel) component;
//        v.refreshTable();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton BOOK;
    private javax.swing.JTable Customertbl;
    private javax.swing.JTextField Seatsavailable;
    private javax.swing.JButton SelectSeatButton;
    private javax.swing.JTextField custName;
    private javax.swing.JTextField custPhone;
    private javax.swing.JTextField flightprice;
    private javax.swing.JTextField flighttxt;
    private javax.swing.JTextField flighttxtdest;
    private javax.swing.JTextField flighttxtsource;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField showSelectedSeat;
    // End of variables declaration//GEN-END:variables
}