package sort;

public interface ISort {
	
	void bubbleSort(int[] a);
	void mergeSort(int[] a, int p, int r);
	void quickSort(int[] a, int p, int r);
	void heapSort(int[] a);
	void swap(int[]a, int i, int j);
	void printAll(int[]a);

}
