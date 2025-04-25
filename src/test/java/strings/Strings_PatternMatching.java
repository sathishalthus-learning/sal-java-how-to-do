package strings;

import java.util.HashMap;
import java.util.Map;

public class Strings_PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String pattern ="abba";
	      String str = "dog cat cat dog";
	      String[] strs = str.split(" ");
	      Map<Character,String> map = new HashMap<>();
	      
	      if(pattern.length()!=strs.length) {
	    	  System.out.println("not equal");
	      }
	      else {
	    	  for(int i=0; i<pattern.length(); i++) {
	    		  String val = map.get(pattern.charAt(i));
	    		  map.put(pattern.charAt(i),);
	    		  
	    	  }
	    	 
	      }
	      
	}

}
