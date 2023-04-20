package programmers;

import java.util.Arrays;


public class LV2_20221130 {
	/*
길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다. 
이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)*/
	public int solution(int []A, int []B) {
        int answer = 0;
    	Arrays.sort(A);
    	Arrays.sort(B);
//    	Integer[] Breverse=Arrays.stream(B).boxed().toArray(Integer[]::new);
 //   	Arrays.sort(Breverse, Comparator.reverseOrder());  
    	int times=0;
        for(int i=0;i<A.length;i++) {
        	times=A[i]*B[B.length-1-i];
//        	times=A[i]*Breverse[i];
        	answer+=times;
        }
        return answer;
    }
/*괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.*/
	  boolean solution(String s) {
	        boolean answer = true;
	        int open=0;
	        int close=0;
	        for(char c:s.toCharArray()) {
	        	 if(c=='(') {
	        		 open++;
	        	 }else {
	        		 close++;
	        	 }
	        if(open<close) {
	        	answer=false;
	        	break;}
	        }
	        System.out.println(open);
	        System.out.println(close);
	        if(open!=close) answer=false;
	        return answer;
	    }
	
	public static void main(String[] args) {
		LV2_20221130 lv=new LV2_20221130();
		lv.solution("()())");
		



	}

}
