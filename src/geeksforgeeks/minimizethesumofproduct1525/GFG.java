package geeksforgeeks.minimizethesumofproduct1525;

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
/*
https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1/

Sample Input
1
3
3 1 1
6 5 4
*/
class GFG {
  public static void main(String[] args) throws IOException
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.minValue(a, b, n));
        }
  }
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        long toReturn = 0;
        for(long i=0; i<n; i++){
            long mul = a[(int) i]*b[(int) (n-1-i)];
            toReturn = toReturn + mul;
        }
        return toReturn;
    }
}