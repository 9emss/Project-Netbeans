/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author gemss
 */
public class Kubus extends Persegi {
    
    public Kubus(int s){
        sisi = s;
    }
    
    public int getLuasKubus(){
        return(6*getLuasPersegi());
    }
    
    public int getVolumeKubus(){
        return(sisi*getLuasKubus());
    }
    
    public void getCetak(){
        System.out.println("");
        System.out.println("Keliling Persegi : " + getKelPersegi());
        System.out.println("Luas Persegi     : " + getLuasPersegi());
        System.out.println("Luas Kubus       : " + getLuasKubus());
        System.out.println("Volume Kubus     : " + getVolumeKubus());

    }
    
}
