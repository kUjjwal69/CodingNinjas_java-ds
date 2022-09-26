/*
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            if (checkPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
        public static boolean checkPrime(int a){
            int count = 0;
            for (int x = 2; x <= a / 2; x++) {
                if (a % x == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return true;
            }
            return false;
        }
}


