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
public class Nilai_Jawa {
    
    int nilai1, nilai2;
    
    public Nilai_Jawa(){
        
    }
    
    public int getNilai(int a, int b){
        return(a*b);
    }
    
    void getCetak(){
        System.out.println("Konsep Dasar OOP");
        System.out.println("Nilai Java : " + getNilai(10,20));
    }
    
}
