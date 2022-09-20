/*
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
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
        int i = 1;
        while (i<=n){

            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces = spaces +1;
            }
            int j = 1;
            int p = i;
            while(j<=i){
                System.out.print(p);
                p= p+1;
                j = j+1;
            }
            int decNum = ((2*i)-2);
            while(decNum>=i){
                System.out.print(decNum);
                decNum = decNum-1;
            }
            System.out.println(" ");
            i = i+1;
        }
	}
}

