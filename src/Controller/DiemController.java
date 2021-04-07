/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import classObj.DIEM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DiemController {

    public static ArrayList<DIEM> getAlldsSvLopTC(int maloptc) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "Select * from DIEM where MALOPTC=" + maloptc;
        ArrayList ds = new ArrayList();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();;
            while (rs.next()) {
                DIEM a = new DIEM();
                a.setMaLopTC(rs.getInt("MALOPTC"));
                a.setMASV(rs.getString("MASV"));
                a.setDiem(rs.getFloat("DIEM"));
                ds.add(a);
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static void updeteDiem(DIEM diem) {
        Connection ketNoi = KetNoiSQL.getConnection();
        try {
            String sql = "update DIEM set DIEM=? WHERE MASV=? and MALOPTC=?";
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setFloat(1, diem.getDiem());
            ps.setString(2, diem.getMASV());
            ps.setInt(3, diem.getMaLopTC());
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void demSVtrong1Lop(int maloptc) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String a = "";
        try {
            String sql = "select count(*) as soluong from DIEM where MALOPTC =?";
            PreparedStatement ps = ps = ketNoi.prepareStatement(sql);
            ps.setInt(1, maloptc);
            System.out.println("a");
            System.out.println("a" + ps.executeUpdate());

        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) {
        demSVtrong1Lop(15967);
    }

    public static ArrayList<DIEM> getThongtinSV(String masv) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "Select * from DIEM where MASV ='" + masv + "'";
        ArrayList ds = new ArrayList();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();;
            while (rs.next()) {
                DIEM a = new DIEM();
                a.setMaLopTC(rs.getInt("MALOPTC"));
                a.setMASV(rs.getString("MASV"));
                a.setDiem(rs.getFloat("DIEM"));
                ds.add(a);
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
        }
        return ds;
    }

    public static Boolean ktSinhVien(String masv) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "SELECT * FROM DIEM WHERE MASV = '" + masv + "'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException e) {
        }
        return false;
    }

    public static Boolean ktLopTC(int maLopTC) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "SELECT * FROM DIEM WHERE MALOPTC =" + maLopTC;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException e) {
        }
        return false;
    }
}
