/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;
    import java.util.Scanner;

/**
 *
 * @author Sameh
 */
public class fibonacci {

  private static long calc_fib(int n) {
   int arr[]=new int[n+1];
   arr[0] = 0;
   if (n>0)
   arr[1] = 1;
   for (int i=2;i<n+1;i++)
       arr[i]= arr[i-1] + arr[i-2];
    return arr[n];
  }

    /**
     *
     * @param args
     */
   /* public  static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }*/
}


