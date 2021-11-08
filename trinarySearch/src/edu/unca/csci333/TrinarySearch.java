
package edu.unca.csci333;

/**
 * @author cblah
 * 
 * This trinary search is going to check the list at 1/3 and 2/3
 * to find the target. If the target is found, the search will recurse to the 
 * left to see if the same instance of the target is at
 * a smaller index.
 * If the target is not found, the search will recurse to the third of the set
 * that will lead to the target.
 * The algorithm will return -1 if the target is not found
 *
 */
public class TrinarySearch<T extends Comparable<T>> {

	private int retIndex;
	private T[] searchArray;
	/**
	 * @param searchArray
	 * 
	 * The constructor takes a generic array and sets the
	 * initial return index to -1. that way if the target is not found, 
	 * the algorithm will properly return -1. 
	 */
	public TrinarySearch(T[] searchArray) {
		this.retIndex = -1;
		this.searchArray = searchArray;
	}
	
	/**
	 * The base case of the search algorithm will check if the size is less than or equal to 3.
	 * If so, then it will iterate through the small set to find the first instance of the target.
	 * If not, the algorithm will recursively check the 1/3 and 2/3 point of 
	 * the subset that is closer to the target.
	 * If the target is found, the algorithm will check the lower subset to see 
	 * if the target can be found at a lower index.
	 * 
	 * @param target, the target element to search for
	 * @param start, the begining of the set or subset.
	 * @param end, the end of the set or subset
	 * @return the search algorithm will return the lowest index of the target, or -1 if the target can not be found
	 */
	public int search(T target, int start, int end) {
		
		if(end-start <=3) {
			for(int i = start; i < end; i++) {
				if(this.searchArray[i].compareTo(target)==0  ) {
					if(this.retIndex==-1 || i<=this.retIndex) {
						this.retIndex = i;
					}
					
				}
			}
			return this.retIndex;
			
		}else {
			int third = start +((end-start)/3);
			int twothirds = end-((end-start)/3);
			int tempstart = third;
			int tempend = twothirds;
			
			if(this.searchArray[third].compareTo(target)==0) {
				this.retIndex = third;
				return search(target, start, third);
			}else if(this.searchArray[twothirds].compareTo(target)==0) {
				this.retIndex = twothirds;
				return search(target, third, twothirds);
			}else {
			
				if(this.searchArray[third].compareTo(target)>0) {
					tempstart=start;
					tempend = third;
				}else if(this.searchArray[twothirds].compareTo(target)<0) {
					tempstart = twothirds;
					tempend = end;
				}else {
					tempstart = third;
					tempend = twothirds;
				}
				return search(target, tempstart, tempend);
			}
		}
	}
	
	/**
	 * After each search, the return index needs to be reset, or it will return
	 * the result from the last search if the target is not found instead of -1.
	 */
	public void reset() {
		this.retIndex = -1;
	}
}
