/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_chuongtrinh;

import ConnectSQL.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model_chuongtrinh.Model_ChiTietPhieuMuon;

public class Service_ChiTietPhieuMuon {

    private static Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;

    public Service_ChiTietPhieuMuon() {
        connection = DBConnect.getConnection();
    }

    public ArrayList<Model_ChiTietPhieuMuon> getAll() {
        sql = "select IDChiTietPhieuMuon,IDPhieuMuon,IDSach,SoLuongSachMuon from ChiTietPhieuMuon";
        ArrayList lst_ctpm = new ArrayList();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            String IDChiTietPhieuMuon;
            String IDPhieuMuon;
            String IDSach;
            int SoLuongSachMuon;
            while (rs.next()) {
                IDChiTietPhieuMuon = rs.getString(1);
                IDPhieuMuon = rs.getString(2);
                IDSach = rs.getString(3);
                SoLuongSachMuon = rs.getInt(4);
                Model_ChiTietPhieuMuon mctpm = new Model_ChiTietPhieuMuon(IDChiTietPhieuMuon, IDPhieuMuon, IDSach, SoLuongSachMuon);
                lst_ctpm.add(mctpm);
            }
            return lst_ctpm;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int Add(Model_ChiTietPhieuMuon mctpm) {
        sql = "insert into ChiTietPhieuMuon(IDChiTietPhieuMuon,IDPhieuMuon,IDSach,SoLuongSachMuon) values (?,?,?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, mctpm.getIDChiTietPhieuMuon());
            ps.setObject(2, mctpm.getIDPhieuMuon());
            ps.setObject(3, mctpm.getIDSach());
            ps.setObject(4, mctpm.getSoLuongSachMuon());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int Delete(String id) {
        sql = "delete from ChiTietPhieuMuon where IDChiTietPhieuMuon = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int Update(String id, Model_ChiTietPhieuMuon mctpm) {
        sql = "update ChiTietPhieuMuon\n"
                + "set IDPhieuMuon = ?,IDSach = ?,SoLuongSachMuon = ?\n"
                + "where IDChiTietPhieuMuon = ? ";
        try{
            ps = connection.prepareStatement(sql);
            ps.setObject(1, mctpm.getIDPhieuMuon());
            ps.setObject(2, mctpm.getIDSach());
            ps.setObject(3, mctpm.getSoLuongSachMuon());
            ps.setObject(4, id);
            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
