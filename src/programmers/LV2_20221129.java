package programmers;

public class LV2_20221129 {
	/*
	 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를
	 * "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요. 예를들어 s가 "1 2 3 4"라면 "1 4"를
	 * 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
	 */
	public String solution(String s) {
		String slist[] = s.split(" ");
		int max = Integer.parseInt(slist[0]);
		int min = max;

		for (int i = 0; i < slist.length; i++) {// int 변환
			int present = Integer.parseInt(slist[i]);

			if (present > max)
				max = present;
			if (present < min)
				min = present;
		}
		String answer = min + " " + max;
		return answer;
	}

	/*
	 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는
	 * 이어지는 알파벳은 소문자로 쓰면 됩니다. "3people~" 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는
	 * 함수, solution을 완성해주세요.
	 */
	public String solution2(String s) {

		char[] list=s.toLowerCase().toCharArray();
		if(list[0]>96&&list[0]<123) {list[0]=(char)(list[0]-32);}
		for(int i=1;i<list.length;i++) {
			if(list[i-1]==' ') {
				//char[] cc=(String.valueOf(list[i]).toUpperCase()).toCharArray();
				//list[i]=cc[0]; 두 방법 다 사용가능
				if(list[i]>96&&list[i]<123) {list[i]=(char)(list[i]-32);}
			}
		}
		 String answer = new String(list);	
	return answer;
	}

	public static void main(String[] args) {
		LV2_20221129 lv=new LV2_20221129();
	System.out.println(lv.solution2("3as    3df 34sad"));
	System.out.println(lv.solution2("as dfsda wer  "));

	}

}
