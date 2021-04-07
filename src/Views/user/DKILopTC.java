package Views.user;

import Controller.LopTCController;
import Controller.MonHocController;
import Controller.SinhVienController;
import classObj.LopTC;
import classObj.Monhoc;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LE HIEU
 */
public class DKILopTC extends javax.swing.JFrame {

    private String masv;
    DefaultTableModel dtm;

    /**
     * Creates new form DKILopTC
     */
    public DKILopTC(String masv) {
        initComponents();
        this.masv = masv;
        jLabel_tensv.setText(SinhVienController.ktTrung_MASV(masv).getHoTen());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_tensv = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_thoat = new javax.swing.JButton();
        jComboBox_NK = new javax.swing.JComboBox<>();
        jComboBox_HK = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG KÝ LỚP TÍN CHỈ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\10\\QLSV\\src\\hinhanh\\136729120_236131321215679_1330693937606788859_n.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("CƠ SỞ THÀNH PHỐ HỒ CHÍ MINH");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CHÀO");

        jLabel_tensv.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel_tensv.setForeground(new java.awt.Color(255, 51, 51));

        jTable_1.setBackground(new java.awt.Color(240, 240, 240));
        jTable_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã lớp tín chỉ", "Mã môn học", "Tên môn học", "Số tín chỉ", "Số Lượng", "Nhóm", "Đăng ký"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable_1FocusLost(evt);
            }
        });
        jTable_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_1);
        if (jTable_1.getColumnModel().getColumnCount() > 0) {
            jTable_1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable_1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable_1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable_1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable_1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable_1.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable_1.getColumnModel().getColumn(3).setMinWidth(200);
            jTable_1.getColumnModel().getColumn(3).setMaxWidth(200);
            jTable_1.getColumnModel().getColumn(4).setMinWidth(70);
            jTable_1.getColumnModel().getColumn(4).setMaxWidth(70);
            jTable_1.getColumnModel().getColumn(5).setMinWidth(70);
            jTable_1.getColumnModel().getColumn(5).setMaxWidth(70);
            jTable_1.getColumnModel().getColumn(6).setMinWidth(50);
            jTable_1.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DANH SÁCH LỚP TÍN CHỈ");

        jTable_2.setBackground(new java.awt.Color(240, 240, 240));
        jTable_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã lớp tín chỉ", "Tên môn học", "Số tín chỉ", "Nhóm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_2);
        if (jTable_2.getColumnModel().getColumnCount() > 0) {
            jTable_2.getColumnModel().getColumn(0).setMinWidth(40);
            jTable_2.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("LỚP TÍN CHỈ ĐÃ ĐĂNG KÝ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("LƯU");

        jButton_thoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_thoat.setText("QUAY LẠI");
        jButton_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thoatActionPerformed(evt);
            }
        });

        jComboBox_NK.setBackground(new java.awt.Color(240, 240, 240));
        jComboBox_NK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox_NK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--chọn--", "2013-2014", "2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019", "2019-2020", "2020-2021", "2021-2022" }));
        jComboBox_NK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_NK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_NKItemStateChanged(evt);
            }
        });
        jComboBox_NK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NKActionPerformed(evt);
            }
        });

        jComboBox_HK.setBackground(new java.awt.Color(240, 240, 240));
        jComboBox_HK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox_HK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--chon--", "học kỳ 1", "học kỳ 2", "học kỳ 3" }));
        jComboBox_HK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_HKItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("NIÊN KHÓA");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("HỌC KỲ");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1023, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(899, 899, 899))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(jLabel1)
                        .add(29, 29, 29)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 465, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(79, 79, 79)
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 331, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(44, 44, 44)
                                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel_tensv, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(112, 112, 112)
                        .add(jLabel8)
                        .add(34, 34, 34)
                        .add(jComboBox_NK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(47, 47, 47)
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(39, 39, 39)
                        .add(jComboBox_HK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 594, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(jLabel7))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(36, 36, 36)
                        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 588, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(147, 147, 147)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(153, 153, 153)
                        .add(jButton_thoat, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 895, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel2)
                        .add(17, 17, 17)
                        .add(jLabel3)
                        .add(11, 11, 11)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(7, 7, 7)
                                .add(jLabel4))
                            .add(jLabel_tensv, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jComboBox_NK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel8))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(3, 3, 3)
                        .add(jLabel9))
                    .add(jComboBox_HK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(11, 11, 11)
                .add(jLabel6)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(49, 49, 49)
                .add(jLabel7)
                .add(6, 6, 6)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(59, 59, 59)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1)
                    .add(jButton_thoat)))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_NKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_NKActionPerformed

    private void jButton_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thoatActionPerformed
        this.dispose();
        new SVLOGIN(masv).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_thoatActionPerformed

    private void jComboBox_NKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_NKItemStateChanged
        if (jComboBox_NK.getSelectedIndex() != 0 && jComboBox_HK.getSelectedIndex() != 0) {
            ArrayList<LopTC> list = LopTCController.layDanhSachLopTCwhereNienKhoavsHocKy(jComboBox_NK.getSelectedItem().toString(),
                    jComboBox_HK.getSelectedIndex());
            dtm = (DefaultTableModel) jTable_1.getModel();
            dtm.setNumRows(0);
            int i = 1;
            for (LopTC lopTC : list) {
                Monhoc mh = MonHocController.ktMonhoc(lopTC.getMaMH());
                dtm.addRow(new Object[]{
                    i++, lopTC.getMaLop(), lopTC.getMaMH(), mh.getTenMH(), mh.getSTC(), lopTC.getSvMax(), lopTC.getNhom()
                });
            }
            jTable_1.setModel(dtm);
        } else {
            dtm = (DefaultTableModel) jTable_1.getModel();
            dtm.setNumRows(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_NKItemStateChanged

    private void jComboBox_HKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_HKItemStateChanged
        if (jComboBox_NK.getSelectedIndex() != 0 && jComboBox_HK.getSelectedIndex() != 0) {
            ArrayList<LopTC> list = LopTCController.layDanhSachLopTCwhereNienKhoavsHocKy(jComboBox_NK.getSelectedItem().toString(),
                    jComboBox_HK.getSelectedIndex());
            dtm = (DefaultTableModel) jTable_1.getModel();
            dtm.setNumRows(0);
            int i = 0;
            for (LopTC lopTC : list) {
                Monhoc mh = MonHocController.ktMonhoc(lopTC.getMaMH());
                dtm.addRow(new Object[]{
                    i + 1, lopTC.getMaLop(), lopTC.getMaMH(), mh.getTenMH(), mh.getSTC(), lopTC.getSvMax(), lopTC.getNhom()
                });
            }
            jTable_1.setModel(dtm);
        } else {
            dtm = (DefaultTableModel) jTable_1.getModel();
            dtm.setNumRows(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_HKItemStateChanged

    private void jTable_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_1KeyReleased

    private void jTable_1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_1FocusGained
        int size = jTable_1.getSelectedRow() + 1;
        for (int i = 0; i < size; i++) {
            Boolean kt = Boolean.valueOf(jTable_1.getValueAt(i, 7).toString());
            System.out.println(kt);
            if (kt == true) {

            } else {
                dtm = (DefaultTableModel) jTable_2.getModel();
                dtm.setNumRows(0);
                int j = 1;
                dtm.addRow(new Object[]{
                    j++, jTable_1.getValueAt(i, 1), jTable_1.getValueAt(i, 3), jTable_1.getValueAt(i, 4), jTable_1.getValueAt(i, 6)
                });
                jTable_2.setModel(dtm);
            }
        }
    }//GEN-LAST:event_jTable_1FocusGained

    private void jTable_1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_1FocusLost
    }//GEN-LAST:event_jTable_1FocusLost

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
            java.util.logging.Logger.getLogger(DKILopTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DKILopTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DKILopTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DKILopTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DKILopTC("N17DCAT016").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_thoat;
    private javax.swing.JComboBox<String> jComboBox_HK;
    private javax.swing.JComboBox<String> jComboBox_NK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_tensv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable_1;
    private javax.swing.JTable jTable_2;
    // End of variables declaration//GEN-END:variables

}