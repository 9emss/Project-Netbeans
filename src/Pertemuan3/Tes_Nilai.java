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
public class Tes_Nilai {
    
    int nilai1 = 10, nilai2 = 20;
    
    public int getNilai(){
        return(nilai1*nilai2);
    }
    
    void cetakNilai(){
        System.out.println("Test Nilai");
        System.out.println("Nilai Tes  : " + getNilai());
    }
    
    
}
