package com.greatlearning.binarysearchtreefindpairsum;

import java.util.HashSet;

public class FindSumPair {

	// Recursive function to insert a key into a BST
	public Node insert(Node root, int key) {
		// If the tree is empty, return a new node
		if (root == null) {
			root = new Node(key);
			return root;
		}
		// If the given key is less than the root node, recur for the left subtree
		if (key < root.nodeData)
			root.leftNode = insert(root.leftNode, key);

		// if the given key is more than the root node, recur for the right subtree
		else if (key > root.nodeData)
			root.rightNode = insert(root.rightNode, key);

		return root;
	}

	// Function to find a pair with a given sum in the BST
	public boolean findpair(Node root, int sum, HashSet<Integer> set) {
		if (root == null)
			return false;

		// Return true if pair is found in the left subtree; otherwise, continue
		// processing the node
		if (findpair(root.leftNode, sum, set))
			return true;

		// If a pair is formed with the current node, print the pair and return true
		if (set.contains(sum - root.nodeData)) {
			System.out.println("Pair is found (" + (sum - root.nodeData) + ", " + root.nodeData + ")");
			return true;
		}
		// Insert the current node's value into the set
		else
			set.add(root.nodeData);

		// Search in the right subtree
		return findpair(root.rightNode, sum, set);

	}

	public void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpair(root, sum, set))
			System.out.println("Pairs do not exist");
	}
}