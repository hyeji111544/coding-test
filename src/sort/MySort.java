package sort;

public class MySort implements ISort{
	
	
	@Override
	public void bubbleSort(int[] a) {
		// 배열의 전체 크기 잡아줌
		for(int i=a.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				
				if(a[j]> a[j+1]) {
					swap(a, j, j+1);
				}
			}
		}
	}
	
	
	@Override
	public void mergeSort(int[] a, int start, int end ) {
		// end 가 start 보다 크면 쪼갤 게 남았다는 뜻
		if(start < end) {
			// 쪼개기 위해 중간값 찾기
			int middle = (start + end ) / 2;
			
			// 재귀호출 1. 배열의 처음부터 중간값 까지
			// 재귀호출 2. 배열의 중간다음값부터 끝까지
			mergeSort(a, start, middle);
			mergeSort(a, middle+1, end);
			
			// 쪼갠걸 다시 병합해야함.
			merge(a, start, middle, end);
		}
	}
	
	public void merge(int[]a, int start, int middle, int end)  {
		int i = start;
		int j = middle + 1;
		int k = start;
		
		// 임의로 값을 담아둘 배열, 길이는 a 와 같음
		int[] sorted = new int[a.length];
		
		// 비교할 대상이 남아있을 때 까지
		while((i <= middle) && (j <= end)) {
			if(a[i] < a[j]) {
				// 작은게 들어가게
				sorted[k] = a[i];
				k++;
				i++;
			}else {
				sorted[k] = a[j];
				k++;
				j++;
			}
		}
		
		// 비교할 대상이 없어졌을 때 왼쪽 원소들 다 넣어줌
 		while(i <= middle) {
			sorted[k] = a[i];
			k++;
			i++;
		}
		// 오른쪽 원소 넣어줌
		while (j <= end ) {
			sorted[k] = a[j];
			k++;
			j++;
		}
		// 임의로 저장된 배열을 원래 배열에 넣어줌
		for(int l=start; l<=end ; l++) {
			a[l] = sorted[l];
		}
	}
	
	
	@Override
	public void swap(int[]a, int i, int j) {
		//위치를 바꿔주는 메서드
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	@Override
	public void printAll(int[]a) {
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if(i != a.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
	}


	@Override
	public void quickSort(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heapSort(int[] a) {
		// TODO Auto-generated method stub
		
	}

}
