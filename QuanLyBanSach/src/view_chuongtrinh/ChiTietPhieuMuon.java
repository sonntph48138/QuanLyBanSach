/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view_chuongtrinh;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model_chuongtrinh.Model_ChiTietPhieuMuon;
import javax.swing.table.DefaultTableModel;
import service_chuongtrinh.Service_ChiTietPhieuMuon;

public class ChiTietPhieuMuon extends javax.swing.JFrame {

    private Service_ChiTietPhieuMuon sctpm = new Service_ChiTietPhieuMuon();
    private DefaultTableModel dtm = new DefaultTableModel();

    public ChiTietPhieuMuon() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.fillTable(sctpm.getAll());
    }

    public void fillTable(ArrayList<Model_ChiTietPhieuMuon> lstct) {
        dtm.setRowCount(0);
        dtm = (DefaultTableModel) this.tblCTPhieuMuon.getModel();
        for (Model_ChiTietPhieuMuon model_ChiTietPhieuMuon : lstct) {
            dtm.addRow(model_ChiTietPhieuMuon.toDataRow());
        }
    }

    public Model_ChiTietPhieuMuon readForm() {
        String idctpm = txtIDCTphieumuon.getText();
        String idpm = txtIDPhieuMuon.getText();
        String ids = txtIDSach.getText();
        String sls = txtSoLuongSach.getText();
        if (idctpm.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Chi Tiet Phieu Muon khong duoc bo trong");
            txtIDCTphieumuon.requestFocus();
            return null;
        }
        if (idpm.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Phieu Muon khong duoc bo trong");
            txtIDPhieuMuon.requestFocus();
            return null;
        }
        if (ids.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Sach khong duoc bo trong");
            txtIDSach.requestFocus();
            return null;
        }
        if (sls.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "So Luong Sach khong duoc bo trong");
            txtSoLuongSach.requestFocus();
            return null;
        }
        int SLS;
        try {
            SLS = Integer.parseInt(sls);
            if (SLS < 0) {
                JOptionPane.showMessageDialog(this, "So Luong Sach phai lon hon 0");
                return null;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
        return new Model_ChiTietPhieuMuon(idctpm, idpm, ids, SLS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDCTphieumuon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDPhieuMuon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIDSach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSoLuongSach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTPhieuMuon = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("CHI TIẾT PHIẾU MƯỢN");

        jLabel2.setText("ID Chi Tiết Phiếu Mượn ");

        jLabel3.setText("ID Phiếu Mượn");

        jLabel4.setText("ID Sach");

        jLabel5.setText("So Luong Sach");

        tblCTPhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Chi Tiết Phiếu Mượn ", "ID Phiếu Mượn", "ID Sách", "Số Lượng Sách"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCTPhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTPhieuMuonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCTPhieuMuon);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDCTphieumuon)
                                    .addComponent(txtIDPhieuMuon)
                                    .addComponent(txtIDSach)
                                    .addComponent(txtSoLuongSach, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnLamMoi)
                                .addGap(18, 18, 18)
                                .addComponent(btnThoat)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDCTphieumuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIDPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIDSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoLuongSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnLamMoi)
                    .addComponent(btnThoat))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (readForm() != null) {
            int chon = JOptionPane.showConfirmDialog(this, "Ban co muon them khong");
            if(chon == 0){
                sctpm.Add(this.readForm());
                this.fillTable(sctpm.getAll());
                JOptionPane.showMessageDialog(this, "Them thanh cong");
            }else{
                JOptionPane.showMessageDialog(this, "Ban khong chon them");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Them that bai");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int i = this.tblCTPhieuMuon.getSelectedRow();
        if(i==-1){
            JOptionPane.showMessageDialog(this, "Ban chua chon dong");
        }
        if(readForm()!= null){
            int chon = JOptionPane.showConfirmDialog(this, "Ban co muon them khong");
            String id = tblCTPhieuMuon.getValueAt(i, 0).toString();
            if(chon == 0){
                this.sctpm.Update(id,this.readForm());
                this.fillTable(sctpm.getAll());
                JOptionPane.showMessageDialog(this, "Update thanh cong");
            }else{
                JOptionPane.showMessageDialog(this, "Ban khong chon update");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Update that bai");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = this.tblCTPhieuMuon.getSelectedRow();
        if(i==-1){
            JOptionPane.showMessageDialog(this, "Ban chua chon dong");
        }
        int chon = JOptionPane.showConfirmDialog(this, "Ban chua chon dong");
        if(chon==0){
            String id =tblCTPhieuMuon.getValueAt(i, 0).toString();
            sctpm.Delete(id);
            this.fillTable(sctpm.getAll());
        }else{
            JOptionPane.showMessageDialog(this,"Ban khong chon xoa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtIDCTphieumuon.setText("");
        txtIDPhieuMuon.setText("");
        txtIDSach.setText("");
        txtSoLuongSach.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblCTPhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTPhieuMuonMouseClicked
        int i = this.tblCTPhieuMuon.getSelectedRow();
        if (i == -1) {
            return;
        }
        txtIDCTphieumuon.setText(tblCTPhieuMuon.getValueAt(i, 0).toString());
        txtIDPhieuMuon.setText(tblCTPhieuMuon.getValueAt(i, 1).toString());
        txtIDSach.setText(tblCTPhieuMuon.getValueAt(i, 2).toString());
        txtSoLuongSach.setText(tblCTPhieuMuon.getValueAt(i, 3).toString());

    }//GEN-LAST:event_tblCTPhieuMuonMouseClicked

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
            java.util.logging.Logger.getLogger(ChiTietPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietPhieuMuon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCTPhieuMuon;
    private javax.swing.JTextField txtIDCTphieumuon;
    private javax.swing.JTextField txtIDPhieuMuon;
    private javax.swing.JTextField txtIDSach;
    private javax.swing.JTextField txtSoLuongSach;
    // End of variables declaration//GEN-END:variables
}
