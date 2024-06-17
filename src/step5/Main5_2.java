package step5;

import java.util.*;

public class Main5_2 {
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[][] classes = new int[n][3];

	        for (int i = 0; i < n; i++) {
	            classes[i][0] = scanner.nextInt(); // N
	            classes[i][1] = scanner.nextInt(); // S
	            classes[i][2] = scanner.nextInt(); // E
	        }


	        System.out.println(minimumClassrooms(classes));
	    }

	 public static int minimumClassrooms(int[][] classes) {
	        // 수업을 시작 시간(S) 기준으로 정렬
	        Arrays.sort(classes, Comparator.comparingInt(o -> o[1]));

	        // 우선순위 큐 초기화 (종료 시간(E)을 저장)
	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        for (int[] cls : classes) {
	            int start = cls[1];
	            int end = cls[2];
	            // 현재 수업의 시작 시간이 가장 빨리 끝나는 수업의 종료 시간보다 크거나 같다면
	            if (!pq.isEmpty() && pq.peek() <= start) {
	                pq.poll();
	            }
	            // 현재 수업의 종료 시간을 큐에 추가
	            pq.offer(end);
	        }

	        // 큐의 크기가 필요한 강의실의 최소 개수
	        return pq.size();
	}

}
