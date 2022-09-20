/*
Print the following pattern
Pattern for N = 4
---*
--***
-*****
*******

The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner (System.in);
        
        int n = s.nextInt();
        
        int rows = 1;
        
        while(rows<=n){
            
            int spaces = 1;
            
            while(spaces<=n-rows){
                
                System.out.print(" ");
                
                spaces = spaces +1;
                
                }
            int num = 1;
            while(num<=rows)
            {
                System.out.print("*");
                num = num +1;
            }
            int decNum = rows-1;
            while(decNum>=1){
                System.out.print("*");
                decNum = decNum-1;
            }
            System.out.println(" ");
            rows = rows +1;
            }
        }
		
	}



