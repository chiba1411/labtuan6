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
public class NhanVienPartTime extends NhanVienCL {
    private int giolamthem;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(int giolamthem) {
        this.giolamthem = giolamthem;
    }

    public NhanVienPartTime(int giolamthem, String ten, long luong, String loainhanvien) {
        super(ten, luong, loainhanvien);
        this.giolamthem = giolamthem;
    }

    public int getGiolamthem() {
        return giolamthem;
    }

    public void setGiolamthem(int giolamthem) {
        this.giolamthem = giolamthem;
    }
    public long tingluong(){
        return getGiolamthem()*getLuong();
    }
    
}
