/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsSinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class tbSinhVien {
    public Vector<clsSinhVien> layDuLieu(String keyword) {
        Vector<clsSinhVien> bangSinhVien = null;
        Connection cnn = Database.ketNoiCSDL();
        if (cnn != null) {
            String sql = "SELECT SV.*,LH.ten_lop FROM thong_tin_sv SV INNER JOIN lop LH ON SV.ma_lop_hoc=LH.ma_lop_hoc ";
            if (!keyword.equals("")) {
                if (keyword.contains("SV")) {
                    sql = sql + "WHERE ma_sv ='" + keyword + "'";
                }
                else if (keyword.contains("K3")) {
                    sql = sql + "WHERE ma_lop_hoc='" +keyword +"'";
                }
                else {
                    sql = sql + "WHERE ho_ten LIKE '%" + keyword + "%'";
                }
            }
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                bangSinhVien = new Vector<clsSinhVien>();
                while (rs.next()) {
                    clsSinhVien sv = new clsSinhVien();
                    sv.setMasinhvien(rs.getString("ma_sv"));
                    sv.setHoten(rs.getString("ho_ten"));
                    sv.setNgaysinh(rs.getString("ngay_sinh"));
                    sv.setDiem(rs.getByte("diem"));
                    sv.setDiachi(rs.getString("dia_chi"));
                    sv.setGioitinh(rs.getString("gioi_tinh"));
                    sv.setTenlop(rs.getString("ten_lop"));
                    sv.setAnh(rs.getString("anh"));
                    bangSinhVien.add(sv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return bangSinhVien;
    }
    public Vector<clsSinhVien> layDuLieu(int keyword) {
        Vector<clsSinhVien> bangSinhVien = null;
        Connection cnn = Database.ketNoiCSDL();
        if (cnn != null) {
            String sql = "SELECT SV.*,LH.ten_lop FROM thong_tin_sv SV INNER JOIN lop LH ON SV.ma_lop_hoc=LH.ma_lop_hoc " + 
            "WHERE SV.ma_lop_hoc=" + keyword;
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                bangSinhVien = new Vector<clsSinhVien>();
                while (rs.next()) {
                    clsSinhVien sv = new clsSinhVien();
                    sv.setMasinhvien(rs.getString("ma_sv"));
                    sv.setHoten(rs.getString("ho_ten"));
                    sv.setNgaysinh(rs.getString("ngay_sinh"));
                    sv.setDiem(rs.getByte("diem"));
                    sv.setDiachi(rs.getString("dia_chi"));
                    sv.setGioitinh(rs.getString("gioi_tinh"));
                    sv.setTenlop(rs.getString("ten_lop"));
                    sv.setAnh(rs.getString("anh"));
                    bangSinhVien.add(sv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return bangSinhVien;
    }
    public int suaDuLieu(String masv,String ten, String ngaysinh, float diem, String diachi, int gioitinh, int malophoc, String anh) {
        clsSinhVien sv = new clsSinhVien();
        Connection cnn = Database.ketNoiCSDL();
        if (cnn != null) {
            String sql = "UPDATE thong_tin_sv SET ho_ten = ?,ngay_sinh = ?, diem = ?,dia_chi = ?, gioi_tinh= ?,ma_lop_hoc = ?, anh = ? " +
                    "WHERE ma_sv ='" + masv + "'";
            PreparedStatement stm;
            try {
                stm = cnn.prepareStatement(sql);
                stm.setString(1, ten);
                stm.setString(2, ngaysinh);
                stm.setFloat(3, diem);
                stm.setString(4, diachi);
                stm.setInt(5, gioitinh);
                stm.setInt(6, malophoc);
                stm.setString(7, anh);
                stm.executeUpdate();
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
            
        }
        return 0;
    }
    public boolean xoaDuLieu(String masv) {
        Connection cnn = Database.ketNoiCSDL();
        if (cnn != null) {
            String sql = "DELETE FROM thong_tin_sv WHERE ma_sv = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, masv);
                stm.executeUpdate();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    }
    public boolean themMoiSV(String masv,String ten, String ngaysinh, float diem,
    String diachi, int gioitinh, int malophoc, String anh) {
        Connection cnn = Database.ketNoiCSDL();
        String sql = "INSERT INTO thong_tin_sv VALUES(?,?,?,?,?,?,?,?)";
        if (cnn != null) {
            try {
                PreparedStatement ptm = cnn.prepareStatement(sql);
                ptm.setString(1, masv);
                ptm.setString(2, ten);
                ptm.setString(3, ngaysinh);
                ptm.setFloat(4, diem);
                ptm.setString(5, diachi);
                ptm.setInt(6, gioitinh);
                ptm.setInt(7, malophoc);
                ptm.setString(8, anh);
                ptm.executeUpdate();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }
        return false;
    }
    public int demSinhVien(String keyword) {
        Connection cnn = Database.ketNoiCSDL();
        if (cnn != null) {
            String sql = "SELECT COUNT(*) AS dem FROM thong_tin_sv";
            if (!keyword.equals("")) {
                sql = sql + " WHERE ho_ten LIKE '%" + keyword +"%'";
            }
            try {
                Statement stm;
                stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                if (rs.next()) {
                    int kq = rs.getInt(1);
                    return kq;
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
        }
        return -1;
    }
    public int demSinhVien(int keyword) {
        Connection cnn = Database.ketNoiCSDL();
        if (cnn != null) {
            String sql = "SELECT COUNT(*) AS dem FROM thong_tin_sv WHERE ma_lop_hoc LIKE '%" + keyword + "%'";
            try {
                Statement stm;
                stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                if (rs.next()) {
                    int kq = rs.getInt(1);
                    return kq;
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
        }
        return -1;
    }
}

