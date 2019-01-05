package br.com.unisinos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.unisinos.domain.Areas;
import br.com.unisinos.repository.AreasRepository;


@Service
public class AreasService {

	@Autowired  // injeta uma instancia da classe responsaval pelo jpa repository
	private AreasRepository repo;
	
	public List<Areas> lista() {
		
		List <Areas> obj = repo.findAll();
		
		return obj;
		
	}
	
	public Areas localiza(Integer id) {
		Optional<Areas> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Areas.class.getName()));
	}
}
