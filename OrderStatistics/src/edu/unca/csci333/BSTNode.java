/**
 * 
 */
package edu.unca.csci333;

/**
 * @author Chris Blaha
 * CSCI333
 * hw 6
 * 10/1/2021
 *
 */
public class BSTNode {

	private int key;
	private int size;
	private BSTNode left;
	private BSTNode right;
	private BSTNode p;
	/**
	 * @param data
	 */
	public BSTNode(int key) {
		super();
		this.key = key;
		this.size = 0;
		this.left = null;
		this.right = null;
		this.p = null;
	}
	public BSTNode getLeft() {
		return left;
	}
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	public BSTNode getRight() {
		return right;
	}
	public void setRight(BSTNode right) {
		this.right = right;
	}
	public BSTNode getP() {
		return p;
	}
	public void setP(BSTNode p) {
		this.p = p;
	}
	public int getKey() {
		return key;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
