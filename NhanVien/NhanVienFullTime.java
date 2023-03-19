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
public class NhanVienFullTime extends NhanVienCL{
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem) {
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem, String ten, long luong, String loainhanvien) {
        super(ten, luong, loainhanvien);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }

   public long tinhLuong(){
       return getLuong()*getNgayLamThem();
   }
    
}
