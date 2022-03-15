package lol;

public class Campeao {

	private String nome;
	private Especificacao espc;
	
	
	public Campeao(String nome, Especificacao espc){
		this.nome = nome;
		this.espc = espc;
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Especificacao getEspc(){
		return espc;
	}
	
	
}
