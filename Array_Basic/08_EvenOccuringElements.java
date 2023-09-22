package Array_Basic;

import java.io.*;
import java.util.Arrays;
class EvenOccuringElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int maxElement = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[maxElement + 1];
        for (int num : arr) {
            count[num]++;
        }

        boolean foundEvenOccurrence = false;
        System.out.print("Elements occurring even times: ");

        for (int i = 0; i <= maxElement; i++) {
            if (count[i] % 2 == 0 && count[i] > 0) {
                System.out.print(i + " ");
                foundEvenOccurrence = true;
            }
        }

        if (!foundEvenOccurrence) {
            System.out.println("-1");
        }
    }
}
