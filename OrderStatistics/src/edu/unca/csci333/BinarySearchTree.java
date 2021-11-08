package edu.unca.csci333;

public class BinarySearchTree {

	/**
	 * @author Chris Blaha
	 * CSCI333
	 * hw 6
	 * 10/1/2021
	 *
	 */
	private BSTNode root;
	private int size;
	
	public BinarySearchTree() {
		root = null;
		size = 0;
	}
	
	private void transplant(BSTNode u, BSTNode v) {
		if (u.getP() == null) {
			this.root = v;
		}else if(u == u.getP().getLeft()) {
			u.getP().setLeft(v);
		}else {
			u.getP().setRight(v);
		}
		if(v != null) {
			v.setP(u.getP());
		}
	}
	
	public int search(int k) {
		if(searchSub(this.root,k)==null) {
			return -1;
		}else {
			return searchSub(this.root,k).getKey();
		}
	}
	
	private BSTNode searchSub(BSTNode x, int k) {
		if(x == null) {
			return null;
		}
		if(k == x.getKey()) {
			return x;
		}
		if(k< x.getKey()) {
			return searchSub(x.getLeft(), k);
		}else {
			return searchSub(x.getRight(), k);
		}
	}
	
	public BSTNode minimum() {
		return minSub(this.root);
	}
	
	private BSTNode minSub(BSTNode x) {
		while(x.getLeft()!= null) {
			x= x.getLeft();
		}
		return x;
	}
	
	public BSTNode maximum() {
		return maxSub(this.root);
	}
	
	private BSTNode maxSub(BSTNode x) {
		while(x.getRight() != null) {
			x = x.getRight();
		}
		return x;
	}
	
	public BSTNode successor(int x) {
		return successorSub(searchSub(this.root,x));
	}
	
	private BSTNode successorSub(BSTNode x) {
		if(x.getRight() != null) {
			return minSub(x);
		}
		
		while(x.getP()!= null && x == x.getP().getRight()) {
			x = x.getP();
		}
		return x.getP();
	}
	
	public BSTNode predecessor(int x) {
		return predecessorSub(searchSub(this.root, x));
	}
	
	private BSTNode predecessorSub(BSTNode x) {
		if(x.getLeft()!=null) {
			return maxSub(x.getLeft());
		}
		while (x.getP()!= null && x == x.getP().getLeft()) {
			x = x.getP();
		}
		return x.getP();
	}
	
	public void insert(int z) {
		BSTNode x = new BSTNode(z);
		insertSub(x);
	}
	
	private void insertSub(BSTNode z) {
		BSTNode y = null;
		BSTNode x = this.root;
		while(x!=null) {
			y=x;
			if(z.getKey()<x.getKey()) {
				x=x.getLeft();
			}else {
				x=x.getRight();
			}
		}
		z.setP(y);
		if(y == null) {
			this.root = z;
		}else if(z.getKey()<y.getKey()) {
			y.setLeft(z);
		}else {
			y.setRight(z);
		}
		this.size++;
		z.setSize(0);
		while(z!= null) {
			z.setSize(z.getSize()+1);
			z=z.getP();
		
		}
	}
	
	public void delete(int z) {
		deleteSub(searchSub(this.root, z));
	}
	
	private void deleteSub(BSTNode z) {
		BSTNode q = null;
		if(z.getLeft()==null || z.getRight()==null) {
			q = z.getP();
		}else {
			BSTNode y = minSub(z.getRight());
			if(y.getP()!= z) {
				q=y.getP();
			}else {
				q = y;
			}
		}
		//normal delete begin
		if(z.getLeft()==null) {
			transplant(z,z.getRight());
		
		}else if (z.getRight()==null) {
			transplant(z, z.getLeft());
		
		}else {
			BSTNode y=minSub(z.getRight());
			if(y.getP()!= z) {
				transplant(y,y.getRight());
				y.setRight(z.getRight());
				y.getRight().setP(y);
			}
			transplant(z,y);
			y.setLeft(z.getLeft());
			y.getLeft().setP(y);
		
		}
		this.size--;
		//normal delete end
		while(q != null) {
			int left = 0;
			int right = 0;
			if(q.getLeft()!=null) {
				left = q.getLeft().getSize();
			}
			if(q.getRight()!= null) {
				right = q.getRight().getSize();
			}
			
			q.setSize(left+right+1);
			q = q.getP();
		}
		
	}
	
	public int select(int i) {
		BSTNode r = selectSub(this.root, i);
		if(r!= null) {
			return r.getKey();
		}else {
			return -1;
		}
		
	}
	
	private BSTNode selectSub(BSTNode x, int i) {
		
		int r = 0;
		if(x==null) {
			return null;
		}
		if(x.getLeft() != null) {
			r = x.getLeft().getSize()+1;
		}else {
			r=0;
		}
		if(i == r) {
			return x;
		}else if (i < r) {
			return selectSub(x.getLeft(), i);
		}else {
			return selectSub(x.getRight(),i-r);
		}
	}
	
	public int rank(int x) {
		return rankSub(searchSub(this.root,x));
	}
	
	private int rankSub(BSTNode x) {
		int r = 0;
		if(x==null) {
			return -1;
		}
		if(x.getLeft() != null) {
			r = x.getLeft().getSize()+1;
		}else {
			r=0;
		}
		BSTNode y = x;
		while(y != this.root) {
			if(y == y.getP().getRight()) {
				r += y.getP().getLeft().getSize()+1;
			}
			y=y.getP();
		}
		return r;
	}
	
	public void preorderTraversal() {
		System.out.print("pre-order traversal:  ");
		preorderTraversal(this.root);
		System.out.println();
	}
	
	private void preorderTraversal(BSTNode T) {
		if(T != null) {
			System.out.print(T.getKey()+" ");
			preorderTraversal(T.getLeft());
			preorderTraversal(T.getRight());
		}
		
	}
	
	public void preorderSizeTraversal() {
		System.out.print("pre-order size traversal:  ");
		preorderSizeTraversal(this.root);
		System.out.println();
	}
	
	private void preorderSizeTraversal(BSTNode T) {
		if(T != null) {
			System.out.print(T.getSize()+" ");
			preorderSizeTraversal(T.getLeft());
			preorderSizeTraversal(T.getRight());
		}
		
	}
	
	public void inorderTraversal() {
		System.out.print("in-order traversal:   ");
		inorderTraversal(this.root);
		System.out.println();
	}
	
	private void inorderTraversal(BSTNode T) {
		if(T != null) {
			inorderTraversal(T.getLeft());
			System.out.print(T.getKey()+" ");
			inorderTraversal(T.getRight());
		}
		
	}
	
	public void postorderTraversal() {
		System.out.print("post-order traversal: ");
		postorderTraversal(this.root);
		System.out.println();
	}
	
	private void postorderTraversal(BSTNode T) {
		if(T != null) {
			postorderTraversal(T.getLeft());
			postorderTraversal(T.getRight());
			System.out.print(T.getKey()+ " ");
		}
		
	}

	/**
	 * getter for the size variable
	 * @return returns the size of the tree;
	 */
	public int getSize() {
		return size;
	}
	
	

	
}
