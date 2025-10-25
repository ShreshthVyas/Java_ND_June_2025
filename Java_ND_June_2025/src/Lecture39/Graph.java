package Lecture39;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graph {
	
	private HashMap<Integer,HashMap<Integer,Integer>> graph;
	
	public Graph(int v) {
		graph =  new HashMap<>();
		
		for (int i = 1; i <=v; i++) {
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
	
	public boolean containsV(int v1) {
		return graph.containsKey(v1);
	}
	public boolean containsEdge(int v1, int v2) {
		return graph.get(v1).containsKey(v2);// || graph.get(v2).containsKey(v1);
	}
	
	public void removeEdge(int v1, int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}
	
	public void removeV(int v1) {
		
		for (Integer nbr : graph.get(v1).keySet()) {
			graph.get(nbr).remove(v1);
		}
		graph.remove(v1);
	}
	
	public int countEdges() {
		int count  = 0;
		
		for (int v : graph.keySet()) {
			count+= graph.get(v).size();
		}
		return count/2;
	}
	
	
	public void Display() {
		
		for (int v : graph.keySet()) {
			System.out.println(v + " - " + graph.get(v));
		}
		
	}
	
	public boolean hasPath(int src, int dest,HashSet<Integer> vis) {
		if(src == dest) {
			return true;
		}
		vis.add(src);
		for (int nbr : graph.get(src).keySet()) {
			if(vis.contains(nbr)) {
				continue;
			}
			boolean ans =  hasPath(nbr, dest,vis);
			if(ans) {
				return ans;
			}
		}
		vis.remove(src);
		return false;
	}
	public void Printallpath(int src, int dest,HashSet<Integer> vis,String s) {
		if(src == dest) {
			System.out.println(s);
			return ;
		}
		vis.add(src);
		for (int nbr : graph.get(src).keySet()) {
			if(vis.contains(nbr)) {
				continue;
			}
			Printallpath(nbr, dest,vis,s+"==>" +nbr);
			
		}
		vis.remove(src);
		
	}
	
	public boolean BFS(int src , int dest) {
		if(src == dest) {
			return true;
		}
		HashSet<Integer> vis =  new HashSet<>();
		Queue<Integer> q =  new LinkedList<>();
		q.add(src);
		
		while(!q.isEmpty()) {
			int rv  =  q.remove();//remove src
			System.out.println(rv);
			if(rv ==  dest) {// dest found 
				return true;
			}
			if(vis.contains(rv)) {//already visited
				continue;
			}
			vis.add(rv);// mark visited
			
			for (Integer nbrs : graph.get(rv).keySet()) {
				if(!vis.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
	public boolean DFS(int src , int dest) {
		if(src == dest) {
			return true;
		}
		HashSet<Integer> vis =  new HashSet<>();
		Stack<Integer> q =  new Stack<>();
		q.add(src);
		
		while(!q.isEmpty()) {
			int rv  =  q.pop();//remove src
			if(rv ==  dest) {// dest found 
				return true;
			}
			if(vis.contains(rv)) {//already visited
				continue;
			}
			vis.add(rv);// mark visited
			
			for (Integer nbrs : graph.get(rv).keySet()) {
				if(!vis.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
}
