// WAP to create an array of n integer elements. insert from user and print the Maximum number.

package Array_01;

import java.io.*;

public class MaxNumber {

	void MaximumNumber(int arr[]) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Minimum element is: "+max);
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
		MaxNumber obj = new MaxNumber();
		obj.MaximumNumber(arr);	
	}
}
