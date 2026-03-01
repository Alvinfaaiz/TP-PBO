/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod2_103012400229;

/**
 *
 * @author ASUS A15
 */
public class TP_MOD2_103012400229 {

    public static void main(String[] args) {
        
        int [][] m1 = {
            {3, -2},
            {4, 5}
        };
        
        int [][] m2 = {
            {5, 1},
            {-1, 2}
        };
        
        int [][] kali = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    kali[i][j] = kali[i][j] + (m1[i][k] * m2[k][j]) ;
                }
            }
        }
        
        System.out.println("\nHasil perkalian matriks: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(kali[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
