package geeksforgeeks.checkforbst;

public class Solution
{
 //Function to check whether a Binary Tree is BST or not.
 boolean isBST(Node root)
 {
     if(root.left != null && root.right != null)
         return getMax(root.left) < root.data && getMin(root.right) > root.data && isBST(root.left) && isBST(root.right);
     else if(root.left == null && root.right != null)
         return getMin(root.right) > root.data && isBST(root.right);
     else if(root.left != null && root.right == null)
         return getMax(root.left) < root.data && isBST(root.left);
     else
         return true;
 }
 
 int getMax(Node root)
 {
     int max = root.data;
     if(root.left != null){
         int leftMax = getMax(root.left);
         if(leftMax  > max)
             max = leftMax;
     }
     if(root.right != null){
         int rightMax = getMax(root.right);   
         if(rightMax > max)
             max = rightMax;
     }
     return max;
 }
 
 int getMin(Node root)
 {
     int min = root.data;
     if(root.left != null){
         int leftMin = getMin(root.left);
         if(leftMin < min)
             min = leftMin;
     }
     if(root.right != null){
         int rightMin = getMin(root.right);
         if(rightMin < min)
             min = rightMin;       
     }
     return min;
 }
 
 
}