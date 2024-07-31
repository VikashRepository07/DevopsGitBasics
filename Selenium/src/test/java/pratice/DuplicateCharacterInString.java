package pratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "vikav";
		Set<Character> set = new HashSet<Character>();
		Set<Character> duplicate = new HashSet<Character>();
		
		
		for (char c : inputString.toCharArray()) {
            if (!set.add(c)) {
            	boolean z = set.add(c);
            	System.out.println(z);
                duplicate.add(c);
            }
        }

		 // Displaying duplicate characters
        System.out.println("Duplicate characters in the string '" + inputString + "");
        for (char c : duplicate) {
            System.out.println(c);
        }
		System.out.println(set);
		System.out.println(duplicate);
	
    // Convert HashSet to String
    StringBuilder sb = new StringBuilder();
    for (char c : set) {
        sb.append(c);
    }
     String str = sb.toString();
     System.out.println(str);
     

}
	
}
