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
public class HocSinhChuyenToan extends HocSinhCL{

    public HocSinhChuyenToan() {
    }
    public Double getCtTb(){
        return (getToan()*2+getLy()+getHoa());
    }
    
}
