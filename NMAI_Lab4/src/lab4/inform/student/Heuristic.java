package lab4.inform.student;

import java.util.List;
import java.util.PriorityQueue;

public class Heuristic {
	public boolean isAdmissibleH(Node root, String goal) {
		
		PriorityQueue<Node>  frontier = new PriorityQueue<>(new NodeComparatorByHn());
		frontier.add(root);
		while(!frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getLabel().equals(goal)) return true;
			else {
		List<Edge> listChild = current.getChildren();
		int i=0;
		for (Edge edge : listChild) {
			
			Node endNode = edge.getEnd();
			if(current.getH()> endNode.getH()&& !frontier.contains(endNode)) {
				 frontier.add(endNode);
			}
		}
			}
		}
		return false; 
	}
	
}
