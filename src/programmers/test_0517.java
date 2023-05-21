package programmers;

import java.util.ArrayList;
import java.util.List;

public class test_0517 {
	
	public int solution1(String s)
    {
		for(int i=s.length();i>0;i--) {
	          for(int j=0;j+i<=s.length();j++) {	//j는 문자열 시작하는 자리수
	             boolean flag = true;
	             for(int k=0;k<i/2;k++) {	//중간까지만 체크하면 됨
	                if(s.charAt(j+k)!=s.charAt(j+i-k-1)) {	//j는 문자열 시작, k는 지금 확인하는 자리수(앞에서 몇번째, 뒤에서 몇번째)
	                   flag=false;
	                   break;	//다른게 나오면 j부터 시작하는거 멈추고
	                }
	             }
	             if(flag) return i;
	          }
	       }
	      return 0;
    }
	
	int[][] solution2(int n, int[][] signs){
		for (int start = 0; start < n; start++) {
	        List<Integer> temps = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            if (signs[start][i] == 1) {
	                temps.add(i);
	            }
	        }
	
	        while (!temps.isEmpty()) {
	            int temp = temps.remove(temps.size() - 1);
	            for (int end = 0; end < n; end++) {
	                if (signs[temp][end] == 1 && signs[start][end] == 0) {
	                    signs[start][end] = 1;
	                    temps.add(end);
	                }
	            }
	        }
    }
    return signs;

}
	   
	public static void main(String[] args) {
		
	}
}
