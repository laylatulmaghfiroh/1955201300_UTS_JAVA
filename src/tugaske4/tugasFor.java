/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import static javafx.scene.input.KeyCode.I;

/**
 *
 * @author User
 */
public class tugasFor {
    public static void main(String[] args) {
        int n = 5;
        String Pel = "";
        System.out.println("mulai");
        System.out.println("ambil alat pel");
        System.out.println("cuci kain pel menggunakan air bersih");
        System.out.println("peras kain pel");
        System.out.println("lalu pel lantai");
        
        String pel;
        pel = "bersih";
        System.out.println("apakah lantai sudah bersih");
        if("bersih".equals(pel)) {
        }
        else {
            System.out.println("belum bersih");
        } 
        for (int i =1; i <n; i++){
            System.out.println("pel lantai lagi-" + I);
        }
        
            System.out.println("selesai");
            
            
                
    }
}
