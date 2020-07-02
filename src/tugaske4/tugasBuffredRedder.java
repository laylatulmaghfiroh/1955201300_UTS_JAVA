/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class tugasBuffredRedder {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader (System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        String nama ;
        String alamat ;
        String citaCita ;
        String pekerjaan ;
        String status ;
        int tanggalLahir ;
        int umur  ;
        double suhuBadan ;
        double beratBadan ;
     
        
        System.out.println("#######");
        
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("dimana alamat anda?");
        alamat = br.readLine();
        
        System.out.println("apa cita cita anda?");
        citaCita = br.readLine();
        
        System.out.println("apa pekerjaan anda?");
        pekerjaan = br.readLine();
        
        System.out.println("apa status anda?");
        status = br.readLine();
        
        System.out.println("apa tanggal lahir?");
        tanggalLahir = Integer.parseInt(br.readLine());
        
        System.out.println("berapa umur anda?");
        umur = Integer.parseInt(br.readLine());
        
        System.out.println("berapa suhu badan anda?");
        suhuBadan = Double.parseDouble(br.readLine());
        
        System.out.println("berapa berat badan anda?");
        beratBadan = Double.parseDouble(br.readLine());
        
        System.out.println("#######");
        System.out.println("nama anda siapa ;" + nama);
        System.out.println("dimana alamat anda ;" + alamat);
        System.out.println("apa cita cita anda ;" + citaCita);
        System.out.println("apa pekerjaan anda ;" + pekerjaan);
        System.out.println("apa status anda ;" + status);
        System.out.println("berapa tanggal lahir anda ;" + tanggalLahir);
        System.out.println("berapa umur anda ;" + umur);
        System.out.println("berapa suhu badan anda ;" + suhuBadan);
        System.out.println("berapa berat badan anda ;" + beratBadan);
         
        
        
        
        
    }
}
