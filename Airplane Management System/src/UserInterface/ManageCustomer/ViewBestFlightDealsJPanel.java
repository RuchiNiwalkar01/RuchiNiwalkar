/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.AirlineDirectory;
import Business.Airliners;
import Business.CustomerDirectory;
import Business.Flight;
import UserInterface.ManageAirlines.ViewFlightDetailJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riya
 */
public class ViewBestFlightDealsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private AirlineDirectory airlineDirectory;
    private CustomerDirectory customerDirectory;
    ViewBestFlightDealsJPanel(JPanel userProcessContainer, AirlineDirectory airlineDirectory, CustomerDirectory customerDirectory) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.airlineDirectory = airlineDirectory;
        this.customerDirectory = customerDirectory;
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
        jLabel3 = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        destinationTxt = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightsTblCustomer = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Best Deals");

        jLabel3.setText("Source ");

        jLabel4.setText("Destination");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        flightsTblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Source", "Destination", "Price", "Airline", "Airline Number", "FLIGHT ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightsTblCustomer.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(flightsTblCustomer);

        jButton2.setText("PROCEED");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 623, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(308, 308, 308))))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44)
                        .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 64, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 312, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 338, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 99, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) flightsTblCustomer.getModel();
        dtm.setRowCount(0);
        for(Airliners airliner :airlineDirectory.getAirlineDirectory())
        {
            for(Flight flight: airliner.getFlightSchedule())
            {
                if(flight.getSource().equalsIgnoreCase(sourceTxt.getText()) && flight.getDestination().equalsIgnoreCase(destinationTxt.getText()))
                {
                    Object row[]= new Object[7];
                    row[0]= flight;
                    row[1]= flight.getFlightNumber();
                    row[2]=flight.getSource();
                    row[3]=flight.getDestination();
                    row[4]=flight.getPrice();
                    row[5]=airliner.getAirlineName();
                    row[6] = flight.getFlightID();
                    dtm.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//   //     SeatChartCustomers sc = new SeatChartCustomers(userProcessContainer, airlineDirectory,customerDirectory) 
//         SeatChartCustomers sc = new SeatChartCustomers(userProcessContainer,  airlineDirectory,customerDirectory);
//        userProcessContainer.add("BookCustomersJPanel", sc);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
//         
//         int row = flightsTblCustomer.getSelectedRow();
//        if(row<0) 
//        {
//            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        Flight f = (Flight)flightsTblCustomer.getValueAt(row, 0);
//        SeatChartCustomers sc = new SeatChartCustomers(userProcessContainer, f , airlineDirectory,customerDirectory);
//        userProcessContainer.add("BookCustomersJPanel", sc);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
        
                int selectedRow = flightsTblCustomer.getSelectedRow();
        
        if(selectedRow >= 0 )
        {
            Flight flight = (Flight) flightsTblCustomer.getValueAt(selectedRow, 0);
            if(flight.getSeatArrayList().size() < flight.getCount())
            {
                TableCustomers panel = new TableCustomers(userProcessContainer,flight,airlineDirectory,customerDirectory);
                userProcessContainer.add("BookCustomersJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
           else
            {
                 JOptionPane.showMessageDialog(null, "NO seat available", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
            
        
//        int selectedRow = flightsTbl.getSelectedRow();
//        if(selectedRow >= 0 ){
//            Flight flight = (Flight) flightsTbl.getValueAt(selectedRow, 0);
//            if(flight.getSeat().size() < flight.getFlightSize()){
//                BookCustomersJPanel panel = new BookCustomersJPanel(userProcessContainer,airlineDirectory,flight,customerDirectory);
//                userProcessContainer.add("BookCustomersJPanel", panel);
//                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//                layout.next(userProcessContainer);
//            }else
//            JOptionPane.showMessageDialog(null, "No seat available in this flight. Please choose another flight.","Warning!", JOptionPane.WARNING_MESSAGE);
//        }else
//        JOptionPane.showMessageDialog(null, "Please select a flight first");

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JTable flightsTblCustomer;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sourceTxt;
    // End of variables declaration//GEN-END:variables
}
