package lol;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void buscarCampeao(){
		get("/campeao/:tipo/:lane/:dano", (req, res) -> {
		
			Especificacao espec = new Especificacao(req.params(":tipo"), req.params(":lane"), req.params(":dano"));	
			List<Campeao> campeoesEncontrados = model.buscarEspecificacao(espec);	
			return new Gson().toJson(campeoesEncontrados);
			
		});
	}
	
	
	public void buscarCampeaoNome(){
		get("/campeao/:nome", (req, res) -> {
		
			
			Campeao campeaoEncontrado = model.buscarNome(req.params(":nome"));	
			return new Gson().toJson(campeaoEncontrado);
			
		});
	}
	
	public void buscarCampeaoLane(){
		get("/campeao/lane/:lane", (req, res) -> {
		
			
			List<Campeao> campeaoEncontrado = model.buscarLane(req.params(":lane"));	
			return new Gson().toJson(campeaoEncontrado);
			
		});
	}
	
	public void buscarCampeaoTipo(){		
			get("/campeao/tipo/:tipo", (req, res) -> {
		
			
			List<Campeao> campeaoEncontrado = model.buscarTipo(req.params(":tipo"));	
			return new Gson().toJson(campeaoEncontrado);
			
		});
		
	}
	
	

}
