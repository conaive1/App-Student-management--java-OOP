/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.admin;

import Controller.LopTCController;
import Views.admin.Sua_MonHoc;
import Views.admin.QuanTriVien;
import Views.admin.QuanLy_SV;
import Controller.MonHocController;
import classObj.Monhoc;
import java.awt.HeadlessException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import xuly.xuly_All;

public class Quanly_MonHoc extends javax.swing.JFrame {

    static DefaultTableModel dtm;
    private boolean ktmaMH, kttenMH, ktSTC;

    public Quanly_MonHoc() {
        initComponents();
        LayDSMonHoc();
    }

    @SuppressWarnings("unchecked")

    private void LayDSMonHoc() {
        dtm = (DefaultTableModel) jTable_dsMH.getModel();
        dtm.setNumRows(0);
        for (Object object : MonHocController.getAlldsMonHoc()) {
            dtm.addRow((Vector) object);
        }
        jTable_dsMH.setModel(dtm);
    }

    private void setallField() {
        jTextField_MAMH.setText("");
        jTextField_SoTC.setText("");
        jTextField_TenMH.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_MAMH = new javax.swing.JTextField();
        jTextField_TenMH = new javax.swing.JTextField();
        jTextField_SoTC = new javax.swing.JTextField();
        jButton_them = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_dsMH = new javax.swing.JTable();
        jButton_Xoa = new javax.swing.JButton();
        jButton_Sua = new javax.swing.JButton();
        jButton_thoat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jLabel_loimaMH = new javax.swing.JLabel();
        jLabel_loitenMH = new javax.swing.JLabel();
        jLabel_loiSTC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ MÔN HỌC");

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("DANH SÁCH MÔN HỌC");

        jLabel2.setText("MÃ MÔN HỌC");

        jLabel3.setText("TÊN MÔN HỌC");

        jLabel4.setText("SỐ TÍN CHỈ");

        jTextField_MAMH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_MAMHKeyReleased(evt);
            }
        });

        jTextField_TenMH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TenMHKeyReleased(evt);
            }
        });

        jTextField_SoTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SoTCActionPerformed(evt);
            }
        });
        jTextField_SoTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SoTCKeyReleased(evt);
            }
        });

        jButton_them.setText("THÊM");
        jButton_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_themActionPerformed(evt);
            }
        });

        jTable_dsMH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ MÔN HỌC", "TÊN MÔN HỌC", "SỐ TÍN CHỈ"
            }
        ));
        jScrollPane1.setViewportView(jTable_dsMH);
        if (jTable_dsMH.getColumnModel().getColumnCount() > 0) {
            jTable_dsMH.getColumnModel().getColumn(0).setMinWidth(40);
            jTable_dsMH.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jButton_Xoa.setText("XÓA");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });

        jButton_Sua.setText("SỬA");
        jButton_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaActionPerformed(evt);
            }
        });

        jButton_thoat.setText("THOÁT");
        jButton_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thoatActionPerformed(evt);
            }
        });

        jLabel5.setText("Tìm kiếm");

        jTextField_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_searchKeyReleased(evt);
            }
        });

        jLabel_loimaMH.setForeground(new java.awt.Color(255, 51, 0));
        jLabel_loimaMH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel_loimaMHKeyReleased(evt);
            }
        });

        jLabel_loitenMH.setForeground(new java.awt.Color(255, 51, 0));

        jLabel_loiSTC.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton_them, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jButton_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jButton_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_loiSTC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_MAMH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_loimaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_TenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_loitenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_SoTC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_MAMH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel_loimaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_TenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_loitenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_SoTC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(jLabel_loiSTC, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SoTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SoTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SoTCActionPerformed

    private void jButton_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_themActionPerformed
        // TODO add your handling code here:
        String maMonHoc = jTextField_MAMH.getText().trim().toUpperCase();
        String tenMonHoc = jTextField_TenMH.getText();
        String soTinChi = jTextField_SoTC.getText();

        if (ktSTC == true && ktmaMH == true && kttenMH == true) {
            if (MonHocController.ktMonhoc(maMonHoc) != null) {
                JOptionPane.showMessageDialog(this, "Mã môn học đã tồn tại!!!");
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn Thêm?");
                if (JOptionPane.OK_OPTION == confirm) {
                    try {
                        tenMonHoc = xuly_All.firstToUpperCase(tenMonHoc);
                        Monhoc monhoc = new Monhoc(maMonHoc, tenMonHoc, Integer.valueOf(soTinChi));
                        MonHocController.Insert(monhoc);
                        JOptionPane.showMessageDialog(this, "Thêm thành công!!!");
                        setallField();
                        ktSTC = false;
                        ktmaMH = false;
                        kttenMH = false;
                        this.LayDSMonHoc();
                    } catch (HeadlessException | NumberFormatException e) {
                        Logger.getLogger(QuanLy_SV.class.getName()).log(Level.SEVERE, null, e);
                    }

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền Field!!!");
        }
    }//GEN-LAST:event_jButton_themActionPerformed

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        int row = jTable_dsMH.getSelectedRow();
        if (row != -1) {
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn Xoá không?");
            if (confirm == JOptionPane.YES_OPTION) {
                String maMH = String.valueOf(jTable_dsMH.getValueAt(row, 1));
                if (MonHocController.ktMonhoc(maMH) == null) {
                    JOptionPane.showMessageDialog(this, "Mã Môn học không tồn tại!!!");
                }else if(LopTCController.ktMonHoc(maMH)==true){
                    JOptionPane.showMessageDialog(this, "Môn học đang được mở không thế xoá!!!");
                } 
                else {
                    try {
                        MonHocController.delete(maMH);
                        JOptionPane.showMessageDialog(this, "Xoá thành công!!!");
                        this.LayDSMonHoc();
                    } catch (HeadlessException e) {
                        Logger.getLogger(QuanLy_SV.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn Mã Môn học cần xoá!!!");
        }
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jButton_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaActionPerformed
        int row = jTable_dsMH.getSelectedRow();
        if (row != -1) {
            String maMH = String.valueOf(jTable_dsMH.getValueAt(row, 1));
            if (MonHocController.ktMonhoc(maMH) == null) {
                JOptionPane.showMessageDialog(this, "Mã Môn học không tồn tại!!!");
            } else {
                try {
                   new Sua_MonHoc(maMH,this).setVisible(true);
                } catch (HeadlessException e) {
                    Logger.getLogger(QuanLy_SV.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn Mã Môn học cần sửa!!!");
        }

    }//GEN-LAST:event_jButton_SuaActionPerformed

    private void jButton_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thoatActionPerformed
        this.dispose();
        new QuanTriVien().setVisible(true);
    }//GEN-LAST:event_jButton_thoatActionPerformed

    private void jLabel_loimaMHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel_loimaMHKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_loimaMHKeyReleased

    private void jTextField_MAMHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MAMHKeyReleased
        if (jTextField_MAMH.getText().trim().equals("")) {
            jLabel_loimaMH.setText("Mã môn học không được bỏ trống!!!");
            jLabel_loimaMH.setVisible(true);
            ktmaMH = false;
        } else {
            ktmaMH = true;
            jLabel_loimaMH.setVisible(false);
        };
    }//GEN-LAST:event_jTextField_MAMHKeyReleased

    private void jTextField_TenMHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TenMHKeyReleased
        if (jTextField_TenMH.getText().trim().equals("")) {
            jLabel_loitenMH.setText("Tên môn học không được bỏ trống!!!");
            jLabel_loitenMH.setVisible(true);
            kttenMH = false;
        } else {
            kttenMH = true;
            jLabel_loitenMH.setVisible(false);
        };
    }//GEN-LAST:event_jTextField_TenMHKeyReleased

    private void jTextField_SoTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SoTCKeyReleased
        if (jTextField_SoTC.getText().trim().equals("")) {
            jLabel_loiSTC.setText("Số tín chỉ không được bỏ trống!!!");
            jLabel_loiSTC.setVisible(true);
            ktSTC = false;
        } else if (!jTextField_SoTC.getText().trim().matches("\\d")) {
            jLabel_loiSTC.setText("Số tín chỉ sai định dạng!!!");
            jLabel_loiSTC.setVisible(true);
            ktSTC = false;
        } else {
            ktSTC = true;
            jLabel_loiSTC.setVisible(false);
        };
    }//GEN-LAST:event_jTextField_SoTCKeyReleased

    private void jTextField_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchKeyReleased
        try {
            Vector getAll = MonHocController.getAlldsMonHocwheremaMHvstenMH(jTextField_search.getText().trim());
            dtm = (DefaultTableModel) jTable_dsMH.getModel();
            dtm.setRowCount(0);
            for (Object object : getAll) {
                dtm.addRow((Vector) object);
            }
            jTable_dsMH.setModel(dtm);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jTextField_searchKeyReleased

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
            java.util.logging.Logger.getLogger(Quanly_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanly_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanly_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanly_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanly_MonHoc().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Sua;
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JButton jButton_them;
    private javax.swing.JButton jButton_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_loiSTC;
    private javax.swing.JLabel jLabel_loimaMH;
    private javax.swing.JLabel jLabel_loitenMH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_dsMH;
    private javax.swing.JTextField jTextField_MAMH;
    private javax.swing.JTextField jTextField_SoTC;
    private javax.swing.JTextField jTextField_TenMH;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
