package solutionPackage;

// 다리를 지나는 트럭

//다리를 지나는 트럭

import java.util.Queue;
import java.util.LinkedList;

class Solution_42583 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> bridge = new LinkedList<>();
     
		int time = 0;
		int total = 0;

		for(int truck : truck_weights){
			while(true){
				if(bridge.isEmpty()){
					bridge.offer(truck);
					time++;
					total += truck;
					break;
				}
				else if(bridge.size() == bridge_length){
					total -= bridge.poll();
				}
				else {
					if(weight >= total + truck){
						bridge.offer(truck);
						time++;
						total += truck;
						break;
					}
					else{
						bridge.offer(0);
						time++;    
					}
				}
			}   // while
		}   // forEach
		
		return time + bridge_length;
	}   // solution
}

