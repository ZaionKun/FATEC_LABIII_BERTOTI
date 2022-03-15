package org.acme;

public class Especificacao {

	
	private String tipo;
	private String lane;
	private String dano;
	
	
	public Especificacao(String tipo, String lane, String dano){
		this.tipo = tipo;
		this.lane = lane;
		this.dano = dano;
	}
	
	public Especificacao(String campeao, String tipo2, String lane2, String dano2) {
		
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public String getLane(){
		return lane;
	}
	
	public String getDano(){
		return dano;
	}
	
	//delegacao da comparacao de tipo, lane e dano do campeão para a classe Especificacao, pois ela é a dona dos atributos
	public boolean comparar(Especificacao esp){
		if(tipo.equals(esp.tipo) && lane.equals(esp.lane) && dano.equals(esp.dano)){
			return true;
		} else {
			return false;
		}
	}
	
}
