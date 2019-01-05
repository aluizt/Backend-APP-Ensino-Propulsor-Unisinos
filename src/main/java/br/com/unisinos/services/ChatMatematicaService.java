package br.com.unisinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisinos.domain.ChatMatematica;
import br.com.unisinos.repository.ChatMatematicaRepository;

@Service
public class ChatMatematicaService {
	
	@Autowired
	private ChatMatematicaRepository repo;
	
	public void save(ChatMatematica obj) {
		System.out.println("ChatMatematicaService "+obj);
		repo.save(obj);
	}

	public List<ChatMatematica> findAll(){
		return repo.findAll();
		
	}
}
