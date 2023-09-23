package Array_Easy;
import java.io.*;
class ElementOccurance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the element to count its occurrences : ");
        int target = Integer.parseInt(br.readLine());       
        int count = 0;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}
