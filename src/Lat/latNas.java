/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author gemss
 */
public class latNas extends javax.swing.JFrame {

    private DefaultTableModel model;
    /**
     * Creates new form latNas
     */
    public latNas() {
        initComponents();
        
        model = new DefaultTableModel();
        
        jTuser.setModel(model);
        
        model.addColumn("NO");
        model.addColumn("NAMA");
        model.addColumn("USERNAME");
        
        getData();
        btCancel.setVisible(false);
    }
    
    // Menampilkan Data Ke jTable
    public void getData(){
        
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Connection con = cfg.configDB();
            Statement stm = con.createStatement();
            
            String sql = "Select * From usser";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                Object[] obj = new Object[5];
                obj[1] = rs.getString("id");
                obj[1] = rs.getString("nama");
                obj[2] = rs.getString("uname");
                
                model.addRow(obj);
                nTable();
            }
            
            stm.close();
            rs.close();
            
        } catch (Exception ex) {
            System.out.println("salah jTable");
        }
        
    }
    
    //membuat nomor urut pada jTable
    public void nTable(){
        
        int br = model.getRowCount();
        
        for(int a = 0; a < br; a++){
            
            String nomor = String.valueOf(a+1);
            model.setValueAt(nomor + "." , a, 0);
            
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
        jNama = new javax.swing.JTextField();
        jUname = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btCl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTuser = new javax.swing.JTable();
        btHps = new javax.swing.JButton();
        btEdt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jId = new javax.swing.JLabel();
        btCancel = new javax.swing.JButton();
        jPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Page");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUnameActionPerformed(evt);
            }
        });

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btCl.setText("Clear");
        btCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClActionPerformed(evt);
            }
        });

        jTuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTuserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTuser);

        btHps.setText("Hapus");
        btHps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHpsActionPerformed(evt);
            }
        });

        btEdt.setText("Edit");
        btEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEdtActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jNama)
                            .addComponent(jUname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btHps, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btCl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPass)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jId)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btAdd)
                                    .addComponent(btCl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btHps)
                                    .addComponent(btEdt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancel))
                            .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
       
        String nama = jNama.getText();
        String uname = jUname.getText();
        String pass = jPass.getText();
       
        try{
            Connection con = cfg.configDB(); // koneksi ke database
            PreparedStatement pst1 = con.prepareStatement("select max(id)+1 from usser");// agar id auto increment
            ResultSet rs = pst1.executeQuery();// agar id auto increment
            String uid = "";// agar id auto increment
            
            //agar id auto increment
            while(rs.next()){
                uid = rs.getString(1);
            }
            
            String sql = "insert into usser (id,nama,uname,pass) values(?,?,?,?)"; // Menambahkan data ke database
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, uid);
            pst.setString(2, nama);
            pst.setString(3, uname);
            pst.setString(4, pass);
            
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");    
            
            
        } catch (Exception e) {
            System.out.println("Salah 1");
        }finally{
           
           getData();
           
           jNama.setText("");
           jUname.setText("");
           jPass.setText("");
            
        }
        
    }//GEN-LAST:event_btAddActionPerformed

    private void jUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUnameActionPerformed

    private void btClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClActionPerformed
        // TODO add your handling code here:
        
        jNama.setText("");
        jId.setText("");
        jUname.setText("");
        jPass.setText("");
        
    }//GEN-LAST:event_btClActionPerformed

    
    
    private void btHpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHpsActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String sql = "Delete From usser Where uname = '" + jUname.getText() + "'";
            Connection con = cfg.configDB();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Data Terhapus");
            
        }catch (Exception e){
            System.out.println("Salah Delete");
        }finally{
            
            getData();
            
            jNama.setText("");
            jId.setText("");
            jUname.setText("");
            jPass.setText("");
            
        }
        
    }//GEN-LAST:event_btHpsActionPerformed

    private void btEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEdtActionPerformed
        // TODO add your handling code here:
        
        int i = jTuser.getSelectedRow();
        if(i == -1){
            return;
        }
        
        String user = (String)model.getValueAt(i, 2);
        
        try{
        
            Connection con = cfg.configDB();
            String sql = "Update usser set pass = '"+ jPass.getText() +"', nama = '"+ jNama.getText() +"' where uname = '" + user + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            pst.close();
            
        }catch (SQLException e){
        
            System.out.println("Error Update");
            
        }finally{
            
            getData();
            
            jNama.setText("");
            jUname.setText("");
            jPass.setText("");
            
        }
        
    }//GEN-LAST:event_btEdtActionPerformed

    
    private void jTuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTuserMouseClicked
        // TODO add your handling code here:
        btAdd.setEnabled(false);
        btEdt.setEnabled(true);
        jUname.setEnabled(false);
        btCancel.setVisible(true);
        btCl.setEnabled(false);
        
        int i = jTuser.getSelectedRow();
        if(i == -1){
            return;
        }
        
        /*try{
            
          Connection con = cfg.configDB(); // koneksi ke database
          PreparedStatement pst1 = con.prepareStatement("select * from usser");// agar id auto increment
          ResultSet rs = pst1.executeQuery();// agar id auto increment
          String uid = "";// agar id auto increment
            
          //agar id auto increment
          while(rs.next()){
              uid = rs.getString(1);
          }  
        
          jId.setText(uid);
          
        }catch(Exception e){
            System.out.println("Salah Row");
        }*/
        
        String nama = (String)model.getValueAt(i, 1);
        jNama.setText(nama);
        
        String uname = (String)model.getValueAt(i, 2);
        jUname.setText(uname);
        
       
        
    }//GEN-LAST:event_jTuserMouseClicked

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        
       btAdd.setEnabled(true);
       btEdt.setEnabled(true);
       jUname.setEnabled(true); 
       btCancel.setVisible(false);
       btCl.setEnabled(true);
       
       jNama.setText("");
       jUname.setText("");
       jPass.setText("");
       
       try{
           
           Connection con = cfg.configDB();
           Statement st = con.createStatement();
           st.close();
           
       }catch (SQLException e){
           System.out.println("Error cancel");
       }
        
    }//GEN-LAST:event_btCancelActionPerformed

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
            java.util.logging.Logger.getLogger(latNas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latNas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latNas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latNas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latNas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCl;
    private javax.swing.JButton btEdt;
    private javax.swing.JButton btHps;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNama;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTuser;
    private javax.swing.JTextField jUname;
    // End of variables declaration//GEN-END:variables
}