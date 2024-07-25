class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int n=matrix.length;
        int y=matrix[0].length;
        int count=0;
	    int i=0,j=0,avoidTop=0,avoidLeft=0,avoidBottom=0,avoidRight=0;
	      
	       while(count<(n*y))
	       {
	      
	         while(j<(y-avoidRight) && count<(n*y))
	         {  
	             list.add(matrix[i][j]);
	        	 count++;
	             j++;
	         }
	          avoidTop++;
	          j--;
	          i++;
	          while(i<n-avoidBottom && count<(n*y))
	          {
	              list.add(matrix[i][j]);
	              count++;
	              i++;
	          }
	          avoidRight++;
	          i--;
	          j--;
	         
	          while(j>=avoidLeft && count<(n*y))
	          {
	              list.add(matrix[i][j]);
	              count++;
	              j--;
	          }
	          avoidBottom++;
	          j++;
	          i--;
	          while(i>=avoidTop && count<(n*y))
	          {
	             list.add(matrix[i][j]);
	            count++;
	             i--;
	          }
	          avoidLeft++;
	          i++;
	          j++;
	       }
      return list;
    }
 }
