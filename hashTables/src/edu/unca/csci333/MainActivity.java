/**
 * 
 */
package edu.unca.csci333;

/**
* @author Chris Blaha
* csci333
* hw5 - hash tables
* 9/27/2021
*
*/
public class MainActivity {

	/**
	 * @param args
	 * The main method will make a ChainedHashTable and an
	 * OpenAddressedHashTable to test out the methods.
	 */
	public static void main(String[] args) {
		ChainedHashTable hash = new ChainedHashTable(20);
		for(int i = 1; i < 21; i ++) {
			int j = i;
			hash.insert(j);
		}
		System.out.println("printing chain hash table.");
		hash.printTable();
		System.out.println("deleting 5 elements and printing chain hash table");
		hash.delete(1);
		hash.delete(2);
		hash.delete(3);
		hash.delete(4);
		hash.delete(5);
		hash.printTable();
		System.out.println("searching for five elements not in the table and five elements in the table");
		System.out.println(hash.search(1));
		System.out.println(hash.search(2));
		System.out.println(hash.search(3));
		System.out.println(hash.search(4));
		System.out.println(hash.search(5));
		System.out.println(hash.search(6));
		System.out.println(hash.search(7));
		System.out.println(hash.search(8));
		System.out.println(hash.search(9));
		System.out.println(hash.search(10));
		
		OpenAddressedHashTable hash2 = new OpenAddressedHashTable(20);
		for(int i = 1; i < 21; i ++) {
			int j = i;
			hash2.insert(j);
		}
		System.out.println("printing open address hash table");
		hash2.printTable();
		System.out.println("deleting five elements and printing table");
		hash2.delete(1);
		hash2.delete(2);
		hash2.delete(3);
		hash2.delete(4);
		hash2.delete(5);
		hash2.printTable();
		System.out.println("searching for 5 elements in table and 5 elements not in table");
		System.out.println(hash2.search(1));
		System.out.println(hash2.search(2));
		System.out.println(hash2.search(3));
		System.out.println(hash2.search(4));
		System.out.println(hash2.search(5));
		System.out.println(hash2.search(6));
		System.out.println(hash2.search(7));
		System.out.println(hash2.search(8));
		System.out.println(hash2.search(9));
		System.out.println(hash2.search(10));
	}

}
