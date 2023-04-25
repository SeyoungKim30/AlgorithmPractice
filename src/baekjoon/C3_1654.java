package baekjoon;

public class C3_1654 {
	
	/*k는 가지고 있는 랜선의 갯수 (길이 모두 다름) 1~10000
	n은 필요한 랜선의 갯수 1~1000000
	m은 길이
	*/
	public int q1(int k, int n, int l1, int l2, int l3,int l4) {
		int m=0;
		System.out.println((l1+l2+l3+l4)/n);

		return m;
	}

	public static void main(String[] args) {
		C3_1654 me= new C3_1654();
		me.q1(4,11,802,743,457,539);
	}

}
