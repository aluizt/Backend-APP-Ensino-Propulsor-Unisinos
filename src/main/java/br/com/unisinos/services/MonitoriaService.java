package br.com.unisinos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisinos.domain.Monitoria;
import br.com.unisinos.repository.MonitoriaRespository;


@Service
public class MonitoriaService {

	@Autowired  // injeta uma instancia da classe responsaval pelo jpa repository
	private MonitoriaRespository repo;
	
	public List<Monitoria> lista() {		
		List <Monitoria> obj = repo.findAll();		
		return obj;		
	}
	
	public Monitoria atualiza(Monitoria obj) {
		Monitoria newObj =localiza(obj.getId());
		updateData(newObj,obj);
		return repo.save(newObj);		
	}	

	private void updateData(Monitoria newObj, Monitoria obj) {
		newObj.setSegunda1(obj.getSegunda1());
		newObj.setTerca1(obj.getTerca1());
		newObj.setQuarta1(obj.getQuarta1());
		newObj.setQuinta1(obj.getQuinta1());
		newObj.setSexta1(obj.getSexta1());
		newObj.setSabado1(obj.getSabado1());
		newObj.setSegunda2(obj.getSegunda2());
		newObj.setTerca2(obj.getTerca2());
		newObj.setQuarta2(obj.getQuarta2());
		newObj.setQuinta2(obj.getQuinta2());
		newObj.setSexta2(obj.getSexta2());
		newObj.setSabado2(obj.getSabado2());
		newObj.setSegunda3(obj.getSegunda3());
		newObj.setTerca3(obj.getTerca3());
		newObj.setQuarta3(obj.getQuarta3());
		newObj.setQuinta3(obj.getQuinta3());
		newObj.setSexta3(obj.getSexta3());
		newObj.setSabado3(obj.getSabado3());
		newObj.setSegunda4(obj.getSegunda4());
		newObj.setTerca4(obj.getTerca4());
		newObj.setQuarta4(obj.getQuarta4());
		newObj.setQuinta4(obj.getQuinta4());
		newObj.setSexta4(obj.getSexta4());
		newObj.setSabado4(obj.getSabado4());
		newObj.setInicio(obj.getInicio());
	}
	public Monitoria localiza(Integer id) {
		Optional<Monitoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Monitoria.class.getName()));
	}
	

}
