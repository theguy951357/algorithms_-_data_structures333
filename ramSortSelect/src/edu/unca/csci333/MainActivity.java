package edu.unca.csci333;

import java.util.Arrays;
import java.util.Random;

public class MainActivity {
	
	/**
	 * @author chris Blaha
	 * csci333
	 * hw4 ramSortSelect
	 * 9/20/2021
	 *
	 *This main method is going to test counting sort and randomized quick select
	 *five times each.
	 */

	public static void main(String[] args) {
		Random rand = new Random();
		CountingSort count = new CountingSort();
		//1st
		int k = 50;
		int[] count1 = new int[200];
		int[] count1B = new int[count1.length];
		for(int i=0; i<count1.length; i++) {
			count1[i] = rand.nextInt(k)+1;
		}
		System.out.println("1st test of size = 200");
		System.out.println(Arrays.toString(count1));
		System.out.println();
		count.countingSort(count1, count1B, k);
		System.out.println(Arrays.toString(count1B));
		System.out.println("*********************************************");
		//2nd
		k = 500;
		count1 = new int[20];
		count1B = new int[count1.length];
		for(int i=0; i<count1.length; i++) {
			count1[i] = rand.nextInt(k)+1;
		}
		System.out.println("2nd test of size = 20");
		System.out.println(Arrays.toString(count1));
		System.out.println();
		count.countingSort(count1, count1B, k);
		System.out.println(Arrays.toString(count1B));
		System.out.println("*********************************************");
		//3rd
		k = 123;
		count1 = new int[100];
		count1B = new int[count1.length];
		for(int i=0; i<count1.length; i++) {
			count1[i] = rand.nextInt(k)+1;
		}
		System.out.println("3rd test of size = 100");
		System.out.println(Arrays.toString(count1));
		System.out.println();
		count.countingSort(count1, count1B, k);
		System.out.println(Arrays.toString(count1B));
		System.out.println("*********************************************");
		//4th
		k = 321;
		count1 = new int[10];
		count1B = new int[count1.length];
		for(int i=0; i<count1.length; i++) {
			count1[i] = rand.nextInt(k)+1;
		}
		System.out.println("4th test of size = 10");
		System.out.println(Arrays.toString(count1));
		System.out.println();
		count.countingSort(count1, count1B, k);
		System.out.println(Arrays.toString(count1B));
		System.out.println("*********************************************");
		//5th
		k = 5;
		count1 = new int[50];
		count1B = new int[count1.length];
		for(int i=0; i<count1.length; i++) {
			count1[i] = rand.nextInt(k)+1;
		}
		System.out.println("5th test of size = 50");
		System.out.println(Arrays.toString(count1));
		System.out.println();
		count.countingSort(count1, count1B, k);
		System.out.println(Arrays.toString(count1B));
		System.out.println("*********************************************");
		//1st
		int[] select1 = new int[200];
		for(int i=0; i<select1.length; i++) {
			select1[i] = i+1;
		}
		int result = count.randomizedQuickselect(select1, 0, select1.length-1, 70);
		System.out.println("1st test at i=70 of size = 200");
		System.out.println(Arrays.toString(select1));
		System.out.println("result = " +result);
		System.out.println("*********************************************");
		//2nd
		select1 = new int[20];
		for(int i=0; i<select1.length; i++) {
		select1[i] = i*234;
		}
		result = count.randomizedQuickselect(select1, 0, select1.length-1, 4);
		System.out.println("2nd test at i=4 of size = 20");
		System.out.println(Arrays.toString(select1));
		System.out.println("result = " +result);
		System.out.println("*********************************************");

		//3rd
		select1 = new int[50];
		for(int i=0; i<select1.length; i++) {
		select1[i] = i*i+i;
		}
		result = count.randomizedQuickselect(select1, 0, select1.length-1, 25);
		System.out.println("3rd test at i=25 of size = 50");
		System.out.println(Arrays.toString(select1));
		System.out.println("result = " + result);
		System.out.println("*********************************************");
				
		//4th
		select1 = new int[2000];
		for(int i=0; i<select1.length; i++) {
		select1[i] = (i*i)/2;
		}
		result = count.randomizedQuickselect(select1, 0, select1.length-1, 1234);
		System.out.println("4th test at i=1234 on size = 2000");
		System.out.println(Arrays.toString(select1));
		System.out.println("result = " + result);
		System.out.println("*********************************************");
		//5th
		select1 = new int[200];
		for(int i=0; i<select1.length; i++) {
		select1[i] = i/2;
		}
		result = count.randomizedQuickselect(select1, 0, select1.length-1, 20);
		System.out.println("5th test at i=20 of size = 200");
		System.out.println(Arrays.toString(select1));
		System.out.println("result = "+result);
		System.out.println("*********************************************");
		
	}
	
	

}
