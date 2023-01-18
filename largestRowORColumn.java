/*For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a seperate line.
 Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
Constraints :
1 <= t <= 10^2
1 <= N <= 10^3
1 <= M <= 10^3
Time Limit: 1sec
*/
// there is two approach for this problem

       if (mat.length == 0)
        {
            System.out.print("row 0 " + Integer.MIN_VALUE);
        }
        else
        {
            int rowidx=-1,colidx=-1,rowsum=Integer.MIN_VALUE,colsum=Integer.MIN_VALUE;
            for (int i=0;i<mat.length;i++)
        	{
            	int rsum=0;
            	int j;
            	for (j=0;j<mat[0].length;j++)
            	{
                	rsum=rsum+mat[i][j];
                	
            	}            
            	//System.out.println("Row " + i + " sum = " + rsum);
            	
            
            	if (rowsum<rsum)
            	{
                	rowsum=rsum;
                	rowidx=i;
            	}
                //System.out.println("Largest Row sum is in row " + rowidx + " sum = " + rowsum);
        	}
            
            for (int i=0;i<mat[0].length;i++)
            {
                int j;
                int csum=0;
                for (j=0;j<mat.length;j++)
                {
                    csum=csum+mat[j][i];
                }
                //System.out.println("Col " + i + " sum = " + csum);
                
                if (colsum<csum)
            	{
                	colsum=csum;
                	colidx=i;
            	}
                //System.out.println("Largest Col sum is in col " + colidx + " sum = " + colsum);
            }
            
            if (rowsum >= colsum)
            {
                System.out.print("row " + rowidx + " " + rowsum);
            }
            else
            {
                System.out.print("column " + colidx + " " + colsum);
            }
        } 

// second approach
   int minRowCols = Integer.MIN_VALUE;
        // for rows
        for(int i = 0;i<arr.length;i++){
            int sumRows = 0;
            for(int j =0;j<arr[0].length;j++){
                sumRows+=arr[i][j];
            }
            if(sumRows>minRowCols){
                minRowCols = sumRows;
            }
        }
        // for columns
        for(int i = 0;i<arr.length;i++){
            int sumcols = 0;
            for(int j =0;j<arr[0].length;j++){
                sumcols+=arr[j][i];
            }
            if(sumcols>minRowCols){
                minRowCols = sumcols;
            }
        }




