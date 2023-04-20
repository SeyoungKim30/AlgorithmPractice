package programmers;

public class LV2_20221202 {
/*피보나치 수
문제 설명
피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
예를들어
F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
와 같이 이어집니다.
2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.*/
    public long solution(int n) {
    	//n자리수까지만 피보나치 구하기
    	//(a + b) % m = ((a % m) + (b % m)) % m
    	n++;
    	long [] fibonacci = new long[n];
//    	long lastlastnum=0;
//    	long lastnum=1;
    	fibonacci[0]=0%1234567;
    	fibonacci[1]=1%1234567;
    	for(int i=2;i<n;i++) {
//    		long thisnum=lastlastnum+lastnum;
//    		fibonacci[i]= (thisnum%1234567);
    		fibonacci[i]= (fibonacci[i-1]+fibonacci[i-2])%1234567;
//    		lastlastnum=lastnum;
//    		lastnum=thisnum;
    	}
        long answer = fibonacci[n-1];
        return answer;
    }	
/*
다음 큰 숫자
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
	조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
	조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
	조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
 */	
    public int solution2(int n) {
        int answer = n+1;
    	int n1=Integer.toBinaryString(n).replace("0","").length();
    	int answer1=Integer.toBinaryString(answer).replace("0","").length();
        while(answer1!=n1) {
        	answer++;
        	answer1=Integer.toBinaryString(answer).replace("0","").length();
        }
        return answer;
    }
    
    
	public static void main(String[] args) {
		LV2_20221202 lv= new LV2_20221202();
	


	}

}
