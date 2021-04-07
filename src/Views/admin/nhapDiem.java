/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.admin;

import Controller.DiemController;
import Controller.LopTCController;
import Controller.MonHocController;
import Controller.SinhVienController;
import classObj.DIEM;
import classObj.LopTC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class nhapDiem extends javax.swing.JFrame {

    /**
     * Creates new form nhapDiem
     */
    DefaultTableModel dtm;

    public nhapDiem() {
        initComponents();
        loadcomboboxMaLop();
        dtm = (DefaultTableModel) jTable_diem.getModel();
    }

    private void loadcomboboxMaLop() {
        for (LopTC object : LopTCController.layDanhSachLopTC()) {
            jComboBox_maLop.addItem(String.valueOf(object.getMaLop()));
        }
    }

    public void showTable(ArrayList<DIEM> list) {
        dtm.setNumRows(0);
        int i = 1;
        for (DIEM a : list) {
            dtm.addRow(new Object[]{
                i++, a.getMASV(), SinhVienController.ktTrung_MASV(a.getMASV()).getHoTen(), a.getDiem()
            });
        }
        jTable_diem.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBox_maLop = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_diem = new javax.swing.JTable();
        jButton_lua = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel_maMH = new javax.swing.JLabel();
        jLabel_TenMH = new javax.swing.JLabel();
        jLabel_NK = new javax.swing.JLabel();
        jLabel_Nhom = new javax.swing.JLabel();
        jLabel_HK = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ ĐIỂM");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jComboBox_maLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Lớp--" }));
        jComboBox_maLop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_maLopItemStateChanged(evt);
            }
        });
        jComboBox_maLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_maLopActionPerformed(evt);
            }
        });
        jComboBox_maLop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox_maLopKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 30, 0, 0);
        getContentPane().add(jComboBox_maLop, gridBagConstraints);

        jTable_diem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Số Sinh Viên", "Họ Tên", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_diem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_diem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_diemFocusGained(evt);
            }
        });
        jTable_diem.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable_diemInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTable_diem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_diemKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_diem);
        if (jTable_diem.getColumnModel().getColumnCount() > 0) {
            jTable_diem.getColumnModel().getColumn(0).setMinWidth(50);
            jTable_diem.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable_diem.getColumnModel().getColumn(3).setMinWidth(50);
            jTable_diem.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 577;
        gridBagConstraints.ipady = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 153);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton_lua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_lua.setText("Lưu");
        jButton_lua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_luaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 170, 64, 0);
        getContentPane().add(jButton_lua, gridBagConstraints);

        jButton_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_cancel.setText("Thoát");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 193, 64, 0);
        getContentPane().add(jButton_cancel, gridBagConstraints);

        jLabel_maMH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_maMH.setText("Mã môn học:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 100, 0, 0);
        getContentPane().add(jLabel_maMH, gridBagConstraints);

        jLabel_TenMH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_TenMH.setText("Tên Môn học:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 73, 0, 0);
        getContentPane().add(jLabel_TenMH, gridBagConstraints);

        jLabel_NK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_NK.setText("Niên Khoá:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 30, 0, 0);
        getContentPane().add(jLabel_NK, gridBagConstraints);

        jLabel_Nhom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_Nhom.setText("Nhóm:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 0, 0);
        getContentPane().add(jLabel_Nhom, gridBagConstraints);

        jLabel_HK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_HK.setText("Học kỳ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 30, 0, 0);
        getContentPane().add(jLabel_HK, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("NHẬP ĐIỂM THEO LỚP TÍN CHỈ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 200, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_maLopKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_maLopKeyReleased

    }//GEN-LAST:event_jComboBox_maLopKeyReleased

    private void jComboBox_maLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_maLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_maLopActionPerformed

    private void jComboBox_maLopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_maLopItemStateChanged
        if (jComboBox_maLop.getSelectedIndex() != 0) {
            LopTC a = LopTCController.ktMaLopTrung(Integer.valueOf(jComboBox_maLop.getSelectedItem().toString()));
            jLabel_HK.setText("Học kỳ:  " + a.getHocKy());
            jLabel_Nhom.setText("Nhóm:  " + a.getNhom());
            jLabel_NK.setText("Niên Khoá: " + a.getNienKhoa());
            jLabel_maMH.setText("Mã Môn học: " + a.getMaMH());
            jLabel_TenMH.setText(MonHocController.ktMonhoc(a.getMaMH()).getTenMH());
            ArrayList<DIEM> getAll = DiemController.getAlldsSvLopTC(a.getMaLop());
            showTable(getAll);
        } else {
            jLabel_HK.setText("Học kỳ:");
            jLabel_Nhom.setText("Nhóm:");
            jLabel_NK.setText("Niên Khoá:");
            jLabel_maMH.setText("Mã Môn học:");
            jLabel_TenMH.setText("Tên Môn học:");
            dtm.setNumRows(0);
        }

    }//GEN-LAST:event_jComboBox_maLopItemStateChanged

    private void jTable_diemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_diemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_diemKeyReleased

    private void jTable_diemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_diemFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_diemFocusGained

    private void jTable_diemInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable_diemInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_diemInputMethodTextChanged
    private boolean kttable(ArrayList<DIEM> list) {
        boolean trangthai = true;
        for (int i = 0; i < list.size(); i++) {
            if (jTable_diem.getValueAt(i, 3) == null) {
                JOptionPane.showMessageDialog(rootPane, "Dòng " + (i + 1) + " chưa nhập điểm!!!");
                trangthai = false;
            } else {
                float kt = Float.valueOf(jTable_diem.getValueAt(i, 3).toString());
                if (kt < 0 || kt > 10 || jTable_diem.getValueAt(i, 3).toString().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Dòng " + (i + 1) + " sai định dạng!!!");
                    trangthai = false;
                }
            }
        }
        return trangthai;
    }

    private void luudiem(ArrayList<DIEM> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setDiem(Float.valueOf(jTable_diem.getValueAt(i, 3).toString()));
            DiemController.updeteDiem(list.get(i));
        }
    }
    private void jButton_luaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_luaActionPerformed
        if (jComboBox_maLop.getSelectedIndex() != 0) {
            ArrayList<DIEM> getAll = DiemController.getAlldsSvLopTC(Integer.valueOf(jComboBox_maLop.getSelectedItem().toString()));
            if (kttable(getAll)) {
                luudiem(getAll);
                JOptionPane.showMessageDialog(rootPane, "Lưa thành công!!!");
            }
        }
    }//GEN-LAST:event_jButton_luaActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        this.dispose();
        new QuanTriVien().setVisible(true);
    }//GEN-LAST:event_jButton_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(nhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhapDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_lua;
    private javax.swing.JComboBox<String> jComboBox_maLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_HK;
    private javax.swing.JLabel jLabel_NK;
    private javax.swing.JLabel jLabel_Nhom;
    private javax.swing.JLabel jLabel_TenMH;
    private javax.swing.JLabel jLabel_maMH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_diem;
    // End of variables declaration//GEN-END:variables
}
