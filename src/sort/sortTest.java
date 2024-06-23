package sort;

public class sortTest {
	
	public static void main(String[] args) {
		MySort s = new MySort();
		
//		int[] bubbletest = {7, 4, 5, 1, 3};
		
//		s.printAll(bubbletest);
//		s.bubbleSort(bubbletest);
//		s.printAll(bubbletest);
		
		int[] mergetest = {40, 20, 50, 10, 30, 70};
		s.printAll(mergetest);
		s.mergeSort(mergetest, 0, mergetest.length-1);
		s.printAll(mergetest);
	}
	

}
