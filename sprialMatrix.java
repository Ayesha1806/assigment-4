package Assigmnet4;

public class sprialMatrix {

	
	static void spiralPrint(int m, int n, int a[][])  
	{  
	int i, k = 0, l = 0;  
	
	while (k < m && l < n)   
	{  
	for (i = l; i < n; ++i)   
	{  
	System.out.print(a[k][i] + " ");  
	}  
	k++;  
	  
	for (i = k; i < m; ++i)   
	{  
	System.out.print(a[i][n - 1] + " ");  
	}  
	n--;  
	if (k < m)   
	{  
	for (i = n - 1; i >= l; --i)   
	{  
	System.out.print(a[m - 1][i] + " ");  
	}  
	m--;  
	}  
	if (l < n)   
	{  
	for (i = m - 1; i >= k; --i)   
	{  
	System.out.print(a[i][l] + " ");  
	}  
	l++;  
	}  
	}  
	}  
	//driver Code  
	public static void main(String args[])  
	{  
	int row = 5;  
	int col = 5;  
	//array to print in spiral form  
	int arr[][] = { {1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9} };  
	spiralPrint(row, col, arr);  
	}  
	}  