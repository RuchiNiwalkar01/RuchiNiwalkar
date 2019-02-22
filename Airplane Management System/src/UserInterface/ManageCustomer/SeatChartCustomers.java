/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.AirlineDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.Seat;
import static UserInterface.ManageAirlines.CreateNewFlightJPanel.convertToString;
import UserInterface.ManageAirlines.ManageFlightScheduleJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author riya
 */
public class SeatChartCustomers extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private AirlineDirectory airlineDirectory;
    private CustomerDirectory customerDirectory;
    private Flight f;
    private int count;
    String a ;
    
    public SeatChartCustomers(JPanel userProcessContainer,Flight f,  AirlineDirectory airlineDirectory, CustomerDirectory customerDirectory) 
    {
        initComponents();
        this.f = f;
        this.userProcessContainer=userProcessContainer;
        this.airlineDirectory = airlineDirectory;
        this.customerDirectory = customerDirectory;
        flightNumberTxt.setText(f.getFlightNumber());
        sourceTxt.setText(f.getSource());
        destinationTxt.setText(f.getDestination());
        deptTimeTxt.setText(convertToString(f.getDepartureDate()));
        arrivalTimeTxt.setText(convertToString(f.getArrivalDate())); 
        FlightIDTxt.setText(Integer.toString(f.getFlightID()));
       if(f.getFlightID()==Integer.parseInt(FlightIDTxt.getText()))
       {
            Seat s = customerDirectory.getSeat();
           String[] SeatsChart = s.getSeatsSelection();
    
          for(String i : SeatsChart)
                 {
                     ComboBoxSeats.addItem(i);
                 }
             ComboBoxSeats.setSelectedItem(null); 
             ComboBoxSeats.removeItem(showSelectedSeat.getText());
           
       }
       
     
            
         Customer cust =  customerDirectory.addCustomer();
         int c =cust.getCustomerCount();
         AvailSeats.setText(Integer.toString(c));
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxSeats = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        showSelectedSeat = new javax.swing.JTextField();
        SelectSeatButton = new javax.swing.JButton();
        PROCEED = new javax.swing.JButton();
        AvailSeats = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        custNameTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        arrivalTimeTxt = new javax.swing.JTextField();
        flightNumberTxt = new javax.swing.JTextField();
        sourceTxt = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        deptTimeTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FlightIDTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        ComboBoxSeats.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSeatsActionPerformed(evt);
            }
        });

        jLabel1.setText("Seats");

        jLabel9.setText("SELECTED SEAT :");

        SelectSeatButton.setText("SELECT");
        SelectSeatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectSeatButtonActionPerformed(evt);
            }
        });

        PROCEED.setText("BOOK");
        PROCEED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROCEEDActionPerformed(evt);
            }
        });

        AvailSeats.setColumns(10);
        AvailSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailSeatsActionPerformed(evt);
            }
        });

        BACK.setText("Back");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        jLabel2.setText("Flight Number:");

        jLabel3.setText("Source: ");

        jLabel5.setText("Destination:");

        jLabel7.setText("Departure Time:");

        jLabel8.setText("Arrival Time:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Customer Details");

        jLabel11.setText("Name:");

        custNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTxtActionPerformed(evt);
            }
        });
        custNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custNameTxtKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Book Flight for the Customer");

        arrivalTimeTxt.setEditable(false);

        flightNumberTxt.setEditable(false);

        sourceTxt.setEditable(false);

        destinationTxt.setEditable(false);

        deptTimeTxt.setEditable(false);

        jLabel13.setText("Email:");

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("FLIGHT ID ");

        FlightIDTxt.setEditable(false);

        jLabel6.setText("Selected Seat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(SelectSeatButton))
                    .addComponent(BACK))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(PROCEED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(showSelectedSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 403, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(91, 91, 91)
                                .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(72, 72, 72)
                                .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(45, 45, 45)
                                .addComponent(deptTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(65, 65, 65)
                                .addComponent(arrivalTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(102, 102, 102)
                                .addComponent(custNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(104, 104, 104)
                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel12)))
                        .addGap(344, 344, 344))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flightNumberTxt)
                            .addComponent(FlightIDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)))
                .addComponent(AvailSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AvailSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(FlightIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2))
                            .addComponent(flightNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(deptTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(arrivalTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(custNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectSeatButton)
                            .addComponent(jLabel9)
                            .addComponent(showSelectedSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACK)
                    .addComponent(PROCEED))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PROCEEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROCEEDActionPerformed
        // TODO add your handling code here:
         ComboBoxSeats.removeItem(showSelectedSeat.getText());
         showSelectedSeat.setText("");
         Customer cust =  customerDirectory.addCustomer();
         count =cust.countSeatdecrement();
         AvailSeats.setText(Integer.toString(count));
//        Book sc = new Book(userProcessContainer,  airlineDirectory,customerDirectory, a);
//        userProcessContainer.add("BookCustomersJPanel", sc);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
      
        
    }//GEN-LAST:event_PROCEEDActionPerformed

    private void AvailSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailSeatsActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
//         userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        ViewBestFlightDealsJPanel manageProductCatalogJPanel = (ViewBestFlightDealsJPanel) component;
//        manageProductCatalogJPanel.refreshTable();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BACKActionPerformed

    private void custNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTxtActionPerformed

    private void custNameTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custNameTxtKeyPressed
//        int key = evt.getKeyCode();
//        if(!(key >= evt.VK_0 && key <= evt.VK_9) || key == evt.VK_BACK_SPACE || key == evt.VK_RIGHT || key == evt.VK_LEFT || key == evt.VK_DELETE){
//            custNameTxt.setEditable(true);
//            custNameTxt.setBackground(Color.WHITE);
//        }else{
//            custNameTxt.setEditable(false);
//            custNameTxt.setBackground(Color.RED);
//        }
    }//GEN-LAST:event_custNameTxtKeyPressed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void ComboBoxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSeatsActionPerformed

    private void SelectSeatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectSeatButtonActionPerformed
        // TODO add your handling code here:
        a = (String)ComboBoxSeats.getSelectedItem();
        showSelectedSeat.setText(a);
    }//GEN-LAST:event_SelectSeatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvailSeats;
    private javax.swing.JButton BACK;
    private javax.swing.JComboBox ComboBoxSeats;
    private javax.swing.JTextField FlightIDTxt;
    private javax.swing.JButton PROCEED;
    private javax.swing.JButton SelectSeatButton;
    private javax.swing.JTextField arrivalTimeTxt;
    private javax.swing.JTextField custNameTxt;
    private javax.swing.JTextField deptTimeTxt;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField flightNumberTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField showSelectedSeat;
    private javax.swing.JTextField sourceTxt;
    // End of variables declaration//GEN-END:variables
}
