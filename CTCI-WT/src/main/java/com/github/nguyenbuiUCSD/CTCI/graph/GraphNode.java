package com.github.nguyenbuiUCSD.CTCI.graph;

import static org.junit.Assert.assertFalse;

import java.util.List;

public class GraphNode {
	private String name;
	private List<GraphEdge> edges;
	
	
	public String getName() {
		return name;
	}
	
	public GraphNode(String name) {
		this.name = name;
	}

	public List<GraphEdge> getEdges() {
		return edges;
	}
	public boolean addEdge(GraphEdge edge) {
		if (edges!=null && edge!=null) {
			this.edges.add(edge);
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
