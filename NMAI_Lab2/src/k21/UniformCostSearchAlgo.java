package k21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class UniformCostSearchAlgo implements ISearchAlgo{

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> fontier = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				if(o1.getPathCost()!=o2.getPathCost())
					return Double.compare(o1.getPathCost(), o2.getPathCost());
					else return o1.getLabel().compareTo(o2.getLabel());
			}
			
		});
		fontier.add(root);

		List<Node> explored = new ArrayList<>();
		while (!fontier.isEmpty()) {
			Node current = fontier.poll();
			if (current.getLabel().equals(goal))
				return current;
			else {
				explored.add(current);
			List<Edge> path = current.getChildren();

			for (Edge e : path) {
				Node endNode = e.getEnd();
						if (!fontier.contains(endNode) && !explored.contains(endNode)) {
							fontier.add(endNode);
							endNode.setPathCost(current.getPathCost() + e.getWeight());
							endNode.setParent(current);

					}
						else if(fontier.contains(endNode)&& endNode.getPathCost()>current.getPathCost()+e.getWeight()) {
							endNode.setPathCost(current.getPathCost()+e.getWeight());
							endNode.setParent(current);
						}
				}
			}

		}
		return null;
	}

	@Override
	public Node execute_TreeSearch(Node root, String goal) {
		PriorityQueue<Node> fontier = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				if(o1.getPathCost()!=o2.getPathCost())
					return Double.compare(o1.getPathCost(), o2.getPathCost());
					else return o1.getLabel().compareTo(o2.getLabel());
			}
			
		});
		fontier.add(root);

		List<Node> explored = new ArrayList<>();
		while (!fontier.isEmpty()) {
			Node current = fontier.poll();
			if (current.getLabel().equals(goal))
				return current;
			else {
				explored.add(current);
			List<Edge> path = current.getChildren();

			for (Edge e : path) {
				Node endNode = e.getEnd();
						if (!fontier.contains(endNode) && !explored.contains(endNode)) {
							fontier.add(endNode);
							endNode.setPathCost(current.getPathCost() + e.getWeight());
							endNode.setParent(current);

					}
						else if(fontier.contains(endNode)&& endNode.getPathCost()>current.getPathCost()+e.getWeight()) {
							endNode.setPathCost(current.getPathCost()+e.getWeight());
							endNode.setParent(current);
						}
				}
			}

		}
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node execute_TreeSearch(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

}
