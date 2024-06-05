//https://javaconceptoftheday.com/java-interview-programs-with-solutions/
//9-Program
// Program to find second largest number in integer array

public class SecondLargest{
	public static void main(String args[]){
	int a[] = {20,23,13,43,32,64,34,43};
	System.out.println(findSecondLarge(a));
	}
	
	private static int findSecondLarge(int a[]){
	int firstLarge = a[0];
	int secondLarge = a[1];
	
		if(a[0]>a[1]){
			firstLarge = a[0];
			secondLarge = a[1];
		}else{
			firstLarge = a[1];
			secondLarge = a[0];
		}
		
	for(int i=2;i<a.length;i++){
		if(a[i]> firstLarge){
				secondLarge = firstLarge;
				firstLarge = a[i];
			}else if(a[i] < firstLarge && a[i]>secondLarge){
				secondLarge = a[i];
			}
		}
		return secondLarge;
	}
}