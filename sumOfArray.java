package Assigmnet4;
import java.util.Scanner;

public class sumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n= s.nextInt();
		int[] arr=new int[n];
		int sum=0;
		System.out.print("enter the array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		System.out.print("sum of array is :");
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			arr[i]=sum;
			
			
		
		System.out.println(arr[i] +" ");
		}
	}

}
