package Array_Basic;
import java.io.*;
class Product {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first array size : ");
        int size1 = Integer.parseInt(br.readLine());

        System.out.println("Enter first array elements : ");
        int firstArr[] = new int[size1];
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter second array size : ");
        int size2 = Integer.parseInt(br.readLine());

        System.out.println("Enter second array elements : ");
        int secArr[] = new int[size2];
        for (int i = 0; i < secArr.length; i++) {
            secArr[i] = Integer.parseInt(br.readLine());
        }
        
        int max = firstArr[0];
        for (int i = 1; i < firstArr.length; i++) {
            if (firstArr[i] > max) {
                max = firstArr[i];
            }
        }
        System.out.println(max);

        int min = secArr[0];
        for (int i = 1; i < secArr.length; i++) {
            if (secArr[i] < min) {
                min = secArr[i];
            }
        }
        System.out.println(min);
        
        int product = max*min;
        System.out.println("Product of max in first and min in second: " + product);
    }
}
