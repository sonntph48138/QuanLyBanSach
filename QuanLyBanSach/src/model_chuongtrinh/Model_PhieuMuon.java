/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_chuongtrinh;

/**
 *
 * @author anhso
 */
public class Model_PhieuMuon {

    private String IDPhieuMuon;
    private String IDBanDoc;
    private String IDNhanVien;
    private String NgayMuon;
    private String NgayTra;

    public Model_PhieuMuon() {
    }

    public Model_PhieuMuon(String IDPhieuMuon, String IDBanDoc, String IDNhanVien, String NgayMuon, String NgayTra) {
        this.IDPhieuMuon = IDPhieuMuon;
        this.IDBanDoc = IDBanDoc;
        this.IDNhanVien = IDNhanVien;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
    }

    public String getIDPhieuMuon() {
        return IDPhieuMuon;
    }

    public void setIDPhieuMuon(String IDPhieuMuon) {
        this.IDPhieuMuon = IDPhieuMuon;
    }

    public String getIDBanDoc() {
        return IDBanDoc;
    }

    public void setIDBanDoc(String IDBanDoc) {
        this.IDBanDoc = IDBanDoc;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public Object[] toDataRow() {
        return new Object[]{
            this.IDPhieuMuon,this.IDBanDoc,this.IDNhanVien, this.NgayMuon,this.NgayTra
        };
    }
}
