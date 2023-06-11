package interview;

import java.util.HashMap;
import java.util.Map;

public class FindDublicateWordInString {

	public static void main(String[] args) {
		
	
	String str = "i,i,i,love,love,my,my,india,india";
	String[] s= str.split(",");
	
	Map<String,Integer> map = new HashMap<String,Integer>();
	for(String st:s) {
		Integer old = map.get(st);
		if(old==null) {
			old=0;
		}
		map.put(st, old+1);
	}
	System.out.println(map);
	
	
}	
}
