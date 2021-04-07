/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classObj;



/**
 *
 * @author TuanVi
 */
public class LopTC {
    private int maLop;
    private String maMH;
    private String nienKhoa;
    private int hocKy;
    private int nhom;
    private int svMax;
    private int svMin;

    public LopTC() {
    }

    public LopTC(int maLop, String maMH, String nienKhoa, int hocKy, int nhom, int svMax, int svMin) {
        this.maLop = maLop;
        this.maMH = maMH;
        this.nienKhoa = nienKhoa;
        this.hocKy = hocKy;
        this.nhom = nhom;
        this.svMax = svMax;
        this.svMin = svMin;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public int getSvMax() {
        return svMax;
    }

    public void setSvMax(int svMax) {
        this.svMax = svMax;
    }

    public int getSvMin() {
        return svMin;
    }

    public void setSvMin(int svMin) {
        this.svMin = svMin;
    }
    
    
}
