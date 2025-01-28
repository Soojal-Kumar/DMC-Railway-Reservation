/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.train.packs;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 *
 * @author HP
 */
public class AdminSchedule extends javax.swing.JFrame {

    /**
     * Creates new form AdminSchedule
     */
    public String name;
    public String sid;
    public AdminSchedule(String uname) {
        initComponents();
        name=uname;
            if(name.equals("jubli"))
        {
       
        }
            else if(name.equals("popup"))
            {
             jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jSpinField1.setVisible(false);
        jSpinField2.setVisible(false);
        jSpinField3.setVisible(false);
        jSpinField4.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton9.setVisible(false);
        jButton8.setVisible(false);
        jButton6.setVisible(false);
        jButton4.setVisible(false);
         jLabel2.setVisible(false);
         jLabel3.setVisible(false);
         jLabel4.setVisible(false);
         jLabel5.setVisible(false);
         jLabel6.setVisible(false);
         jLabel7.setVisible(false);
         jPanel1.setSize(920, 400);
         jScrollPane2.setSize(878,380 );
                  jTable1.setSize(878,380 );
            }
        else
        {
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jSpinField1.setVisible(false);
        jSpinField2.setVisible(false);
        jSpinField3.setVisible(false);
        jSpinField4.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton9.setVisible(false);
        jButton8.setVisible(false);
        jButton6.setVisible(false);
         jLabel2.setVisible(false);
         jLabel3.setVisible(false);
         jLabel4.setVisible(false);
         jLabel5.setVisible(false);
         jLabel6.setVisible(false);
         jLabel7.setVisible(false);
         jPanel1.setSize(920, 400);
         jScrollPane2.setSize(878,380 );
                  jTable1.setSize(878,380 );
       
        }
        updatestable();
        updatecmbox();
    }

