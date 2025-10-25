package Lecture39;

import java.util.HashSet;

public class graphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 10);
		g.addEdge(2, 4, 10);
		g.addEdge(3, 4, 10);
		g.addEdge(2, 5, 10);
		g.addEdge(5, 6, 10);
		g.addEdge(5, 7, 10);
		g.addEdge(6, 7, 10);
		g.addVertice(8);
//		g.Display();
////		g.removeEdge(3, 4);
//		g.removeV(3);
//		g.Display();
		
//		System.out.println(g.hasPath(1, 6, new HashSet<>()));
//		g.Printallpath(1, 6, new HashSet<>(),"");
		
		System.out.println(g.BFS(1, 7));
		System.out.println(g.DFS(1, 7));
		
	}

}
