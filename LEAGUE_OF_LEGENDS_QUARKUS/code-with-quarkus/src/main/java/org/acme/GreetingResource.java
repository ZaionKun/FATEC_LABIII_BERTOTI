package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

import java.util.List;



@Path("")
public class GreetingResource {

	
	Model model = new Model();
	

	@GET
	@Path("/org.acme")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
	
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("campeao/{tipo}/{lane}/{dano}/")
    public Response campeao2(@PathParam String campeao, @PathParam String tipo, @PathParam String lane,  @PathParam String dano) {	
		List<Campeao> campeaoEncontrados = model.buscarEspecificacao(new Especificacao(campeao, tipo, lane, dano));	
		String json = new Gson().toJson(campeaoEncontrados);
    	return Response.status(200).entity(json).build();	
    }
    
    
}
