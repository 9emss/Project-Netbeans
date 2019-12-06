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
public class Sepeda {
    
    public int gir;
    
    void setGir(int pertambahanGir){
        
        gir = getGir() + pertambahanGir;
        
    }
    
    int getGir(){
        
        return gir;
        
    }
    
    
    public static void main(String[] args){
        
        Sepeda bicycle = new Sepeda();
        
        bicycle.setGir(1);
        
        bicycle.setGir(3) ;
        
        System.out.println("Gir Saat ini : " + bicycle.getGir());
    }
    
}
