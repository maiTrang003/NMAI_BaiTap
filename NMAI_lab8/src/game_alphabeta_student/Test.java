package game_alphabeta_student;

public class Test {
	public static void main(String[] args) {
//		List<Node> list = new ArrayList<>();
//		Node W = new Node("W",-3 );
//		Node X = new Node("X",-5 );
//		Node N = new Node("N",4 );
//		Node O = new Node("O" );
//		Node P = new Node("P",9 );
//		Node Q = new Node("Q",-6 );
//		Node R = new Node("R",0 );
//		Node S = new Node("S",3 );
//		Node T = new Node("T",5 );
//		Node U = new Node("U",-7 );
//		Node V = new Node("V",-9);
//		Node F = new Node("F");
//		Node G = new Node("G",-5 );
//		Node H = new Node("H",3);
//		Node I = new Node("I",8);
//		Node J = new Node("J" );
//		Node K = new Node("K");
//		Node L = new Node("L",2 );
//		Node M = new Node("M");
//		Node B = new Node("B");
//		Node C = new Node("C");
//		Node D = new Node("D",0 );
//		Node E = new Node("E");
//		Node A = new Node("A");
//		
//		O.addChild(W);
//		O.addChild(X);
//		F.addChild(N);
//		F.addChild(O);
//		J.addChild(P);
//		J.addChild(Q);
//		J.addChild(R);
//		K.addChild(S);
//		K.addChild(T);
//		M.addChild(U);
//		M.addChild(V);
//		B.addChild(F);
//		B.addChild(G);
//		C.addChild(H);
//		C.addChild(I);
//		C.addChild(J);
//		E.addChild(K);
//		E.addChild(L);
//		E.addChild(M);
//		A.addChild(B);
//		A.addChild(C);
//		A.addChild(D);
//		A.addChild(E);
		
		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node("D");
		Node E = new Node("E");
		Node F = new Node("F");
		Node G = new Node("G");
		Node H = new Node("H");
		Node I = new Node("I");
		Node J = new Node("J");
		Node K = new Node("K");
		Node L = new Node("L");
		Node M = new Node("M");
		Node N = new Node("N");
		Node O = new Node("O");
		Node P = new Node("P");
		Node Q = new Node("Q");
		Node R = new Node("R");
		Node S = new Node("S");
		Node T = new Node("T");
		Node N0 = new Node("N0",0);
		Node M1 = new Node("M1", 1);
		Node Q1 = new Node("Q1", 1);
		Node T1 = new Node("T1", 1);
		Node L2 = new Node("L2", 2);
		Node P2 = new Node("P2", 2);
		Node K4 = new Node("K4", 4);
		Node O4 = new Node("O4", 4);
		Node S4 = new Node("S4", 4);
		Node R3 = new Node("R3", 3);
		Node T3 = new Node("T3", 3);
		Node N7 = new Node("N7", 7);
		Node S7 = new Node("S7", 7);
		Node Q8 = new Node("Q8", 8);
		Node K9 = new Node("K9", 9);
		Node M10 = new Node("M10", 10);

		
		
		K.addChild(K4);
		K.addChild(K9);
		L.addChild(L2);
		E.addChild(K);
		E.addChild(L);
		
		M.addChild(M1);
		M.addChild(M10);
		N.addChild(N0);
		N.addChild(N7);
		F.addChild(M);
		F.addChild(N);
		
		O.addChild(O4);
		G.addChild(O);
		
		P.addChild(P2);
		Q.addChild(Q1);
		Q.addChild(Q8);
		H.addChild(P);
		H.addChild(Q);
		
		S.addChild(S7);
		S.addChild(S4);
		R.addChild(R3);
		I.addChild(R);
		I.addChild(S);
		
		T.addChild(T3);
		T.addChild(T1);
		J.addChild(T);
		
		
		B.addChild(E);
		B.addChild(F);
		C.addChild(G);
		C.addChild(H);
		D.addChild(I);
		D.addChild(J);
		
		A.addChild(B);
		A.addChild(C);
		A.addChild(D);
		
//		MiniMaxSearchAlgo m = new MiniMaxSearchAlgo();
//		m.execute(A);
		AlphaBetaSearchAlgo l = new AlphaBetaSearchAlgo();
		l.execute(A);
		System.out.println("bestmove_L: "+A.getNextBestNode());
		AlphaBetaRightToLeftSearchAlgo r = new AlphaBetaRightToLeftSearchAlgo();
		r.execute(A);
		System.out.println("bestmove_R: "+A.getNextBestNode());
	}
}
