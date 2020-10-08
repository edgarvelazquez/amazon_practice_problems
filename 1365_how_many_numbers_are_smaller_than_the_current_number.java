//1365. How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    
        int[] result = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] secondArray= nums.clone();
        Arrays.sort(nums);
        
        for(int i=0; i < nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        
        for(int i=0; i < nums.length; i++) {
            result[i]=map.get(secondArray[i]);
        }
        //System.out.println(map);
        /*
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println("map has key: "+ entry.getKey() + " with val "+entry.getValue());
        }
        */
        return result;
    }
}

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] ans = new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j) {
                    if(nums[j] < nums[i]){
                        ans[i]++;
                    }
                }
                
            }
        }
        return ans;      
    }
    
    
}