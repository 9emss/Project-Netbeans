/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author gemss
 */
public class Handphone {
    
      
    //Data Obat
    void Hidupkan(){

        String k_Obat , n_Obat;

        k_Obat = "Ptml";
        n_Obat = "Paracetamol";

        System.out.println("|==========================|");
        System.out.println("|        Data Obat         |");
        System.out.println("|==========================|");
        System.out.println("|Kode Obat   : " + k_Obat + "        |");
        System.out.println("|Nama Obat   : " + n_Obat + " |");
        System.out.println("----------------------------");

    }
    
    
    //Data Dokter
    public static class DataDokter{
        
        void Panggilan(){

           String k_Dokter, n_Dokter; 

            k_Dokter = "SC";
            n_Dokter = "Steven Chou";

            System.out.println("|==========================|");
            System.out.println("|       Data Dokter        |");
            System.out.println("|==========================|");
            System.out.println("|Kode Dokter : " + k_Dokter + "          |");
            System.out.println("|Nama Dokter : " + n_Dokter + " |");
            System.out.println("----------------------------");

        }
    }
    
    //Data Pembayaran
    private static class Sms {

        public String getNomor(String a){
         
            return(a);
        
        }
        
        public int getHarga(int a){
            
            return(a);
        
        }
        
        void cetakPembayaran() {
            
        
        System.out.println("|==========================|");
        System.out.println("|         Pembayaran       |");
        System.out.println("|==========================|");
        System.out.println("|No. Kuwitansi : " + getNomor("001       ") + "|");
        System.out.println("|Bayar         : Rp." + getHarga(100000) + " |");
        System.out.println("----------------------------");
          
            
        }
    }
    
    //Data Pasien
    public static class Matikan{
        
        public String getPasien(String pas){
            return(pas);
        }
        
        void cetakPasien(){
            System.out.println("|==========================|");
            System.out.println("|        Data Pasien       |");
            System.out.println("|==========================|");
            System.out.println("|Kode Pasien : " + getPasien("MBK    ") + "     |");
            System.out.println("|Nama Pasien : " + getPasien("Mabar Kuy   ") + "|");
            System.out.println("----------------------------");
        
        }
        
    }
    
    
    public static void main(String[] args){
        
        Handphone hp = new Handphone();
        Handphone.DataDokter dok = new Handphone.DataDokter();
        Handphone.Sms sms = new Handphone.Sms();
        Handphone.Matikan pas = new Handphone.Matikan();
        
        //Mencetak Data Obat
        hp.Hidupkan();
        //Mencetak Data Dokter
        dok.Panggilan();
        //Mencetak Data Pasien
        pas.cetakPasien();
        //Mencetak Data Pembayaran
        sms.cetakPembayaran();
    }
    
}
