/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import classObj.LopTC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author TuanVi
 */
public class LopTCController {

    public static ArrayList<LopTC> layDanhSachLopTC() {
        ArrayList<LopTC> list = new ArrayList<>();

        String sql = "select * FROM LOPTC";

        try {
            Connection ketNoi = KetNoiSQL.getConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopTC loptc = new LopTC();
                loptc.setMaLop(rs.getInt("MALOPTC"));
                loptc.setMaMH(rs.getString("MAMH"));
                loptc.setNienKhoa(rs.getString("NIENKHOA"));
                loptc.setHocKy(rs.getInt("HOCKY"));
                loptc.setNhom(rs.getInt("NHOM"));
                loptc.setSvMax(rs.getInt("SVMAX"));
                loptc.setSvMin(rs.getInt("SVMIN"));
                list.add(loptc);
            }
            ketNoi.close();
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void themLopTC(LopTC loptc) {
        String sql = "INSERT INTO LOPTC VALUES (?,?,?,?,?,?,?)";
        try {
            Connection ketNoi = KetNoiSQL.getConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setInt(1, loptc.getMaLop());
            ps.setString(2, loptc.getMaMH());
            ps.setString(3, loptc.getNienKhoa());
            ps.setInt(4, loptc.getHocKy());
            ps.setInt(5, loptc.getNhom());
            ps.setInt(6, loptc.getSvMax());
            ps.setInt(7, loptc.getSvMin());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
        }
    }

    public static void xoaLopTC(int maLop) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "delete from LOPTC where MALOPTC = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setInt(1, maLop);
            ps.executeUpdate();
        } catch (SQLException ex) {

        }
    }

    public static LopTC ktMaLopTrung(int maLop) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "SELECT * FROM LOPTC WHERE MALOPTC = '" + maLop + "'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                LopTC loptc = new LopTC();
                loptc.setMaLop(rs.getInt("MALOPTC"));
                loptc.setMaMH(rs.getString("MAMH"));
                loptc.setNienKhoa(rs.getString("NIENKHOA"));
                loptc.setHocKy(rs.getInt("HOCKY"));
                loptc.setNhom(rs.getInt("NHOM"));
                loptc.setSvMax(rs.getInt("SVMAX"));
                loptc.setSvMin(rs.getInt("SVMIN"));
                return loptc;
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException e) {
        }
        return null;
    }

    public static void suaLop(LopTC loptc) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "UPDATE LOPTC SET MAMH=?, NIENKHOA=?, HOCKY=?, NHOM=?, SVMAX=?, SVMIN=? where MALOPTC=?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);

            ps.setString(1, loptc.getMaMH());
            ps.setString(2, loptc.getNienKhoa());
            ps.setInt(3, loptc.getHocKy());
            ps.setInt(4, loptc.getNhom());
            ps.setInt(5, loptc.getSvMax());
            ps.setInt(6, loptc.getSvMin());
            ps.setInt(7, loptc.getMaLop());
            ps.executeUpdate();
            ps.close();
            ketNoi.close();
        } catch (SQLException e) {
        }
    }

    public static LopTC getLopWhere(String mamh, String nienkhoa, int nhom, int hk) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "SELECT * FROM LOPTC WHERE MAMH = '" + mamh + "'AND NIENKHOA = '" + nienkhoa
                + "'AND NHOM=" + nhom + "AND HOCKY=" + hk + "";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                LopTC a = new LopTC();
                a.setHocKy(rs.getInt("HOCKY"));
                a.setNhom(rs.getInt("NHOM"));
                a.setSvMax(rs.getInt("SVMAX"));
                a.setSvMin(rs.getInt("SVMIN"));
                a.setMaLop(rs.getInt("MALOPTC"));
                a.setNienKhoa(rs.getString("NIENKHOA"));
                a.setMaMH(rs.getString("MAMH"));
                return a;
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException e) {
        }
        return null;
    }

    public static ArrayList<LopTC> layDanhSachLopTCwhereNienKhoavsHocKy(String Nienkhoa, int hocky) {
        ArrayList<LopTC> list = new ArrayList<>();

        String sql = "select * FROM LOPTC WHERE NIENKHOA ='" + Nienkhoa + "' AND HOCKY =" + hocky;

        try {
            Connection ketNoi = KetNoiSQL.getConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopTC loptc = new LopTC();
                loptc.setMaLop(rs.getInt("MALOPTC"));
                loptc.setMaMH(rs.getString("MAMH"));
                loptc.setNienKhoa(rs.getString("NIENKHOA"));
                loptc.setHocKy(rs.getInt("HOCKY"));
                loptc.setNhom(rs.getInt("NHOM"));
                loptc.setSvMax(rs.getInt("SVMAX"));
                loptc.setSvMin(rs.getInt("SVMIN"));
                list.add(loptc);
            }
            ketNoi.close();
            ps.close();
            rs.close();
        } catch (SQLException e) {
        }
        return list;
    }

    public static Boolean ktMonHoc(String mamh) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "SELECT * FROM LOPTC WHERE MAMH = '" + mamh + "'";
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
