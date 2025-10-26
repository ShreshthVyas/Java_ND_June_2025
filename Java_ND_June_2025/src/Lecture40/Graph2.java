package Lecture40;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
	public static void main(String[] args) {
		Graph2 g = new Graph2(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 10);
		g.addEdge(2, 4, 10);
		g.addEdge(3, 4, 10);
//		g.addEdge(2, 5, 10);
		g.addEdge(5, 6, 10);
		g.addEdge(5, 7, 10);
		g.addEdge(6, 7, 10);
		g.addVertice(8);
		
		g.BFT();
		g.DFT();
	}

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Graph2(int v) {
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

	public void BFT() {
		HashSet<Integer> vis = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		for (int src : graph.keySet()) {// to get all vertices in graph
			if (vis.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {// BFS
				int rv = q.remove();// remove src
				if (vis.contains(rv)) {// already visited
					continue;
				}
				vis.add(rv);// mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if (!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
	public void DFT() {
		HashSet<Integer> vis =  new HashSet<>();
		Stack<Integer> q =  new Stack<>();
		
		for (int src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv  =  q.pop();//remove src
				if(vis.contains(rv)) {//already visited
					continue;
				}
				vis.add(rv);// mark visited
				System.out.print(rv+" ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
	}
	
	public boolean isCyclic() {
		HashSet<Integer> vis =  new HashSet<>();
		Stack<Integer> q =  new Stack<>();
		
		for (int src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv  =  q.pop();//remove src
				if(vis.contains(rv)) {//already visited that means cycle
					return true;
				}
				vis.add(rv);// mark visited
				System.out.print(rv+" ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return false;
	}
	
	public boolean isConnected() {
		HashSet<Integer> vis = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		int count =0;
		for (int src : graph.keySet()) {// to get all vertices in graph
			if (vis.contains(src)) {
				continue;
			}
			q.add(src);
			count++;
			while (!q.isEmpty()) {// BFS
				int rv = q.remove();// remove src
				if (vis.contains(rv)) {// already visited
					continue;
				}
				vis.add(rv);// mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if (!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
		return count==1;
	}
	public boolean isTree() {// isConnected && !isCyclic
		HashSet<Integer> vis = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		int count =0;
		for (int src : graph.keySet()) {// to get all vertices in graph
			if (vis.contains(src)) {
				continue;
			}
			q.add(src);
			count++;
			while (!q.isEmpty()) {// BFS
				int rv = q.remove();// remove src
				if (vis.contains(rv)) {// already visited means cycle
					return false;
				}
				vis.add(rv);// mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if (!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
		return count==1;
	}
}
