package programmers;

import java.util.Arrays;
import java.util.stream.Stream;

public class LV2_20221205 {
/*Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때
카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.*/
    public int[] solution(int brown, int yellow) {	//10,2  8,1    24,24
        int[] answer = new int[2];
        int sum=(brown-4)/2;
        for(int i=0;i<sum;i++) {
        	answer[1]=i+2;
        	answer[0]=sum-i+2;
        	if((sum-i)*i==yellow)break;
        }
        return answer;
    }	
	/*
1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 
1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
이전에 등장했던 단어는 사용할 수 없습니다.
한 글자인 단어는 인정되지 않습니다.
tank → kick → know → wheel → land → dream → mother → robot → tank
끝말잇기를 계속 진행해 나가다 보면, 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 이전에 등장했던 단어이므로 탈락하게 됩니다.
사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 
가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성해주세요.
- 끝말잇기에 참여하는 사람의 수 n은 2 이상 10 이하의 자연수입니다.
- words는 끝말잇기에 사용한 단어들이 순서대로 들어있는 배열이며, 길이는 n 이상 100 이하입니다.
- 단어의 길이는 2 이상 50 이하입니다.
- 모든 단어는 알파벳 소문자로만 이루어져 있습니다.
- 끝말잇기에 사용되는 단어의 뜻(의미)은 신경 쓰지 않으셔도 됩니다.
- 정답은 [ 번호, 차례 ] 형태로 return 해주세요.
- 만약 주어진 단어들로 탈락자가 생기지 않는다면, [0, 0]을 return 해주세요
*/
    public int[] solution(int n, String[] words) {
       int[] answer = {0,0};	//누가, 몇번째에 탈락하는지
       int loser=0;
       for(int i=1;i<words.length;i++) {
    	 System.out.println("loser="+loser);
    	 char first=words[i].charAt(0);
    	 char last=words[i-1].charAt(words[i-1].length()-1);
    	 if(first!=last) {loser=i; break;} 
    	 for(int j=0;j<i;j++) {
    		if(words[i].equals(words[j])) {
    			loser=i;
    			System.out.println(words[i]+loser);
    			break;
    			   }
    	   }
    	 if(loser!=0)break;
       }
	   System.out.println("loser="+loser);
       if(loser!=0) {
    	   answer[0]=loser%n+1;
    	   answer[1]=loser/n+1;
    	   System.out.println("loser="+loser);
    	   System.out.println(answer[0]);
    	   System.out.println(answer[1]);
       }
        return answer;
    }
	
	public static void main(String[] args) {
		LV2_20221205 lv=new LV2_20221205();
		String[] words={"land", "dream", "mom", "mom", "land", "dream", "mother", "robot", "tank"};
		lv.solution(2,words);
	}

}
