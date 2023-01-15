/*
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always*/

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
String ans = " ";

int currentWord = 0;
int i = 0;
for(;i<input.length();i++){
  if(input.charAt(i) == ' '){
int currentWordEnd = i-1;
String reversedWord="";

                for(int j=currentWord;j<=currentWordEnd;j++){
                    reversedWord = input.length()+reversedWord;
                }
                //Add it final String(ans)
                ans+=reversedWord+" ";
                currentWord=i+1;
            }
  }



int currentWordEnd = i - 1;
String reversedWord="";
for(
int j = currentWord;j<=currentWordEnd;j++)
{
  reversedWord = input.charAt(j) + reversedWord;
}
ans+=reversedWord;

        return ans;
	}
}
