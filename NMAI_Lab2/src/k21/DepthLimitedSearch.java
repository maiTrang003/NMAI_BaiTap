package k21;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthLimitedSearch implements ISearchAlgo{
	private int limit=3;

	@Override
	public Node execute(Node root, String goal) {
		// TODO Auto-generated method stub
		Stack<Node> fontier = new Stack<>();
		fontier.add(root);
		List<Node> explore = new ArrayList<>();
		while(!fontier.isEmpty()){
			Node current = fontier.pop();
			if (current.getLabel().equals(goal))
				return current;
			else {
				System.out.println("huhu");
				if(current.getDepth()<limit) {
					System.out.println("haha");
					List<Node> children = current.getChildrenNodes();
					for (Node child : children) {
						if(!fontier.contains(child)&&!explore.contains(child)) {
							fontier.add(child);
							child.setParent(current);
							child.setDepth(current.getDepth()+1);
						}
					}
				}
			}
		}
		return null;
	}

	@Override
	public Node execute_TreeSearch(Node root, String goal) {
		// TODO Auto-generated method stub
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
