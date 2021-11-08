/**
 * 
 */
package edu.unca.csci333;

import java.util.Arrays;
import java.util.Random;

/**
 * @author chris blaha
 * 9/6/2021
 * csci333
 * hw3
 * this main class will make some arrays and fill them with random numbers to 
 * test the quickSort and randomizedQuickSort methods
 *
 */
public class SortTest {

	/**
	 * @param args
	 * The main method
	 * main method makes five instances for each sort method to test.
	 */
	public static void main(String[] args) {

		Random rand = new Random();
		Sort sort = new Sort();
		
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array));
		sort.quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));

		int array2[] = new int[100];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array2));
		sort.quickSort(array2, 0, array2.length-1);
		System.out.println(Arrays.toString(array2));

		int array3[] = new int[200];
		for(int i = 0; i < array3.length; i++) {
			array3[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array3));
		sort.quickSort(array3, 0, array3.length-1);
		System.out.println(Arrays.toString(array3));

		int array4[] = new int[1000];
		for(int i = 0; i < array4.length; i++) {
			array4[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array4));
		sort.quickSort(array4, 0, array4.length-1);
		System.out.println(Arrays.toString(array4));


		int array5[] = new int[2000];
		for(int i = 0; i < array5.length; i++) {
			array5[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array5));
		sort.quickSort(array5, 0, array5.length-1);
		System.out.println(Arrays.toString(array5));

		
		int array10[] = new int[10];
		for(int i = 0; i < array10.length; i++) {
			array10[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array10));
		sort.randomizedQuickSort(array10, 0, array10.length-1);
		System.out.println(Arrays.toString(array10));

		int array22[] = new int[100];
		for(int i = 0; i < array22.length; i++) {
			array22[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array22));
		sort.randomizedQuickSort(array22, 0, array22.length-1);
		System.out.println(Arrays.toString(array22));

		int array33[] = new int[200];
		for(int i = 0; i < array33.length; i++) {
			array33[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array33));
		sort.randomizedQuickSort(array33, 0, array33.length-1);
		System.out.println(Arrays.toString(array33));

		int array44[] = new int[1000];
		for(int i = 0; i < array44.length; i++) {
			array44[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array44));
		sort.randomizedQuickSort(array44, 0, array44.length-1);
		System.out.println(Arrays.toString(array44));


		int array55[] = new int[2000];
		for(int i = 0; i < array55.length; i++) {
			array55[i] = rand.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(array55));
		sort.randomizedQuickSort(array55, 0, array55.length-1);
		System.out.println(Arrays.toString(array55));

	}

}
