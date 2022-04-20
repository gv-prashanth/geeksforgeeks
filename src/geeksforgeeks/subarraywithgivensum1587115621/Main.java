package geeksforgeeks.subarraywithgivensum1587115621;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
/*
https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/

Sample Input
1
5 12
1 2 3 7 5

1
10 15
1 2 3 4 5 6 7 8 9 10

Its Correct output is:

1 5
*/

class Main{
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int t = sc.nextInt();

     for (int i = 0; i < t; i++) {
         int n = sc.nextInt();
         int s = sc.nextInt();

         int[] m = new int[n];
         for (int j = 0; j < n; j++) {
             m[j] = sc.nextInt();
         }
         
         Solution obj = new Solution();
         ArrayList<Integer> res = obj.subarraySum(m, n, s);
         for(int ii = 0;ii<res.size();ii++)
             System.out.print(res.get(ii) + " ");
         System.out.println();
     }
 }

}// } Driver Code Ends


class Solution
{
 //Function to find a continuous sub-array which adds up to a given number.
 static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
 {
   ArrayList<Integer> toReturn = new ArrayList<>();
   int leftPointer = 0;
   int rightPointer = 0;
   while(true) {
     break;
   }
   return toReturn;
 }
}