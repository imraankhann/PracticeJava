//https://javaconceptoftheday.com/java-interview-programs-with-solutions/

import java.util.HashMap;
import java.util.Set;
public class DuplicateCharInString{
	
	public static void main(String[] args){
		dupChars("JavaJ2EE");
	}
	
	private static void dupChars(String inputStr){
		char[] strArr = inputStr.toCharArray();
		HashMap<Character,Integer> dupCount = new HashMap<>();
		for(char c: strArr){
			if(dupCount.containsKey(c)){
				dupCount.put(c,dupCount.get(c)+1);
			}else{
				dupCount.put(c,1);
			}
		}
		Set<Character> charInString = dupChars.keySet();
		for(char ch : charInString){
			if(dupCount.get(ch)>1){
				System.out.println(ch+" : "+dupCount.get(ch));
			}
		}
	}
}