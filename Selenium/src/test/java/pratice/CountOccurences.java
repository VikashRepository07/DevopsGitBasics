package pratice;

import java.util.HashMap;

public class CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("javaaa");
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c :str.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			
		
		else 
		{
			map.put(c, 1);
				
		}
			
		}
		
		System.out.println(map);
		 for (char key : map.keySet()) {
	            
					{
			        //  System.out.println(key);
			       int a = map.get(key);
			       if(a==1)
			       {
			    		   System.out.println(map.get(key));
			       }
			          
					}
		 }
		 
	}
	}

