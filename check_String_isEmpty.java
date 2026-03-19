/*Q14. Write a program to check whether a string is empty or not.
 Input : " "
 Output : String is empty
*/

import java.util.*;
public class check_String_isEmpty{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		String s = "";

		if(s.length() == 0){
	 		System.out.print("String is Empty");
		}
		else{
			System.out.print("String is not Empty");
		}
	}
}