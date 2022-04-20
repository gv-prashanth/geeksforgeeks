package geeksforgeeks.binarysearch1587115620;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

/*
https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1/

Sample Input
1
5
1 2 3 4 5 
4
*/

public class GFG {
 public static void main (String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T>0)
     {
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
          
         int key =sc.nextInt();
         Solution g = new Solution();
         System.out.println(g.binarysearch(arr,n,key));
         T--;
     }
 }
}

//} Driver Code Ends


//User function Template for Java

class Solution {
 int[] input;
 int toSearch;
 
 int binarysearch(int arr[], int n, int k){
     input = arr;
     toSearch = k;
     return searchFrom(0, n-1);
 }
 int searchFrom(int start, int end){
     int mid = start + (end - start)/2;
     if(end >= start){
         if(input[mid] == toSearch)
             return mid;
         else if(toSearch < input[mid])
             return searchFrom(start, mid-1);
         else if(toSearch > input[mid])
             return searchFrom(mid+1, end);
     }
     return -1;
 }
}