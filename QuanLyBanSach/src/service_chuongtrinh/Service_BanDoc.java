/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_chuongtrinh;

import model_chuongtrinh.model_BanDoc;
import ConnectSQL.DBConnect;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Service_BanDoc {

    private static Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public Service_BanDoc() {
        connection = DBConnect.getConnection();
    }

    public ArrayList<model_BanDoc> getAll() {
        sql = "select IDBanDoc,TenBanDoc,tendn,matkhau,ChucVu,Email,SoDienThoai,DiaChi from BanDoc";

        ArrayList lstbd = new ArrayList();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idbd;
                String tenbd;
                String tendangnhap;
                String matkhau;
                String chucvu;
                String email;
                String sdt;
                String diachi;

                idbd = rs.getString(1);
                tenbd = rs.getString(2);
                tendangnhap = rs.getString(3);
                matkhau = rs.getString(4);
                chucvu = rs.getString(5);
                email = rs.getString(6);
                sdt = rs.getString(7);
                diachi = rs.getString(8);

                model_BanDoc banDoc = new model_BanDoc(idbd, tenbd, tendangnhap, matkhau, chucvu, email, sdt, diachi);
                lstbd.add(banDoc);
            }
            return lstbd;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int Them(model_BanDoc bd) {
        sql = "insert into BanDoc(IDBanDoc,TenBanDoc,tendn,matkhau,ChucVu,Email,SoDienThoai,DiaChi) values (?,?,?,?,?,?,?,?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, bd.getIdbd());
            ps.setObject(2, bd.getTenbd());
            ps.setObject(3, bd.getTendangnhap());
            ps.setObject(4, bd.getMatkhau());
            ps.setObject(5, bd.getChucvu());
            ps.setObject(6, bd.getEmail());
            ps.setObject(7, bd.getSdt());
            ps.setObject(8, bd.getDiachi());

            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int Sua(String id, model_BanDoc bd) {
        sql = "update BanDoc\n"
                + "set TenBanDoc = ?,tendn = ?,matkhau = ?,ChucVu = ?,Email = ?,SoDienThoai = ?,DiaChi = ?\n"
                + "where IDBanDoc = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, bd.getTenbd());
            ps.setObject(2, bd.getTendangnhap());
            ps.setObject(3, bd.getMatkhau());
            ps.setObject(4, bd.getChucvu());
            ps.setObject(5, bd.getEmail());
            ps.setObject(6, bd.getSdt());
            ps.setObject(7, bd.getDiachi());
            ps.setObject(8, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int Xoa(String id) {
        sql = "delete from BanDoc where IDBanDoc = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public model_BanDoc checkTrungMa(String id_form) {
        sql = "select IDBanDoc,TenBanDoc,tendn,matkhau,ChucVu,Email,SoDienThoai,DiaChi from BanDoc where IDBanDoc = ?";
        model_BanDoc bd = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1,id_form);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idbd;
                String tenbd;
                String tendangnhap;
                String matkhau;
                String chucvu;
                String email;
                String sdt;
                String diachi;

                idbd = rs.getString(1);
                tenbd = rs.getString(2);
                tendangnhap = rs.getString(3);
                matkhau = rs.getString(4);
                chucvu = rs.getString(5);
                email = rs.getString(6);
                sdt = rs.getString(7);
                diachi = rs.getString(8);

                model_BanDoc banDoc = new model_BanDoc(idbd, tenbd, tendangnhap, matkhau, chucvu, email, sdt, diachi);
                bd = banDoc;
            }
            return bd;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public model_BanDoc checkTrungtkdn(String tendn) {
        sql = "select IDBanDoc,TenBanDoc,tendn,matkhau,ChucVu,Email,SoDienThoai,DiaChi from BanDoc where tendn = ?";
        model_BanDoc bd = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setObject(1, tendn);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idbd;
                String tenbd;
                String tendangnhap;
                String matkhau;
                String chucvu;
                String email;
                String sdt;
                String diachi;

                idbd = rs.getString(1);
                tenbd = rs.getString(2);
                tendangnhap = rs.getString(3);
                matkhau = rs.getString(4);
                chucvu = rs.getString(5);
                email = rs.getString(6);
                sdt = rs.getString(7);
                diachi = rs.getString(8);

                model_BanDoc banDoc = new model_BanDoc(idbd, tenbd, tendangnhap, matkhau, chucvu, email, sdt, diachi);
                bd = banDoc;
            }
            return bd;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
