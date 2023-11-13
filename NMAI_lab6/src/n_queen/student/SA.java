package n_queen.student;

import java.util.Random;

public class SA {
	public Node execute(Node initialState) {
		Node current = initialState;
		Node next=null;
		double T = 1000;
		while(current.getH()!=0) {
			if(T==0) return current; 
				next=current.selectNextRandomCandidate();
			int deltaE = next.getH()-current.getH();
			if(deltaE<0) {
				current=next;
			}else {
				if(Math.exp(deltaE/T)>Math.random()) {
					current=next;
				}
			}
			T*=0.999;
		}
		return current;
		
		}

	public static void main(String[] args) {
		SA sa = new SA();
		Node n= sa.execute(new Node());
		n.displayBoard();
		System.out.println(n.getH());
	}

}
