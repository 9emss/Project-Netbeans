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
public class bil {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan Pertama : ");
        int bil1 = scan.nextInt();
        System.out.print("Masukan Bilangan KEdua   : ");
        int bil2 = scan.nextInt();
        System.out.println("Hasil Bilangan           : " + (bil1 * bil2));
        
    }
    
}
