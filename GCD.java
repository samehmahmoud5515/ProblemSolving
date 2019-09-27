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
public class GCD {
     private static int gcd(int a, int b) {
    if (b == 0)
		return a;
	return gcd(b, a%b);

  }

 /* public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd(a, b));
  }*/

}
