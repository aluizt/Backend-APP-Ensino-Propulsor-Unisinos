package br.com.unisinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisinos.domain.ChatEstatistica;
import br.com.unisinos.repository.ChatEstatisticaRepository;


@Service
public class ChatEstatisticaService {
	
	@Autowired
	private ChatEstatisticaRepository repo;
	
	public void save(ChatEstatistica obj) {
		System.out.println("ChatEstatisticaService "+obj);
		repo.save(obj);
	}

	public List<ChatEstatistica> findAll(){
		return repo.findAll();
		
	}
}
