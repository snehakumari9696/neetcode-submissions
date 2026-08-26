class WordDictionary {

    public class TrieNode{
        TrieNode[]children;
        boolean isEnd;

        public TrieNode(){
            children= new TrieNode[26];
            isEnd=false;


        }
    }

    private TrieNode root;

    public WordDictionary() {
        root= new TrieNode();

    }

    public void addWord(String word) {
        TrieNode curr= root;
        
        for(int i=0; i<word.length(); i++){
            char ch= word.charAt(i);
            int index=ch- 'a';

            if(curr.children[index]==null){
                curr.children[index]= new TrieNode();
            }

            curr= curr.children[index];
        }
        curr.isEnd= true;

    }

    public boolean search(String word) {
        return dfs(word, 0, root);
}

private boolean dfs(String word, int index, TrieNode curr){
    if(curr==null){
        return false;
    }

    if(index==word.length()){
        return curr.isEnd;
    }

    char ch= word.charAt(index);
        if(ch!= '.'){
        int childIndex= ch-'a';

        return dfs(word, index+1, curr.children[childIndex]);
    }

    for(int i=0; i<26; i++){
        if(curr.children[i] != null){
            if(dfs(word, index+1, curr.children[i])){
                return true;
            }
        }
    }
    return false;


}
}
