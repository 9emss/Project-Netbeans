/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author gemss
 */
public class MobilBekas {
    
    public static void main(String[] args){
        
        Mobil mobilHapid = new Mobil();
        
        mobilHapid.warna = "Pink";
        mobilHapid.tahunProduksi = 1934;
        
        System.out.println("warna         : " + mobilHapid.warna);
        System.out.println("Tahun Produksi: " + mobilHapid.tahunProduksi);

        
    }
    
}
