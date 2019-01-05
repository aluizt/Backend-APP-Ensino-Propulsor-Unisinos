package br.com.unisinos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unisinos.domain.Areas;
import br.com.unisinos.services.AreasService;


@RestController
@RequestMapping(value="/areas")
public class AreasResources {
	private int contador =0;
	
	@Autowired // injeta uma instancia da classe AreasService
	private AreasService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> listar() {		
		
		contador++;
		
	    List<Areas> obj =  service.lista();
		
		if(obj == null) {
			
			return ResponseEntity.notFound().build();
		}
		System.out.println("entrou em AreasResources "+contador+" vezes");
		return ResponseEntity.ok().body(obj);
		
	}

}
