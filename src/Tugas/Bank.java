/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author gemss
 */
public class Bank {
    
    int saldo;
    
    //Construct
    public Bank(int saldo){
        this.saldo = saldo;
    }
    
    public void simpanUang(int value){
        saldo += value;
    }
    
    public void ambilUang(int value){
        saldo -= value;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
   
    
    //Class Aksi Bank
    public static void main(String[] args){
        
        int simpan, ambil;
        
        //Deklarasi Scanner
        Scanner scan = new Scanner(System.in);
        
        //Deklarasi objek dari class bank
        Bank bk = new Bank(100000);
        
        System.out.println("Selamat Datang Di Bank ABC");
        System.out.println("Saldo Saat ini : Rp." + bk.getSaldo());
        System.out.print("Simpan Uang    : Rp.");simpan = scan.nextInt();
        bk.simpanUang(simpan);
        System.out.println("--------------------------");
        System.out.println("Saldo Saat ini : Rp." + bk.getSaldo());
        System.out.print("Ambil Uang     : Rp."); ambil = scan.nextInt();
        bk.ambilUang(ambil);
        System.out.println("--------------------------");
        System.out.println("Saldo Saat ini : Rp." + bk.getSaldo());
        
    }
    
}
