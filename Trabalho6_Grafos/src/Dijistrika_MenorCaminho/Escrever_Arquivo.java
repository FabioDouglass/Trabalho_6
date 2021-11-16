package Dijistrika_MenorCaminho;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrever_Arquivo {

	
	public static void Escrita(GRAPH gh) {
		
		System.out.println("\nDigite a Raiz");
		String raiz = new Scanner(System.in).next();
		
		gh.Dijistrika(raiz);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("Dijistrika.txt"))){
	
			   bw.write(gh.printList());
			   bw.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}}

}