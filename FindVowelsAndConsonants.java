import java.util.*;
public class FindVowelsAndConsonants{
	public static void main(String[] args){
		searchVowelsAndConsonants("");
	}
	
	private static void searchVowelsAndConsonants(String str){
		char vowels[] = new char[str.length()+1];
		char consonants[] = new char[str.length()+1];
		if(str.length()<1){
			System.out.println("Invalid String provided");
		}
		else{
			for(int i=0;i<=str.length()-1;i++){
		if(str.charAt(i)=='a' || str.charAt(i) =='e' || str.charAt(i) =='o' || str.charAt(i) == 'i' || str.charAt(i) == 'u'){
			vowels[i]=str.charAt(i);
		}
		else{
			consonants[i]=str.charAt(i);
		}
			}
		}
		/*for(int i=0;i<str.length()-1;i++){
			System.out.println("Vowels : "+vowels[i]);
			System.out.println("Consonants: " + consonants[i]);
		}*/
		System.out.println("Vowels: "+ Arrays.toString(vowels));
		System.out.println("Consonants: "+ Arrays.toString(consonants));
	}
}