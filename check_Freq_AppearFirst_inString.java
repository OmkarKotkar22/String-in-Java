/*Q28. Write a java program to Check character whose frequency is 1 and appears first.
 Input : swiss
 Output : w*/

import java.util.*;
public class check_Freq_AppearFirst_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();

		for(int i = 0; i < s.length(); i++){
			int count = 0;
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					count++;
				}
			}
			if(count == 1){
				System.out.print(s.charAt(i));
				break;
			}
		}
	}
}

/*
import java.util.*;
public class check_Freq_Appearlast_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();
		
		char ch ='0';
		for(int i = 0; i < s.length(); i++){
			int count = 0;
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					count++;
				}
			}
			if(count == 1){
				ch= s.charAt(i);
			}
		}
		System.out.println(ch);
	}
}*/