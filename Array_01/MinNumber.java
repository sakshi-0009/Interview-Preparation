// WAP to create an array of n integer elements. insert from user and print the Minimum number.

package Array_01;

import java.io.*;

public class MinNumber {

	void MinimumNumber(int arr[]) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element is: "+min);
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
		MinNumber obj = new MinNumber();
		obj.MinimumNumber(arr);	
	}
}
