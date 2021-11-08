/**
 * Chris Blaha
 * 8/28/2021
 * CSCI333
 * homework 2
 * 
 * This main class will make a few arrays and test the heapsort method 
 * on them.
 */
package edu.unca.csci333;

import java.util.Arrays;
import java.util.Random;

/**
 * @author cblah
 * Main class
 */
public class Main {

	/**
	 * @param args
	 * 
	 * generates arrays with Random() ints and tests heapSort.
	 */
	public static void main(String[] args) {
		int test1[] = new int[25];
		int test2[] = new int[24];
		int test3[] = new int[30];
		int test4[] = new int[100];
		int test5[] = new int[10000];
		
		Random rand = new Random();
		for(int i = 0; i < test1.length; i++) {
			test1[i] = rand.nextInt(1000)+1;
		}
		for(int i = 0; i < test2.length; i++) {
			test2[i] = rand.nextInt(1000)+1;
		}
		for(int i = 0; i < test3.length; i++) {
			test3[i] = rand.nextInt(1000)+1;
		}
		for(int i = 0; i < test4.length; i++) {
			test4[i] = rand.nextInt(1000)+1;
		}
		for(int i = 0; i < test5.length; i++) {
			test5[i] = rand.nextInt(1000)+1;
		}
		
		MaxHeap heap1 = new MaxHeap(test1);
		MaxHeap heap2 = new MaxHeap(test2);
		MaxHeap heap3 = new MaxHeap(test3);
		MaxHeap heap4 = new MaxHeap(test4);
		MaxHeap heap5 = new MaxHeap(test5);
		
		System.out.println("heap 1 "+Arrays.toString(test1));
		heap1.printMaxHeap();
		heap1.heapSort();
		heap1.printMaxHeap();
		
		System.out.println();
		System.out.println();
		
		System.out.println("heap 2 "+Arrays.toString(test2));
		heap2.printMaxHeap();
		heap2.heapSort();
		heap2.printMaxHeap();
		
		System.out.println();
		System.out.println();
		
		System.out.println("heap 3 "+Arrays.toString(test3));
		heap3.printMaxHeap();
		heap3.heapSort();
		heap3.printMaxHeap();
		
		System.out.println();
		System.out.println();
		
		System.out.println("heap 4 "+Arrays.toString(test4));
		heap4.printMaxHeap();
		heap4.heapSort();
		heap4.printMaxHeap();
		
		System.out.println();
		System.out.println();
		
		System.out.println("heap 5 "+Arrays.toString(test5));
		heap5.printMaxHeap();
		heap5.heapSort();
		heap5.printMaxHeap();
		

	}

}
