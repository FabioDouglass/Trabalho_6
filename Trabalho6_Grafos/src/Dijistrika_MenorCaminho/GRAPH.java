package Dijistrika_MenorCaminho;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GRAPH {

	private List<No> nodes;
	private String sequencia ="";
	
	
	public GRAPH(int size) {
		nodes = new ArrayList<No>(size);
	}
	
	public List<No> getNodes() {
		return nodes;
	}

	
	public void addNode(int value) {
		String n = TrocarValor(value);
		nodes.add(new No(n));
	}
	
	
	public No findByLabel(String no) {
		
		for(No n : nodes) {
			if(n.getLabel().equals(no)) {
				return n;
			}}	
		
		throw new NullPointerException("No  " +  no  + "  não identificado");
	}
	
	
	public void addEdge(String l1, String l2, int value) {
		No n = findByLabel(l1);
		No n2 = findByLabel(l2);
		
		n.addEdge(n2, value);
	}
	
	
	public void Dijistrika(String raiz) {
		
		No principal = findByLabel(raiz);
		principal.setValue(0);
		

		LinkedList<No> fila = new LinkedList<No>();
		fila.add(principal);
		
		
		while(!fila.isEmpty()) {
			
			No aux = fila.remove();

			for(No n : aux.getEdges().keySet()) {
				
				int custo = aux.getValue() + aux.getEdges().get(n);
				
				if(n.getValue() > custo) {
					
					  n.setValue(custo);
					  n.setParent(aux);
					  fila.add(n);	
				}}
		}}

	
	public void GerarCaminho(No n) {
	
		if(n.getParent() == null) {
			sequencia += n.getLabel();
			
		}else if(n.getParent() != null) {
			GerarCaminho(n.getParent());
			sequencia += "-" + n.getLabel();
		}}
	
	
	public String printList() {	
		
		String resultados = "";
		
		for(No n : nodes) {
			
			if(n.getParent() != null) {
				
				GerarCaminho(n);
				
				System.out.println(n.getLabel() + "  " + n.getValue() + "  " + sequencia + "\n");
				
				resultados += n.getLabel() + "  " + n.getValue() + "  " + sequencia + "\n";	
				sequencia="";
			}}
		
		return resultados;
	}
	
	
	private  String TrocarValor(int n) {	
		
		switch(n) {
		      case 1:return "A";
		      case 2:return "B";
		      case 3:return "C";
		      case 4:return "D";
		      case 5:return "E";
		      case 6:return "F";
		      case 7:return "G";
		      case 8:return "H";
		      case 9:return "I";
		      case 10:return "J";
		      case 11:return "K";
		      case 12:return "L";
		      case 13:return "M";
		      case 14:return "N";
		      case 15:return "O";
		      case 16:return "P";
		      case 17:return "Q";
		      case 18:return "R";
		      case 19:return "S";
		      case 20:return "T";
		      case 21:return "U";
		      case 22:return "V";
		      case 23:return "W";
		      case 24:return "X";
		      case 25:return "Y";
		      case 26:return "Z";
		}
		
		return null;
	}
	
	
}