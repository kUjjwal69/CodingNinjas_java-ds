/*
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/
import java.util.*;
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        String ans = "";
        int startWord = 0;
       int i = 0;
        for(;i<str.length();i++){
              // reverse word
            
            if(str.charAt(i)==' '){
                int endWord = i-1;
                String reverseWord = "";
                for(int j = startWord;j<=endWord;j++){
                    reverseWord = str.charAt(j)+reverseWord;
                }
                
                
                // add all the strings to ans
               ans+=reverseWord + " ";
                startWord = i+1;
                
                
            }
           
        }
        // since there are no space after the last word that's 
        //we have to use this piece of code again to print that last word too
         int endWord = i-1;
                String reverseWord = "";
                for(int j = startWord;j<=endWord;j++){
                    reverseWord = str.charAt(j)+reverseWord;
                }
                
                ans+=reverseWord ;
                startWord = i+1;
                
            
            
        
        return ans;
	}

}
