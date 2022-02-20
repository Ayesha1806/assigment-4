package Assigmnet4;
import java.util.Scanner;

public class secondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n= s.nextInt();
		int[] arr=new int[n];
		int temp=0;
		int i;
		System.out.print("enter the array elements :");
		for( i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		for( i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}	
			}
			System.out.println("sorted array is :" +arr[i]);
			
		}
		System.out.print("second largest element " +arr[n-2]);
		
			
		

			
		

	}

}
