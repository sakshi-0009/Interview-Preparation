package Array_Easy;
import java.io.*;
class CheckSorted {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int n = arr.length;
        
        boolean isSorted = true;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        
        if (isSorted) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
