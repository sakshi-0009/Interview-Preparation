package Array_Basic;

import java.io.*;

class ReplaceAllZeros {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number : ");
		int N = Integer.parseInt(br.readLine());
		
		String strNum = String.valueOf(N);

		strNum = strNum.replaceAll("0", "5");

        int newNum = Integer.parseInt(strNum);

        System.out.println("Number after replacing 0's with 5 : "+newNum);
    }
}
