package programmers;

public class LV1_20221128 {
	/*
	 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요. 예를들어 N = 123이면
	 * 1 + 2 + 3 = 6을 return 하면 됩니다.
	 */
	 public int solution(int n) {
	        int answer = 0;
	        String nstr=""+n;
	        String[] splitted=nstr.split("");
	        for(int i=0;i<splitted.length;i++) {
	        	answer+=Integer.parseInt(splitted[i]);
	        }
	        return answer;
	    }
	   
	 //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
	 public int[] q2(long n) {
		 int length=(""+n).length();
	        int[] answer = new int[length];
	        for(int i=0;i<length;i++) {
	        	 answer[i]=(int) (n%Math.pow(10,i+1)/Math.pow(10, i));
	        	 /*
	        	 answer[i]=(int) (n%10);
	        	 n /=10;
	        	 */
	        	 
	        }
	        return answer;
	    }
//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
	 public long q3(long n) {
		 long answer = -1;
		 long x=(long) Math.sqrt(n);	//정수
		 if(x*x==n) {
			 answer= (x+1)*(x+1);
			 }
	 return answer;
	    }
//	문자열 내 p와 y의 개수
/*대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.*/
	  boolean q4(String s) {
	        boolean answer = true;
	        int numP=0;	
	        int numY=0;
	       for(char c:s.toCharArray()) {
	    	   if(c=='P'||c=='p') numP++;
	    	   if(c=='Y'||c=='y') numY++;
	       }
	       if(numP!=numY) answer=false;
	       return answer;
	    }	 
	 
	 
	public static void main(String[] args) {
		LV1_20221128 test=new LV1_20221128();
		System.out.println(test.q3(36));
		System.out.println(test.q3(35));
		System.out.println(test.q4("pppyyy"));
		System.out.println(test.q4("pyyy"));
	}

}
