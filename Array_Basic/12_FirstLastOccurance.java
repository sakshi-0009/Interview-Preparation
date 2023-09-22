package Array_Basic;
import java.io.*;
class FirstLastOccurance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter element to search : ");
        int target = Integer.parseInt(br.readLine());

        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        if (firstIndex != -1 && lastIndex != -1) {
            System.out.println("First occurrence : "+ firstIndex);
            System.out.println("Last occurrence : "+ lastIndex);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
