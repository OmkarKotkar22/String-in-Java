/*Q20. Write a program to check whether a string contains a substring.
 Input: Java Programming, 
Java
 Output : Substring found
*/

import java.util.*;
public class check_Substring_inString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input String: ");
		String s = sc.nextLine();
		
		System.out.print("Enter the sub String: ");
		String sub = sc.nextLine();
		Boolean found = false;
		for(int i = 0; i < s.length()-sub.length(); i++){
			int j = 0;
			for(j = 0; j < sub.length(); j++){
				if(s.charAt(i+j) != sub.charAt(j)){
					break;
				}
			}
			if(j == sub.length()){
				found = true;
				break;
			}
		}
	
		if(found){
			System.out.print("String Found");
		}
		else{
			System.out.print("String not Found");
		}
	}
}

/*public class SubstringIgnoreCase {
    public static void main(String[] args) {

        String mainStr = "Java Programming";
        String subStr = "java";

        boolean found = false;

        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {

            int j;
            for (j = 0; j < subStr.length(); j++) {

                char c1 = mainStr.charAt(i + j);
                char c2 = subStr.charAt(j);

                // manual lowercase conversion
                if (c1 >= 'A' && c1 <= 'Z') {
                    c1 = (char)(c1 + 32);
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    c2 = (char)(c2 + 32);
                }

                if (c1 != c2) {
                    break;
                }
            }

            if (j == subStr.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
    }
}
*/