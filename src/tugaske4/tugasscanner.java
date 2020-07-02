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
public class tugasscanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //type data yang akan di gunakan
        String nama,alamat;
        int usia,tahunlulus;
        double beratbadan;
        
        //New Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //output to user
        System.out.println("!!! biodata mahasiswa baru!!!");
        System.out.println("nama mahasiswa");
        //apa yang di simpan yang di type data
        nama = keyboard.nextLine();
        // tampilkan output
        System.out.println("hobi");
        String hobi = keyboard.nextLine();
        
        System.out.println("status");
        String status = keyboard.nextLine();
        
        System.out.println("tempat");
        String tempat = keyboard.nextLine();
        
        System.out.println("tanggal lahir");
        int tanggalLahir = keyboard.nextInt();
        
        System.out.println("suhu badan");
        double suhuBadan = keyboard.nextDouble();
        
        //output dari input
        System.out.println("#####");
        System.out.println("nama alamat;" + nama);
        System.out.println("hobi;" + hobi);
        System.out.println("status;" + status);
        System.out.println("tempat;" + tempat);
        System.out.println("tanggal lahir;" + tanggalLahir);
        System.out.println("suhu badan;" + suhuBadan);
       
   
      
        
        
    }
    
}
