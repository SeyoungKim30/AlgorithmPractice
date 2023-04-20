package programmers;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LV2_20221206 {
/*짝지어 제거하기
짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 
먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다. 
그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 
이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요.
성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.
예를 들어, 문자열 S = baabaa 라면 
b aa baa → bb aa → aa → 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다. 문자열은 모두 소문자로 이루어져 있습니다.
*/
	public int solution(String s) {
		//list로 만들기
		//List<String> slist =new ArrayList<>(Arrays.asList(s.split("")));
		Stack<String> sstack= new Stack<>();
		for(String ss:s.split("")) {
			if(sstack.size()==0) {
				sstack.push(ss);
			}else if(sstack.peek().equals(ss)){
				sstack.pop();
			}else {
				sstack.push(ss);
			}
		}
		int answer = (sstack.size()==0)?1:0;
		return answer;
	}
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
		int answer = people.length;
		Arrays.sort(people);
	int j=people.length-1;	//밖에 둬야 없어진 인덱스 유지됨
	for(int i=0;i<people.length;i++) {
		if(people[i]<=limit/2) {
			int j2=j;
			while(j2>i) {
				j--;
				System.out.println("i인덱스는 "+i);
				System.out.println("j인덱스는 "+j);
				if(people[i]+people[j]>limit) {
					System.out.println("j--실행 : " +(j-1));
				}else {
					answer--;
					System.out.println("탑승가능, j는: "+j);
					break;
				}
			}
		}
	}
		return answer;
	   }	
	
	public static void main(String[] args) {
		LV2_20221206 lv=new LV2_20221206();
		int [] people= {40, 50, 55, 60, 65, 70, 75, 80,85, 90};
		int [] people2= { 40, 40, 40, 40};
		System.out.println(lv.solution(people,150));
	}

}
