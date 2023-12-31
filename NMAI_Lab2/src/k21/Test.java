package k21;

public class Test {

	public static void print(Node n) {
		for (String string : NodeUtils.printPath(n)) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.print(n);

	}

	public static void main(String[] args) {

//		Node nodeS = new Node("S");
//		Node nodeA = new Node("A");
//		Node nodeB = new Node("B");
//		Node nodeC = new Node("C");
//		Node nodeD = new Node("D");
//		Node nodeE = new Node("E");
//		Node nodeG = new Node("G");
//		nodeS.addEdge(nodeA, 10);
//		nodeS.addEdge(nodeE, 11);
//		nodeS.addEdge(nodeD, 5);
//		nodeA.addEdge(nodeB, 7);
//		nodeA.addEdge(nodeC, 4);
//		nodeB.addEdge(nodeG, 1);
//		nodeE.addEdge(nodeG, 7);
//		nodeC.addEdge(nodeG, 3);
//		nodeC.addEdge(nodeD, 8);
//		nodeC.addEdge(nodeE, 6);
//		nodeD.addEdge(nodeA, 6);
		
		Node nodeS = new Node("S");
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);

		// BFS graph search S->G
//		BreadthFirstSearchAlgo bg1 = new BreadthFirstSearchAlgo();
//		Node n1 = bg1.execute(nodeS, "G");
//		print(n1);
//		Node nodeF = new Node("F");
//		Node nodeG = new Node("G");
//		Node nodeH = new Node("H");
//		nodeS.addEdge(nodeA, 5);
//		nodeS.addEdge(nodeB, 2);
//		nodeS.addEdge(nodeC, 4);
//		nodeA.addEdge(nodeD, 9);
//		nodeA.addEdge(nodeE, 4);
//		nodeB.addEdge(nodeG, 6);
//		nodeC.addEdge(nodeF, 2);
//		nodeD.addEdge(nodeH, 7);
//		nodeE.addEdge(nodeG, 6);
//		nodeF.addEdge(nodeG, 1);

		
		// BFS graph search S->G
//		BreadthFirstSearchAlgo bg1 = new BreadthFirstSearchAlgo();
//		Node n1 = bg1.execute(nodeS, "G");
//		print(n1);
//		// BFS graph search bat ki->G
//		BreadthFirstSearchAlgo bg2 = new BreadthFirstSearchAlgo();
//		Node n2 = bg2.execute(nodeS, "A", "G");
//		print(n2);
//		// DFS graph search S->G
		// DFS graph search S->G
//		DepthFirstSearchAlgo dg1 = new DepthFirstSearchAlgo();
//		Node n3 = dg1.execute(nodeS, "G");
//		print(n3);
//		// DFS graph search bat ki->G
//		DepthFirstSearchAlgo dg2 = new DepthFirstSearchAlgo();
//		Node n4 = dg2.execute(nodeS, "A", "G");
//		print(n4);

//		// BFS Tree search S->G
//		BreadthFirstSearchAlgo btr1 = new BreadthFirstSearchAlgo();
//		Node n_btr1 = btr1.execute_TreeSearch(nodeS, "G");
//		print(n_btr1);
		
////		// BFS Tree search bat ki->G
//		BreadthFirstSearchAlgo btr2 = new BreadthFirstSearchAlgo();
//		Node n_btr2 = btr2.execute(nodeS, "A", "G");
//		print(n_btr2);
		
		// DFS tree search S->G
//		DepthFirstSearchAlgo dg1 = new DepthFirstSearchAlgo();
//		Node n3 = dg1.execute_TreeSearch(nodeS, "G");
//		print(n3);
//		// DFS tree search bat ki->G
//		DepthFirstSearchAlgo dg2 = new DepthFirstSearchAlgo();
//		Node n4 = dg2.execute_TreeSearch(nodeS, "A", "G");
//		print(n4);
		// BFS Tree search S->G
//		BreadthFirstSearchAlgo btr1 = new BreadthFirstSearchAlgo();
//		Node n_btr1 = btr1.execute_TreeSearch(nodeS, "G");
//		print(n_btr1);
//		
////		// BFS Tree search bat ki->G
//		BreadthFirstSearchAlgo btr2 = new BreadthFirstSearchAlgo();
//		Node n_btr2 = btr2.execute_TreeSearch(nodeS, "A", "G");
//		print(n_btr2);
////		
//		// DFS tree search S->G
//		DepthFirstSearchAlgo dtr1 = new DepthFirstSearchAlgo();
//		Node n_dtr3 = dtr1.execute_TreeSearch(nodeS, "G");
//		print(n_dtr3);
//		// DFS tree search bat ki->G
//		DepthFirstSearchAlgo dtr2 = new DepthFirstSearchAlgo();
//		Node n_dtr4 = dtr2.execute_TreeSearch(nodeS, "A", "G");
//		print(n_dtr4);
		
		//UniformCostSearch graph
//		UniformCostSearchAlgo ucs_graph = new UniformCostSearchAlgo();
//		print(ucs_graph.execute(nodeS, "G"));
		//depthLimitSearch
		DepthLimitedSearch dls = new DepthLimitedSearch();
		print(dls.execute(nodeS, "G"));
		
	}
}
