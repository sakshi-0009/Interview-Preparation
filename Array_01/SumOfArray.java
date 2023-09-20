// WAP to create an array of n integer elements. insert from user and print the sum of array.

package Array_01;

import java.io.*;

public class SumOfArray {

	void ArraySum(int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array is: "+sum);
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array size: ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		SumOfArray obj = new SumOfArray();
		obj.ArraySum(arr);	
	}
}
