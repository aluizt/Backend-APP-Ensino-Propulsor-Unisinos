package br.com.unisinos.resources;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.unisinos.domain.Evento;
import br.com.unisinos.services.EventoService;


@RestController
@RequestMapping(value="/eventos")
public class EventoResources {
	
	@Autowired // injeta uma instancia da classe EventoService
	private EventoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> listar() {				
	    List<Evento> obj =  service.lista();		
		if(obj == null) {
			return ResponseEntity.notFound().build();
		}		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Evento> find(@PathVariable Integer id) {
		Evento objeto = service.localiza(id);;
		return ResponseEntity.ok().body(objeto);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<?> alterar(@Valid @RequestBody Evento obj, @PathVariable Integer id) {
		
		obj.setId(id);
		obj = service.atualiza(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> delete(@Valid @RequestBody Evento obj, @PathVariable Integer id) {		
		obj.setId(id);
		service.delete(obj);
		return ResponseEntity.ok().body("OK");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Evento objDto) {
		Evento obj = objDto;
		System.out.println("passou pele post");
		System.out.println(obj.getId());
		System.out.println(obj.getDescricao());
		System.out.println(obj.getData());
		System.out.println(obj.getIdArea());
		
		obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	
}


