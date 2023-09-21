package Array_Basic;

import java.io.*;

public class ProductOfElements {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of test cases : ");
		int T = Integer.parseInt(br.readLine());
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		System.out.println("Enter array elements : ");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int prod = 1;
		for(int i=1; i<arr.length; i++) {
			prod = prod*arr[i];
		}
		System.out.println("Product of given array elements is : "+prod);
	}
}
