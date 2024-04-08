/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_chuongtrinh;

/**
 *
 * @author anhso
 */
public class Model_Sach {

    private String IDSach;
    private String TieuDe;
    private String TacGia;
    private String NamXuatBan;
    private String NhaXuatBan;
    private String TheLoai;
    private int SoLuongTonKho;

    public Model_Sach() {
    }

    public Model_Sach(String IDSach, String TieuDe, String TacGia, String NamXuatBan, String NhaXuatBan, String TheLoai, int SoLuongTonKho) {
        this.IDSach = IDSach;
        this.TieuDe = TieuDe;
        this.TacGia = TacGia;
        this.NamXuatBan = NamXuatBan;
        this.NhaXuatBan = NhaXuatBan;
        this.TheLoai = TheLoai;
        this.SoLuongTonKho = SoLuongTonKho;
    }

    public String getIDSach() {
        return IDSach;
    }

    public void setIDSach(String IDSach) {
        this.IDSach = IDSach;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(String NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public int getSoLuongTonKho() {
        return SoLuongTonKho;
    }

    public void setSoLuongTonKho(int SoLuongTonKho) {
        this.SoLuongTonKho = SoLuongTonKho;
    }

    public Object[] toDataRow() {
        return new Object[]{
            this.IDSach, this.TieuDe, this.TacGia, this.NamXuatBan, this.NhaXuatBan, this.TheLoai, this.SoLuongTonKho
        };
    }
}
