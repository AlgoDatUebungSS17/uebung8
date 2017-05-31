package edu.hm.cs.algdat17.trees;

/**
 * Internal node of binary trees holding a single key/value.
 * 
 * @author katz.bastian
 *
 * @param <T>
 *            key type
 */
public class TreeNode<T> {
	T data;
	TreeNode<T> left;
	TreeNode<T> right;

	TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

//	public int getLeafeCount() {
//		if (left == null && right == null) {
//			return 1;
//		}
//
//		if (left != null && right != null) {
//			return left.getLeafeCount() + right.getLeafeCount();
//		} else {
//			if (left != null) {
//				return left.getLeafeCount();
//			} else {
//				return right.getLeafeCount();
//			}
//		}
//	}

//	public boolean contains(T elemet) {
//		if (data.equals(elemet)) {
//			return true;
//		}
//
//		if (left == null && right == null) {
//			return false;
//		}
//
//		if (left != null && right != null) {
//			if (left.contains(elemet)) {
//				return true;
//			} else {
//				return right.contains(elemet);
//			}
//		} else {
//			if (left != null) {
//				return left.contains(elemet);
//			} else {
//				return right.contains(elemet);
//			}
//		}
//
//	}
//	
//	public void insert (T data)
//	{
//		if(((Comparable)this.data).compareTo((Comparable)data) > 0)
//	    {
//	    	if(left!=null)
//	    	{
//	    		left.insert(data);
//	    	}
//	    	else{
//	    		left = new TreeNode<>(data, null, null);
//	    	}
//	    }
//	    else
//	    {
//	    	if(right!=null)
//	    	{
//	    		right.insert(data);
//	    	}
//	    	else{
//	    		right = new TreeNode<>(data, null, null);
//	    	}
//	    }
//	}
}
