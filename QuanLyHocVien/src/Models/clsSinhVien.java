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
public class clsSinhVien {
    private String masinhvien;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String diachi;
    private float diem;
    private String tenlop;
    private String anh;

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

   

    public clsSinhVien(String hoten, String ngaysinh, String gioitinh, String lophoc, String diachi, Byte diem, String masinhvien, int malophoc, String anh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.diem = diem;
        this.masinhvien = masinhvien;
        this.tenlop = tenlop;
        this.anh = anh;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public clsSinhVien() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(Byte diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "clsSinhVien{" + "masinhvien=" + masinhvien + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", diachi=" + diachi + ", diem=" + diem + ", tenlop=" + tenlop + ", anh=" + anh + '}';
    }

    

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }
    
    
    
}
