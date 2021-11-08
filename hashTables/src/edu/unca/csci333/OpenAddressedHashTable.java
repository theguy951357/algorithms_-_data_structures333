package edu.unca.csci333;

import java.util.Arrays;

/**
* @author Chris Blaha
* csci333
* hw5 - hash tables
* 9/27/2021
*
*/

public class OpenAddressedHashTable {
	int m;
	Integer inputs[];
	final double A = 0.61803;
	private final int DELETED = -1;
	/**
	 * @param n number of expected inputs
	 * 
	 * constructor takes an integer that represents the number of expected
	 * inputs and makes an array that is the next 2^n higher than n
	 * 
	 */
	public OpenAddressedHashTable(int n) {
		int size = 2;
		while(size<n) {
			size *= 2;
		}
		m = size;
		this.inputs = new Integer[size];
		
	}
	
	/**
	 * @param k the input to hash
	 * @return returns the hashed index
	 * hash will take input k and use the multiplication method to hash to an index.
	 * 
	 */
	private int hash(int k) {
		int h = (int) (m*(k*this.A%1));
		
		return h;
	}
	
	/**
	 * @param k input to hash to
	 * @param i the index that is being hashed
	 * @return returns the hashed index
	 * This hash method works the same as the one 
	 * parameter hash, but this takes an index as well
	 *  to hash to. if the index is greater than the size
	 *  of the expected inputs, it will recycle bact to the
	 *  beginning of the array.
	 */
	private int hash(int k, int i) {
		int h = hash(k);
		i+=h;
		if(i>=m) {
			i-=m;
		}
		return i;
	}
	
	/**
	 * @param k element to be inserted
	 * @return returns the index of the inserted element
	 * or -1 if there is no space to insert
	 */
	public int insert(int k) {
		for(int i = 0; i < m; i++) {
			int j = hash(k,i);
			if(this.inputs[j]==null||this.inputs[j] == DELETED) {
				this.inputs[j] = k;
				return j;
			}
		}
		return -1;//hash table is full
	}
	
	/**
	 * @param k the element to be deleted
	 * @return returns the index of the deleted element
	 * 
	 * This delete method will take the input parameter
	 * and hash to the index of that element
	 * It will then set that index to DELETED and return the
	 * index where the element is deleted or -1 if that element is not found
	 */
	public int delete(int k) {
		for(int i = 0; i < m; i++) {
			int j = hash(k,i);
			if(this.inputs[j] == k) {
				this.inputs[j] = DELETED;
				return j;
			}
		}
		return -1;
	}
	
	/**
	 * @param k the element to search for
	 * @return returns the index where the element is
	 * or DELETED if it can not be found
	 * 
	 * This search method takes an element and searches for it at the hashed location
	 * It will return the index where it is found of DELETED if not found.
	 */
	public int search(int k) {
		for(int i = 0; i < m; i++) {
			int j = hash(k,i);
			if(this.inputs[j]==null) {
				return DELETED;
			}
			
			if(this.inputs[j]==k) {
				return this.inputs[j];
			}
		}
		return -1;
	}
	
	/**
	 * printTable method calls the toString overide and prints to
	 * the console.
	 */
	public void printTable() {
		System.out.println(this.toString());
	}

	/**
	 *toString method uses Arrays.toString() for the expected inputs array.
	 */
	@Override
	public String toString() {
		return "OpenAddressedHashTable [inputs=" + Arrays.toString(inputs) + "]";
	}
	
	

}
