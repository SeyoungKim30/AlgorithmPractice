package programmers.LV2;
/**
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 
정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. 
n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 */
public class Date20230530_Q12953 {
	
	
	static  public int solution(int[] arr) {
        int lcm = arr[0];
        for(int i=1;i<arr.length;i++){
        	lcm = lcm*arr[i] / gcd(lcm,arr[i]);
        	System.out.println(lcm);
        }
        return lcm;
    }
    
  static public int gcd(int s, int l){
	       //최대공약수
	       if(s>l){
	           int temp=s;
	           s=l;
	           l=temp;
	       }
	       int mod = 0;
	       while(s!=0){
	           mod=l%s;
	           l=s;
	           s=mod;
	       }
	       return l;
	   }    
    
    
	public static void main(String[] args) {
		int [] arr = {2,6,8,14};
		System.out.println(solution(arr));
		
	}
}
