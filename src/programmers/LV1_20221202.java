package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LV1_20221202 {
/*	나누어 떨어지는 숫자 배열
	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
제한사항
	arr은 자연수를 담은 배열입니다.
	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	divisor는 자연수입니다.
	array는 길이 1 이상인 배열입니다.*/
    public int[] solution1_2(int[] arr, int divisor) {
//        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    	IntStream intstm=Arrays.stream(arr);
    	int[] answer= intstm.filter(num->num % divisor==0).toArray();
        return answer;
    }
	
    public int[] solution1(int[] arr, int divisor) {
        
        int cnt=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor!=0) {
        		arr[i]=-1;
    		}else {
    			cnt++;	
    			}
        	}
        if(cnt==0) {
        	int[] answer= {-1};
        	return answer;
        	}
    	int[]answer=new int[cnt];
    	int j=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>0) {
    			answer[j]=arr[i];
    			j++;
    		}
    	}
    	Arrays.sort(answer);
        return answer;
    }

    //제일 작은 수 제거하기
/*정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
* 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
* 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.*/
    public int[] solution(int[] arr) {
    	IntStream istrm=Arrays.stream(arr);
    	int[] answer = new int[] {-1};
    	if(arr.length!=1) {
    	answer = istrm.filter(num->num!=Arrays.stream(arr).min().getAsInt()).toArray();
    	}
        return answer;
    }  
/*
음양 더하기
어떤 정수들이 있습니다. 
이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
제한사항
absolutes의 길이는 1 이상 1,000 이하입니다.
absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
signs의 길이는 absolutes의 길이와 같습니다.
signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
 */
public int solution(int[] absolutes, boolean[] signs) {
	int answer = 0;
	for(int i=0;i<signs.length;i++) {
		if(!signs[i]) {
			absolutes[i]=absolutes[i]*-1;
		}
		answer+=absolutes[i];
	}
    return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LV1_20221202 lv=new LV1_20221202();
		int[] arr= {1,2,3,4,5};
		for(int a:lv.solution(arr)) {
			System.out.println(a);
		}
	}

}
