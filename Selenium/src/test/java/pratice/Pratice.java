package pratice;

import java.util.HashMap;
import java.util.HashSet;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "vikashv";
		
		HashSet<Character> set = new HashSet<Character>();
		 HashSet<Character>  duplicate  = new HashSet<Character>();
		HashMap map  = new HashMap<Character, Integer>();
		 
		 for(char c: str.toCharArray())	 
		 {
			 
			if(!set.add(c))
			{
				duplicate.add(c);
			}
		 }
	
		System.out.println(set);
		System.out.println(duplicate);


	}

}
