package game_alphabeta_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AlphaBetaSearchAlgo implements ISearchAlgo {

	// function ALPHA-BETA-SEARCH(state) returns an action
	// inputs: state, current state in game
	// v <- MAX-VALUE(state, Integer.MIN_VALUE , Integer.MAX_VALUE)
	// return the action in SUCCESSORS(state) with value v
	@Override
	public void execute(Node node) {
		// Enter your code here
		System.out.println(maxValue(node,  Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

	// function MAX-VALUE(state, alpha, beta) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- MIN_VALUE;
	// for each s in SUCCESSORS(state) do
	// v <- MAX(v, MIN-VALUE(s, alpha, beta))
	// if v >= beta then return v
	// alpha <- MAX(alpha, v)
	// return v

	public int maxValue(Node node, int alpha, int beta) {
		// Enter your code here
		int v = Integer.MIN_VALUE;
		if(node.isTerminal()) return node.getValue();
		
		List<Node> list = node.getChildren();
		Collections.sort(list,Node.LabelComparator);
		for (int i=0;i<list.size();i++) {
			v=Math.max(v, minValue(list.get(i), alpha, beta));
			node.setNextBestNode(list.get(i));
			if(v>=beta) {
				for(int j=i+1;j<list.size();j++) {
					Node n =list.get(j);
//					System.out.println(n);
					if(!n.isTerminal()) {
						Stack<Node> st = new Stack<>();
						st.add(n);
						while(!st.isEmpty()) {
							Node current = st.pop();
							System.out.println(current.getLabel());
								for (Node node2 : current.getChildren()) {
									if(!st.contains(node2))
									st.add(node2);
								}
						}
					}else System.out.println(n.getLabel());
				}
				return v;
			}
			alpha=Math.max(alpha, v);
		}
		return v;
	}
	// function MIN-VALUE(state, alpha , beta) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MAX_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MIN(v, MAX-VALUE(s, alpha , beta))
	// if v <= alpha then return v
	// beta <- MIN(beta ,v)
	// return v

	public int minValue(Node node, int alpha, int beta) {
		// Enter your code here
		int v = Integer.MAX_VALUE;
		if(node.isTerminal()) return node.getValue();
		List<Node> list = node.getChildren();
		Collections.sort(list,Node.LabelComparator);
		for (int i=0;i<list.size();i++) {
			v=Math.min(v, maxValue(list.get(i), alpha, beta));
			if(v<=alpha) {
				for(int j=i+1;j<list.size();j++) {
					Node n =list.get(j);
//					System.out.println(n);
					if(!n.isTerminal()) {
						Stack<Node> st = new Stack<>();
						st.add(n);
						while(!st.isEmpty()) {
							Node current = st.pop();
							System.out.println(current.getLabel());
								for (Node node2 : current.getChildren()) {
									if(!st.contains(node2))
									st.add(node2);
								}
						}
					}else System.out.println(n.getLabel());
				}
				return v;
			}
			beta=Math.min(beta, v);
		}
		
		return v;
	}
	
}
