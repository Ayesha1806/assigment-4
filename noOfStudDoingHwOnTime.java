package Assigmnet4;
//import java.util.Scanner;

public class noOfStudDoingHwOnTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] startTime= {1,2,3,3};
		int[] endTime= {3,2,7,8};
		int queryTime=4;
		int noofstud=0;
		for(int i=0;i<startTime.length;i++) {
			
			if(startTime[i]<=queryTime && endTime[i]>=queryTime) {
				noofstud++;
			}
		}
		System.out.print(noofstud);
	}
}