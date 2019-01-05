package br.com.unisinos.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import br.com.unisinos.domain.Monitoria;
import br.com.unisinos.services.MonitoriaService;

@RestController
@RequestMapping(value="/monitorias")
public class MonitoriaResources {
	
	@Autowired // injeta uma instancia da classe AreasService
	private MonitoriaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> listar() {		
		
		List<Monitoria> obj =  service.lista();
		
		if(obj == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Monitoria> find(@PathVariable Integer id) {
		Monitoria objeto = service.localiza(id);;
		return ResponseEntity.ok().body(objeto);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<?> update(@Valid @RequestBody Monitoria obj, @PathVariable Integer id) {
		System.out.println("chamou o metodo" );
		System.out.println(obj.getId());
		System.out.println(obj.getSegunda1());
		System.out.println(obj.getSabado1());
		
		obj.setId(id);
		obj = service.atualiza(obj);
		return ResponseEntity.ok().body(obj);
	}
	

}