//1342. Number of Steps to Reduce a Number to Zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps (int num) {
        if(num == 0) return 0;
        if(num == 1) return 1; //might delete later;
        /*
        Steps
        1) while loop while num is not equals to zero
        2) reduce until num is equals to zero
        */
        int result=0;
        while(num !=0){
            if(isEven(num)){
                num=num/2;
            } else {
                num--;    
            }
            result++;
        }
        return result;
    }
    
    public boolean isEven(int n) {
        if(n%2 == 0) return true;
        return false;
    }
}


//without even function, no actual improvement just harder to read code
class Solution {
    
    public int numberOfSteps (int num) {
        
        //base case
        if(num==0) return 0;
        
        int ans=0;
        while(num != 0) {
            if(num%2==0){
                num=num/2;
            }
            else{
                num--;
            }
            ans++;
        }
        return ans;
        
    }
    
}