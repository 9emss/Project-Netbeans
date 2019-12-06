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
public class HeyManusia {
    
    String jKelamin = "Wanita", wRambut = "Violet";
    
    int usia = 27;
    
    void getCetak(){
        
        System.out.println("Jenis Kelamin : " + jKelamin);
        System.out.println("Warna Rambut  : " + wRambut);
        System.out.println("Usia          : " + usia);
        
    }
    
    public static void main(String[] args){
        
        HeyManusia hM = new HeyManusia();
        
        System.out.println("Konsep Dasar OOP");
        hM.getCetak();
    }
    
}
