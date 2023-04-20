package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C3_10815 {

/*	n 가지고 잇는 카드의 개수
	arr1 카드에 적힌 정수
	m 아래 배열의 길이
	arr2 이게 arr1에 있는지 구해야됨
	*/
	

	public int binarySearch(int[] arr, int length, int a) {
		//arr 중에 a가 어디에 있는지 찾아낼거임
		int left=0;
		int right=length-1;
		
		while(left<=right) {
			int divider=(left+right)/2;
			if(arr[divider]==a) {
				return divider;
			}else if(arr[divider]<a) {	//피벗값이 a보다 작으면 뒤에부분 검색
				left=divider+1;
			}else {
				right=divider-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		C3_10815 main =new C3_10815();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//스캐너 입력받아서 띄어쓰기마다 쪼개기
        int n = Integer.parseInt(st.nextToken());	//처음 받은걸로 n 생성
        int[] arr1 = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");//문장 받아서 arr1 만들거 
        for(int i=0;i<n;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        
    	int[] answer = new int[m] ;
    	for(int i=0;i<m;i++) { 
    		if(main.binarySearch(arr1,n,arr2[i])!=-1) {
    			answer[i]=1;
    		}else {
    			answer[i]=0;
    		}
    	}
    	
     for(int a: answer) {
    	 System.out.print(a+" ");
     }   
		
		
	}
	
}
