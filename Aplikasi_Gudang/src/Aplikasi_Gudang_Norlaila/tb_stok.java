/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi_Gudang_Norlaila;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class tb_stok extends javax.swing.JFrame {
    DefaultTableModel mod;
    private String SQL;
    /**
     * Creates new form tb_stok
     * @throws java.sql.SQLException
     */
    public tb_stok() throws SQLException{
        initComponents();
        bersih();
        tampilData();
        setLocationRelativeTo(this);
    }
    private void bersih(){
        txid.setText(null);
        txnm.setText(null);
        txstok.setText(null);
    }
    private void tampilData() throws SQLException{
    mod = new DefaultTableModel();
    mod.addColumn("id_barang");
    mod.addColumn("nama_brg");
    mod.addColumn("stok");
    tabel.setModel(mod);
    Connection conn=koneksi.getConnection();
    try{
        java.sql.Statement stmt = conn.createStatement();
        SQL ="select * from tb_stok";
        java.sql.ResultSet res = stmt.executeQuery(SQL);
        while(res.next()){
            mod.addRow(new Object[]{
                res.getString("id_barang"),
                res.getString("nama_brg"),
                res.getString("stok")
            });
            }
        }
    catch (SQLException e){
    System.out.println(e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txid = new javax.swing.JTextField();
        txnm = new javax.swing.JTextField();
        txstok = new javax.swing.JTextField();
        keluar = new javax.swing.JButton();
        btnread = new javax.swing.JButton();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("STOK GUDANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 29, -1, -1));

        jLabel2.setText("ID Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 64, -1, -1));

        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 95, -1, -1));

        jLabel4.setText("Stok");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 128, -1, -1));

        txid.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(txid, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 61, 99, -1));

        txnm.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(txnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 92, 99, -1));

        txstok.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(txstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 125, 99, -1));

        keluar.setBackground(new java.awt.Color(0, 153, 153));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 91, -1, -1));

        btnread.setBackground(new java.awt.Color(0, 153, 153));
        btnread.setText("Read");
        btnread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreadActionPerformed(evt);
            }
        });
        getContentPane().add(btnread, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 175, -1, -1));

        btncreate.setBackground(new java.awt.Color(0, 153, 153));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        getContentPane().add(btncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 175, -1, -1));

        btnupdate.setBackground(new java.awt.Color(0, 153, 153));
        btnupdate.setText("Update");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 175, -1, -1));

        btndelete.setBackground(new java.awt.Color(0, 153, 153));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 175, -1, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 209, -1, 105));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_Gudang_Norlaila/bawang putih.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int i =tabel.getSelectedRow();
        if(i== -1) {
            return;
        }
        
        String id_barang = (String)mod.getValueAt(i, 0);
        int question = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Hapus data?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(question == JOptionPane.OK_OPTION){
            try{
                Connection c = koneksi.getConnection();
                String sql = "DELETE FROM tb_stok WHERE id_barang= ?";
                try (PreparedStatement p = c.prepareStatement(sql)) {
                    p.setString(1, id_barang);
                    p.executeUpdate();
                }
                JOptionPane.showMessageDialog(null, "Data terhapus");
            }catch (SQLException e){
                System.out.println(e);
            }
        }
        if (question == JOptionPane.CANCEL_OPTION){
            
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement
        ("insert into tb_stok (id_barang, nama_brg, stok)value(?, ?, ?)");
            stmt.setString(1, txid.getText());
            stmt.setString(2, txnm.getText());
            stmt.setString(3, txstok.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan ", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            tampilData();
            bersih();
        }catch (SQLException e){
            System.out.println(e);
        } 
    }//GEN-LAST:event_btnreadActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
         try{
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement
        ("insert into tb_stok (id_barang, nama_brg, stok)value(?, ?, ?)");
            stmt.setString(1, txid.getText());
            stmt.setString(2, txnm.getText());
            stmt.setString(3, txstok.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah ", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            tampilData();
            bersih();
        }catch (SQLException e){
            System.out.println(e);
        } 
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "UPDATE tb_stok SET nama_brg ='"+txnm.getText()+"', stok='"+txstok.getText()+"'WHERE id_barang='"+txid.getText()+"'";
        java.sql.Connection conn = (Connection)koneksi.getConnection();
        java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Data Berhasil di Update");
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Data Gagal diUpdate"+ e.getMessage());
    }
   
        try {
            tampilData();
        } catch (SQLException ex) {
            Logger.getLogger(tb_stok.class.getName()).log(Level.SEVERE, null, ex);
        }
         bersih();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        formUtama xx;
        xx = new formUtama();
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btnupdateMouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
         try{
               Connection conn = koneksi.getConnection();
               int row = tabel.getSelectedRow();
               String tabel_klik = (tabel.getModel().getValueAt(row, 0).toString());
               java.sql.Statement stmt = conn.createStatement();
               java.sql.ResultSet sql = stmt.executeQuery("select * from tb_stok where  id_barang = '"+tabel_klik+"'");
               if (sql.next()){
                   String id_barang=sql.getString("id_barang");
                   txid.setText(id_barang);
                   String nama_brg=sql.getString("nama_brg");
                   txnm.setText(nama_brg);
                   String stok=sql.getString("stok");
                   txstok.setText(stok);
               }
           }catch (SQLException e){}
        
    }//GEN-LAST:event_tabelMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tb_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new tb_stok().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(tb_stok.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnread;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txid;
    private javax.swing.JTextField txnm;
    private javax.swing.JTextField txstok;
    // End of variables declaration//GEN-END:variables
}