    private AdminSchedule() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }        
    public void updatecmbox()
    {
        
        try
        {        
            
            String sql="SELECT * FROM train";
            Connection con=  SConnection.getcon();
            PreparedStatement pst = con.prepareStatement (sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) 
            {
              jComboBox2.addItem(rs.getString("train_name"));
            }
                        
            String ssql="SELECT * FROM station";
            pst = con.prepareStatement (ssql);
            rs = pst.executeQuery();
            while (rs.next()) 
            {
              jComboBox3.addItem(rs.getString("station_name"));
              jComboBox1.addItem(rs.getString("station_name"));

            }
        }
    
    catch (Exception e)
    {
        System.out.println("Error: "+e);
    }
}

        public void updatestable()
    {
        
        try
        {        
            
            String sql="SELECT schedule_id, train_name, dep.station_name AS departure_station, arr.station_name AS arrival_station, departure_time, arrival_time, t_date FROM TSCHEDULE TS join TRAIN T ON TS.train_id=T.train_id JOIN station dep ON ts.departure_station = dep.station_id JOIN station arr ON ts.arrival_station = arr.station_id;";
            Connection con=  SConnection.getcon();
            PreparedStatement pst = con.prepareStatement (sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount (0);
            while (rs.next()) 
            {
                model.addRow(new String[] {rs.getString(1), rs.getString (2), rs.getString (3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
                
            }
        }
    
    catch (Exception e)
    {
        System.out.println("Error: "+e);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jSpinField1 = new com.toedter.components.JSpinField();
        jSpinField2 = new com.toedter.components.JSpinField();
        jSpinField3 = new com.toedter.components.JSpinField();
        jSpinField4 = new com.toedter.components.JSpinField();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCHEDULE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 1, 24))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule ID", "Train Name", "Departure", "Arrival", "Departure TIme", "Arrival Time", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 920, 370));

        jButton4.setBackground(new java.awt.Color(60, 63, 65));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton4.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jButton4.setText("BACK");
        jButton4.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"), 3, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 410, 40));

        jButton6.setBackground(new java.awt.Color(60, 63, 65));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton6.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jButton6.setText("ADD");
        jButton6.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green"), 3, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 110, 40));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 120, 40));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 120, 40));

        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 120, 40));

        jButton8.setBackground(new java.awt.Color(60, 63, 65));
        jButton8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton8.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jButton8.setText("DELETE");
        jButton8.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Red"), 3, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 120, 40));

        jLabel2.setText("Arrival");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        jLabel3.setText("Train Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel4.setText("Departure");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jLabel6.setText("Departure Time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("y-M-d");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 120, 40));

        jLabel7.setText("Arrival Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jSpinField1.setMaximum(59);
        jSpinField1.setMinimum(0);
        getContentPane().add(jSpinField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 50, 30));

        jSpinField2.setMaximum(59);
        jSpinField2.setMinimum(0);
        getContentPane().add(jSpinField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 50, 30));

        jSpinField3.setMaximum(23);
        jSpinField3.setMinimum(0);
        getContentPane().add(jSpinField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 60, 30));

        jSpinField4.setMaximum(23);
        jSpinField4.setMinimum(0);
        getContentPane().add(jSpinField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 60, 30));

        jButton9.setBackground(new java.awt.Color(60, 63, 65));
        jButton9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton9.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton9.setText("UPDATE");
        jButton9.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"), 3, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 120, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(name.equals("user"))
        {
        Menu  m =new Menu("user");
        m.setVisible(true);
        dispose();
        }
        else if(name.equals("jubli")){
        Menu  m =new Menu("jubli");
        m.setVisible(true);
        dispose();}

            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
     

       
        String deptime=jSpinField3.getValue()+":"+jSpinField2.getValue();
        String arrtime=jSpinField4.getValue()+":"+jSpinField1.getValue();
        try{
        PreparedStatement ps;
        ResultSet rs=null;
        Connection con=  SConnection.getcon();
        
         ps=con.prepareStatement("Insert into tschedule(train_id,departure_station,arrival_station,departure_time,arrival_time,t_date) value((select train_id from train where train_name=?),(select station_id from station where station_name=?),(select station_id from station where station_name=?),?,?,?)"); 

         ps.setString (1,jComboBox2.getSelectedItem().toString());
         ps.setString (2,jComboBox3.getSelectedItem().toString());
         ps.setString (3,jComboBox1.getSelectedItem().toString());
         ps.setString (4,deptime);
         ps.setString (5,arrtime);
         SimpleDateFormat sdf=new SimpleDateFormat ("y-M-d"); 
         String tdate=sdf.format (jDateChooser1.getDate());
         ps.setString (6,tdate);

         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(this,"Record Added");
         updatestable();

         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
              try{
              
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel(); 
        int SelectedRows = jTable1.getSelectedRow();
        PreparedStatement ps;
        ResultSet rs=null;
        Connection con=  SConnection.getcon();
        
         ps=con.prepareStatement("delete from tschedule where schedule_id=?"); 
         
         ps.setString(1,RecordTable.getValueAt(SelectedRows, 0).toString());


         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(this,"Record Deleted");
         updatestable();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
                String deptime=jSpinField3.getValue()+":"+jSpinField2.getValue();
        String arrtime=jSpinField4.getValue()+":"+jSpinField1.getValue();
        try{
        PreparedStatement ps;
        ResultSet rs=null;
                DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel(); 
        int SelectedRows = jTable1.getSelectedRow();
        Connection con=  SConnection.getcon();
        
         ps=con.prepareStatement("update tschedule set train_id = (select train_id from train where train_name=?), departure_station=(select station_id from station where station_name=?),arrival_station=(select station_id from station where station_name=?),departure_time=?,arrival_time=?,t_date=? where schedule_id=?"); 

         ps.setString (1,jComboBox2.getSelectedItem().toString());
         ps.setString (2,jComboBox3.getSelectedItem().toString());
         ps.setString (3,jComboBox1.getSelectedItem().toString());
         ps.setString (4,deptime);
         ps.setString (5,arrtime);
         SimpleDateFormat sdf=new SimpleDateFormat ("y-M-d"); 
         String tdate=sdf.format (jDateChooser1.getDate());
         ps.setString (6,tdate);
         ps.setString(7,RecordTable.getValueAt(SelectedRows, 0).toString());


         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(this,"Record Updated");
         updatestable();

         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_jButton9ActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
           DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel(); 
        int SelectedRows = jTable1.getSelectedRow();
        jComboBox2.setSelectedItem(RecordTable.getValueAt (SelectedRows, 1).toString());
        jComboBox3.setSelectedItem(RecordTable.getValueAt (SelectedRows, 2).toString());
        jComboBox1.setSelectedItem(RecordTable.getValueAt (SelectedRows, 3).toString());
        sid=RecordTable.getValueAt(SelectedRows, 0).toString();

   
    }//GEN-LAST:event_jTable1MouseClicked

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
    UIManager.setLookAndFeel( new FlatDarkLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSchedule().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private com.toedter.components.JSpinField jSpinField3;
    private com.toedter.components.JSpinField jSpinField4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
