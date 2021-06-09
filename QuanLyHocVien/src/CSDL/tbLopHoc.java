/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import JPanel.jPQuanLy;
import Models.clsLopHoc;
import java.sql.Connection;
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
public class tbLopHoc {
    public Vector<clsLopHoc> bangLopHoc() {
        Vector<clsLopHoc> lopHoc = null;
        Connection cnn = Database.ketNoiCSDL();
        String sql = "SELECT * FROM lop";
        try {
            lopHoc = new Vector<clsLopHoc>();
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                clsLopHoc lop = new clsLopHoc(rs.getInt("ma_lop_hoc"), rs.getString("ten_lop"));
                lopHoc.add(lop);
            }
        } catch (SQLException ex) {
            Logger.getLogger(jPQuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lopHoc;
    }
    public boolean timKiem(String keyword) {
        Connection cnn = Database.ketNoiCSDL();
        String sql = "SELECT * FROM lop WHERE ten_lop ='" + keyword + "'";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                return false;
            }
            else {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean themMoiLopHoc(String tenLop) {
        Connection cnn = Database.ketNoiCSDL();
        String sql = "INSERT INTO lop VALUES(null,'" + tenLop + "')";
        try {
            Statement stm = cnn.createStatement();
            int i = stm.executeUpdate(sql);
            if (i > 0) {
                return true;
            }
            else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    public int kiemTraLopHoc(String keyword) {
        Connection cnn = Database.ketNoiCSDL();
        int result;
        if (cnn != null) {
            String sql = "SELECT COUNT(*) FROM lop WHERE ten_lop='" + keyword + "'";
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                if (rs.next()) {
                    result = rs.getInt(1);
                    return result;
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLopHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
        
    }
}
