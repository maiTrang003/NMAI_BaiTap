package lab4.inform.student;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AStarSearchAlgo implements IInformedSearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		// TODO Auto-generated method stub
		PriorityQueue<Node> frontier = new PriorityQueue<>(new NodeComparatorByHnPlussGn());
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
					}else if(frontier.contains(node)&& node.getG()> current.getG()+edge.getWeight()) {
						frontier.remove(node);
						node.setParent(current);
						node.setG(current.getG()+edge.getWeight());
						frontier.add(node);
					}
				}
			}
		}
		return null;
	}
	
//	public boolean isAdmissibleH(Node root, String goal) {
//		
//	}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		boolean started = false;
		PriorityQueue<Node> frontier = new PriorityQueue<>(new NodeComparatorByHnPlussGn());
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
				List<Edge> listNodeChild = current.getChildren();
				for (Edge edge : listNodeChild) {
					Node endNode = edge.getEnd();
					if(!frontier.contains(endNode)&& !explored.contains(endNode)) {
						frontier.add(endNode);
						endNode.setParent(current);
						endNode.setG(current.getG()+edge.getWeight());
					}else if(frontier.contains(endNode)&& endNode.getG()>current.getG()+edge.getWeight()) {
						frontier.remove(endNode);
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
