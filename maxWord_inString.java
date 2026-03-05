/*Q23. Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful
*/

import java.util.*;
public class maxWord_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();

		String currentWord = "";
		String maxWord = "";
		int maxLength = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' '){
				currentWord = currentWord + s.charAt(i);
			}
			else{
				if(currentWord.length() > maxLength){
					maxLength = currentWord.length();
					maxWord = currentWord;
				}
				currentWord= "";
			}
		}	
		if(currentWord.length()>maxLength){
			maxWord = currentWord;
		}
		System.out.print(maxWord);
	}
}