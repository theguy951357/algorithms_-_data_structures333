/**
 * 
 */
package edu.unca.csci333;


import java.util.LinkedList;

/**
 * @author Chris Blaha
 * csci333
 * hw5 - hash tables
 * 9/27/2021
 *
 */
public class ChainedHashTable {

	
	
	
	
	//A = .61803
	int m;
	final double A = 0.61803;
	private LinkedList<Integer> expectedInputs[];

	
	/**
	 * @param n number of expected inputs
	 * constructor takes the number of inputs and determines the size of the table.
	 */
	public ChainedHashTable(int n) {
		super();
		int size = 2;
		while(size<n) {
			size*=2;
		}
		m= size;
		this.expectedInputs = new LinkedList[size];
		for(int i = 0; i < m; i ++) {
			this.expectedInputs[i] = new LinkedList<Integer>();
		}
	}
	
	/**
	 * @param k the element to be inserted
	 * insert method will hash a spot to insert the method and insert it at the head of the linked list
	 */
	public void insert(Integer k) {
		int index = hash(k);
		//System.out.println(index);
		this.expectedInputs[index].add(k);
	}
	
	/**
	 * @param k the element to be deleted
	 * delete method will hash to the element and delete it from the linkedList
	 */
	public void delete(int k) {
		int index = hash(k);
		this.expectedInputs[index].removeFirstOccurrence(k);
	}
	
	/**
	 * @param k the element to search for
	 * @return returns true if the element is in the list and false if not
	 * method will hash to the index where the element is and search the linkedList for the element
	 * 
	 */
	public Boolean search(int k) {
		int index = hash(k);
		LinkedList<Integer> list = this.expectedInputs[index];
		for(int i = 0 ; i < list.size(); i++) {
			if(k == list.get(i)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * print table method will print out the table
	 */
	public void printTable() {
		System.out.println(this.toString());
	}

	/**
	 *To string method to print out the hash table
	 */
	@Override
	public String toString() {
		String output="ChainedHashTable [expectedInputs = ";
		for(LinkedList<Integer> i : this.expectedInputs) {
			output+= i.toString() + "\n";
		}
		
		return output + "]";
	}
	
	/**
	 * @param k the element to be hashed
	 * @return returns the hashed index for the element
	 * multiplication hash for the table. 
	 * A = golden ratio -1.
	 */
	private int hash(int k) {
		int h = (int) (m*(k*this.A%1));
		//System.out.println(h);
		return h;
	}
	

	
	
	
}
