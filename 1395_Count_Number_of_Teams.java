//1395. Count Number of Teams
//https://leetcode.com/problems/count-number-of-teams/


//Brute force O(n^3), very slow, but it is still a solution
class Solution {
    public int numTeams(int[] rating) {
        int ans=0;
        for(int i=0;i < rating.length; i++) {
            for(int j=i; j < rating.length;j++) {
                for(int k=j; k < rating.length;k++) {
                    if(rating[i] < rating[j] && rating[j] < rating[k]){
                        ans++;
                    }
                    else if(rating[i] > rating[j] && rating[j] > rating[k]){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

/*
1 2 3
1 3 4
2 3 4
1 2 4
*/

//to finish
class Solution {
    public int numTeams(int[] rating) {
        int ans=0;
        for(int i=0;i < rating.length-2; i++) {
            int j=i+1;
            int k=rating.length-1;
            while( j <= k) {
                    if(rating[i] < rating[j] && rating[j] < rating[k]){
                        ans++;
                        
                    }
                    else if(rating[i] > rating[j] && rating[j] > rating[k]){
                        ans++;
                    }
                k--;
                j++;
            }    
            
        }
        return ans;
    }
}

/*
1 2 3
1 3 4
2 3 4
1 2 4
*/
