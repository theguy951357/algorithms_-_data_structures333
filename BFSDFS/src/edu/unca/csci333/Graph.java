/**
 * 
 */
package edu.unca.csci333;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chris Blaha
 * CSCI333
 * hw7 BFSDFS
 * 10/18/2021
 *
 *The graph class will make an array of nodes and run either a depth first search or a breadth first search
 */
public class Graph {

	private int n;
	private int time;
	private boolean edges[][];
	private Node nodes[];
	/**
	 * The constructor will take a 2d array as an input and assign it to the edges instance variable
	 * It will also assign the rest of the instance variables based off of 
	 * the size of edges.
	 * @param edges
	 * 
	 */
	public Graph(boolean[][] edges) {
		super();
		this.edges = edges;
		this.n = edges.length;
		this.time = 0;
		this.nodes = new Node[n];
		for(int i = 0; i <n; i ++) {
			this.nodes[i] = new Node(i);
		}
	}
	
	/**
	 * Depth first search will reference the edges 2Darray to see what is connected to what
	 * and search depth first through the set
	 */
	public void depthFirstSearch() {
		for(int u = 0; u < nodes.length; ++u) {
			nodes[u].setColor(State.WHITE);
			nodes[u].setParent(-1);
		}
		this.time = 0;
		for(int u = 0; u < nodes.length; ++u) {
			if (nodes[u].getColor()== State.WHITE) {
				DFSVisit(nodes[u]);
			}
		}
	}
	
	/**
	 * @param u
	 * 
	 * private sub-method for depth first search that will visit nodes recursively
	 * while there is still a connection between the nodes
	 */
	private void DFSVisit(Node u) {
		this.time++;
		u.setdTime(this.time);
		u.setColor(State.GRAY);
		for(int v = 0; v < this.edges[u.getName()].length; ++v) {
			if(edges[u.getName()][v] && this.nodes[v].getColor()==State.WHITE) {
				this.nodes[v].setParent(u.getName());
				DFSVisit(nodes[v]);
			}
		}
		u.setColor(State.BLACK);
		this.time++;
		u.setfTime(this.time);
	}
	
	/**
	 * @param s
	 * Breadth first search takes a node to start from and searches breadth wise through the graph
	 */
	public void breadthFirstSearch(int s) {
		for(int i = 0; i < nodes.length; ++i) {
			if(i == s) {
				continue;
			}else {
				nodes[i].setColor(State.WHITE);
				nodes[i].setDist(Integer.MAX_VALUE);
				nodes[i].setParent(-1);
			}
		}
		nodes[s].setColor(State.GRAY);
		nodes[s].setDist(0);
		nodes[s].setParent(-1);
		Queue<Integer> Q = new ArrayDeque<Integer>();
		Q.add(s);
		while(!Q.isEmpty()) {
			int u = Q.remove();
			nodes[u].setColor(State.BLACK);
			for(int v = 0; v < edges[u].length; ++v) {
				if(nodes[v].getColor()== State.WHITE&& edges[u][v]) {
					nodes[v].setColor(State.GRAY);
					nodes[v].setDist(nodes[u].getDist()+1);
					nodes[v].setParent(u);
					Q.add(v);
				}
			}
		}
	}
	
	/**
	 * method for resetting the nodes after a search is done so a new search can start with 
	 * a fresh set of nodes.
	 */
	private void resetNodes() {
		this.time = 0;
		for(int i = 0; i <n; i ++) {
			this.nodes[i] = new Node(i);
		}
	}

	/**
	 *toString method for the graph.
	 */
	@Override
	public String toString() {
		return "Graph [nodes=" + Arrays.toString(nodes) + "]";
	}
	
	
}
