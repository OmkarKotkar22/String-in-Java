/*Q21. Traverse the string and count how many times each character appears.
 Input : programming
 Output : p=1 r=2 o=1 g=2 a=1 m=2 i=1 n=1*/

import java.util.*;
public class count_Character_Appears{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();
		
		boolean[] visit = new boolean[s.length()];

		for(int i = 0; i < s.length(); i++){
			if(visit[i]){
				continue;
			}

			int count = 1;
			for(int j = i+1; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					count++;
					visit[j] = true;
				}
			}
			System.out.print(s.charAt(i) +" = "+ count +" ");
		}
	}
}