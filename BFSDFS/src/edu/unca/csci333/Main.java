package edu.unca.csci333;

import java.util.Random;

/**
 * @author Chris Blaha
 * CSCI333
 * hw7 BFSDFS
 * 10/18/2021
 *
 */


public class Main {

	public static void main(String[] args) {
		
		boolean graphArray1[][] = {
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false}
		};
		
		boolean graphArray2[][] = {
				{false,true,false,false,false,false},
				{false,false,true,false,false,false},
				{false,false,false,true,false,false},
				{false,false,false,false,true,false},
				{false,false,false,false,false,true},
				{true,false,false,false,false,false}
		};
		
		boolean graphArray3[][] = {
				{false,false,true,false,false,false},
				{false,false,true,true,false,false},
				{false,false,true,false,true,false},
				{false,false,true,false,false,true},
				{false,false,true,false,false,false},
				{false,false,true,false,false,false}
		};
		
		boolean graphArray4[][] = {
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false},
				{false,false,false,false,false,false}
		};
		
		boolean graphArray5[][] = {
				{false,true,false,false,false,false},
				{false,false,true,false,false,false},
				{false,false,false,true,false,false},
				{false,false,false,false,true,false},
				{false,false,false,false,false,true},
				{true,false,false,false,false,false}
		};
		
		boolean graphArray6[][] = {
				{false,true,true,false,true,false,false,false},
				{true,false,false,true,true,false,true,false},
				{true,false,false,false,false,false,false,true},
				{false,true,false,false,false,false,true,false},
				{true,true,false,false,false,true,false,false},
				{false,false,false,false,true,false,false,false},
				{false,true,false,true,false,false,false,false},
				{false,false,true,false,false,false,false,false}
		};
		
		
		
		Graph graph1 = new Graph(graphArray1);
		System.out.println(graph1.toString()+"\n\n");
		graph1.breadthFirstSearch(3);
		System.out.println(graph1.toString()+"\n\n");
		
		Graph graph2 = new Graph(graphArray2);
		System.out.println(graph2.toString()+"\n\n");
		graph2.breadthFirstSearch(2);
		System.out.println(graph2.toString()+"\n\n");
		
		Graph graph3 = new Graph(graphArray3);
		System.out.println(graph3.toString()+"\n\n");
		graph3.breadthFirstSearch(4);
		System.out.println(graph3.toString()+"\n\n");
		
		Graph graph4 = new Graph(graphArray4);
		System.out.println(graph4.toString()+"\n\n");
		graph4.depthFirstSearch();
		System.out.println(graph4.toString()+"\n\n");
		
		Graph graph5 = new Graph(graphArray5);
		System.out.println(graph5.toString()+"\n\n");
		graph5.depthFirstSearch();
		System.out.println(graph5.toString()+"\n\n");
		
		Graph graph6 = new Graph(graphArray6);
		System.out.println(graph6.toString()+"\n\n");
		graph6.depthFirstSearch();
		System.out.println(graph6.toString()+"\n\n");

	}
	

}
