/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.admin.Quanly_MonHoc;
import classObj.Monhoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MonHocController {

    public static Vector getAlldsMonHoc() {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "Select * from MONHOC";
        Vector ds = new Vector();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();;
            int i=1;
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(i++);
                vt.add(rs.getString("MAMH"));
                vt.add(rs.getString("TENMONHOC"));
                vt.add(rs.getString("SOTINCHI"));
                ds.add(vt);
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static ArrayList getAllmaMonHoc() {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "Select * from MONHOC";
        ArrayList ds = new ArrayList();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();;
            while (rs.next()) {
                ds.add(rs.getString("MAMH"));
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static void Insert(Monhoc monhoc) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "insert into MONHOC values (?,?,?)";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, monhoc.getMAMH());
            ps.setString(2, monhoc.getTenMH());
            ps.setInt(3, monhoc.getSTC());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Quanly_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Monhoc ktMonhoc(String MAMH) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "select * from MONHOC where MAMH ='" + MAMH + "'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Monhoc mh = new Monhoc();
                mh.setMAMH(rs.getString("MAMH"));
                mh.setTenMH(rs.getString("TENMONHOC"));
                mh.setSTC(rs.getInt("SOTINCHI"));
                rs.close();
                ps.close();
                ketNoi.close();
                return mh;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Quanly_MonHoc.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public static void delete(String MAMH) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "delete from MONHOC where MAMH = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MAMH);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Quanly_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void update(Monhoc mh) {
        Connection ketNoi = KetNoiSQL.getConnection();
        try {
            String sql = "update MONHOC set TENMONHOC=?,SOTINCHI=? WHERE MAMH=?";
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, mh.getTenMH());
            ps.setInt(2, mh.getSTC());
            ps.setString(3, mh.getMAMH());
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static Vector getAlldsMonHocwheremaMHvstenMH(String shearch) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "select * from MONHOC WHERE MAMH like N'%" + shearch + "%' or TENMONHOC like N'%" + shearch + "%'";
        Vector ds = new Vector();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();;
            int i=1;
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(i++);
                vt.add(rs.getString("MAMH"));
                vt.add(rs.getString("TENMONHOC"));
                vt.add(rs.getString("SOTINCHI"));
                ds.add(vt);
            }
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
}
