package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date0425_Q18108 {

	public static void main(String[] args) {
		int gap=2541-1998;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int inputyear = Integer.parseInt(br.readLine());
			br.close();
			System.out.println(inputyear-gap);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
