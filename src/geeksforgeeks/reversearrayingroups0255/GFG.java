package geeksforgeeks.reversearrayingroups0255;

import java.io.*;
import java.util.*;
/*
https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1/

Sample Input
1
5 3
1 2 3 4 5
*/

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        
        //while testcases exist
        while(t-->0){
            
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            
            ArrayList<Integer> arr = new ArrayList<>();            
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }
            
            Solution obj = new Solution();
            obj.reverseInGroups(arr, n, k);
            
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        Stack<Integer> myStack = new Stack<Integer>();
        int group = 1;
        for(int i =0; i < n; i++){
            if(i>=group*k){
                //empty stack
                int start = (group-1)*k;
                while(!myStack.empty()){
                    arr.set(start, myStack.pop());
                    start++;
                }
                group++;
            }
            myStack.push(arr.get(i));
        }
        int start = (group-1)*k;
        while(!myStack.empty()){
            arr.set(start, myStack.pop());
            start++;
        }
    }
}
