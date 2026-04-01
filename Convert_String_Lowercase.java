/*Q9. Write a program to convert a string into lowercase.
 Input : HELLO
 Output : hello
*/


import java.util.*;
public class Convert_String_Lowercase{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();

		String result = "";
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				ch = (char)(ch + 32);
			}
			result = result + ch;
		}
		System.out.print("Display Uppercase String: "+ result);
	}
}