class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows= heights.length;
        int cols=heights[0].length;
        
        List<List<Integer>> result= new ArrayList<>();

        boolean[][]pacific=new boolean[rows][cols];
        boolean[][]atlantic=new boolean[rows][cols];

        for(int c=0;c<cols;c++){
            dfs(heights,0,c,heights[0][c], pacific);
        }
        for(int r=0; r<rows;r++){
            dfs(heights,r,0,heights[r][0],pacific);
        }
        for(int c=0; c<cols;c++){
            dfs(heights, rows-1, c, heights[rows-1][c],atlantic);
        }
        for(int r=0;r<rows; r++){
            dfs(heights,r,cols-1, heights[r][cols-1], atlantic);
        }

        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){

                if(pacific[r][c] && atlantic[r][c]){
                result.add(Arrays.asList(r,c));
        }
            }
        }

        return result;
    }
    private void dfs(int[][] heights, int r, int c, int prevHeights, boolean[][]ocean){
        int rows= heights.length;
        int cols=heights[0].length;
        
        if(r<0 || c<0 ||r>=rows || c>=cols ||ocean[r][c]==true ||heights[r][c]<prevHeights){
            return;
        }
        ocean[r][c]=true;

        dfs(heights,r+1,c, heights[r][c], ocean);
        dfs(heights, r-1, c, heights[r][c], ocean);
        dfs(heights,r,c+1, heights[r][c], ocean);
        dfs(heights, r, c-1, heights[r][c], ocean);
    }
}
