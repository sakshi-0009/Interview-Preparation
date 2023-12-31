package Array_Easy;

import java.io.*;

class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int n = arr.length + 1;

        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;
        for (int i = 1; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missingElement = expectedSum - actualSum;

        System.out.println("The missing element is: " + missingElement);
    }
}
