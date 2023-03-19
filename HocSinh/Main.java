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
public class Main {
    
    public static void main(String[] args) {
        HocSinhChuyenToan ct= new HocSinhChuyenToan(); 
        ct.setHo("mai");
        ct.setTen("ba");
        ct.setLop("cntt3");
        ct.setHoa(5);
        ct.setToan(5);
        ct.setLy(0);
        
        System.out.println(ct.getCtTb());
    }
}
