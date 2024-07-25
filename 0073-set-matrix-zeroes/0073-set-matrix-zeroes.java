class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> zeroIndex = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sim;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    sim=new ArrayList<>();
                    sim.add(i);
                    sim.add(j);
                    zeroIndex.add(sim);
                }
            }
        }
        for(ArrayList tmp:zeroIndex){
            int a=(int)tmp.get(0);
            int b=(int)tmp.get(1);
            rowZeros(matrix,a);
            colZeros(matrix,b);
        }
    }
    public static void rowZeros(int[][] matrix ,int row){
      for(int i=0;i<matrix[0].length;i++){
        matrix[row][i]=0;
      }
    }
    public static void colZeros(int[][] matrix,int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
}