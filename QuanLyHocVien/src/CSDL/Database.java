/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Database {
    private static String username="root";
    private static String password="";
    private static String url="jdbc:mysql://localhost:3306/quanlysinhvien?useUnicode=true&characterEncoding=utf8";
    public static Connection ketNoiCSDL() {
        Connection cnn = null;
        try {
            cnn = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Lỗi kết nối CSDL");
        }
        return cnn;
        
    }
}
