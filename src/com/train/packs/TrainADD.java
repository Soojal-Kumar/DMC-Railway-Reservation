/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.train.packs;

import com.formdev.flatlaf.FlatDarkLaf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
/**
 *
 * @author HP
 */
public class TrainADD extends javax.swing.JFrame {
    
    
    public String name;   
    public TrainADD(String uname) {
        initComponents();
        name=uname;
        updatettable();
        updatecbox();
    }

    private TrainADD() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    public void updatecbox()
    {
        
        try
        {        
            
            String sql="SELECT * FROM traintype";
            Connection con=  SConnection.getcon();
            PreparedStatement pst = con.prepareStatement (sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) 
            {
              jfrom.addItem(rs.getString("type_name"));
            }
        }
    
    catch (Exception e)
    {
        System.out.println("Error: "+e);
    }
}

    
    public void updatettable()
    {
        
        try
        {        
            
            String sql="SELECT train_id,train_name,type_name,t_capacity FROM TRAIN t join traintype tt on t.t_type=tt.type_id order by train_id asc;";
            Connection con=  SConnection.getcon();
            PreparedStatement pst = con.prepareStatement (sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount (0);
            while (rs.next()) 
            {
                model.addRow(new String[] {rs.getString(1), rs.getString (2), rs.getString (3), rs.getString(4)});
                
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

        time1 = new cambodia.raven.Time();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jfrom = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        time1.setBackground(new java.awt.Color(153, 153, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TrainID", "Train Name", "Type", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 940, 280));

        jfrom.setForeground(new java.awt.Color(255, 255, 255));
        jfrom.setBorder(null);
        jfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfromActionPerformed(evt);
            }
        });
        getContentPane().add(jfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 280, 40));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 300, 40));

        jButton6.setBackground(new java.awt.Color(60, 63, 65));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton6.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jButton6.setText("BACK");
        jButton6.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"), 3, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 300, 40));

        jButton9.setBackground(new java.awt.Color(60, 63, 65));
        jButton9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton9.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jButton9.setText("ADD");
        jButton9.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green"), 3, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 180, 40));

        jButton3.setBackground(new java.awt.Color(60, 63, 65));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton3.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jButton3.setText("DELETE");
        jButton3.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Red"), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 180, 40));

        jButton10.setBackground(new java.awt.Color(60, 63, 65));
        jButton10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton10.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton10.setText("UPDATE");
        jButton10.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"), 3, true));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 190, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 300, 40));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 940, 20));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TRAINS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel9.setText("Train Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabel6.setText("Capacity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 200, -1));

        jLabel8.setText("Train Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/bg13.jpg"))); // NOI18N
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/Train Station Illustration.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfromActionPerformed
String Dupl[];
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         int spinnerValue = (int) jSpinner1.getValue();

                  
        if(spinnerValue<100)
        { JOptionPane.showMessageDialog(this,"The Minimum Capacity should be 100");}
        else if(jTextField1.getText().isBlank())
        {
        { JOptionPane.showMessageDialog(this,"Please Fill the Name...!");}
        }
        else
        {
                     String stype=jfrom.getSelectedItem().toString();
         if(stype.contentEquals("Luxury"))
         {
             stype="1";
         }
        else if(stype.contentEquals("Standard"))
         {
             stype="2";
         }
        else if(stype.contentEquals("Economy"))
         {
             stype="3";
         }
           try{
        PreparedStatement ps;
        ResultSet rs=null;
        Connection con=  SConnection.getcon();
        
         ps=con.prepareStatement("Insert into train(train_name,t_type,t_capacity) value(?,?,?)"); 
         
         ps.setString (1,jTextField1.getText());
         ps.setString (2,stype);
         ps.setString (3,jSpinner1.getValue().toString());

         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(this,"Record Added");
         updatettable();
         jTextField1.setText("");
 
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }}
             
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
              
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel(); 
        int SelectedRows = jTable1.getSelectedRow();
        PreparedStatement ps;
        ResultSet rs=null;
        Connection con=  SConnection.getcon();
        
         ps=con.prepareStatement("delete from train where train_id=?"); 
         
         ps.setString(1,RecordTable.getValueAt(SelectedRows, 0).toString());


         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(this,"Record Deleted");
         updatettable();
         jTextField1.setText("");
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
               int spinnerValue = (int) jSpinner1.getValue();

                  
        if(spinnerValue<100)
        { JOptionPane.showMessageDialog(this,"The Minimum Capacity should be 100");}
        else if(jTextField1.getText().isBlank())
        {
        { JOptionPane.showMessageDialog(this,"Please Fill the Name...!");}
        }
        else
        {
                     String stype=jfrom.getSelectedItem().toString();
         if(stype.contentEquals("Luxury"))
         {
             stype="1";
         }
        else if(stype.contentEquals("Standard"))
         {
             stype="2";
         }
        else if(stype.contentEquals("Economy"))
         {
             stype="3";
         }
           try{
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel(); 
        int SelectedRows = jTable1.getSelectedRow();
        PreparedStatement ps;
        ResultSet rs=null;
        Connection con=  SConnection.getcon();
        
         ps=con.prepareStatement("update train set train_name=?,t_type=?,t_capacity=? where train_id=?"); 
         
         ps.setString (1,jTextField1.getText());
         ps.setString (2,stype);
         ps.setString (3,jSpinner1.getValue().toString());
         ps.setString(4,RecordTable.getValueAt(SelectedRows, 0).toString());

         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(this,"Record Updated");
         updatettable();
         jTextField1.setText("");
 
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }}
             
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel(); 
        int SelectedRows = jTable1.getSelectedRow();
        jTextField1.setText(RecordTable.getValueAt (SelectedRows, 1).toString());
        jfrom.setSelectedItem(RecordTable.getValueAt (SelectedRows, 2).toString());
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
                new TrainADD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jfrom;
    private cambodia.raven.Time time1;
    // End of variables declaration//GEN-END:variables
}
