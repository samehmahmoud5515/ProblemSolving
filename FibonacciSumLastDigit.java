/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
    import java.util.Scanner;

/**
 *
 * @author Sameh
 */
public class FibonacciSumLastDigit {
     private static long getFibonacciSum(int n) {
         long arr[]=new long[n];
         long sum = 0;
   arr[0] = 0;
   if (n>0)
   { arr[1] = 1;
   
   sum=1;
   }
   for (int i=2;i<n;i++)
   { arr[i]= arr[i-1] + arr[i-2];
  // System.out.println(arr[i]);
   
   sum+=arr[i];
   }
    return sum-1;
    
    }
    
    
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long s = getFibonacciSum(n);
        
        
        System.out.println(s);
    }*/

}
