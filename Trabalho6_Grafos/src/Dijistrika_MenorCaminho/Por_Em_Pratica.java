package Dijistrika_MenorCaminho;


public class Por_Em_Pratica {

	
	public static void main(String[] args) {
		
		Ler_Arquivo.Recolher_Informacoes("Grafo_Dijistrka_2.txt");
				
		Escrever_Arquivo.Escrita(Ler_Arquivo.getGh());
	}
}