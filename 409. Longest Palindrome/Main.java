class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        boolean singleEle = false;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), val+1);
            }else map.put(s.charAt(i),1);
        }
        int ans =0;
        for(Character c: map.keySet()){
            if(map.get(c)==1 && singleEle==false){ 
                singleEle = true;
                ans++;
            }else{
                if(map.get(c)%2 !=0 && singleEle==false){
                    singleEle= true;
                    ans += map.get(c);
                }else if(map.get(c)%2==0){ 
                    ans+=map.get(c);
                }
                else ans+=map.get(c)-1;
            }
        }
        return ans;
    }
}