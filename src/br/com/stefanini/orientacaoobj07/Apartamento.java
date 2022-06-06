package br.com.stefanini.orientacaoobj07;

public class Apartamento extends Moradia {

	private int ApartamentoComprado=107;
	
	public void ApartamentoComprado(int ApartamentoComprado) {
		this.setApartamentoComprado(ApartamentoComprado);
	}
	
	@Override
	public String mensagem() {
		
		return "Você comprou um apartamento de " + super.getQuarto() + " quartos";
	}

	public int getApartamentoComprado() {
		return ApartamentoComprado;
	}

	public void setApartamentoComprado(int apartamentoComprado) {
		ApartamentoComprado = apartamentoComprado;
	}
	



}
