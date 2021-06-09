/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Admin
 */
public class clsLopHoc {
    private int malophoc;
    private String tenlophoc;

    public clsLopHoc() {
    }

    public clsLopHoc(int malophoc, String tenlophoc) {
        this.malophoc = malophoc;
        this.tenlophoc = tenlophoc;
    }

    public int getMalophoc() {
        return malophoc;
    }

    public void setMalophoc(int malophoc) {
        this.malophoc = malophoc;
    }

    public String getTenlophoc() {
        return tenlophoc;
    }

    public void setTenlophoc(String tenlophoc) {
        this.tenlophoc = tenlophoc;
    }

    @Override
    public String toString() {
        return tenlophoc; 
    }
    
    
}
