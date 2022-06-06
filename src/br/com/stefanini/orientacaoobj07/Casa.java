package br.com.stefanini.orientacaoobj07;

import br.com.stefanini.orientacaoobj07.Moradia;

public class Casa extends Moradia {
	
	public Casa(String Cidade, String Estado) {
		
	}
	
	@Override
	public String mensagem() {
		
		return "Você comprou um casa de " + super.getQuarto() + " quartos";
	}
	


}
