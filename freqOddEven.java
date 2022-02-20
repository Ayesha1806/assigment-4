package Assigmnet4;


public class freqOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,3,5},{2,4,1},{7,8,9}};
		int noofrows=arr.length;
		int noofcol=arr[0].length;
		int even=0,odd=0;
		for(int i=0;i<noofrows;i++) {
			for(int j=0;j<noofcol;j++) {
				if(arr[i][j]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
		}
		System.out.println("noof even :" +even);
		System.out.println("noof even :" +odd);
		

	}

}
