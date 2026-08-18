class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb= new StringBuilder();
        int n=strs.size();
        for(int i=0; i<n; i++){
            sb.append(strs.get(i).length());
            sb.append('#');
            sb.append(strs.get(i));

        }
        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> result= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int delimiterIndex= str.indexOf('#', i);
            int start=delimiterIndex+ 1;
            int length=Integer.parseInt(str.substring(i, delimiterIndex));
           
            String string=str.substring(start, start+length);
            i=start+length;
            result.add(string);


        }
        return result;

    }
}
