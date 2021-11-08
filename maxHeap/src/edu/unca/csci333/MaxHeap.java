/**
 * Chris Blaha
 * 8/28/2021
 * CSCI333
 * homework 2
 * 
 * This code runs through the heapsort method. It will take an array and put it through some heap methods.
 * Between 0 and 1 indexing, I decided to go with 0 indexing.
 * I tried 1 indexing first and had a hard time keeping track.
 */
package edu.unca.csci333;

import java.util.Arrays;

/**
 * @author cblah
 *
 */
public class MaxHeap {
	
	private int dataField[];
	private int heapSize;
	
	/**
	 * @param dataField
	 * The constructor will take an array as a parameter.
	 * It will then determine the heapsize with the length of the array.
	 * The dataField will take a copy of the array passed into the parameter.
	 * lastly, the constructor will call the buildMaxHeap function
	 */
	public MaxHeap(int[] dataField) {
		
		this.heapSize = dataField.length;
		this.dataField = Arrays.copyOfRange(dataField, 0, this.heapSize);
		buildMaxHeap();
	}
	
	/**
	 * The left child of method takes an index as a parameter. It will then
	 * return the index that represents the left child node of a tree structure.
	 * @param index
	 * @return returns the index that would represent the left node of a tree, or -1 if the index is out of bounds.
	 */
	private int leftChildOf(int index) {
		
		if(index> this.heapSize) {
			return -1;
		}else {
			if(index == 0) {
				index = 1;
			}else {
				index += index;
			}
			return index;
		}
	}
	
	/**
	 * 
	 * The right child of method takes an index as a parameter. It will then
	 * return the index that represents the right child node of a tree structure.
	 * @param index
	 * @return returns the index that would represent the right child node of a tree, or -1 if out of bounds.
	 */
	private int rightChildOf(int index) {
		
		if(index> this.heapSize) {
			return -1;
		}else {
			if (index == 0) {
				index = 2;
			}else {
				index += index;
				index++;
			}
			return index;
		}
	}
	
	/**
	 * This prints out the current state of the Heap
	 */
	public void printMaxHeap(){
		int temp[] = Arrays.copyOfRange(this.dataField, 0, this.heapSize);
		System.out.println(Arrays.toString(temp));
	}
	
	/**
	 * the maxHeapify method helps organize the heap into a max heap structure
	 * it will check the left and right children and determine the largest element of the three.
	 * it will then recurse through the largest elements.
	 * @param index
	 */
	private void maxHeapify(int index) {
		int left = this.leftChildOf(index);
		int right = this.rightChildOf(index);
		int largest;
		if(left < this.heapSize && this.dataField[left] > this.dataField[index]) {
			largest = left;
		}else {
			largest = index;
		}
		if(right < this.heapSize && this.dataField[right] >this.dataField[largest]) {
			largest = right;
		}
		if(largest != index) {
			this.swap(largest, index);
			this.maxHeapify(largest);
		}
	}
	
	/**
	 * This is a helper method to swap one index with another
	 * @param one
	 * @param two
	 */
	private void swap(int one, int two) {
		int temp = this.dataField[one];
		this.dataField[one] = this.dataField[two];
		this.dataField[two] = temp;
	}
	/**
	 * The buildMaxHeap method will loop through half of the data and maxheapify.
	 */
	private void buildMaxHeap() {
		for(int i = this.heapSize/2; i >= 0; i--) {
			
			maxHeapify(i);
		}
	}
	
	/**
	 * The heapsort method will start at the end of the list, and iterate through
	 * each item and call maxHeapify, each time decrementing the heapsize. this will
	 * leave the largest numbers at the end and result in a sorted list.
	 */
	public void heapSort() {
		this.buildMaxHeap();
		int backup = this.heapSize;
		for(int i = this.heapSize-1; i >=1; i--) {
			this.swap(0, i);
			this.heapSize--;
			this.maxHeapify(0);
		}
		this.heapSize = backup;
	}

}
