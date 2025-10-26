package Lecture40;

import java.util.LinkedList;
import java.util.Queue;

import java.util.HashMap;

public class BiPartitite {
	
	public boolean isBipartite(int[][] graph) {
		Queue<pair> q =  new LinkedList<>();
		HashMap<Integer,Integer> visited =  new HashMap<>();
		
		for (int src = 0; src < graph.length; src++) {// all vertices
			if (visited.containsKey(src)) {
				continue;
			}
			q.add(new pair(src, 0));
			while(!q.isEmpty()) {
				pair rv =  q.poll();
				if(visited.containsKey(rv.v)) {//cyclic
					if(rv.d !=  visited.get(rv.v)) {// odd length cycle
						return false;// not bipartite
					}
				}
				visited.put(rv.v, rv.d);
				
				for (int nbr : graph[rv.v]) {
					if(!visited.containsKey(nbr)) {
						q.add(new pair(nbr, rv.d +1));
					}
				}
				
				
			}
		}
		return true;
	}
	
	public class pair{
		int v;
		int d;
		public pair(int v, int d) {
			this.v = v;
			this.d = d;
		}
	}
}
