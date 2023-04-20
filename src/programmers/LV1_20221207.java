package programmers;

public class LV1_20221207 {
/*문자열 다루기 기본
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.*/
	public boolean solution(String s) {
        boolean answer = false;
       if(s.length()==4||s.length()==6) {
    	   if(s.split("[0-9]").length==0) {
    		   //숫자만 있으면 길이가 0으로 나오고 문자가 껴있으면 숫자가 공백으로 바껴서 길이에 포함됨
    		   return true;
    	   }
       }
        return answer;
    }
	
/*	부족한 금액 계산하기
놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 
즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
단, 금액이 부족하지 않으면 0을 return 하세요.	
*/	
	   public long solution(int price, int money, int count) {
		   long answer=money;
	        for(int i=1;i<=count;i++){
	        	answer -= price*i;
	        }
	    
	        return answer<0?Math.abs(answer):0;
	    }	
	   
/*	   
행렬의 덧셈
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
*/
	   public int[][] solution(int[][] arr1, int[][] arr2) {
		   int row=arr1.length;
	       int col=arr1[0].length;	
	        int[][] answer = new int[row][col];
	       	for(int r=0;r<row;r++) {
	       		for(int c=0;c<col;c++) {
	       			answer[r][c]=arr1[r][c]+arr2[r][c];
	       		}
	       	}
	        return answer;
	    }


	   
	public static void main(String[] args) {
		LV1_20221207 lv=new LV1_20221207();

	}

}