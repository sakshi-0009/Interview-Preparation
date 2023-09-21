package Array_Basic;

import java.io.*;

class ElementsInRange {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter Start : ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter End : ");
        int end = Integer.parseInt(br.readLine());

		System.out.println("Enter array elements : ");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        boolean[] found = new boolean[end - start + 1];

        for (int element : arr) {
            int index = element - start;

            if (index >= 0 && index < found.length) {
                found[index] = true;
            }
        }
        for (boolean element : found) {
            if (!element) {
                System.out.println("No");
                break;
            }
        }
        System.out.println("Yes");
    }
}