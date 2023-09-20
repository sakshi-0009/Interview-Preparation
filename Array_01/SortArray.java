// WAP to create an array of n integer elements. insert from user and sort the array in ascending order.

package Array_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortArray {
	
	void SortArrayElemenys(int arr[]) {
		int temp=0;
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
		System.out.println("Sorted array in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } 
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
		
		SortArray obj = new SortArray();
		obj.SortArrayElemenys(arr);	
	}

}
