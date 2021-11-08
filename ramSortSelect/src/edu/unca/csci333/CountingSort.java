/**
 * 
 */
package edu.unca.csci333;

import java.util.Arrays;
import java.util.Random;

/**
 * @author chris Blaha
 * csci333
 * hw4 ramSortSelect
 * 9/20/2021
 *
 */
public class CountingSort {
	
	
	
	

	
	/**
	 * constructor for countingSort
	 */
	public CountingSort() {
		super();
	}

	//0 indexing A and B
	/**
	 * 
	 * @param A
	 * @param B
	 * @param k
	 * 
	 * Counting sort will count how many of each int there are in the array and then sort them.
	 * Both the A and B array will be 0 indexed.
	 */
	public void countingSort(int[] A, int[] B, int k) {
		int[] C = new int[k+1];
		for(int i = 0; i < C.length; i++) {
			C[i]=0;
		}
		for(int i = 0; i < A.length; i++) {
			C[A[i]]++;
		}
		for(int i = 1; i < C.length;i++) {
			C[i] = C[i]+C[i-1];
		}
		//decrementing each index in C by 1 to adjust for 0 indexing.
		for(int i = 1; i < C.length;i++) {
			C[i]--;
		}
		for(int i = A.length-1; i>=0; i--) {
			B[C[A[i]]]= A[i];
			C[A[i]]--;
		}
	}
	/**
	 * @param A array to be copied.
	 * @param p begin
	 * @param r end
	 * @param i index to find
	 * @return returns the private sub method of randomized quick select.
	 * This is the wrapper method that will make a copy of the input array to run quick select on.
	 */
	public int randomizedQuickselect(int[] A, int p, int r, int i) {
		int[] copy = Arrays.copyOf(A, A.length);
		return this.randomizedQuickselectSub(copy, p, r, i); 
	}
	/**
	 * @param A the copied array to select over
	 * @param p begin
	 * @param r end
	 * @param i index to find
	 * @return returns the selected
	 * This is the private sub method of randomized quick select.
	 * Randomized quick select will work like randomized quick sort, only it selects instead of sorts
	 */
	private int randomizedQuickselectSub(int[] A, int p, int r, int i){
		Random rand = new Random();
		if(p == r) {//base case
			return A[p];
		}
		int z = rand.nextInt(r-p)+p;
		int temp = A[r];
		A[r] = A[z];
		A[z] = temp;
		int q = this.partition(A, p, r);
		int k = q-p+1;
		if(i == k) {
			return A[q];
		}else if (i<k) {
			return this.randomizedQuickselect(A, p, q-1, i);
		}else {
			return this.randomizedQuickselect(A, q+1, r, i-k);
		}
	}
	
	/**
	 * @param array
	 * @param p
	 * @param r
	 * @return this returns the location of the partitioned element (r)
	 * the partition method will iterate through the array and swap any datapoints
	 * that are less than the partition with elements that are greater than the partition.
	 * it will then put the partitioned data point into place and return its posisiton.
	 */
	private int partition(int[] array, int p, int r) {
		
		int x = array[r];
		int i = p-1;
		for(int j = p; j<r; j++) {
			if(array[j]<=x) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[r];
		array[r] = temp;
		return i+1;
	}
	
}
