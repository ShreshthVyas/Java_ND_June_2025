package Lecture37;

import java.util.ArrayList;

public class Hashmap<K,V> {
	
	private ArrayList<Node> bckt;
	private class Node{
		K key;
		V value;
		Node next;
	}
	
	public Hashmap() {
		this.bckt =  new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			this.bckt.add(null);
		}
	}
	private int size = 0;//No of nodes=> No of key value pairs
	
	public void put(K key , V val) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		// Case 1: key already present
		while(curr!=null) {// check if key is already present
			if(curr.key.equals(key)) {// key already present
				curr.value = val;// value override
				return;
			}
			curr = curr.next;
		}
		// case 2: key not present
		Node nn  = new Node();
		nn.key = key;
		nn.value = val;
		nn.next = bckt.get(idx);// curr head linked to nn's next
		bckt.set(idx, nn);
		this.size++;
		double thf = 2.0;
		double lf = this.size / this.bckt.size();
		if(lf>thf) {
			rehashing();
		}
		
	}
	
	private void rehashing() {
		System.out.println("...");
		// TODO Auto-generated method stub
		ArrayList<Node> newbckt = new ArrayList<>();
		
		for (int i = 0; i < 2* bckt.size(); i++) {
			newbckt.add(null);
		}
		ArrayList<Node> temp = this.bckt;
		this.bckt = newbckt;
		
		for (Node head : temp) {
			while(head!=null) {
				put(head.key, head.value);
				head= head.next;
			}
		}
		
	}

	public void remove(K key) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		Node prev = null;
		// check if key exists
		while(curr!=null) {// check if key is already present
			if(curr.key.equals(key)) {// key already present
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if(curr ==null) {//empty list
			return;//list is empty i.e node is not present
		}
		else if(prev == null) {// remove first node
			bckt.set(idx, curr.next);
			this.size--;
		}
		else {
			prev.next = curr.next;
			curr.next = null;
			this.size--;
		}
		
	}
	
	public boolean containsKey(K key) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		while(curr!=null) {// check if key is already present
			if(curr.key.equals(key)) {// key already present
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	public V get(K key) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		while(curr!=null) {// check if key is already present
			if(curr.key.equals(key)) {// key already present
				return curr.value;
			}
			curr = curr.next;
		}
		return null;
	}
	
	
	@Override
	public String toString() {
		String s = "{ ";
		for (Node head : bckt) {
			while(head!=null) {
				s+= head.key + "==>" + head.value +" ,";
				head =  head.next;
			}
		}
		s+= " }";
		return s;
	}
	private int hashfunc(K key) {
		// TODO Auto-generated method stub
		int idx = key.hashCode() % this.bckt.size();
		
		return Math.abs(idx);
	}
	

}
