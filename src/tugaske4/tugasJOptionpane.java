/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class tugasJOptionpane {
    public static void main(String[] args) {
        
        
        String tanya = JOptionPane.showInputDialog("siapa nama anda");
        String alamat = JOptionPane.showInputDialog("dimana alamat anda");
        String citaCita = JOptionPane.showInputDialog("apa cita cita mu");
        String umur = JOptionPane.showInputDialog("berapa umur anda");
        String pekerjaan = JOptionPane.showInputDialog("apa pekerjaan anda");
        String tanggalLahir = JOptionPane.showInputDialog("apa tanggalLahir anda");
        String beratbadan = JOptionPane.showInputDialog("berapa berat badan anda");
        String status = JOptionPane.showInputDialog("apa status anda");
        String suhuBadan = JOptionPane.showInputDialog("berapa suhu badan anda");
        
        int jumlah = Integer.parseInt(umur);
        int banyaknyamahasiswa = 2000;
        double total = jumlah*banyaknyamahasiswa;
        
        System.out.println("siapa nama anda;" + tanya);
        System.out.println("dimana alamat anda;" + alamat);
        System.out.println("apa cita cita mu;" + citaCita);
        System.out.println("berapa umur anda;" + umur);
        System.out.println("apa pekerjaan anda;" + pekerjaan);
        System.out.println("apa tanggal lahir anda;" + tanggalLahir);
        System.out.println("berapa berat badan anda;" + beratbadan);
        System.out.println("apa status anda;" + status);
        System.out.println("berapa suhu badan anda;" + suhuBadan);
        
        
        
         
                
    }
}
