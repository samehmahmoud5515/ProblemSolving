/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Sameh
 */


public class BinarySearch {

    static int binarySearch(int[] a, int key) {
        int left = 0, right = a.length-1;
        //write your code here
        int index = BinarySearchHelper(a,left,right,key);
        
        
        
        return index;
    }
    
   static int BinarySearchHelperREC(int[] a, int left, int right,int k)
    {
      if (right < left) {
			return -1;
		}
	
		int mid = (left + right) / 2;
		if (k > a[mid]) {
			return BinarySearchHelperREC(a, mid + 1, right,k);
		} else if (k < a[mid]) {
			return BinarySearchHelperREC(a, left, mid - 1,k);
		} else {
			return mid;
		}
    }
    
   static int BinarySearchHelper(int[] a, int left ,int right, int k)
    {
        while ( left <= right )
        {
            int mid =  (right + left) /2 ;
            if (k == a[mid]) return mid;
            else if (k<a[mid])
            {
               right = mid - 1;
            }
            else
            {
                left = mid +1 ;
            }

        }
         
          
        return -1;
    }

   
    /*public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
        }
    }*/
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

