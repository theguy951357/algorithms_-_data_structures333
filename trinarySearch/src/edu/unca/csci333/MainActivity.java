
package edu.unca.csci333;

/**
 * @author cblah
 *
 *The MainActivity class just has a main class to test the search algorithm
 */
public class MainActivity {

	/**
	 * @param args
	 * 
	 * The main class is making an Integer array, and a String array.
	 * it will search and reset multiple times to find different targets as well as
	 * test a target that is not in the array.
	 */
	public static void main(String[] args) {

		Integer numbers[] = {0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10};
		
		TrinarySearch<Integer> find = new TrinarySearch<Integer>(numbers);
		int end = numbers.length;
		System.out.println(find.search(1, 0, end));
		find.reset();
		System.out.println(find.search(2, 0, end));
		find.reset();
		System.out.println(find.search(3, 0, end));
		find.reset();
		System.out.println(find.search(4, 0, end));
		find.reset();
		System.out.println(find.search(5, 0, end));
		find.reset();
		System.out.println(find.search(6, 0, end));
		find.reset();
		System.out.println(find.search(7, 0, end));
		find.reset();
		System.out.println(find.search(8, 0, end));
		find.reset();
		System.out.println(find.search(9, 0, end));
		find.reset();
		System.out.println(find.search(10, 0, end));
		find.reset();
		System.out.println(find.search(66, 0, end) + "\n\n");
		find.reset();
		
		
		String letters[] = {"aa","aa","ab","ab","ac","ac","ad","ad","ad","ad","ad","ad","ad","ad","ad","ad","ad","ad","ad","ad","ae"};
		TrinarySearch<String> find2 = new TrinarySearch<String>(letters);
		System.out.println(find2.search("aa", 0, letters.length));
		find2.reset();
		System.out.println(find2.search("ab", 0, letters.length));
		find2.reset();
		System.out.println(find2.search("ac", 0, letters.length));
		find2.reset();
		System.out.println(find2.search("ad", 0, letters.length));
		find2.reset();
		System.out.println(find2.search("ae", 0, letters.length));
		find2.reset();
		System.out.println(find2.search("b", 0, letters.length));
		find2.reset();	
	}
}
