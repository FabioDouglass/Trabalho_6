package Dijistrika_MenorCaminho;

import java.util.Hashtable;


public class No {

	private String label;
	private int value = Integer.MAX_VALUE;
	
	private Hashtable<No,Integer> edges = new Hashtable<No,Integer>();
	private No parent;
	
	
	public No(String l) {
		this.label=l;
	}
	
	
	public String getLabel() {
		return label;
	}

	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public No getParent() {
		return parent;
	}
	
	public void setParent(No parent) {
		this.parent = parent;
	}


	public Hashtable<No, Integer> getEdges() {
		return edges;
	}	

	
	public void addEdge(No n, int distance) {
		edges.put(n, distance);
	}

}