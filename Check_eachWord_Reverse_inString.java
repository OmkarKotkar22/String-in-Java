/*Q27. Reverse each word but keep word order same.
 Input : Java is fun
 Output : avaJ si nuf*/

import java.util.*;
public class Check_eachWord_Reverse_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();

		String []word = new String[s.length()];
		for(int i = 0; i < s.length(); i++){
			word[i] = "";
		}

		int j = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				j++;
				continue;
			}
			word[j] += s.charAt(i);
		}

		String result = "";
		for(int i = 0; i <= j; i++){
			String rev ="";
			for(int k = word[i].length()-1; k >=0 ; k--){
				rev += word[i].charAt(k);
			}
			result += rev+" ";
		}
		System.out.println(result);

	}
}