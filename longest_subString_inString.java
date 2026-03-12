/*Q32. Given a string s, return the longest
in s.
 
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"
*/

import java.util.*;
public class longest_subString_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();

		String visited[] = new String[s.length()];
		String result = "";
		//int maxLen = 0;
		for(int i = 0; i < s.length(); i++){
			//int currLen = 0;
			for(int j = 0;  j < s.length(); j++){
				if(visited[i]){
					continue;
				}
			
				result = visited[i];
				//currLen++;
			}	
		}
		System.out.print(result);
	}
}