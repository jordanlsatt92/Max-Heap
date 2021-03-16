

/**
 * @author Jordan Satterfield
 * January 28, 2021
 * CSCI333
 * Homework 2
 * MaxHeapMain demonstrates the functionality of the MaxHeap class.
 */

public class MaxHeapMain {

	public static void main(String[] args) {
		System.out.println("Heap1");
		int array1[] = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(java.util.Arrays.toString(array1));
		MaxHeap heap1 = new MaxHeap(array1);
		heap1.printMaxHeap();
		heap1.heapsort();
		heap1.printMaxHeap();
		
		System.out.println();
		System.out.println("Heap2");
		int array2[] = {12,1,3,35,78,100,99,68,78,78};
		System.out.println(java.util.Arrays.toString(array2));
		MaxHeap heap2 = new MaxHeap(array2);
		heap2.printMaxHeap();
		heap2.heapsort();
		heap2.printMaxHeap();
		
		System.out.println();
		System.out.println("Heap3");
		int array3[] = {-1,-5,-1000,900,567,44,0,252,43,99,43,1,2,3};
		System.out.println(java.util.Arrays.toString(array3));
		MaxHeap heap3 = new MaxHeap(array3);
		heap3.printMaxHeap();
		heap3.heapsort();
		heap3.printMaxHeap();
		
		System.out.println();
		System.out.println("Heap4");
		int array4[] = {500,500000,690413,132,-900,300,55,44,33,666,987,-1};
		System.out.println(java.util.Arrays.toString(array4));
		MaxHeap heap4 = new MaxHeap(array4);
		heap4.printMaxHeap();
		heap4.heapsort();
		heap4.printMaxHeap();
		
		System.out.println();
		System.out.println("Heap5");
		int array5[] = {-1,-2,-3,77,22,-999,66,12,-89,98,4,3,2,1,0};
		System.out.println(java.util.Arrays.toString(array5));
		MaxHeap heap5= new MaxHeap(array5);
		heap5.printMaxHeap();
		heap5.heapsort();
		heap5.printMaxHeap();
	}

}
