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
public class percabanganIfElse {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null,"tulis nama anda");
        String alamat = JOptionPane.showInputDialog(null,"tulis alamat anda");
        String kewarganegaraan = JOptionPane.showInputDialog(null,"tulis kewarganegaraan anda");
        String agama = JOptionPane.showInputDialog(null,"tulis agama anda");
        
        int umur = Integer.parseInt(JOptionPane.showInputDialog(null,"berapa umur anda"));
        int usia;
        
        if (umur >= 19){
            JOptionPane.showInputDialog(null,"selamat " + nama + "selamat anda telah berhasil,silakan keluar");
        }else{
            JOptionPane.showInputDialog(null,"maaf" + nama + "umur anda belum cukup,silahkan mengulang tahun depan");
        }
    }
  
}
    

