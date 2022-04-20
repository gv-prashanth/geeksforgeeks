package geeksforgeeks.convertarrayintozigzagfashion1638;
//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

/*
https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1/

Sample Input
1
7
4 3 7 8 6 2 1
*/

public class Main {

 public static void main(String[] args) throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int tc = Integer.parseInt(br.readLine().trim());
     while (tc-- > 0) {
         String[] inputLine;
         int n = Integer.parseInt(br.readLine().trim());
         int[] arr = new int[n];
         inputLine = br.readLine().trim().split(" ");
         for (int i = 0; i < n; i++) {
             arr[i] = Integer.parseInt(inputLine[i]);
         }

         new Solution().zigZag(arr, n);
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
         System.out.println();
     }
 }
}// } Driver Code Ends


//User function Template for Java


class Solution {
 void zigZag(int arr[], int n) {
     boolean increasingMode = true;
     for(int i=1; i<n; i++){
         if(increasingMode){
             if(arr[i-1] < arr[i]){
                 //cool. Notin to do   
             }else{
                 int temp = arr[i-1];
                 arr[i-1] = arr[i];
                 arr[i] = temp; 
             }
         }else{
             if(arr[i-1] > arr[i]){
                 //cool. Notin to do   
             }else{
                 int temp = arr[i-1];
                 arr[i-1] = arr[i];
                 arr[i] = temp; 
             }
         }
         increasingMode = !increasingMode;
     }
 }

}