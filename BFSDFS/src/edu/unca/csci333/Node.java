/**
 * 
 */
package edu.unca.csci333;

/**
 * @author Chris Blaha
 * CSCI333
 * hw7 BFSDFS
 * 10/18/2021
 *
 */
public class Node {

	private int name;
	private int parent;
	private int dTime;
	private int fTime;
	private int dist;
	private State color;

	
	/**
	 * The node value just takes in a name. everything else is assigned to a default value
	 * @param name
	 */
	public Node(int name) {
		super();
		this.name = name;
		this.parent = -1;
		this.dist = Integer.MIN_VALUE;
		this.dTime = 0;
		this.fTime = 0;
		this.color = State.WHITE; 
	}
	
	
	/**
	 *toString method for the node.
	 */
	@Override
	public String toString() {
		return "Node = " + name +" [ parent=" + parent + ", dTime=" + dTime + ", fTime=" + fTime + ", dist=" + dist
				+ ", color=" + color + "]\n";
	}


	/**
	 * @return the parent
	 */
	public int getParent() {
		return parent;
	}


	/**
	 * @param parent the parent to set
	 */
	public void setParent(int parent) {
		this.parent = parent;
	}


	/**
	 * @return the dTime
	 */
	public int getdTime() {
		return dTime;
	}


	/**
	 * @param dTime the dTime to set
	 */
	public void setdTime(int dTime) {
		this.dTime = dTime;
	}


	/**
	 * @return the fTime
	 */
	public int getfTime() {
		return fTime;
	}


	/**
	 * @param fTime the fTime to set
	 */
	public void setfTime(int fTime) {
		this.fTime = fTime;
	}


	/**
	 * @return the dist
	 */
	public int getDist() {
		return dist;
	}


	/**
	 * @param dist the dist to set
	 */
	public void setDist(int dist) {
		this.dist = dist;
	}


	/**
	 * @return the color
	 */
	public State getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(State color) {
		this.color = color;
	}


	/**
	 * @return the name
	 */
	public int getName() {
		return name;
	}
	
	
}
