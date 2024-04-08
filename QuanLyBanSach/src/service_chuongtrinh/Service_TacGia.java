/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_chuongtrinh;

import model_chuongtrinh.Model_TacGia;
import ConnectSQL.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Service_TacGia {

    private static Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Service_TacGia() {
        connection = DBConnect.getConnection();
    }

    public ArrayList<Model_TacGia> getAll() {
        sql = "Select IDTacGia, TenTacGia from TacGia";
        ArrayList lst_tg = new ArrayList();
        try {

            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id, ten;
                id = rs.getString(1);
                ten = rs.getString(2);
                Model_TacGia model_TacGia = new Model_TacGia(id, ten);
                lst_tg.add(model_TacGia);
            }
            return lst_tg;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int Add(Model_TacGia model_TacGia) {
        sql = "insert into TacGia(IDTacGia,TenTacGia) values (?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, model_TacGia.getIDTacgia());
            ps.setObject(2, model_TacGia.getTenTacGia());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int Update(String id, Model_TacGia model_TacGia) {
        sql = "update TacGia\n"
                + "set TenTacGia = ?\n"
                + "where IDTacGia = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, model_TacGia.getTenTacGia());
            ps.setObject(2, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int Delete(String id){
        sql = "Delete form TacGia where IDTacGia = ?";
        try{
            ps = connection.prepareStatement(sql);
            ps.setObject(1, id);
            return  ps.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
