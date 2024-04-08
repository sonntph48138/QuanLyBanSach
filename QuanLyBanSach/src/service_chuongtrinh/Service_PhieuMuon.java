/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_chuongtrinh;

import ConnectSQL.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import model_chuongtrinh.Model_PhieuMuon;

public class Service_PhieuMuon {

    private static Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;

    public Service_PhieuMuon() {
        connection = DBConnect.getConnection();
    }

    public ArrayList<Model_PhieuMuon> getAll() {
        sql = "select IDPhieuMuon ,IDBanDoc ,IDNhanVien,NgayMuon,NgayTra from PhieuMuon";
        ArrayList lstpm = new ArrayList();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String IDPhieuMuon;
                String IDBanDoc;
                String IDNhanVien;
                String NgayMuon;
                String NgayTra;
                IDPhieuMuon = rs.getString(1);
                IDBanDoc = rs.getString(2);
                IDNhanVien = rs.getString(3);
                NgayMuon = rs.getString(4);
                NgayTra = rs.getString(5);
                Model_PhieuMuon model_PhieuMuon = new Model_PhieuMuon(IDPhieuMuon, IDBanDoc, IDNhanVien, NgayMuon, NgayTra);
                lstpm.add(model_PhieuMuon);
            }
            return lstpm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int Add(Model_PhieuMuon model_PhieuMuon) {
        sql = "insert into PhieuMuon(IDPhieuMuon ,IDBanDoc ,IDNhanVien,NgayMuon,NgayTra) values (?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, model_PhieuMuon.getIDPhieuMuon());
            ps.setObject(2, model_PhieuMuon.getIDBanDoc());
            ps.setObject(3, model_PhieuMuon.getIDNhanVien());
            ps.setObject(4, model_PhieuMuon.getNgayMuon());
            ps.setObject(5, model_PhieuMuon.getNgayTra());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int Update(String id, Model_PhieuMuon model_PhieuMuon) {
        sql = "update PhieuMuon\n"
                + "set IDBanDoc =?, IDNhanVien = ?, NgayMuon = ?, NgayTra = ?\n"
                + "where IDPhieuMuon = ?";
        try{
            ps = connection.prepareStatement(sql);
            ps.setObject(1, model_PhieuMuon.getIDBanDoc());
            ps.setObject(2, model_PhieuMuon.getIDNhanVien());
            ps.setObject(3, model_PhieuMuon.getNgayMuon());
            ps.setObject(4, model_PhieuMuon.getNgayTra());
            ps.setObject(5, id);
            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
    
    public int Delete(String id){
        sql = "exec dbo.xoaDataPM ?";
        try{
            ps = connection.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            return 0 ;
        }
    }
}
