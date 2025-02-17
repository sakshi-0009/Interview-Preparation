// WAP to create an array of n integer elements. insert from user and print the even elements.

package Array_01;

import java.io.*;

public class EvenNumber {

	void EvenNum(int arr[]) {
		System.out.println("Even Array elements are: ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array size: ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		EvenNumber obj = new EvenNumber();
		obj.EvenNum(arr);
	}
}
