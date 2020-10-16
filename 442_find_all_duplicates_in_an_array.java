//442. Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

//Approach
//The key if the problem is in the description 1 ≤ a[i] ≤ n (n = size of array),
//Then we will mark visited index as negative, if the visited index is negative
//then we will add it to the list
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i])-1]<0){
                list.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i])-1]= (-1)*nums[Math.abs(nums[i])-1];
            }
        }
        return list;   
        
    }
}