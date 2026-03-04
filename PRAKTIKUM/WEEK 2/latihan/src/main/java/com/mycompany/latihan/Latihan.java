/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan;

/**
 *
 * @author ASUS A15
 */
public class Latihan {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(n);
        double x = 12;
        float z = 122;
        System.out.println(z);
        final int a = 10;
        System.out.println("");
        System.out.println(a);
        /*a = 60;*/
        System.out.println(a);
        System.out.println("");
        System.out.println(x);
        System.out.println("Array:");
        int[][] durian = {
            {2,1},
            {2,1}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(durian[i][j] + " pisahin ");
            }
            System.out.println("New line ");
        }
        System.out.println(durian);
        
        System.out.println("");
        System.out.println("Hello World!");
    }
}
