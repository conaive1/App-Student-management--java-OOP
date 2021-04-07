/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Encryption.MD5;
import classObj.Sinhvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SinhVienController {

    public static Sinhvien ktTrung_MASV(String MASV) {
        Connection ketnoi = KetNoiSQL.getConnection();
        String sql = "select * from SINHVIEN where MASV='" + MASV + "'";
        try {
            PreparedStatement ps = ketnoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Sinhvien sv = new Sinhvien();
                sv.setMaSV(rs.getString("MASV"));
                sv.setMalOP(rs.getString("MALOP"));
                sv.setHoTen(rs.getString("HOTEN"));
                sv.setNgaySinh(rs.getString("NGAYSINH"));
                sv.setGoiTinh(rs.getString("GIOITINH"));
                sv.setSDT(rs.getString("SODT"));
                sv.setNamNH(rs.getInt("NAMNH"));
                sv.setDiaChi(rs.getString("DIACHI"));
                rs.close();
                ps.close();
                ketnoi.close();
                return sv;
            }
            rs.close();
            ps.close();
            ketnoi.close();
        } catch (Exception e) {
        }
        return null;
    }

    public static void themSinhVien(Sinhvien sv) {

        Connection ketNoi = KetNoiSQL.getConnection();

        String sql = "INSERT INTO SINHVIEN VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getSDT());
            ps.setString(4, sv.getGoiTinh());
            ps.setString(5, sv.getNgaySinh());
            ps.setString(6, sv.getDiaChi());
            ps.setInt(7, sv.getNamNH());
            ps.setString(8, sv.getMalOP());
            ps.setString(9, MD5.getMd5(sv.getPassword()));
            ps.executeUpdate();
            ketNoi.close();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Vector getdsSinhVien() {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "select MASV,HOTEN,NGAYSINH,DIACHI,NAMNH,MALOP,SODT,GIOITINH from SINHVIEN";
        Vector ds = new Vector();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i=1;
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(i++);
                vt.add(rs.getString("MASV"));
                vt.add(rs.getString("MALOP"));
                vt.add(rs.getString("HOTEN"));
                vt.add(rs.getString("NGAYSINH"));
                vt.add(rs.getString("GIOITINH"));
                vt.add(rs.getString("SODT"));
                vt.add(rs.getString("NAMNH"));
                vt.add(rs.getString("DIACHI"));
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

    public static Vector getAllSinhVienWheremaLop(String malop) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "select MASV,HOTEN,NGAYSINH,DIACHI,NAMNH,MALOP,SODT,GIOITINH from SINHVIEN WHERE MALOP='" + malop + "'";
        Vector ds = new Vector();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(rs.getString("MASV"));
                vt.add(rs.getString("MALOP"));
                vt.add(rs.getString("HOTEN"));
                vt.add(rs.getString("NGAYSINH"));
                vt.add(rs.getString("GIOITINH"));
                vt.add(rs.getString("SODT"));
                vt.add(rs.getString("NAMNH"));
                vt.add(rs.getString("DIACHI"));
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

    public static Vector getALLSVbyMSSVvsHoTen(String shearch) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "select * from SINHVIEN WHERE MASV like N'%" + shearch + "%' or HOTEN like N'%" + shearch + "%'";
        Vector ds = new Vector();
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i=1;
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(i++);
                vt.add(rs.getString("MASV"));
                vt.add(rs.getString("MALOP"));
                vt.add(rs.getString("HOTEN"));
                vt.add(rs.getString("NGAYSINH"));
                vt.add(rs.getString("GIOITINH"));
                vt.add(rs.getString("SODT"));
                vt.add(rs.getString("NAMNH"));
                vt.add(rs.getString("DIACHI"));
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

    public static void xoaSinhVien(String masv) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "delete from SINHVIEN where MASV = ?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, masv);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("loi xoa");
        }
    }

    public static void suaSinhVien(String maSV, String hoTen, String ngaySinh, String DiaChi, int namNH, String malOP, String SDT, String GioiTinh) {
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "UPDATE SINHVIEN SET HOTEN=?, NGAYSINH=?, DIACHI=?, GIOITINH=?, SODT=?, NAMNH=?, MALOP=? where MASV=?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, hoTen);
            ps.setString(2, ngaySinh);
            ps.setString(3, DiaChi);
            ps.setString(4, GioiTinh);
            ps.setString(5, SDT);
            ps.setInt(6, namNH);
            ps.setString(7, malOP);
            ps.setString(8, maSV);
            ps.executeUpdate();
            ps.close();
            ketNoi.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public static void doiMatKhau(String masv,String newpassword){
        Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "UPDATE SINHVIEN SET Password=? WHERE MASV=?";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, MD5.getMd5(newpassword));
            ps.setString(2, masv);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static boolean ktPassWord(String masv,String mk){
         Connection ketNoi = KetNoiSQL.getConnection();
        String sql = "SELECT * FROM SINHVIEN WHERE Password = " + "'" + mk + "' and MASV = "+"'"+masv+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
