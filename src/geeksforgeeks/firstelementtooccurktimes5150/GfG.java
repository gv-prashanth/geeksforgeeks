package geeksforgeeks.firstelementtooccurktimes5150;

//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

/*
https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1/

Sample Input
1
7 2
1 7 4 3 4 8 7
*/

public class GfG { 
public static void main (String[] args) throws IOException  {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int t = Integer.parseInt(br.readLine().trim());
 while(t-->0){
     String inputLine[] = br.readLine().trim().split(" ");
     int n = Integer.parseInt(inputLine[0]);
     int m = Integer.parseInt(inputLine[1]);
     int[] arr = new int[n];
     inputLine = br.readLine().trim().split(" ");
     for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
     
     Solution obj = new Solution();
     System.out.println(obj.firstElementKTime(arr, n, m));
 }
}
}
//} Driver Code Ends


class Solution
{
 public int firstElementKTime(int[] a, int n, int k) { 
     Map<Integer, Integer> numberOfTimes = new HashMap<>();
     for(int i=0; i <n; i++) {
         int num = a[i];
         if(numberOfTimes.containsKey(num))
             numberOfTimes.put(num, numberOfTimes.get(num)+1);
         else
             numberOfTimes.put(num, 1);
         if(numberOfTimes.get(num) >=k)
             return num;
     }
     return -1;
 }
}