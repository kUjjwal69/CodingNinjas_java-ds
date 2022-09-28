/*
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/

 import java.util.Scanner;
 import java.lang.Math; 
 public class Main {
	
 	public static void main(String[] args) {
// 		// Write your code here
Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pv = 1;
        int ans = 0;
        while(n!=0){
            int n1 = n%10;
            ans+= n1*pv;
            pv*=2;
        n = n/10;

        }
        System.out.println(ans);
	}
}

// approach 2

Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int sum=0,prod=1,i=0;
        while(N!=0)
        {
            prod= N%10;
            sum+=((prod) * Math.pow(2,i));
            N=N/10;
            i++;
        }
        System.out.println(sum);
	}
}
