package com.github.nguyenbuiUCSD.CTCI.graph;

import java.util.List;

public class GraphEdge {
	private GraphNode start,end;
	
	private List<GraphNode> nodeList;

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

	public List<GraphNode> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
}
