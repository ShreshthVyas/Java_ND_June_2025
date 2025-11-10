package Lecture41;

import java.util.ArrayList;
import java.util.HashMap;

public class BellManFord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BellManFord g = new BellManFord(5);
//		g.addEdge(1, 3, 3);
//		g.addEdge(1, 2, 1);
//		g.addEdge(2, 3, -3);
//		g.addEdge(2, 5, -2);
//		g.addEdge(3, 4, 6);
//		g.addEdge(4, 5, 4);
		BellManFord g = new BellManFord(3);
		g.addEdge(1, 2, -4);
		g.addEdge(2, 3, -3);
		g.addEdge(3, 1, -1);
		g.bellmanford();
	}
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public BellManFord(int v) {
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
		
	}
	public class edgepair {
		int v1;
		int v2;
		int cost;

		public edgepair(int v1, int v2, int cost) {
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}
//
//		public String toString() {
//			return v1 + " " + v2 + " @ cost  " + cost;
//		}
	}
	public ArrayList<edgepair> getedges(){
		ArrayList<edgepair> list =  new ArrayList<>();
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1).keySet()) {
				list.add(new edgepair(v1, v2, graph.get(v1).get(v2)));
			}
		}
		return list;
	}
	
	public void bellmanford() {
		ArrayList<edgepair> list =  getedges();
		int v =  graph.size();
		int arr[] =  new int[v+1];
		
		for (int i = 2; i <=v; i++) {
			arr[i] = 9999999;
		}
		
		for (int i = 1; i <=v; i++) {
			
			for (edgepair ep : list) {//relax all edges
				if(i == v && arr[ep.v2] > arr[ep.v1] + ep.cost) {// negetive cycle
					System.out.println("-ve cycle");
					return;
				}
				if(arr[ep.v2] > arr[ep.v1] + ep.cost) {// relaxed edge between v1 and v2
					arr[ep.v2]= arr[ep.v1] + ep.cost;
				}
			}
		}
		
		
		for (int i = 1; i <=v; i++) {
			System.out.println(i + "==>" + arr[i]);
		}
	}
 
}
