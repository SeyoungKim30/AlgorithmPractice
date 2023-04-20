package programmers;

public class LV1_20221205 {
/*0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.*/
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0;i<=9;i++) {
        	answer+=i;
        	for(int a:numbers) {
        		if(a==i) {
        			answer-=i;
        		}
        	}
        }
        return answer;
    }

/*단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.*/
    public String solution(String s) {
     String answer = s.substring((int)Math.round(s.length()/2.0)-1, s.length()/2+1);
        return answer;
    }
/*
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다.
a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 */	 
    public int solution(int[] a, int[] b) {
     int answer = 0;
     for(int i=0;i<a.length;i++) {
    	 answer+= a[i]*b[i];
     }
     return answer;
 }
	public static void main(String[] args) {
		LV1_20221205 lv=new LV1_20221205();
		
	}

}