/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocSinh;

/**
 *
 * @author Admin
 */
public class HocSinhCL {
    private String ho;
    private String ten;
    private String lop;
    private double toan;
    private double ly;
    private double hoa;
    private double tb;

    public HocSinhCL() {
    }

    public HocSinhCL(String ho, String ten, String lop, double toan, double ly, double hoa, double tb) {
        this.ho = ho;
        this.ten = ten;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.tb = tb;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public  double getTb() {
        return (getHoa()+getLy()+getToan()/3);
    }

    public  void setTb(double tb) {
        this.tb = tb;
    }
    
    
  
    
    
}
