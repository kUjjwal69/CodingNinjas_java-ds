/*


Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
*/


import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int n1 = (n+1)/2;// for upper part
            int n2 = n/2;// for lower part
            int i = 1;
            while(i<=n1){
                int spaces = 1;
                while(spaces<=n1-i){
                    System.out.print(" ");
                    spaces = spaces +1;
                }
                int j = 1;
                while(j<=(2*i-1)){
                    System.out.print("*");
                    j = j+1;
                }
                System.out.println(" ");
                i = i+1;
            }
        // now for lower part
            int k = n2;
            while(k>=1){
                int Spaces = 1;
                while(Spaces<=(n2-k+1)){
                    System.out.print(" ");
                    Spaces= Spaces+1;
                }
                int l = 1;
                while(l<=(2*k-1)) {
                    System.out.print("*");
                    l = l+1
                }
                System.out.println("");
                k = k-1;
            }
}
}



