class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return result;
        }

        int m=matrix.length;  //row
        int n=matrix[0].length;  //column

        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;

        while(top<=bottom && left<=right){
            //left to right...traverse first row
            for(int j=left; j<=right; j++ ){
                result.add(matrix[top][j]);
            }
            top++;

            //top to bottom..traverse right column
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //traverse bottom row
            if(top<=bottom){
                for(int j=right;j>=left; j--){
                    result.add(matrix[bottom][j]);

                }
                bottom--;
                
            }

            //traverse left column

            if(left<=right){
                for(int i=bottom;i>=top; i-- ){
                    result.add(matrix[i][left]);
                    
                }
                left++;
            

                

            }




        }
        return result;



        
    }
}
