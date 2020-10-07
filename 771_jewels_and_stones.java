//771. Jewels and Stones
//https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {
        
        //base case
        if(J.length()==0||S.length()==0) return 0;

        //1.convert string to char array
        //2. Put every J(key) value into a HashSet
        //go through S and increase counter every time the value already exists
        //3. return counter

        Set<Character> set = new HashSet<Character>();
        int ans=0;
        
        for(char a:J.toCharArray()){
            set.add(a);
        }
        
        for(char a:S.toCharArray()){
            if(set.contains(a)) {
               ans++;
            }
        }
        return ans;
        
    }
}