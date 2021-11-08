/**
 * 
 */
package edu.unca.csci333;

import java.util.Random;

/**
 * @author chris blaha
 * 9/6/2021
 * csci333
 * homework 3
 * 
 * this sort class will have a private partiton method. it will then have a quicksort and a randomized quicksort
 * that will operate on the partition method recursively.
 *
 */
public class Sort {

	/**
	 * @param array: the array or part of the array to be sorted
	 * @param p
	 * @param r
	 * this normal quicksort method uses the last element in the array
	 * as the partition
	 * It will then call itself recursively on the parts of the array that are to the left 
	 * adn right of where the partition ends up
	 */
	public void quickSort(int[] array, int p, int r) {
		if(p<r) {
			int q = partition(array, p, r);
				quickSort(array, p, q-1);
				quickSort(array, q+1, r);
			
		}
		
	}
	
	/**
	 * @param array
	 * @param p
	 * @param r
	 * operates the same as quicksort, except a random element from the array parameter
	 * will be swapped with the element at the end.
	 */
	public void randomizedQuickSort(int[] array, int p, int r) {
		if(p<r) {
			
			Random rand = new Random();
			//1 2 3 4 5 6 7 8 9 10
			int randindex = rand.nextInt(r-p)+p;
			int temp = array[r];
			array[r] = array[randindex];
			array[randindex] = temp;
			int q = partition(array,p,r);
			randomizedQuickSort(array, p, q-1);
			randomizedQuickSort(array, q+1, r);
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
