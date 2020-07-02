/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class perulanganUTS {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("==========================");
        System.out.println("     MINI MARKET      ");
        System.out.println("==========================");
        
        System.out.println("Masukan jumlah barang yang akan anda beli");
        int beli = input.nextInt();
        
        for (int i = 1; i<=beli; i++)
        {
            System.out.println("Masukkan nama barang ke- "+i+" : ");
            String nama = input.next();
            System.out.println("Masukkan harga barang ke- "+i+" : ");
            int harga = input.nextInt();
            System.out.println("masukkan jumlah barang ke- "+i+" : ");
            int Jumlahb = input.nextInt();
            System.out.println("");
            
            System.out.println("==================================");
            System.out.println("Nama barang   :  "+nama);
            System.out.println("Harga barang  :  "+harga);
            System.out.println("jumlah barang : "+Jumlahb);
            System.out.println("==================================");
            
            int total,totalb, diskon =0;
            total = harga * Jumlahb;
            System.out.println("total belanja  = Rp."+total);
            if (total >=50000){
                diskon = total/5;
            }else {diskon = 0;}
            
            System.out.println("Diskon  = Rp."+diskon);
            totalb = total - diskon;
            System.out.println("Total Bayar  = Rp."+totalb);
            
            System.out.println("Uang Bayar = Rp.");
            int bayar = input.nextInt();
            
            int kembali = bayar - totalb;
            System.out.println("Uang Kembali = Rp."+kembali);
            System.out.println("==================================");
            System.out.println("");
            
            
        }   
        
    }
  
}
