/*Q24. Write a java program to convert first character of each word to uppercase.
 Input : java is easy
 Output : Java Is Easy*/

import java.util.*;
public class first_char_isCapital_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();

		char[] ch = s.toCharArray();
		for(int i= 0; i < s.length(); i++){
			if(i==0 && ch[i] >='a' && ch[i]<='z'){
				ch[i] = (char)(ch[i]-32);
			}
			else if(ch[i] == ' ' && ch[i+1] >='a' && ch[i+1]<='z')
				ch[i+1] = (char)(ch[i+1]-32);
			
		}
		String result = new String(ch);
		System.out.print(result);
	}
}