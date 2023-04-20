package programmers;

public class LV1_20221201 {
/*콜라츠 추측
 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
	1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
	2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 
	예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 
	위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 
	단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
*/	
	public int solution(long num) {
		int answer = 1;
		if (num == 1) {
			return 0;
		}

		while (answer <= 500) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			if (num == 1) {
				break;
			} else {
				answer++;
			}
			System.out.println(answer+"회: "+num);
		}
		
		if (num != 1) answer = (-1);
		return answer;
	}
/*String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, 
 * "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
 * seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.*/	
	public String solution(String[] seoul) {
		int x=0;
		for(String ss:seoul) {
			if(ss.equals("Kim")) {
				break;
			}else {
				x++;
				}
			}
		String answer = "김서방은 "+x+"에 있다";
		return answer;
	    }
/*	프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.*/
	   public String solution(String phone_number) {
		  int idx = phone_number.length()-4;
	        String answer ="";
	        for(int i=0;i<idx;i++) {
	        	answer+="*";
	        }
	        answer+=phone_number.substring(idx);
	        return answer;
	    }
//	0 1 2 3 / 4 5 6 7
	
	public static void main(String[] args) {
		LV1_20221201 lv= new LV1_20221201();
		System.out.println(lv.solution("01234567"));
}

}
