package Assigmnet4;


public class intersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4,5};
		int[] arr2= {2,3,4,7,8};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[j] +"," );
				}
			}
		}
	}
	}

