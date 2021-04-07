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
public class Monhoc {
    private String MAMH,tenMH;
    private int STC;

    public Monhoc() {
    }

    public Monhoc(String MAMH, String tenMH, int STC) {
        this.MAMH = MAMH;
        this.tenMH = tenMH;
        this.STC = STC;
    }

    public String getMAMH() {
        return MAMH;
    }

    public void setMAMH(String MAMH) {
        this.MAMH = MAMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSTC() {
        return STC;
    }

    public void setSTC(int STC) {
        this.STC = STC;
    }
    
}
