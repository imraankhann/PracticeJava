//10 Find Occurences of each character in given string
import java.util.HashMap;
public class OccurencesOfEachCharInString{
	public static void main(String[] args){
		charCount("JavaJ2EE");
	}
	private static void charCount(String str){
		
		HashMap<Character,Integer> chCount = new HashMap<>();
		char strArr[] = str.toCharArray();
		for(char c : strArr){
			if(chCount.containsKey(c)){
				chCount.put(c,chCount.get(c)+1);
			}
			else{
				chCount.put(c,1);
			}
			
		}
		System.out.println(str +" : "+chCount);
		
	}
}