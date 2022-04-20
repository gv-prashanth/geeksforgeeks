package geeksforgeeks.checkiftwoarraysareequalornot3847;

//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;

/*
https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/

Sample Input
1
5
1 2 5 4 0
2 4 5 0 1
*/

class GFG {
public static void main (String[] args) {
 Scanner sc=new Scanner(System.in);
 
 long t=sc.nextLong();
 
 while(t-->0)
 {
   int n=sc.nextInt();
   long arr[]=new long[n];
   long brr[]=new long[n];
   
   for(int i=0;i<n;i++)
   {
       arr[i]=sc.nextLong();
   }
   
   for(int i=0;i<n;i++)
   {
       brr[i]=sc.nextLong();
   }
   Solution ob = new Solution();
   System.out.println(ob.check(arr,brr,n)==true?"1":"0");
   
   
 }
}
}// } Driver Code Ends


//User function Template for Java

class Solution{
 //Function to check if two arrays are equal or not.
 public static boolean check(long A[],long B[],int N)
 {
     Map<Long, Integer> valuesOfA = new HashMap<>();
     for(int j =0; j<N; j++){
         long i = A[j];
         if(!valuesOfA.containsKey(i))
             valuesOfA.put(i, 1);
         else {
             valuesOfA.put(i, valuesOfA.get(i)+1);
         }
     }
     for(int j =0; j<N; j++){
         long i = B[j];
         if(!valuesOfA.containsKey(i)){
             return false;
         }
         else {
             valuesOfA.put(i, valuesOfA.get(i)-1);
         }
     }
     if(valuesOfA.values().stream().anyMatch(x -> x!=0)){
         return false;   
     }
     return true;
 }
}