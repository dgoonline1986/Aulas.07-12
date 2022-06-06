package br.com.stefanini.estruturas.de.repeticao;


public class AnaliseCompraAula12 {

	public static void main(String[] args) {
		
		String compra= "Apartamento";
		int parcelas=144;
		int pagas=3;
		boolean quitado=true;
		int semestreCompra=1;
	
	
		if(compra=="Apartamento") {
			System.out.println("Você comprou um apartamento");	
		}else {
			System.out.println("Você comprou uma Casa");
		}
		
		 
		for(int i=1; i<=pagas; i++) {
			System.out.println("parcela " + i + " paga");
		}
		
	
			
			switch(semestreCompra) {
				case 1: System.out.println("Compra do imovel no primeiro semestre"); break;
				case 2: System.out.println("Compara do imovel segundo semestre");break;
				default: System.out.println("valor invalido");
			}
		
		
			while(parcelas>pagas) {
				quitado=false;
				if(quitado==false) {
					System.out.println("financiamento em andamento");
					break;
				}	else {
					System.out.println("financiamento quitado");
				}
			}
		
		}
		
		
		



}
