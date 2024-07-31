package pratice;

import java.util.HashSet;

public class DuplicateOfstringWithoutHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String inputString = "programp"; 
		  HashSet<Character> set =  new HashSet<Character>();
		  
		  for(char c: inputString.toCharArray())
		  {
			 // set.add(c);
			  
			  if(!set.add(c))
			  {
				  System.err.println(c);
			  }
			 
		  }
			  StringBuilder  sb = new StringBuilder();//string buffer and builder both are mutable but string builder is have better performances for single thread applications
			 // StringBuffer sb = new StringBuffer();// it is thread safe good to use in multithread enviroment as it was syncronised to use in multithread application 
			  for(char d: set)
			  {
			  sb.append(d);
			  
			  }
		  
			  System.out.println(sb.toString());
			  
		  }
		  
		//  System.out.println(set);
	        
	     

}
