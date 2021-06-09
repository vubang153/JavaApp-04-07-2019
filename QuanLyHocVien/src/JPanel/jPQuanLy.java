/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanel;

import CSDL.Database;
import CSDL.tbLopHoc;
import CSDL.tbSinhVien;
import Forms.frmThemMoiSV;
import Models.clsLopHoc;
import Models.clsSinhVien;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class jPQuanLy extends javax.swing.JPanel {
    private String imgPath;
    /**
     * Creates new form jPQuanLy
     */
    public jPQuanLy() {
        initComponents();
        this.loadContent("");
        this.loadClass();
        this.hienThiSiSo("");
    }
    public int layMaLop() {
        int maLop;
        String lop = txtLop.getText();
        if (lop.equals("K32B1")) {
            maLop = 1;
        }
        else if (lop.equals("K32B2")) {
            maLop = 2;
        }
        else if (lop.equals("K32A1")) {
            maLop = 3;
        }
        else if (lop.equals("K31A2")) {
            maLop = 4;
        }
        else {
            maLop = 5;
        }
        return maLop;
    }
    public int layGioiTinh() {
        if (rbNam.isSelected()) {
            return 1;
        }
        else {
            return 2;
        }
    }
    public void reloadInfo() {
        txtDiaChi.setEditable(false);
        txtDiem.setEditable(false);
        txtHoVaTen.setEditable(false);
        txtLop.setEditable(false);
        txtMaSinhVien.setEditable(false);
        txtNgaySinh.setEditable(false);
        rbNam.setEnabled(false);
        rbNu.setEnabled(false);
        jBSua.setEnabled(false);
        lbLoiDiaChi.setText("");
        lbLoiDiem.setText("");
        lbLoiHoVaTen.setText("");
        lbLoiLop.setText("");
        lbLoiNgaySinh.setText("");
        
    }
    public void hienThiSiSo(String sql) {
        tbSinhVien sv = new tbSinhVien();
        int siSo = sv.demSinhVien(sql);
        lbSiSo.setText(Integer.toString(siSo));
    }
    public void hienThiSiSo(int sql) {
        tbSinhVien sv = new tbSinhVien();
        int siSo = sv.demSinhVien(sql);
        lbSiSo.setText(Integer.toString(siSo));
    }
    public void loadClass() {
        tbLopHoc bangLopHoc = new tbLopHoc();
        Vector<clsLopHoc> lopHoc = bangLopHoc.bangLopHoc();
        DefaultComboBoxModel dcb = new DefaultComboBoxModel(lopHoc);
        cbLopHoc.setModel(dcb);
        cbLopHoc.insertItemAt("Chọn lớp học",0);
        cbLopHoc.setSelectedIndex(0);
    }
    public void loadContent(String keyword) {
        tbSinhVien bangSinhVien = new tbSinhVien();
        Vector<clsSinhVien> vSinhVien = bangSinhVien.layDuLieu(keyword);
        if (vSinhVien != null) {
            DefaultTableModel dtm = (DefaultTableModel) jTBangThongTin.getModel();
            dtm.setRowCount(0);
            for (clsSinhVien sv : vSinhVien) {
                if (sv.getGioitinh().equals("1")) {
                    sv.setGioitinh("Nam");
                }
                else {
                    sv.setGioitinh("Nữ");
                }
                dtm.addRow(new Object[]{sv.getMasinhvien(),sv.getHoten(),sv.getNgaysinh(),sv.getGioitinh(),sv.getTenlop()});
            }
            
        }
    }
    public void loadContent(int keyword) {
        tbSinhVien bangSinhVien = new tbSinhVien();
        Vector<clsSinhVien> vSinhVien = bangSinhVien.layDuLieu(keyword);
        if (vSinhVien != null) {
            DefaultTableModel dtm = (DefaultTableModel) jTBangThongTin.getModel();
            dtm.setRowCount(0);
            for (clsSinhVien sv : vSinhVien) {
                if (sv.getGioitinh().equals("1")) {
                    sv.setGioitinh("Nam");
                }
                else {
                    sv.setGioitinh("Nữ");
                }
                dtm.addRow(new Object[]{sv.getMasinhvien(),sv.getHoten(),sv.getNgaysinh(),sv.getGioitinh(),sv.getTenlop()});
            }
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBangThongTin = new javax.swing.JTable();
        cbLopHoc = new javax.swing.JComboBox();
        txtTuKhoa = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jPThongTinChiTiet = new javax.swing.JPanel();
        lbThayAnh = new javax.swing.JLabel();
        lbAnhDaiDien = new javax.swing.JLabel();
        lbDiaChi = new javax.swing.JLabel();
        txtMaSinhVien = new javax.swing.JTextField();
        lbNgaySinh = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lbDiem = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        lbMaSinhVien = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        lbGioiTinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        lbHoVaTen = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        lbLop = new javax.swing.JLabel();
        txtLop = new javax.swing.JTextField();
        jBXoa = new javax.swing.JButton();
        jBSua = new javax.swing.JButton();
        jBSuaDiaChi = new javax.swing.JLabel();
        jBSuaDiem = new javax.swing.JLabel();
        jBSuaLop = new javax.swing.JLabel();
        jBSuaHoTen = new javax.swing.JLabel();
        jBSuaGT = new javax.swing.JLabel();
        jBSuaNgaySinh = new javax.swing.JLabel();
        lbLoiHoVaTen = new javax.swing.JLabel();
        lbLoiLop = new javax.swing.JLabel();
        lbLoiDiem = new javax.swing.JLabel();
        lbLoiNgaySinh = new javax.swing.JLabel();
        lbLoiDiaChi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbSiSo = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 550));
        setLayout(null);

        jTBangThongTin.setBackground(new java.awt.Color(242, 120, 35));
        jTBangThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jTBangThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Họ và tên", "Ngày sinh", "Giới tính", "Lớp học"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTBangThongTin.setGridColor(new java.awt.Color(255, 255, 255));
        jTBangThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBangThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBangThongTin);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 1180, 153);

        cbLopHoc.setForeground(new java.awt.Color(242, 120, 35));
        cbLopHoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn lớp học", "Item 2", "Item 3", "Item 4" }));
        cbLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopHocActionPerformed(evt);
            }
        });
        add(cbLopHoc);
        cbLopHoc.setBounds(10, 20, 110, 20);
        add(txtTuKhoa);
        txtTuKhoa.setBounds(940, 20, 160, 20);

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        add(btnTimKiem);
        btnTimKiem.setBounds(1100, 20, 30, 20);

        jPThongTinChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        jPThongTinChiTiet.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPThongTinChiTiet.setLayout(null);

        lbThayAnh.setBackground(new java.awt.Color(255, 255, 255));
        lbThayAnh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbThayAnh.setForeground(new java.awt.Color(242, 120, 35));
        lbThayAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThayAnh.setText("CẬP NHẬT");
        lbThayAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 120, 35), new java.awt.Color(242, 120, 35)));
        lbThayAnh.setOpaque(true);
        lbThayAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThayAnhMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbThayAnhMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbThayAnhMousePressed(evt);
            }
        });
        jPThongTinChiTiet.add(lbThayAnh);
        lbThayAnh.setBounds(30, 260, 260, 50);

        lbAnhDaiDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown-person .png"))); // NOI18N
        lbAnhDaiDien.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(242, 121, 35), new java.awt.Color(242, 121, 35)));
        jPThongTinChiTiet.add(lbAnhDaiDien);
        lbAnhDaiDien.setBounds(30, 10, 260, 300);

        lbDiaChi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDiaChi.setForeground(new java.awt.Color(242, 120, 35));
        lbDiaChi.setText("ĐỊA CHỈ:");
        jPThongTinChiTiet.add(lbDiaChi);
        lbDiaChi.setBounds(810, 140, 70, 20);

        txtMaSinhVien.setEditable(false);
        jPThongTinChiTiet.add(txtMaSinhVien);
        txtMaSinhVien.setBounds(490, 20, 210, 20);

        lbNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(242, 120, 35));
        lbNgaySinh.setText("NGÀY SINH:");
        jPThongTinChiTiet.add(lbNgaySinh);
        lbNgaySinh.setBounds(810, 80, 90, 20);

        txtDiaChi.setEditable(false);
        jPThongTinChiTiet.add(txtDiaChi);
        txtDiaChi.setBounds(810, 170, 360, 50);

        lbDiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDiem.setForeground(new java.awt.Color(242, 120, 35));
        lbDiem.setText("ĐIỂM:");
        jPThongTinChiTiet.add(lbDiem);
        lbDiem.setBounds(370, 200, 50, 20);

        txtDiem.setEditable(false);
        txtDiem.setBackground(new java.awt.Color(255, 255, 255));
        txtDiem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDiem.setForeground(new java.awt.Color(0, 102, 255));
        txtDiem.setText("10.0");
        txtDiem.setBorder(null);
        jPThongTinChiTiet.add(txtDiem);
        txtDiem.setBounds(430, 190, 70, 30);

        lbMaSinhVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMaSinhVien.setForeground(new java.awt.Color(242, 120, 35));
        lbMaSinhVien.setText("MÃ SINH VIÊN:");
        jPThongTinChiTiet.add(lbMaSinhVien);
        lbMaSinhVien.setBounds(370, 20, 120, 20);

        rbNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");
        rbNam.setEnabled(false);
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });
        jPThongTinChiTiet.add(rbNam);
        rbNam.setBounds(920, 20, 60, 23);

        rbNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbNu);
        rbNu.setText("Nữ");
        rbNu.setEnabled(false);
        jPThongTinChiTiet.add(rbNu);
        rbNu.setBounds(990, 20, 60, 23);

        lbGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbGioiTinh.setForeground(new java.awt.Color(242, 120, 35));
        lbGioiTinh.setText("GIỚI TÍNH:");
        jPThongTinChiTiet.add(lbGioiTinh);
        lbGioiTinh.setBounds(810, 20, 90, 20);

        txtNgaySinh.setEditable(false);
        jPThongTinChiTiet.add(txtNgaySinh);
        txtNgaySinh.setBounds(920, 80, 180, 20);

        lbHoVaTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbHoVaTen.setForeground(new java.awt.Color(242, 120, 35));
        lbHoVaTen.setText("HỌ VÀ TÊN:");
        jPThongTinChiTiet.add(lbHoVaTen);
        lbHoVaTen.setBounds(370, 80, 90, 20);

        txtHoVaTen.setEditable(false);
        jPThongTinChiTiet.add(txtHoVaTen);
        txtHoVaTen.setBounds(490, 80, 210, 20);

        lbLop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLop.setForeground(new java.awt.Color(242, 120, 35));
        lbLop.setText("LỚP:");
        jPThongTinChiTiet.add(lbLop);
        lbLop.setBounds(370, 140, 50, 20);

        txtLop.setEditable(false);
        jPThongTinChiTiet.add(txtLop);
        txtLop.setBounds(430, 140, 150, 20);

        jBXoa.setBackground(new java.awt.Color(242, 120, 35));
        jBXoa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBXoa.setForeground(new java.awt.Color(255, 255, 255));
        jBXoa.setText("XOÁ");
        jBXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXoaActionPerformed(evt);
            }
        });
        jPThongTinChiTiet.add(jBXoa);
        jBXoa.setBounds(750, 270, 90, 31);

        jBSua.setBackground(new java.awt.Color(242, 120, 35));
        jBSua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSua.setForeground(new java.awt.Color(255, 255, 255));
        jBSua.setText("SỬA");
        jBSua.setEnabled(false);
        jBSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSuaActionPerformed(evt);
            }
        });
        jPThongTinChiTiet.add(jBSua);
        jBSua.setBounds(620, 270, 90, 31);

        jBSuaDiaChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jBSuaDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSuaDiaChiMouseClicked(evt);
            }
        });
        jPThongTinChiTiet.add(jBSuaDiaChi);
        jBSuaDiaChi.setBounds(880, 140, 20, 20);

        jBSuaDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jBSuaDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSuaDiemMouseClicked(evt);
            }
        });
        jPThongTinChiTiet.add(jBSuaDiem);
        jBSuaDiem.setBounds(500, 200, 20, 20);

        jBSuaLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jBSuaLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSuaLopMouseClicked(evt);
            }
        });
        jPThongTinChiTiet.add(jBSuaLop);
        jBSuaLop.setBounds(580, 140, 20, 20);

        jBSuaHoTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jBSuaHoTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSuaHoTenMouseClicked(evt);
            }
        });
        jPThongTinChiTiet.add(jBSuaHoTen);
        jBSuaHoTen.setBounds(700, 80, 20, 20);

        jBSuaGT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jBSuaGT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSuaGTMouseClicked(evt);
            }
        });
        jPThongTinChiTiet.add(jBSuaGT);
        jBSuaGT.setBounds(1050, 20, 20, 20);

        jBSuaNgaySinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jBSuaNgaySinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSuaNgaySinhMouseClicked(evt);
            }
        });
        jPThongTinChiTiet.add(jBSuaNgaySinh);
        jBSuaNgaySinh.setBounds(1100, 80, 20, 20);

        lbLoiHoVaTen.setForeground(java.awt.Color.red);
        lbLoiHoVaTen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPThongTinChiTiet.add(lbLoiHoVaTen);
        lbLoiHoVaTen.setBounds(490, 100, 210, 20);

        lbLoiLop.setForeground(java.awt.Color.red);
        jPThongTinChiTiet.add(lbLoiLop);
        lbLoiLop.setBounds(430, 160, 170, 20);

        lbLoiDiem.setForeground(java.awt.Color.red);
        jPThongTinChiTiet.add(lbLoiDiem);
        lbLoiDiem.setBounds(370, 220, 120, 20);

        lbLoiNgaySinh.setForeground(java.awt.Color.red);
        jPThongTinChiTiet.add(lbLoiNgaySinh);
        lbLoiNgaySinh.setBounds(920, 100, 190, 20);

        lbLoiDiaChi.setForeground(java.awt.Color.red);
        jPThongTinChiTiet.add(lbLoiDiaChi);
        lbLoiDiaChi.setBounds(810, 220, 190, 20);

        add(jPThongTinChiTiet);
        jPThongTinChiTiet.setBounds(10, 220, 1180, 320);

        jLabel1.setText("Sĩ số:");
        add(jLabel1);
        jLabel1.setBounds(140, 20, 40, 20);

        lbSiSo.setForeground(new java.awt.Color(0, 0, 255));
        add(lbSiSo);
        lbSiSo.setBounds(180, 20, 60, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNamActionPerformed

    private void jBXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXoaActionPerformed
        // TODO add your handling code here:
        tbSinhVien sv = new tbSinhVien();
        String masv = txtMaSinhVien.getText();
        boolean result = sv.xoaDuLieu(masv);
        if (result) {
            JOptionPane.showMessageDialog(this,"Xoá thành công :D");
        }
        else {
            JOptionPane.showMessageDialog(this,"Xoá thất bại :(");

        }
        loadContent("");
    }//GEN-LAST:event_jBXoaActionPerformed

    private void jBSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSuaActionPerformed
        // TODO add your handling code here:
        boolean checkResult = txtHoVaTen.getText().equals("") || txtNgaySinh.getText().equals("") || txtDiem.getText().equals("") || txtDiaChi.getText().equals("") || txtLop.getText().equals("");
        if (checkResult) {
            if (txtHoVaTen.getText().equals("")) {
                lbLoiHoVaTen.setText("Nhập họ và tên");
            }
            if (txtNgaySinh.getText().equals("")) {
                lbLoiNgaySinh.setText("Nhập ngày sinh");
            }
            if (txtDiem.getText().equals("")) {
                lbLoiDiem.setText("Nhập điểm");
            }
            if (txtDiaChi.getText().equals("")) {
                lbLoiDiaChi.setText("Nhập địa chỉ");
            }
            if(txtLop.getText().equals("")) {
                lbLoiLop.setText("Nhập lớp");
            }
        }
        else {
            System.out.println(txtHoVaTen.getText());
            tbLopHoc lh = new tbLopHoc();
            tbSinhVien sv = new tbSinhVien();
            String masv = txtMaSinhVien.getText();
            String ten = txtHoVaTen.getText();
            String diachi = txtDiaChi.getText();
            String ngaysinh = txtNgaySinh.getText();
            if (lh.kiemTraLopHoc(txtLop.getText()) ==0) {
                lh.themMoiLopHoc(txtLop.getText());
            }
            int malop = this.layMaLop();
            String anh = this.imgPath;
            int gioitinh = this.layGioiTinh();
            float diem = Float.parseFloat(txtDiem.getText());
            int result = sv.suaDuLieu(masv, ten, ngaysinh, diem, diachi, gioitinh, malop, anh);
            if (result == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                loadContent("");
                reloadInfo();
            }
            else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại !");
            }
            
            
        }
        
    }//GEN-LAST:event_jBSuaActionPerformed

    private void jBSuaHoTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSuaHoTenMouseClicked
        // TODO add your handling code here:
        jBSua.setEnabled(true);
        txtHoVaTen.setEditable(true);
        
    }//GEN-LAST:event_jBSuaHoTenMouseClicked

    private void jBSuaLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSuaLopMouseClicked
        // TODO add your handling code here:
        jBSua.setEnabled(true);
        txtLop.setEditable(true);
    }//GEN-LAST:event_jBSuaLopMouseClicked

    private void jBSuaDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSuaDiemMouseClicked
        // TODO add your handling code here:
        jBSua.setEnabled(true);
        txtDiem.setEditable(true);
    }//GEN-LAST:event_jBSuaDiemMouseClicked

    private void jBSuaGTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSuaGTMouseClicked
        // TODO add your handling code here:
        jBSua.setEnabled(true);
        rbNam.setEnabled(true);
        rbNu.setEnabled(true);
    }//GEN-LAST:event_jBSuaGTMouseClicked

    private void jBSuaNgaySinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSuaNgaySinhMouseClicked
        // TODO add your handling code here:
        jBSua.setEnabled(true);
        txtNgaySinh.setEditable(true);
        
    }//GEN-LAST:event_jBSuaNgaySinhMouseClicked

    private void jBSuaDiaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSuaDiaChiMouseClicked
        // TODO add your handling code here:
        jBSua.setEnabled(true);
        txtDiaChi.setEditable(true);
        
    }//GEN-LAST:event_jBSuaDiaChiMouseClicked

    private void jTBangThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBangThongTinMouseClicked
        // TODO add your handling code here:
        reloadInfo();
        int currentRow =jTBangThongTin.getSelectedRow();
        String maSV = (String) jTBangThongTin.getModel().getValueAt(currentRow, 0);
        tbSinhVien bangSinhVien = new tbSinhVien();
        Vector<clsSinhVien> sv = bangSinhVien.layDuLieu(maSV);
        sv.get(0).setMasinhvien(maSV);
        txtMaSinhVien.setText(maSV);
        txtDiaChi.setText(sv.get(0).getDiachi());
        txtDiem.setText(Float.toString(sv.get(0).getDiem()));
        txtHoVaTen.setText(sv.get(0).getHoten());
        txtLop.setText(sv.get(0).getTenlop());
        txtNgaySinh.setText(sv.get(0).getNgaysinh());
        this.imgPath = sv.get(0).getAnh();
        File anh = new File(this.imgPath);
        try {
                Image img1 = ImageIO.read(anh);
                Image img2 = img1.getScaledInstance(lbAnhDaiDien.getWidth(), 
                                             lbAnhDaiDien.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img2);
                lbAnhDaiDien.setIcon(icon);
            } catch (IOException ex) {
                lbAnhDaiDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown-person .png")));            }
        
        if (sv.get(0).getGioitinh().equals("1")) {
            rbNam.setSelected(true);
        }
        else {
            rbNu.setSelected(true);
        }
        /*if (!sv.get(0).getAnh().equals("")) {
            lbAnhDaiDien.setIcon(new javax.swing.ImageIcon(sv.get(0).getAnh()));
        }
        else {
            lbAnhDaiDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown-person .png")));
        }
                */
        
        
        
    }//GEN-LAST:event_jTBangThongTinMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        loadContent(txtTuKhoa.getText());
        this.hienThiSiSo(txtTuKhoa.getText());
        
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void cbLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLopHocActionPerformed
        // TODO add your handling code here:
        int i = cbLopHoc.getSelectedIndex();
        if (i > 0) {
            loadContent(i);
            hienThiSiSo(i);
        }
        else {
            loadContent("");
            hienThiSiSo("");
        }
    }//GEN-LAST:event_cbLopHocActionPerformed

    private void lbThayAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThayAnhMouseClicked
        // TODO add your handling code here:
        JFileChooser openFile = new JFileChooser();
        openFile.showOpenDialog(null);
        File f = openFile.getSelectedFile();
        String filename = f.getAbsolutePath();
        System.out.println(filename);
        System.out.println(f);

        ImageIcon icon=null;
        try {
            Image anh_goc = ImageIO.read(f);
            Image anh_sua =anh_goc.getScaledInstance(lbAnhDaiDien.getWidth(), lbAnhDaiDien.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(anh_sua);
        }catch(Exception e){}
        //ImageIcon icon = new ImageIcon(filename);
        lbAnhDaiDien.setIcon(icon);
        jBSua.setEnabled(true);
        this.imgPath = filename;
    }//GEN-LAST:event_lbThayAnhMouseClicked

    private void lbThayAnhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThayAnhMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbThayAnhMousePressed

    private void lbThayAnhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThayAnhMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbThayAnhMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbLopHoc;
    private javax.swing.JButton jBSua;
    private javax.swing.JLabel jBSuaDiaChi;
    private javax.swing.JLabel jBSuaDiem;
    private javax.swing.JLabel jBSuaGT;
    private javax.swing.JLabel jBSuaHoTen;
    private javax.swing.JLabel jBSuaLop;
    private javax.swing.JLabel jBSuaNgaySinh;
    private javax.swing.JButton jBXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPThongTinChiTiet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBangThongTin;
    private javax.swing.JLabel lbAnhDaiDien;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbDiem;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoVaTen;
    private javax.swing.JLabel lbLoiDiaChi;
    private javax.swing.JLabel lbLoiDiem;
    private javax.swing.JLabel lbLoiHoVaTen;
    private javax.swing.JLabel lbLoiLop;
    private javax.swing.JLabel lbLoiNgaySinh;
    private javax.swing.JLabel lbLop;
    private javax.swing.JLabel lbMaSinhVien;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSiSo;
    private javax.swing.JLabel lbThayAnh;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMaSinhVien;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}