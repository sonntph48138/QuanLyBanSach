/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_chuongtrinh;

/**
 *
 * @author anhso
 */
public class Model_ChiTietPhieuMuon {
    private String IDChiTietPhieuMuon;
    private String IDPhieuMuon;
    private String IDSach;
    private int SoLuongSachMuon;

    public Model_ChiTietPhieuMuon() {
    }

    public Model_ChiTietPhieuMuon(String IDChiTietPhieuMuon, String IDPhieuMuon, String IDSach, int SoLuongSachMuon) {
        this.IDChiTietPhieuMuon = IDChiTietPhieuMuon;
        this.IDPhieuMuon = IDPhieuMuon;
        this.IDSach = IDSach;
        this.SoLuongSachMuon = SoLuongSachMuon;
    }

    public String getIDChiTietPhieuMuon() {
        return IDChiTietPhieuMuon;
    }

    public void setIDChiTietPhieuMuon(String IDChiTietPhieuMuon) {
        this.IDChiTietPhieuMuon = IDChiTietPhieuMuon;
    }

    public String getIDPhieuMuon() {
        return IDPhieuMuon;
    }

    public void setIDPhieuMuon(String IDPhieuMuon) {
        this.IDPhieuMuon = IDPhieuMuon;
    }

    public String getIDSach() {
        return IDSach;
    }

    public void setIDSach(String IDSach) {
        this.IDSach = IDSach;
    }

    public int getSoLuongSachMuon() {
        return SoLuongSachMuon;
    }

    public void setSoLuongSachMuon(int SoLuongSachMuon) {
        this.SoLuongSachMuon = SoLuongSachMuon;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            this.IDChiTietPhieuMuon,this.IDPhieuMuon,this.IDSach,this.SoLuongSachMuon
        };
    }
}
