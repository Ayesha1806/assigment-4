package Assigmnet4;

public class sumOfDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] arr= {{1,5,7},{2,6,8},{5,8,2}};
		int[][] arr= {{1,2,3},{4,5,5},{9,12,15}};

		int noofrows=arr.length;
		int noofcols=arr[0].length;
		int diagonal=0;
		for(int i=0;i<noofrows;i++) {
			for(int j=0;j<noofcols;j++) {
				if(i+j==2) {
					diagonal=diagonal+arr[i][j];
				}
			}
			
		}
		System.out.print("diagonal elements are :" + diagonal);

	}

}
