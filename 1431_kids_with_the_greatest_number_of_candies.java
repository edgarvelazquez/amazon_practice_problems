//1431. Kids With the Greatest Number of Candies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        
        int max=max(candies);
        
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
        
    }
    
    public int max(int[] candies){
        int max=0;
        for(int i=0; i < candies.length; i++) {
           if(max<candies[i]){
               max=candies[i];
           } 
        }
        return max;
    }
}