package programmers;

import java.util.Arrays;

public class LV2_20221206_2 {
	/*구명보트
	무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 
	구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
	사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 
	구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만
	1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.
	구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
	사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때,
	모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
		무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다.
		각 사람의 몸무게는 40kg 이상 240kg 이하입니다.
		구명보트의 무게 제한은 40kg 이상 240kg 이하입니다.*/
	public int solution(int[] people, int limit) {
		int boat = people.length;
		Arrays.sort(people);
		int behindindex=people.length-1;	//뒤에서부터
		int leave=0;
		while(leave<behindindex) {
			System.out.println(leave +"<"+behindindex);
			if(people[leave]+people[behindindex]<=limit) {
				boat--;
				leave++;
			}
			behindindex--;	//같이 못타도 혼자 타고 가니까 보내버리기
			//무거운애는 가도 가벼운애는 다른사람이랑 다시 비교해야하니까 leave는 남겨두고 leave랑 behind가 같아지면(혼자가야하면) 어차피 얘보다 무거운애들도 혼자가야하니까 보트수량 끝
		}
		return boat;
	   }	
	
	public static void main(String[] args) {
		LV2_20221206_2 lv=new LV2_20221206_2();
		int [] people= {40, 50, 55, 60, 65, 70, 75, 80};
		int [] people2= {70,80,50};
		System.out.println(lv.solution(people2,100));
	}

}
