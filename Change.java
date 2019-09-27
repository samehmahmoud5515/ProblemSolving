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

public class Change {
    private static int getChange(int n) {
        //write your code here
		int res = 0;
		res = res + n/10;
		n = n % 10;
		res = res + n/5;
		n = n % 5;
		n = n + res;
        return n;
    }

  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }*/
}
