
public class Palindrome {

	public static void main(String[] args){
		System.out.println(isPalindrome("abba"));
	}

private static boolean isPalindrome(String str){
	String rev = "";
	boolean flag = false;
	for(int i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
	}
	if(str.equals(rev)) {
		flag = true;
	}
	return flag;
}
}
