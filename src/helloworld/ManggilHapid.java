/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author gemss
 */
public class ManggilHapid {
    
    public static void main(String[] args){
        
        // Instansiasi Objek
        kelasnyaHapid mhs = new kelasnyaHapid();
        matkul mkl = new matkul();
        
        // Penentuan Variable
        mkl.kMatkul = "666";
        mkl.nMatkul = "OOP";
        mkl.sks = "3";
        
        
        // Pemanggilan Objek
        System.out.println("Data Mahasiswa Kampusku");
        System.out.println("Nama        : " + mhs.nMhs);
        System.out.println("NIM         : " + mhs.Nim);
        System.out.println("Jurusan     : " + mhs.jrsn);
        System.out.println("---------------------------------");
        System.out.println("Kode Matkul : " + mkl.kMatkul);
        System.out.println("Matkul      : " + mkl.nMatkul);
        System.out.println("SKS         : " + mkl.sks);


    }
    
}
