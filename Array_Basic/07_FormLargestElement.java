package Array_Basic;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class FormLargestElement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        String[] numsAsStrings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numsAsStrings[i] = Integer.toString(arr[i]);
        }
        Arrays.sort(numsAsStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        if (numsAsStrings[0].equals("0")) {
            System.out.println("0");
        }
        StringBuilder result = new StringBuilder();
        for (String num : numsAsStrings) {
            result.append(num);
        }

        System.out.println("Largest element formed is : " + result.toString());
    }
}
