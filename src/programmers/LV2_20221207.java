package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LV2_20221207 {
/*
N개의 최소공배수
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
예를 들어 2와 7의 최소공배수는 14가 됩니다.
정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.
 */
	  public int solution(int[] arr) {
	  int answer = 1;
	  Arrays.sort(arr);
	//[2,6,8,14]	답 168=2*6*14
	  //소인수분해해서 소수끼리 곱함 (같은게 있으면 지수가 크게 나온거 하나만)
	  String[] sarr=new String[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			sarr[i] = primeandindex(arr[i])[0];
			sarr[i+arr.length] = primeandindex(arr[i])[1];
		/*	String quotient="";
				for(int division=2;division<arr[i];division++){
					while(a%division==0) {
						   a/= division;
						   quotient += division+" ";
					}
				}
				quotient= Arrays.stream(quotient.split(" ")).distinct().collect(Collectors.joining(" "));	//소인수분해해서 문장으로 만들었음
		sarr[i] = quotient;
		System.out.println(i+"의 소수 모음 : "+quotient);*/		
		}
		//소수끼리 같은것 중에 큰 수를 1로 바꾸고 다 곱하면 됨
		for(int i=0;i<arr.length;i++) {	//대상숫자들
			System.out.println(arr[i]);
			for(int j=i+1;j<arr.length;j++) {	//약수들
				if(sarr[i].equals(sarr[j])) {
				arr[j]=1;
				System.out.println("소수 중복: arr["+j+"]는 1이 되었다");
			}}
			answer=answer*arr[i];
		}
		
		
	    return answer;
	    }

	  public String[] primeandindex(int a) {
		  String[] primeandindex = new String[2];
			primeandindex[0]="";
			primeandindex[1]="";
			int atemp=a;
			
			for(int divisor=2;divisor<=Math.sqrt(a);divisor++) {
				int tempindex=0;
				while(atemp%divisor==0) {
						atemp/= divisor;
						tempindex++;
				}
				if(tempindex>0) {
					primeandindex[0]+=divisor+",";
					primeandindex[1]+=tempindex+",";
				}
			}
			primeandindex[0]+= a;
			primeandindex[1]+="1";
			return primeandindex;

	  }
	  
	public static void main(String[] args) {
		LV2_20221207 lv=new LV2_20221207();
		int [] arr= {12, 32, 45, 67, 72};
		//System.out.println(lv.solution(arr));	//소수가 2만 있는거랑 2랑 3있는거랑 중복으로 잡혀서
		
		//소인수분해 해서 소수primenumber와 지수index까지 구하기
		int a=32041; //1 2 3 4 '6' 9 12 18 36
		System.out.println(lv.primeandindex(345)[0]);
		System.out.println(lv.primeandindex(345)[1]);
		
		
	}

}
