package Assigmnet4;
import java.util.Scanner;

public class twoDArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
	    System.out.print("enter the size of row : ");
		int row=s.nextInt();
		System.out.print("enter the size of column : ");
		int col=s.nextInt();
		int[][] arr=new int[row][col];
		int i,j,sum=0;
		for( i=0;i<row;i++) {
			System.out.println("enter the value for rows : " +(i+1) );
			for( j=0;j<col;j++) {
				System.out.println("enter the value for columns : " +(j+1) );
				arr[i][j]=s.nextInt();
			}
		}
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(arr[i][j] +" , ");
				sum=sum+arr[i][j];
			}
		}
		System.out.println("sum is " +sum);
		
	}

}
