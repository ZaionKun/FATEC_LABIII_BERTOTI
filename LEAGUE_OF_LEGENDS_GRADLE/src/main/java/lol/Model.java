package lol;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Campeao> campeoes = new LinkedList<Campeao>();

	
	public void addCampeao(Campeao campeao){
		campeoes.add(campeao);
	}
	
	public Campeao buscarNome(String nome){
		for(Campeao campeao:campeoes){
			if(campeao.getNome().equals(nome)) return campeao;
		}
		
		return null;
	}
	
	
	public List<Campeao> buscarEspecificacao(Especificacao esp){
		List<Campeao> campeoesEncontrados = new LinkedList<Campeao>();
		
		for(Campeao campeao:campeoes){
			 if(esp.comparar(campeao.getEspc())) campeoesEncontrados.add(campeao);
		}
		
		return campeoesEncontrados;
		
	}
	
	
	public List<Campeao> buscarTipo(String tipo){
		List<Campeao> campeoesEncontrados = new LinkedList<Campeao>();
		for(Campeao campeao:campeoes) {
			if(campeao.getEspc().getTipo().equals(tipo)) campeoesEncontrados.add(campeao);
		}
		return campeoesEncontrados;
	}
	
	public List<Campeao> getCampeoes(){
		return campeoes;
	}
	
	public List<Campeao> buscarLane(String lane){
		
		List<Campeao> campeoesEncontrados = new LinkedList<Campeao>();
		for(Campeao campeao:campeoes) {
			if(campeao.getEspc().getLane().equals(lane)) campeoesEncontrados.add(campeao);
		}
		return campeoesEncontrados;
	}
		
	}


