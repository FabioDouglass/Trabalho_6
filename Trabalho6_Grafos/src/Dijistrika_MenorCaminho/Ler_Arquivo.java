package Dijistrika_MenorCaminho;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ler_Arquivo {

	
	private static GRAPH gh;
	
	
	public static void Recolher_Informacoes(String file) {
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			  String value = br.readLine();
		
			  System.out.println("Total de Vertices: " + value + "\n");
			  
			  gh = new GRAPH(Integer.parseInt(value));
			  
			  for(int x = 1; x <= Integer.parseInt(value); x++) {
				  gh.addNode(x);
			  }
			  
			  
			  value = br.readLine();
		
			  while(value != null) {
				
				    String vertex[] = value.split(" ");
				   				
				    gh.addEdge(vertex[0], vertex[1], Integer.parseInt(vertex[2]) ); 
				
				    System.out.println(vertex[0] + "  " + vertex[1] + "  " + vertex[2]);
				    value = br.readLine();
			  }
			
			  br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}}


	public static GRAPH getGh() {
		return gh;
	}

}