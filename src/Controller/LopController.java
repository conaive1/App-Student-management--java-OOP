/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LopController {

    public static ArrayList getAllmaLop() {
        ArrayList ds = new ArrayList();
        Connection ketnoi = KetNoiSQL.getConnection();
        String sql = "select MALOP from LOP";
        try {
            PreparedStatement ps = ketnoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              ds.add(rs.getString("MALOP"));
            }
            rs.close();
            ps.close();
            ketnoi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

}
