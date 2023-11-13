package n_queen.student;

public class HillClimbing {

	public Node execute(Node initialState) {
		// Enter your code here.
		Node current = initialState;
		Node neighber =null;
		while(true) {
			neighber= current.getBestCandidate();
			if(neighber.getH()<current.getH())
				current=neighber;
			else return current;
		}
//		return null;
		}
	
	
	public Node executeHillClimbingWithRandomRestart(Node
			initialState) {
			// Enter your code here.
		Node n = execute(initialState);
		while(n.getH()!=0) {
		n.generateBoard();
//		System.out.println();
//		n.displayBoard();
//		System.out.println();
			n=execute(n);
		}
		
			return n;
			}

	public static void main(String[] args) {
		HillClimbing h = new HillClimbing();
		Node n = h.executeHillClimbingWithRandomRestart(new Node());
		n.displayBoard();
		
	}
}
