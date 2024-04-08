/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_chuongtrinh;

/**
 *
 * @author anhso
 */
public class Model_TacGia {

    private String IDTacgia;
    private String TenTacGia;

    public Model_TacGia() {
    }

    public Model_TacGia(String IDTacgia, String TenTacGia) {
        this.IDTacgia = IDTacgia;
        this.TenTacGia = TenTacGia;
    }

    public String getIDTacgia() {
        return IDTacgia;
    }

    public void setIDTacgia(String IDTacgia) {
        this.IDTacgia = IDTacgia;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public Object[] toDataRow() {
        return new Object[]{
            this.IDTacgia, this.TenTacGia
        };
    }
}
