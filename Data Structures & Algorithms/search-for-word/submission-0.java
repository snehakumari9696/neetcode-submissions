class Solution {
    
    public boolean exist(char[][] board, String word) {

        int rows=board.length;
        int cols=board[0].length;

        

        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(backtrack(board,word, r, c, 0)){
                    return true;
                }
            }
        }
        return false;
        
    }

    private boolean backtrack(char[][]board, String word,int r, int c, int wordIndex){
        if(wordIndex == word.length()){
            return true;
        }
        if(r<0 || c<0 || r>=board.length || c>=board[0].length){
            return false;
        }

        if(board[r][c] != word.charAt(wordIndex)){
            return false;
        }

        char temp=board[r][c];
        board[r][c]= '#';

        boolean found=backtrack(board, word, r+1, c, wordIndex+1)||
        backtrack(board,word,r-1, c, wordIndex+1)||
        backtrack(board, word, r, c+1, wordIndex+1)||
        backtrack(board, word, r, c-1, wordIndex+1);

        board[r][c]=temp;

        return found;

    }
    
}
