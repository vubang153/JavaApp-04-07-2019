/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class tbLogin {
    public int dangNhap(String user, String password) {
        Connection cnn = Database.ketNoiCSDL();
        if (cnn == null) {
            return -2;
        }
        String sql = "SELECT * FROM dang_nhap WHERE username = ? AND password = ?";
        try {
            PreparedStatement ptm = cnn.prepareStatement(sql);
            ptm.setString(1, user);
            ptm.setString(2, password);
            ResultSet rs = ptm.executeQuery();
            if (rs.next()) {
                if (rs.getInt("quyen_truy_cap") ==0) {
                    return 0;
                }
                else if(rs.getInt("quyen_truy_cap") ==2) {
                    return 2;
                }
                return 1;
            }
            else {
                return -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbLogin.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
}
