
import java.util.Arrays;

public class DuplicateElementsinArray {
	public static void main(String[] args){
		  int a[] = {1,2,3,4,2,1};
		  findDuplicates(a);
		 }
	private static void findDuplicates(int arr[]){
		Arrays.sort(arr);
		 int dupele[] = new int[arr.length-1];
		 for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=i+1;j<arr.length-1;j++){
				 if(arr[i]==arr[j]){
					 dupele[i]=arr[i];
					 System.out.println("Dup element : "+arr[i]);
				 }
			 }
			// System.out.println("Duplicate elements are : "+dupele.toString());
		 }
		 //System.out.println("Duplicate elements are : "+dupele.toString());

	 }

}
