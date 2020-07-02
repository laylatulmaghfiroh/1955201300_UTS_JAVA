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
public class percabanganSWITCHCASE {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null,"tulis nama anda");
        String alamat = JOptionPane.showInputDialog(null,"tulis alamat anda");
        String kewarganegaraan = JOptionPane.showInputDialog(null,"tulis kewarganegaraan");
        String agama = JOptionPane.showInputDialog(null,"tulis agama anda");
        String kelas = JOptionPane.showInputDialog(null,"masuk kelas apa anda");
        
        switch (kelas) {
            case "A":
                JOptionPane.showInputDialog(null,"silahkan" + nama + "anda bisa masuk ke kelas A");
                break;
            case "B":
                JOptionPane.showInputDialog(null,"silahkan" + nama + "anda bisa masuk ke kelas B");
                break;
            case "C":
                JOptionPane.showInputDialog(null,"silahkan" + nama + "anda bisa masuk ke kelas C");
                break;
            default: JOptionPane.showMessageDialog(null, "maaf kelas yang anda masukkan tidak tersedia");
        }
    }
}
 