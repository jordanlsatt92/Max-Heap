
/**
 * @author Jordan Satterfield
 * MaxHeap implements a maxheap and all associated functions, including building the heap,
 * maintaining the heap properties, and sorting the heap.
 */

public class MaxHeap {

	private int array[];
	private int heapsize;
	
	public MaxHeap(int[] array) {
		super();
		this.array = array;
		this.heapsize = array.length;
		buildMaxHeap();
	}
	
	/**
	 * Returns the index of the left child of the parent.
	 * @param indexOfParent - index of the parent node, from which the left child's index can be determined.
	 * @return int - the index of the left child's position in the array.
	 */
	private int leftChildOf(int indexOfParent) {
		int index = 2*(indexOfParent + 1)-1;
		if (index >= this.heapsize) {
			return -1;
		}else {
			return index;
		}
	}
	
	/**
	 * Returns the index of the right child of the parent.
	 * @param indexOfParent - index of the parent node, from which the right child's index can be determined.
	 * @return int - the index of the right child's position in the array.
	 */
	private int rightChildOf(int indexOfParent) {
		int index = 2*(indexOfParent + 1);
		if (index >= this.heapsize) {
			return -1;
		}else {
			return index;
		}
	}
	
	/**
	 * Displays the contents of the Heap to the console.
	 */
	public void printMaxHeap() {
		System.out.println("Heapsize: " + this.heapsize);
		System.out.print("[");
		for (int i = 0; i < this.heapsize; i++) {
			if (i == (this.heapsize - 1)) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	/**
	 * Recursive method that maintains the heap properties of the given subtree.
	 * @param index - the index to fix (if needed) to maintain the heap properties, also the point from where recursion occurs.
	 */
	private void maxHeapify(int index) {
		int largest;
		int left = leftChildOf(index);
		int right = rightChildOf(index);
		if (left < this.heapsize && left >= 0 && this.array[left] > this.array[index]) {
			largest = left;
		}else {
			largest = index;
		}
		if (right < this.heapsize && right >= 0 && this.array[right] > this.array[largest]) {
			largest = right;
		}
		if (largest != index) {
			int temp = this.array[index];
			this.array[index] = this.array[largest];
			this.array[largest] = temp;
			maxHeapify(largest);
		}
	}
	
	/**
	 * Builds the max heap from the given array, using maxHeapify().
	 */
	private void buildMaxHeap() {
		for (int i = ((this.heapsize/2) - 1); i >= 0; i--) {
			maxHeapify(i);
		}
	}
	
	/**
	 * Sorts the heap in ascending order in the array.
	 */
	public void heapsort() {
		buildMaxHeap();
		int backupCopy = this.heapsize;
		for (int i = (this.heapsize - 1); i >= 1; i--) {
			int temp = this.array[0];
			this.array[0] = this.array[i];
			this.array[i] = temp;
			this.heapsize--;
			maxHeapify(0);
		}
		this.heapsize = backupCopy;
	}
	
	
}
