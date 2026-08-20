class Solution {
    public int countSubstrings(String s) {
        int totalCount=0;
      
        

        for(int i=0; i<s.length(); i++){
            int oddLength = helper(s, i, i);
            int evenLength= helper(s, i, i+1);

           totalCount= totalCount+ oddLength+evenLength;
        }
        return totalCount;
    }
    private int helper(String s, int left, int right){
          int count=0;
        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;

        }
        return count;
    }
}
