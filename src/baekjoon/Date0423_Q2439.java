package baekjoon;

import java.util.Scanner;

public class Date0423_Q2439 {
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 (별은 오른쪽정렬)
	public void q2439(int n) {
		for(int i=1;i<=n;i++) {
			System.out.printf("%"+(n+1)+"s","*".repeat(i)+"\n");
		}
	}
	
	//n*2쥴짜리 다이아몬드
	public void diamond(int n) {	//홀수만 입력하세요
		int middle = n/2+1;		//ex n=7, middle =4
		String empty="";
		String star="";
		
		for(int height=1; height<= n; height++) {
			if(height<=middle) {
				empty=" ".repeat(middle-height);
				star="*".repeat(height*2-1);
			}else {
				empty=" ".repeat(height-middle);
				star="*".repeat((n-height)*2 +1);
			}
			System.out.println(empty+star);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Date0423_Q2439 main=new Date0423_Q2439();
		main.diamond(n);
	}

}
