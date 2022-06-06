package br.com.stefanini.orientacaoobj07;

public class Moradia {
	
	private int sala;
	private int quarto;
	private int cozinha;
	private int banheiro;
	

	
	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public int getCozinha() {
		return cozinha;
	}

	public void setCozinha(int cozinha) {
		this.cozinha = cozinha;
	}

	public int getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(int banheiro) {
		this.banheiro = banheiro;
	}


	public String mensagem() {
		return "Você adiquiriu um imovel";
	}

}
