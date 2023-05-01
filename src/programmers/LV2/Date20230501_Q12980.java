package programmers.LV2;


/*
K칸 점프 -> 건전지 K사용
지금까지 온 거리 *2 = 건전지 0 사용
N까지 가려면 최소 건전자 사용량

*/
public class Date20230501_Q12980 {

	static public int Q12980(int n) {
		return Integer.bitCount(n);
	}
	
	public static void main(String[] args) {
		Q12980(7);
		System.out.println(7%2);
	}

}
