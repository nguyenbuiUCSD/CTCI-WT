package com.github.nguyenbuiUCSD.CTCI.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<GraphNode> nodes;

	public Graph() {
		nodes = new ArrayList<GraphNode>();
	}
	
	public List<GraphNode> getNodes() {
		return nodes;
	}

	public boolean addNode(GraphNode node) {
		if (nodes != null && node != null) { 
			nodes.add(node);
			return true;
		} else {
			return false;
		}
	}
	
}
