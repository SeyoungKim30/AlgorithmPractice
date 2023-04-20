package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;


public class LV1_20221206 {
	
/*길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.*/
    public String solution(int n) {
        String answer = "";
        String s0="수";
        String s1="박";
        for(int i=0;i<n;i++){
            answer+=(i%2==0)?s0:s1;
        }
        return answer;
    }
/*문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.*/   
    public String solution(String s) {
        String answer = "";
    	String[] list= s.split("");
        Arrays.sort(list,Comparator.reverseOrder());
    for(String ss:list) {
    	answer+=ss;
    }
        return answer;
    }

/*두 정수 left와 right가 매개변수로 주어집니다. 
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.*/  
    public int solution(int left, int right) {
        int answer = 0;
    	for(int i=left;i<=right;i++) {
        	int divicnt=0;	
    		for(int j=1;j<=i;j++) {
    			if(i%j==0) {divicnt++;}
    		}
    		if(divicnt%2==0) {
    			answer+=i;
    			}else {
    			answer-=i;	
    			}
    	}
        return answer;
    }
   
    
	public static void main(String[] args) {
		LV1_20221206 lv=new LV1_20221206();
	//	System.out.println(lv.solution(4,9));
	//	System.out.println(Math.pow(2, 9));
		lv.solution(71, 72);
	}

}
