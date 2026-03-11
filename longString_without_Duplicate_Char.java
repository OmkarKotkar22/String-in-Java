/*Q31. Given a string s, find the length of the longest without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. 

*/

import java.util.*;
public class longString_without_Duplicate_Char{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();
		
		int maxLength = 0;
		for(int i = 0; i < s.length(); i++){
			int currentLength = 0;
			boolean visited[] = new boolean[256];
			for(int j = i; j < s.length(); j++){
				if(visited[s.charAt(j)])
					break;

				visited[s.charAt(j)] = true;
				currentLength++;
			}
			if(currentLength > maxLength)
			{
				maxLength = currentLength;
			}
		}
		System.out.print(maxLength);
	}
}