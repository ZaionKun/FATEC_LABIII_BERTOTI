package lol;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 1233;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarCampeao();

		Controller controller = new Controller(model);
		
		controller.buscarCampeao();
		controller.buscarCampeaoNome();
		controller.buscarCampeaoLane();
		controller.buscarCampeaoTipo();
		
    }
    
    public static void inicializarCampeao(){
    	model.addCampeao(new Campeao("Zed", new Especificacao("Assassino", "Mid", "Fisico")));
    	model.addCampeao(new Campeao("Talon", new Especificacao("Assassino", "Mid", "Fisico")));
    	
    	model.addCampeao(new Campeao("Ryze", new Especificacao("Mago", "Mid", "Magico")));
    	model.addCampeao(new Campeao("Kassadin", new Especificacao("Mago", "Mid", "Magico")));
    	
    	model.addCampeao(new Campeao("Sett", new Especificacao("Lutador", "Top ou Jungle", "Fisico")));
    	model.addCampeao(new Campeao("Master Yi", new Especificacao("Lutador", "Top ou Jungle", "Fisico")));
    	
    	model.addCampeao(new Campeao("Caitlyn", new Especificacao("Atirador", "Bot", "Fisico")));
    	model.addCampeao(new Campeao("Tristana", new Especificacao("Atirador", "Bot", "Fisico")));
    	
    	model.addCampeao(new Campeao("Lux", new Especificacao("Suporte", "Bot", "Magico")));
    	model.addCampeao(new Campeao("Lulu", new Especificacao("Suporte", "Bot", "Magico")));
    	
    	model.addCampeao(new Campeao("Urgot", new Especificacao("Tanque", "Top", "Fisico")));
    	model.addCampeao(new Campeao("Ornn", new Especificacao("Tanque", "Top", "Fisico")));
   
    }
}
