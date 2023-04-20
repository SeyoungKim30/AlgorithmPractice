package programmers;

public class LV1_20221129 {
/*	문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.*/
	public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
/*양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.*/
    public boolean solution(int x) {
    	boolean answer = false;
    	int sum=0;
    	int y=x;
    	while(y>=1) {
    		sum+=y%10;
    		y/=10;
    	}
    	if(x%sum==0) {answer=true;}
        return answer;
    }
 /*
함수 solution 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.*/   
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++) {
        	answer[i]=(long)x*(i+1);
        }
        return answer;
    }
    
	public static void main(String[] args) {
		int x=-10000000;
		int n=1000;
		  long[] answer = new long[n];
	        for(int i=0;i<n;i++) {
	        	answer[i]=(long)x*(long)(i+1);
	        	System.out.println(i+"번째:"+answer[i]);
	        }

	}

}
