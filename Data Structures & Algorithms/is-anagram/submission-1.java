class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}

        int[] result=new int[26];

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            result[index]++;
        }

        
        for(int j=0; j<t.length(); j++){
            char cd=t.charAt(j);
            int index2=cd-'a';
            result[index2]--;
        }
        for(int k=0; k<26; k++){
            if(result[k]!=0){
                return false;
            }
        }
        return true;

    }

}

