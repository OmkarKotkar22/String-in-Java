/*Q29. Write a java program to remove a, e, i, o, u from the string.
 Input : education
 Output : dctn
*/

import java.util.*;
public class remove_Vowels_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();
	
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
				System.out.print(s.charAt(i));
			}
		}
	}
}