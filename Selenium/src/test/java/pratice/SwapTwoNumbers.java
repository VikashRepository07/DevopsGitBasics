package pratice;

import java.util.HashMap;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int n1= 100;
		int n2 = 40;
		/*
		num1 = num1+ num2; //140
		num2 = num1-num2; //100
		num1 = num1-num2; //40
		System.out.println("n1 is "+num1);
		System.out.println("n2 is "+num2);
		
		*/
          String str = "Javaaa";
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
          for(char c: str.toCharArray())
          {
        	  if(!map.containsKey(c))
        	  {
        		  
        		//  map.put(c, map.get(c)+1);
        		  
        	  }
        	  else 
        	  {
        		  map.put(c, 1);
        	  }
        	  
          }
		
		System.out.println(map);
		
}
}