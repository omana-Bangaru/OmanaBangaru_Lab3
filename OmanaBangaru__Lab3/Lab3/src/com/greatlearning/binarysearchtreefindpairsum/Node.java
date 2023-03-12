package com.greatlearning.binarysearchtreefindpairsum;

//A class to store a BST node
public class Node {
	Node leftNode, rightNode;
	int nodeData;
	
  public Node(int data) {
      this.nodeData = data;
      leftNode = rightNode = null;
  }
}
