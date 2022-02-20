package Assigmnet4;
import java.util.Scanner;

public class stringMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s=new Scanner(System.in);
		System.out.print("enter no of rows : ");
		int row=s.nextInt();
		System.out.print("enter no of columns: ");
		int col=s.nextInt();
		String[][] arr=new String[row][col];
		for(int i=0;i<row;i++) {
			System.out.println("enter the value for rows : " +(i+1) );
			for(int j=0;j<col;j++) {
				System.out.println("enter the value for colums : " +(j+1) );
				arr[i][j]=s.nextLine();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
		String[][] arr= {{"Hello","GeekSter"},{"Good","Day"}};
		int noofrow=arr.length;
		int noofcol=arr[0].length;
		String str=" ";
		for(int i=0;i<noofrow;i++) {
			for(int j=0;j<noofcol;j++) {
				str=str+arr[i][j];
				arr[i][j]=str;
				//System.out.println(" first row is : " +str);

			
			System.out.println((i+1) +" row is : " + arr[i][j] +" ");
			}
		}
		//System.out.println(arr[i);

	}

}
