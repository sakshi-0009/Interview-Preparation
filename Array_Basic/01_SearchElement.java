package Array_Basic;

import java.io.*;

class SearchElement {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		System.out.println("Enter array elements : ");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int flag = 0;
		System.out.println("Enter element to search : ");
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				System.out.println(n+" found at index "+i);
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Enter valid element!");
		}
	}
}
