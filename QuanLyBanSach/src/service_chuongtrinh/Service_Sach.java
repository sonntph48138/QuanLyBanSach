/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_chuongtrinh;

import ConnectSQL.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model_chuongtrinh.Model_Sach;

public class Service_Sach {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;

    public ArrayList<Model_Sach> getAll() {
        sql = "select * from dbo.V_Sach";
        ArrayList lst_Sach = new ArrayList();
        try {
            connection = DBConnect.getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id, tieude, tacgia, ngayxuatban, nhaxuatban, theloai;
                int soluong;
                id = rs.getString(1);
                tieude = rs.getString(2);
                tacgia = rs.getString(3);
                ngayxuatban = rs.getString(4);
                nhaxuatban = rs.getString(5);
                theloai = rs.getString(6);
                soluong = rs.getInt(7);
                Model_Sach model_Sach = new Model_Sach(id, tieude, tacgia, ngayxuatban, nhaxuatban, theloai, soluong);
                lst_Sach.add(model_Sach);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lst_Sach;
    }
    
//    public int Add(Model_Sach model_Sach){
//        sql = "insert into"
//    }
}
