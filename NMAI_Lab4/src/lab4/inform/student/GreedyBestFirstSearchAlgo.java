package lab4.inform.student;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class GreedyBestFirstSearchAlgo implements IInformedSearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		// TODO Auto-generated method stub
		PriorityQueue<Node> frontier = new PriorityQueue<>(new NodeComparatorByHn());
		frontier.add(root);
		List<Node> explored = new ArrayList<>();
		while(!frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getLabel().equals(goal)) return current;
			else {
				explored.add(current);
				List<Edge> listChildren = current.getChildren();
				for (Edge edge : listChildren) {
					Node node = edge.getEnd();
					if(!frontier.contains(node)&& !explored.contains(node)) {
						node.setParent(current);
						node.setG(current.getG()+edge.getWeight());
						frontier.add(node);
					}
				}
			}
		}
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		boolean started =false;
		PriorityQueue<Node> frontier = new PriorityQueue<>(new NodeComparatorByHn());
		frontier.add(root);
		List<Node> explored = new ArrayList<>();
		while(!frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getLabel().equals(start)) {
				started=true;
				frontier.clear();
				current.setParent(null);
				current.setG(0);
			}
			if(current.getLabel().equals(goal)&& started) return current;
			else {
				explored.add(current);
				List<Edge> listChild= current.getChildren();
				for (Edge edge : listChild) {
					Node endNode = edge.getEnd();
					if(!explored.contains(endNode)&&!frontier.contains(endNode)) {
						frontier.add(endNode);
						endNode.setParent(current);
						endNode.setG(current.getG()+edge.getWeight());
					}
				}
			}
		}
		return null;
	}

}
