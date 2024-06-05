//https://javaconceptoftheday.com/java-interview-programs-with-solutions/
//9-Program
public class SumOfAllDigits{

	public static void main(String[] args){
    sumOfDigits(193);
	}
	
	private static void sumOfDigits(int n){
		int originalNum, remainder, result=0;
		originalNum = n;
		while(originalNum!=0){
			remainder = originalNum%10;
			result+=remainder;
			originalNum/=10;
		}
		System.out.println("Result: " +result);
		
	}
	

}