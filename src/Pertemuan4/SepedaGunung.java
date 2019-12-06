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
public class SepedaGunung extends Sepeda {
    
    private int sadel;
    
    void setSadel(int jumlah){
        sadel = getGir() - jumlah;
    }
    
    int getSadel(){
        return sadel;
    }
    
    
    public static void main(String[] args){
        SepedaGunung sgn = new SepedaGunung();
        
        sgn.setGir(3);
        System.out.println(sgn.getGir());
        
        sgn.setSadel(1);
        System.out.println(sgn.getSadel());
    }
}
 
