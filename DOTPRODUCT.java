/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sameh
 */
public class DOTPRODUCT {
    private static long maxDotProduct(int[] a, int[] b) {
         if(a.length <= 0 || b.length <= 0)
             return 0;

        Arrays.sort(a);
        Arrays.sort(b);
        int aLength =a.length;
        long res = 0;
        for (int i = 0; i < aLength; i++) {
            res = res + (long) a[i] * b[i];  
        }
        return res;
    }

 /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }*/
}