/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author gemss
 */
public class tepung {
    
    public static void main(String[] args){
        
        double alas, tinggi;
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Program Perhitungan Luas Segitiga");
        System.out.print("Masukan alas               : ");
        alas = scan.nextDouble();
        System.out.print("Masukan Tinggi             : ");
        tinggi = scan.nextDouble();
        
        double luas = (alas*tinggi)/2;
        
        System.out.println("Jadi, Luas Segitiga adalah : " + luas);
        
        
    }
    
}
