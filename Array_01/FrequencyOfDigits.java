// WAP to create an array of n integer elements. insert from user and find the frequency of digits.

package Array_01;

import java.io.*;

public class FrequencyOfDigits {

	void DigitFrequency(int arr[]) {
	
		int freq[]= new int [arr.length];
		
		int visited = -1;
		for(int i = 0; i < arr.length; i++){  
	        int count = 1;  
	        for(int j = i+1; j < arr.length; j++){  
	            if(arr[i] == arr[j]){  
	                count++;  
	                freq[j] = visited;  
	            }  
	        }
	        if(freq[i] != visited) {
	        	freq[i]=count;
	        }
	    }
		for(int i=0; i<freq.length; i++) {
			if(freq[i]!=visited) {
				System.out.println("Frequency of "+arr[i]+" is "+freq[i]);
			}
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
		FrequencyOfDigits obj = new FrequencyOfDigits();
		obj.DigitFrequency(arr);	
	}
}
