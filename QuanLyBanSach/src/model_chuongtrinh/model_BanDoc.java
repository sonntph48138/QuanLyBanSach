/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_chuongtrinh;

/**
 *
 * @author anhso
 */
public class model_BanDoc {
    private String idbd;
    private String tenbd;
    private String tendangnhap;
    private String matkhau;
    private String chucvu;
    private String email;
    private String sdt;
    private String diachi;

    public model_BanDoc() {
    }

    public model_BanDoc(String idbd, String tenbd, String tendangnhap, String matkhau, String chucvu, String email, String sdt, String diachi) {
        this.idbd = idbd;
        this.tenbd = tenbd;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.chucvu = chucvu;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getIdbd() {
        return idbd;
    }

    public void setIdbd(String idbd) {
        this.idbd = idbd;
    }

    public String getTenbd() {
        return tenbd;
    }

    public void setTenbd(String tenbd) {
        this.tenbd = tenbd;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Object[] toDataRow(){
        return new Object[]{
            this.idbd,this.tenbd,this.tendangnhap,this.matkhau,this.chucvu,this.email,this.sdt,this.diachi
        };
    }
}
