//977. Squares of a Sorted Array
//https://leetcode.com/problems/squares-of-a-sorted-array/

//O(n log n ) approach
class Solution {
    public int[] sortedSquares(int[] A) {
        
        //squares array
        for(int i=0;i< A.length;i++) {
           A[i]= A[i]*A[i]; 
        }
        Arrays.sort(A);//log(nlogn)
        return A; //I cannot just return Arrays.sort(A);
    }
}

//O(n) approach
//Needs to fix
class Solution {
    public int[] sortedSquares(int[] A) {
        
        //squares array's values
        for(int i=0;i< A.length;i++) {
           A[i]= A[i]*A[i]; 
        }
        
        //sorting with a while loop, we can do this since it is partially sorted array
        //the left and right last vals will always be the biggest values
        //so the inside values will always be in range
        int left=0;
        int right=A.length-1;
        boolean check=false;
        
        while(left<=right){
            if(A[right]<A[left]){
                if(A[left+1]>=A[left]){
                  check=true;  
                }
                int temp=A[left];
                A[left]=A[right];
                A[right]=temp;
                right--;
                if(check){
                    left++;
                    check=false;
                }
            } else{
                right--;
                
            }
        }
        return A; //I cannot just return Arrays.sort(A);
    }
}