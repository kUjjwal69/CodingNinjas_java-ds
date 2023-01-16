/*
For a given a string(str), find and return the highest occurring character.
Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.
Consider:
Assume all the characters in the given string to be in lowercase always.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
*/

import java.util.*;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
       int []frequency = new int[256];
       // frequency array is been generated.
	   for(int i = 0; i< str.length(); i++)
	   {
		   int index = str.charAt(i);
		   frequency[index] = frequency[index]+1 ;
	   }
		// finding max value in frequency array.
	   int max = Integer.MIN_VALUE; //max value.
	   int max_index = -1; // max value correspondig index.
	   for(int i =0; i< 256; i++)
	   {
		   if(max<frequency[i])
		   {
			   max = frequency[i];
			   max_index = i;
		   }
	   }

	//    char ch =(char)( max_index);

	//    return ch;

	return (char)(max_index);

       
	}

}
