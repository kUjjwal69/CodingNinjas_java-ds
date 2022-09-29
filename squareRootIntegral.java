/*
Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Input format :
Integer N
Output Format :
Square root of N (integer part only)
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// approach 1
		// Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// in.close();
		// int root=(int)Math.sqrt(n);
		// System.out.print(root);
        
        // approach 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 0;
        while(i <= n){
            if(i*i > n){
                System.out.println(i-1);
                break;
            }else if(i*i == n){
                System.out.println(i);
                break;
            }
            i++;
        }
    //approach 3
    
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int output = 0;
        while(output * output<=n){
            output = output + 1;
        }
        output = output -1;
        System.out.println(output);
        
	}

}
