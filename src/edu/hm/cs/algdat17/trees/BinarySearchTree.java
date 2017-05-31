package edu.hm.cs.algdat17.trees;

/**
 * (Partial) implementation of a binary search tree.
 * 
 * @author katz.bastian
 *
 * @param <T>type
 *            of key values
 */
public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

	/**
	 * Inserts a key to the search tree (if not already contained).
	 * 
	 * @param data
	 *            key to add.
	 */
	public void insert(T data) {
		if (root == null) {
			root = new TreeNode<>(data, null, null);
		} else {
			insert(data, root);
		}
	}

	private void insert(T data, TreeNode<T> node) {			
		if (node.data.compareTo(data) > 0) {
			if (node.left != null) {
				insert(data,node.left);
			} else {
				node.left = new TreeNode<>(data, null, null);
			}
		} else {
			if (node.right != null) {
				insert(data, node.right);
			} else {
				node.right = new TreeNode<>(data, null, null);
			}
		}

	}

	@Override
	public boolean contains(T data) {
		if(root == null)
		{
			return false;
		}
		else
		{
			return contains(data, root);
		}
	}
	
	private boolean contains(T data, TreeNode<T> node)
	{
		if(node.data.equals(data))
		{
			return true;
		}
		else
		{
			if (node.data.compareTo(data)>0)
			{
				if(node.left == null)
				{
					return false;
				}
				else
				{
					return contains(data, node.left);
				}
			}
			else
			{
				if(node.right == null)
				{
					return false;
				}
				else
				{
					return contains(data, node.right);
				}
			}
		}
			
	}

	/**
	 * Finds the largest key smaller than a given key.
	 * 
	 * @param data
	 *            query key
	 * @return the largest key smaller than the query key or null if no such key
	 *         exists
	 */
	public T floor(T data) {
		if(root == null)
		{
			return null;
		}
		else
		{
			return floor(data, root);
		}
		
	}
	
	private T floor (T data, TreeNode<T> node)
	{
		if(node.left == null && node.right == null)
		{
			if(node.data.compareTo(data)<0)
			{
				return node.data;
			}
			else
			{
				return null;
			}
			
		}
		
		if(node.data.equals(data))
		{
			return node.data;
		}
		
		
		if(node.data.compareTo(data)>0)
		{
			if(node.left == null)
			{
				return null;
			}
			else
			{
				return floor(data, node.left);
			}
		}
		else
		{
			if(node.right == null)
			{
				return node.data;
			}
			else
			{
				return floor(data, node.right);
			}
		}		
	}

}
