package pbarang.view.menu;

import pbarang.model.admin.User;
import pbarang.view.detailkontrak.FormDetailKontrak;
import pbarang.view.detailpembelian.FormDetailPembelian;
import pbarang.view.detailpenjualan.FormDetailPenjualan;
import pbarang.view.klien.FormKlien;
import pbarang.view.kontrak.FormKontrak;
import pbarang.view.pembelian.FormPembelian;
import pbarang.view.penjualan.FormPenjualan;
import pbarang.view.report.FormReport;
import pbarang.view.supplier.FormSupplier;

public class FormMenu extends javax.swing.JFrame {

    public FormMenu() {
        initComponents();
        switch (User.userLogin) {
            case "Manajer":
                btnKlien.setEnabled(false);
                btnSupplier.setEnabled(false);
                btnPembelain.setEnabled(false);
                btnDetailPembelian.setEnabled(false);
                btnPenjualan.setEnabled(false);
                btnDetailPenjualan.setEnabled(false);
                btnKontrak.setEnabled(false);
                btnDetailKontrak.setEnabled(false);
                break;
            case "Kepala Gudang":
                btnKlien.setEnabled(false);
                btnSupplier.setEnabled(false);
                btnPembelain.setEnabled(false);
                btnPenjualan.setEnabled(false);
                btnKontrak.setEnabled(false);
                btnDetailKontrak.setEnabled(false);
                btnReport.setEnabled(false);
                break;
            default:
                dispose();
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnKlien = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        btnKontrak = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnPembelain = new javax.swing.JButton();
        btnDetailKontrak = new javax.swing.JButton();
        btnDetailPembelian = new javax.swing.JButton();
        btnDetailPenjualan = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Utama");

        btnLogout.setBackground(new java.awt.Color(255, 153, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbarang/image/logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177)
                .addComponent(btnLogout)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnKlien.setBackground(new java.awt.Color(255, 153, 0));
        btnKlien.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKlien.setForeground(new java.awt.Color(255, 255, 255));
        btnKlien.setText("klien");
        btnKlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlienActionPerformed(evt);
            }
        });

        btnPenjualan.setBackground(new java.awt.Color(255, 153, 0));
        btnPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        btnPenjualan.setText("Penjualan");
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });

        btnKontrak.setBackground(new java.awt.Color(255, 153, 0));
        btnKontrak.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKontrak.setForeground(new java.awt.Color(255, 255, 255));
        btnKontrak.setText("Kontrak");
        btnKontrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKontrakActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(255, 153, 0));
        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnPembelain.setBackground(new java.awt.Color(255, 153, 0));
        btnPembelain.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPembelain.setForeground(new java.awt.Color(255, 255, 255));
        btnPembelain.setText("Pembelian");
        btnPembelain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembelainActionPerformed(evt);
            }
        });

        btnDetailKontrak.setBackground(new java.awt.Color(255, 153, 0));
        btnDetailKontrak.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDetailKontrak.setForeground(new java.awt.Color(255, 255, 255));
        btnDetailKontrak.setText("Detail Kontrak");
        btnDetailKontrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailKontrakActionPerformed(evt);
            }
        });

        btnDetailPembelian.setBackground(new java.awt.Color(255, 153, 0));
        btnDetailPembelian.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDetailPembelian.setForeground(new java.awt.Color(255, 255, 255));
        btnDetailPembelian.setText("Detail Pembelian");
        btnDetailPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailPembelianActionPerformed(evt);
            }
        });

        btnDetailPenjualan.setBackground(new java.awt.Color(255, 153, 0));
        btnDetailPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDetailPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        btnDetailPenjualan.setText("Detail Penjualan");
        btnDetailPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailPenjualanActionPerformed(evt);
            }
        });

        btnSupplier.setBackground(new java.awt.Color(255, 153, 0));
        btnSupplier.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplier.setText("Supplier");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKontrak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPembelain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetailPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetailPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetailKontrak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnKlien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPembelain, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKontrak, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetailPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetailPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetailKontrak, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbarang/image/menu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(313, 313, 313))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        new FormReport().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnDetailKontrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailKontrakActionPerformed
        new FormDetailKontrak().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDetailKontrakActionPerformed

    private void btnDetailPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailPembelianActionPerformed
        new FormDetailPembelian().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDetailPembelianActionPerformed

    private void btnDetailPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailPenjualanActionPerformed
        new FormDetailPenjualan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDetailPenjualanActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnKlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlienActionPerformed
        new FormKlien().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlienActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        new FormSupplier().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnPembelainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembelainActionPerformed
        new FormPembelian().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPembelainActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
        new FormPenjualan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnKontrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKontrakActionPerformed
        new FormKontrak().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKontrakActionPerformed

    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetailKontrak;
    private javax.swing.JButton btnDetailPembelian;
    private javax.swing.JButton btnDetailPenjualan;
    private javax.swing.JButton btnKlien;
    private javax.swing.JButton btnKontrak;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPembelain;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
