/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Forms.frmLogin;
import Forms.frmQuanLy;

/**
 *
 * @author Admin
 */
public class Run {
    public static String username;
    public static int permission;
    public static frmQuanLy frmQL;
    public static frmLogin frmLg;
    public static void logIn() {
        frmLg = new frmLogin();
        frmLg.setVisible(true);
    }
    public static void frmManager() {
        frmQL = new frmQuanLy();
        frmQL.setVisible(true);
    }
    public static void main(String[] args) {
        logIn();
    }    
}
