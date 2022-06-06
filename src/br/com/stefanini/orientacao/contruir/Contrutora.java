package br.com.stefanini.orientacao.contruir;

import br.com.stefanini.orientacaoobj07.Moradia;
import br.com.stefanini.orientacaoobj07.Apartamento;
import br.com.stefanini.orientacaoobj07.Casa;

public class Contrutora {

	public static void main(String[] args) {
		
		Apartamento apto01= new Apartamento();
		apto01.setSala(1);
		apto01.setQuarto(2);
		apto01.setCozinha(1);
		apto01.setBanheiro(2);
		
		System.out.println(apto01.mensagem());
		
		
		Casa casa01= new Casa("São Paulo", "SP");
		
		casa01.setSala(1);
		casa01.setQuarto(3);
		casa01.setCozinha(1);
		casa01.setBanheiro(1);
		
		System.out.println(casa01.mensagem());
		
		
		Moradia apto02= new Apartamento();
		
		System.out.println(((Apartamento) apto02).getApartamentoComprado());
		
		
		
		
	
	}

}
