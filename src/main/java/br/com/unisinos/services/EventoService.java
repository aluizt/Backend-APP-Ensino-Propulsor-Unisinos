package br.com.unisinos.services;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisinos.domain.Areas;
import br.com.unisinos.domain.Evento;
import br.com.unisinos.repository.EventoRepository;


@Service
public class EventoService {
	
	@Autowired  // injeta uma instancia da classe responsaval pelo jpa repository
	private EventoRepository repo;	
	
	@Autowired
	private AreasService areasService;
	
	public List<Evento> lista() {		
		List <Evento> obj = repo.findAll();		
		return obj;		
	}
	
	@Transactional
	public Evento insert(Evento obj) {
		System.out.println("chegou no insert");
		Areas area = areasService.localiza(obj.getIdArea());
        System.out.println("localizou a area "+area.getNome());			
		obj.getAreas().addAll(Arrays.asList(area));
		obj.setId(null);		
	
		return  repo.save(obj);
	}
	
	public Evento atualiza(Evento obj) {
		Evento newObj =localiza(obj.getId());
		updateData(newObj,obj);
		return repo.save(newObj);		
	}	
	
	public void delete(Evento obj) {
		Evento newObj =localiza(obj.getId());
		
		 repo.delete(newObj); 
			
	    
	}

	private void updateData(Evento newObj,Evento obj) {
		
		newObj.setDescricao(obj.getDescricao());
		newObj.setData(obj.getData());		
	}
	
	public Evento localiza(Integer id) {
		Optional<Evento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Evento.class.getName()));
	}
	public Evento fromDTO(Evento objDto) {
		return new Evento(objDto.getId(), objDto.getDescricao(),objDto.getData(),objDto.getIdArea());
	}
}
