class Solution {
    public int numIslands(char[][] grid) {
        int island=0;
        int row= grid.length;
        int col=grid[0].length;

        if(grid==null || grid.length==0){
            return 0;
        }

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){

                if(grid[r][c]=='1'){
                    island++;

                     dfs(grid,r,c);

                }

            }
        }
        return island;
        
    }

    private void dfs(char[][]grid, int r,int c){
        if(r<0 || c<0|| r==grid.length || c==grid[0].length ||grid[r][c]=='0'){
            return;
        }

        if(grid[r][c]=='1'){
            grid[r][c]='0';
        }

        dfs(grid, r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
        
    }
}
