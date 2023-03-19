/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienCL {
    private String ten;
    private long luong;
    private String loainhanvien;

    public NhanVienCL() {
    }

    public NhanVienCL(String ten, long luong, String loainhanvien) {
        this.ten = ten;
        this.luong = luong;
        this.loainhanvien = loainhanvien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public String getLoainhanvien() {
        return loainhanvien;
    }

    public void setLoainhanvien(String loainhanvien) {
        this.loainhanvien = loainhanvien;
    }

   
        
}

