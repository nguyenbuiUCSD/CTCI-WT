package com.github.nguyenbuiUCSD.CTCI.graph;

public class GraphEdge {
	private GraphNode start,end;
	private int weight;
	
	public GraphEdge(GraphNode start, GraphNode end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

	public GraphNode getEnd() {
		return end;
	}

	public void setEnd(GraphNode end) {
		this.end = end;
	}

	public GraphNode getStart() {
		return start;
	}

	public void setStart(GraphNode start) {
		this.start = start;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


}
