package Array_Easy;
import java.io.*;
import java.util.HashSet;
class Duplicates {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        HashSet<Integer> seen = new HashSet<>();

        boolean foundDuplicate = false;
        
        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.print(num+" ");
                foundDuplicate = true;
            }
            seen.add(num);
        }

        if (!foundDuplicate) {
            System.out.println("-1");
        }

    }
}
