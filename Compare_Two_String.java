/*Q13. Write a program to compare two strings.
 Input: String1- Java, String2- Java
 Output : Strings are equal
*/

import java.util.*;
public class Compare_Two_String{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Input String: ");
		String string1 = sc.nextLine();
		
		System.out.print("Enter the second Input String: ");
		String string2 = sc.nextLine();
	
		boolean isCompare = false;
		if(string1.length() != string2.length()){
			isCompare = true;
		}
		for(int i = 0; i < string1.length(); i++){
			if(string1.charAt(i) != string2.charAt(i)){
				isCompare = true;
				break;
			}
		}

		if(!isCompare){
			System.out.print("Strings are equal");
		}

		else{
			System.out.print("Strings are not equal");
		}
	}
}