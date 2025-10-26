package Lecture40;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims {
	
	public static void main(String[] args) {
		Prims g = new Prims(7);
		g.addEdge(1, 2, 1);
		g.addEdge(1, 3, 3);
		g.addEdge(2, 4, -2);
		g.addEdge(3, 4, 7);
		g.addEdge(2, 5, 6);
		g.addEdge(5, 6, -13);
		g.addEdge(5, 7, 4);
		g.addEdge(6, 7, 9);
	
		System.out.println(g.prims());
		
	}

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Prims(int v) {
		graph = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addVertice(int v1) {
		graph.put(v1, new HashMap<>());
	}

	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}
	
	public class edgepair{
		int v;
		int aqv;
		int cost;
		
		public edgepair(int v,int aqv,int cost) {
			this.v =  v;
			this.aqv = aqv;
			this.cost = cost;
		}
		
		public String toString() {
			return v + " " + aqv + " @ cost  "  + cost;
		}
	}
	
	public int prims() {
		HashSet<Integer> vis =  new HashSet<>();
		PriorityQueue<edgepair> q =  new PriorityQueue<>(new Comparator<edgepair>() {

			@Override
			public int compare(edgepair o1, edgepair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		
		int mst = 0;
		for (int src : graph.keySet()) {// to get all vertices in graph
			if (vis.contains(src)) {
				continue;
			}
			q.add(new edgepair(src, src, 0));
			while (!q.isEmpty()) {// BFS
				edgepair rv = q.remove();// remove src
				if (vis.contains(rv.v)) {// already visited
					continue;
				}
				vis.add(rv.v);// mark visited
				mst +=  rv.cost;
				System.out.println(rv + " ");
				for (Integer nbrs : graph.get(rv.v).keySet()) {
					if (!vis.contains(nbrs)) {
						int c =  graph.get(rv.v).get(nbrs);
						q.add(new edgepair(nbrs, rv.v, c));
					}
				}
			}
		}
		return mst;
	}
}
