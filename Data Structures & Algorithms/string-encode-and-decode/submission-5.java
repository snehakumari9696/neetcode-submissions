class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        int n=strs.size();
        for(int i=0; i<n; i++){
            sb.append(strs.get(i).length()).append('#').append(strs.get(i));
        }
        return sb.toString();

        

    }

    public List<String> decode(String str) {
        List<String> result= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }

                int length=Integer.parseInt(str.substring(i,j));
                String word=str.substring(j+1, j+1+length);
                result.add(word);
                i=j+1+length;
            


        }
        return result;

        
    }
}
