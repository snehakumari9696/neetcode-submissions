class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();

        for(int i =0; i<strs.length; i++){

            String word=strs[i];

             char[] result= word.toCharArray();
             Arrays.sort(result);
            String sortedWord= new String(result);


            if(!map.containsKey(sortedWord)){
                 map.put(sortedWord, new ArrayList<>());
        }

         map.get(sortedWord).add(word);

        
        }

       return new ArrayList<>(map.values());
    }
}
