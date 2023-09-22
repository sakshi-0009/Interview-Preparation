package Array_Basic;

import java.io.*;
import java.util.Arrays;

class RemoveIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter index to remove : ");
        int indexToRemove = Integer.parseInt(br.readLine());
        
        if (indexToRemove < 0 || indexToRemove >= arr.length) {
            System.out.println("Invalid index to remove");
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != indexToRemove) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.print("Array after removing element : "+Arrays.toString(newArr));
    }
}
