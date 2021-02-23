package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class q42583 {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {        	
		int answer = 0;
		int max = 0;
		
		Queue<Integer> q = new LinkedList<>();
		
		//for문 안에 조건이 3가지임
		//조건 1. 다리가 비어있을 때
		//조건 2. 다리가 꽉 차 있을 때 
		//조건 3. 둘 다 아닐 때 
		
		//조건 3에는 무게 조건이 추가로 붙는다 
		//조건 3-1. 다리 무게 초과했을 때
		//조건 3-2. 다리 무게 이하일 때
		
		for(int i:truck_weights) {
			while(true) {
				if(q.isEmpty()) {
					q.offer(i);
					max += i;
					answer++;
					break;
				}else if(bridge_length == q.size()) {
					max -= q.poll();
				}else {
					if(max+i > weight) {
						q.offer(0);
						answer++;
						
					}else{
						q.offer(i);
						max += i;
						answer++;
						break;
					}
				}
			}
		}
		
		return answer + bridge_length;
    }
	public static void main(String[] args) {
		int[] arr = {7,4,8,6};
		System.out.println(solution(2,10,arr));
	
	
	}

}
