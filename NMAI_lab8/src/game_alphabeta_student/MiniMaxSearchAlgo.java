package game_alphabeta_student;

import java.util.Collections;
import java.util.List;

public class MiniMaxSearchAlgo implements ISearchAlgo {

	// function MINIMAX-DECISION(state) returns an action
	// inputs: state, current state in game
	// v <- MAX-VALUE(state)
	// return the action in SUCCESSORS(state) with value v
	@Override
	public void execute(Node node) {
		// Enter your code here
		int v=maxValue(node);
		System.out.println(v);
	}

	// function MAX-VALUE(state) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MIN_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MAX(v, MIN-VALUE(s))
	// return v
	public int maxValue(Node node) {
		// Enter your code here
		int v =Integer.MIN_VALUE;
		if(node.getChildren().isEmpty()) return node.getValue();
		if(v< Integer.MIN_VALUE) {
			List<Node> list = node.getChildren();
			for (Node node2 : list) {
				v= Math.max(v, minValue(node2));
			}
		}
		return v;
	}
	// function MIN-VALUE(state) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MAX_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MIN(v, MAX-VALUE(s))
	// return v

	public int minValue(Node node) {
		// Enter your code here
		int v =Integer.MAX_VALUE;
		if(node.getChildren().isEmpty()) return node.getValue();
		if(v> Integer.MAX_VALUE) {
			List<Node> list = node.getChildren();
			for (Node node2 : list) {
				v= Math.min(v, maxValue(node2));
				
			}
		}
		return v;
	}
	public static void main(String[] args) {
		
		MiniMaxSearchAlgo m = new MiniMaxSearchAlgo();
		m.execute(null);
	}
}
