class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character, Integer> map= new HashMap<>();
        int left=0;
        int maxCount=0;
        int maxLength=0;

        for(int right=0; right< s.length(); right++){
            char ch=s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0) +1);
            maxCount= Math.max(map.get(ch), maxCount);

            if((right-left+1)-maxCount >k){
                char chLeft= s.charAt(left);

                map.put(chLeft, map.get(chLeft)-1);
                left++;
            }
             maxLength=Math.max(maxLength, (right-left+1));
        }
        return maxLength;
       
    }
}
