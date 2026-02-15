/*Q25. Two strings are anagrams if they contain same characters with same frequency.
 Input : listen, silent
 Output : Anagram*/

import java.util.*;
public class Check_String_Anagram{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Input String: ");
		String first = sc.nextLine();

		System.out.print("Enter the Second Input String: ");
		String second = sc.nextLine();

		boolean visit[] = new boolean[first.length()];
		boolean found = true;
				
		if(first.length() == second.length()){
			for(int i = 0; i < first.length(); i++){
				if(visit[i])
					continue;

				boolean flag = false;
				for(int j = 0; j < second.length(); j++){
					if(first.charAt(i) == second.charAt(j)){
						visit[j] = true;
						flag = true;
						break;
					}
				}

				if(!flag){
					found = false;
					break;
				}
			}
			if(found)
				System.out.print("String is Anagram");
			else
				System.out.print("String is Not Anagram");
		}
		else
			System.out.print(" STRING IS NOT ANAGRAM because both string lengths are not same ");
	}
}