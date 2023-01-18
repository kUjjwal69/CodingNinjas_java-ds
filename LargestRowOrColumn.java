/*
For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
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


public class Solution {

	public static void findLargest(int arr[][]){
		//Your code goes here
    int minRowCols = Integer.MIN_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;
        // for rows
        if(arr.length == 0)
        {
            System.out.println("row 0 -2147483648"); // if we do not do this it will create an runtim error
            return;
        }
        int row_index = 0;
        for(int i = 0;i<arr.length;i++){
            int sumRows = 0;
            for(int j =0;j<arr[0].length;j++){
                sumRows+=arr[i][j];
            }
            if(sumRows>maxRow){
                maxRow = sumRows;
                row_index = i;
            }
        }
        // for columns
        int col_index = 0;
        for(int i = 0;i<arr[0].length;i++){// we sid this because throught his array index out of bound exception can be ignored
            int sumcols = 0;
            for(int j =0;j<arr.length;j++){
                sumcols+=arr[j][i];
            }
            if(sumcols>maxCol){
                maxCol = sumcols;
                col_index = i;
            }
        }

        if(maxRow>= maxCol)
        {
            System.out.println("row "+row_index+" "+maxRow);
        }
        else{
            System.out.println("column "+col_index+" "+maxCol);
        }
	}
}
