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
public class DIEM {

    private String MASV;
    private int maLopTC;
    private float diem;

    public DIEM(int maLopTC, String MASV, float diem) {
        this.maLopTC = maLopTC;
        this.MASV = MASV;
        this.diem = diem;
    }

    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public int getMaLopTC() {
        return maLopTC;
    }

    public void setMaLopTC(int maLopTC) {
        this.maLopTC = maLopTC;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public DIEM() {
    }
}
