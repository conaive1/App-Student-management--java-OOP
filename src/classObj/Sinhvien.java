/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classObj;

/**
 *
 * @author Admin
 */
public class Sinhvien {
    private String maSV,hoTen,ngaySinh,DiaChi,malOP,SDT,GoiTinh,password;
    private int namNH;

    public Sinhvien() {
    }

    public Sinhvien(String maSV, String hoTen, String ngaySinh, String DiaChi, int namNH, String malOP, String SDT, String GoiTinh,String pasword) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.DiaChi = DiaChi;
        this.namNH = namNH;
        this.malOP = malOP;
        this.SDT = SDT;
        this.GoiTinh = GoiTinh;
        this.password=pasword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getNamNH() {
        return namNH;
    }

    public void setNamNH(int namNH) {
        this.namNH = namNH;
    }

    public String getMalOP() {
        return malOP;
    }

    public void setMalOP(String malOP) {
        this.malOP = malOP;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getGoiTinh() {
        return GoiTinh;
    }

    public void setGoiTinh(String GoiTinh) {
        this.GoiTinh = GoiTinh;
    }
}
