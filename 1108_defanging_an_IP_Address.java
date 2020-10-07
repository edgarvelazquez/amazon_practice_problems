//1108. Defanging an IP Address
//https://leetcode.com/problems/defanging-an-ip-address/

//StirngBuilder approach
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans= new StringBuilder();
        
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ans.append("[.]");
            } else{
                ans.append(address.charAt(i));
            }
            
        }
        return ans.toString();
        
    }
}

///String.replace Approach
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
        
    }
}
