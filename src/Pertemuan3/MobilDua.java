/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author gemss
 */
public class MobilDua {
    
    String warna;
    int thnProduksi;
    
    void printMobil(){
        System.out.println("Warna          : " + warna);
        System.out.println("Tahun Produksi : " + thnProduksi);
    }
    
    public static void main(String[] args){
        
        MobilDua mD = new MobilDua();
        
        mD.warna = "Hitam";
        mD.thnProduksi = 1997;
        
        mD.printMobil();
    }
    
}
