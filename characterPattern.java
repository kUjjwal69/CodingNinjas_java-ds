/*

Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK
*/


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while(row<=n){
            char getChar = (char)('A' + row - 1);
            int column = 1;
            while(column<=row){
                System.out.print(getChar);
                getChar = (char)(getChar + 1);
                column = column + 1;
            }
            System.out.println(" ");
            row = row + 1;
        }
		
	}

}
