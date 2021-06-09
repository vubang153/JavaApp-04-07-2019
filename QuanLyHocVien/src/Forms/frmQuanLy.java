/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;


import JPanel.jPGioiThieu;
import JPanel.jPQuanLy;
import Models.Run;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class frmQuanLy extends javax.swing.JFrame {

    /**
     * Creates new form frmQuanLy
     */
    public frmThemMoiSV formThemMoi;
    public jPQuanLy jPanel;

    public frmQuanLy() {
        initComponents();
        btnThemSinhVien.setEnabled(false);
        this.setLocationRelativeTo(this);
        lbTenDangNhap.setText(Run.username);
        if (Run.permission ==2) {
            btnThemSinhVien.setEnabled(rootPaneCheckingEnabled);
        }
        jPGioiThieu panelGioiThieu = new jPGioiThieu();
        jPContent.add(panelGioiThieu);
        jPContent.validate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMenu = new javax.swing.JPanel();
        btnThemSinhVien = new javax.swing.JButton();
        btnGioiThieu = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbTenDangNhap = new javax.swing.JLabel();
        btnQuanLy = new javax.swing.JButton();
        jPExit = new javax.swing.JPanel();
        lblDongUngDung = new javax.swing.JLabel();
        lblAnUngDung = new javax.swing.JLabel();
        jPContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(new java.awt.Color(255, 153, 153));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 670));
        getContentPane().setLayout(null);

        jPMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnThemSinhVien.setBackground(new java.awt.Color(242, 120, 35));
        btnThemSinhVien.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnThemSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student.png"))); // NOI18N
        btnThemSinhVien.setText("THÊM SINH VIÊN");
        btnThemSinhVien.setBorder(null);
        btnThemSinhVien.setEnabled(false);
        btnThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSinhVienActionPerformed(evt);
            }
        });

        btnGioiThieu.setBackground(new java.awt.Color(242, 120, 35));
        btnGioiThieu.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGioiThieu.setForeground(new java.awt.Color(255, 255, 255));
        btnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/information.png"))); // NOI18N
        btnGioiThieu.setText("GIỚI THIỆU");
        btnGioiThieu.setBorder(null);
        btnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioiThieuActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(242, 120, 35));
        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.setBorder(null);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(242, 120, 35));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 120, 35));
        jLabel1.setText("Tên tài khoản:");

        lbTenDangNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTenDangNhap.setForeground(new java.awt.Color(242, 120, 35));
        lbTenDangNhap.setText("jLabel2");

        btnQuanLy.setBackground(new java.awt.Color(242, 120, 35));
        btnQuanLy.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnQuanLy.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/collaboration.png"))); // NOI18N
        btnQuanLy.setText("QUẢN LÝ");
        btnQuanLy.setBorder(null);
        btnQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnGioiThieu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGioiThieu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTenDangNhap)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPMenu);
        jPMenu.setBounds(0, 20, 1200, 60);

        jPExit.setBackground(new java.awt.Color(242, 120, 35));

        lblDongUngDung.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDongUngDung.setForeground(new java.awt.Color(255, 255, 255));
        lblDongUngDung.setText("X");
        lblDongUngDung.setPreferredSize(new java.awt.Dimension(20, 20));
        lblDongUngDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDongUngDungMouseClicked(evt);
            }
        });

        lblAnUngDung.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblAnUngDung.setForeground(new java.awt.Color(255, 255, 255));
        lblAnUngDung.setText("-");
        lblAnUngDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnUngDungMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPExitLayout = new javax.swing.GroupLayout(jPExit);
        jPExit.setLayout(jPExitLayout);
        jPExitLayout.setHorizontalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPExitLayout.createSequentialGroup()
                .addContainerGap(1098, Short.MAX_VALUE)
                .addComponent(lblAnUngDung)
                .addGap(32, 32, 32)
                .addComponent(lblDongUngDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPExitLayout.setVerticalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPExitLayout.createSequentialGroup()
                .addGroup(jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnUngDung, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblDongUngDung, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPExit);
        jPExit.setBounds(0, 0, 1200, 20);

        jPContent.setBackground(new java.awt.Color(255, 255, 255));
        jPContent.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPContent.setForeground(new java.awt.Color(255, 102, 102));
        jPContent.setPreferredSize(new java.awt.Dimension(1200, 504));
        jPContent.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPContent);
        jPContent.setBounds(0, 90, 1200, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDongUngDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDongUngDungMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblDongUngDungMouseClicked

    private void lblAnUngDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnUngDungMouseClicked
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_lblAnUngDungMouseClicked

    private void btnQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyActionPerformed
        // TODO add your handling code here:
        
        jPContent.removeAll();
        jPContent.repaint();
        jPContent.validate();
        jPanel = new jPQuanLy();
        jPContent.add(jPanel);
        jPContent.validate();
        
        
    }//GEN-LAST:event_btnQuanLyActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmLogin formLogin = new frmLogin();
        formLogin.setVisible(rootPaneCheckingEnabled);
        Run.permission =0;
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioiThieuActionPerformed
        // TODO add your handling code here:
        jPContent.removeAll();
        jPContent.validate();
        jPGioiThieu jPGioiThieu = new jPGioiThieu();
        jPContent.add(jPGioiThieu);
        jPContent.validate();
    }//GEN-LAST:event_btnGioiThieuActionPerformed

    private void btnThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSinhVienActionPerformed
        // TODO add your handling code here:
        formThemMoi = new frmThemMoiSV();
        formThemMoi.jPQL = jPanel;
        formThemMoi.fql = this;
        formThemMoi.setVisible(true);
        btnThemSinhVien.setEnabled(false);
        
    }//GEN-LAST:event_btnThemSinhVienActionPerformed

    public JButton getBtnThemSinhVien() {
        return btnThemSinhVien;
    }

    

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
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnGioiThieu;
    private javax.swing.JButton btnQuanLy;
    private javax.swing.JButton btnThemSinhVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPExit;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JLabel lbTenDangNhap;
    private javax.swing.JLabel lblAnUngDung;
    private javax.swing.JLabel lblDongUngDung;
    // End of variables declaration//GEN-END:variables
}
