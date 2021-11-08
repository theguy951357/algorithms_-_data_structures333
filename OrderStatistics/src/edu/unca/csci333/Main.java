package edu.unca.csci333;

import java.util.Random;

public class Main {

	//TODO you are on the order statistic queries section
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Random rand = new Random();
		for(int i = 1; i <= 20; i++) {
			if(i<=10) {
				bst.insert(i);
			}else {
				bst.insert(rand.nextInt(10)+1);
			}
		}
		
		System.out.println("size = " + bst.getSize());
		
		bst.preorderTraversal();
		bst.preorderSizeTraversal();
		bst.inorderTraversal();
		bst.postorderTraversal();
		System.out.println("search 1 returns " + bst.search(1));
		System.out.println("search 3 returns " + bst.search(2));
		System.out.println("search 5 returns " + bst.search(3));
		System.out.println("search 7 returns " + bst.search(4));
		System.out.println("search 15 returns " + bst.search(5));
		System.out.println("search 50 returns " + bst.search(50));
		System.out.println("search 150 returns " + bst.search(150));
		System.out.println("search 30 returns " + bst.search(30));
		System.out.println("search 40 returns " + bst.search(40));
		System.out.println("search 89 returns " + bst.search(89));
		
		bst.delete(1);
		bst.delete(2);
		bst.delete(3);
		bst.delete(4);
		bst.delete(5);
		System.out.println("size = " + bst.getSize());
		bst.preorderTraversal();
		bst.preorderSizeTraversal();
		bst.inorderTraversal();
		
		System.out.println("Select");
		
		System.out.println(bst.select(1));
		System.out.println(bst.select(2));
		System.out.println(bst.select(3));
		System.out.println(bst.select(4));
		System.out.println(bst.select(5));
		System.out.println("rank ");
		System.out.println(bst.rank(1));
		System.out.println(bst.rank(2));
		System.out.println(bst.rank(3));
		System.out.println(bst.rank(4));
		System.out.println(bst.rank(5));

	}

}
