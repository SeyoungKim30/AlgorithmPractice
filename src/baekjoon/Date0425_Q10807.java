package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Date0425_Q10807 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//스캐너 입력받아서 띄어쓰기마다 쪼개기
       
        int n = Integer.parseInt(st.nextToken());	//입력할 정수의 갯수
        
        int[] arr= new int[n];	//입력받은 정수
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++) {
        	arr[i]=Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(st.nextToken());	//찾으려는 정수
        
       int answer=0;
       for(int ii:arr) {
    	   if(ii==v) answer++;
       }
       System.out.println(answer);

	}

}
