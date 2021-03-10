package algorithm.프로그래머스;

import java.util.Arrays;
import java.util.Collections;

public class 가장큰수 {

	private static String[] toStringArray(int[] arr) {
		String[] str = new String[arr.length];
		for(int i = 0;i<arr.length;i++) {
			str[i] = String.valueOf(arr[i]);
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		
		//입력된 정수형 배열
		int num[] = {6,10,2};
		
		//num 의 인수를 문자열로 전환하여 담을 배열
		String[] str = toStringArray(num);
		
		Arrays.sort(str,(o1,o2)->(o2+o1).compareTo(o1+o2));
		
		if(str[0].equals("0")) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length;i++) {
			sb.append(str[i]);
		}
		String answer ="";
		
		answer = new String(sb);
		System.out.println(answer);
		
		
		
	

	}

}
