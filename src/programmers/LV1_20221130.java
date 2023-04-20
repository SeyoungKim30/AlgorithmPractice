package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class LV1_20221130 {
//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//예를들어 n이 118372면 873211을 리턴하면 됩니다.
	public long solution(long n) {
		String[] list = String.valueOf(n).split("");
		Arrays.sort(list,Comparator.reverseOrder());//배열로 만들어서 역순 정렬
		String str="";
		for(String s:list) {str+=s;}
		long answer = Long.parseLong(str);
		return answer;
	}
/*
자연수 n이 매개변수로 주어집니다. 
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
답이 항상 존재함은 증명될 수 있습니다.*/
	 public int solution(int n) {
	        int x = 1;
	        while(n%x!=1) {
	        	x++;
	        }
	    return x;
	    }
/*두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.*/	
	public long solution(int a, int b) {
		long answer = 0;
		int max= a>b?a:b;
		int min= a<b?a:b;
		while(min<=max) {
			answer+=min;
			min++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		LV1_20221130 nn=new LV1_20221130();
		System.out.println(nn.solution(12134329));
		/*String[] list = {"12","22","33","44"};
		Arrays.sort(list,Comparator.reverseOrder());
		System.out.println(list[0]);
		System.out.println(list[1]);*/
		System.out.println(nn.solution(188));
	}

}
