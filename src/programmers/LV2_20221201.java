package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV2_20221201 {
/*이진 변환 반복하기
문제 설명
0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
x의 모든 0을 제거합니다.
x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
0과 1로 이루어진 문자열 s가 매개변수로 주어집니다.
s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 
이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
제한사항
s의 길이는 1 이상 150,000 이하입니다.
s에는 '1'이 최소 하나 이상 포함되어 있습니다.
 */
	 public int[] solution(String s) {
		 int numofzero=0;
		 int numofrun=0;
		 while(!s.equals("1")) {
			 int c=s.replace("0", "").length();
			 numofzero+=s.length()-c;
			 //c를 이진수로 바꾸기
			 List<Integer>binarylist=new ArrayList<Integer>();
			 while(c>=1) {
				 binarylist.add(c%2);
				 c=c/2;
			 }
			 Collections.reverse(binarylist);
			 int[] binaryarray = binarylist.stream().mapToInt(i->i).toArray();
			 //↑스트림으로 바꾸고 하나씩 Integer에서 int로 바꿔서 배열로 만들기
			 s = Arrays.toString(binaryarray).replaceAll("[^0-9]", "");
			//정규식 표현, 숫자빼고 다
			 numofrun++;
		 	}
		 
		 int[] answer = {numofrun,numofzero};
	        return answer;
	    }	
/*숫자의 표현
Finn은 요즘 수학공부에 빠져 있습니다.
수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다.
예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
 */	
public int solution(int n) {
	int answer = 0;
	int sum=0;
	for(int i=1;i<=n;i++) {
System.out.println("시작숫자: "+i);		
			for(int j=i;j<=n;j++) {
				sum+=j;
System.out.println(j+"더하기 "+sum);				
				if(sum>=n) {
					if(sum==n) {answer++;}
					sum=0;
					break;
					}
			}
	}
	return answer;
}
	
	public static void main(String[] args) {
		LV2_20221201 lv= new LV2_20221201();
	System.out.println(lv.solution(15));

	}

}
