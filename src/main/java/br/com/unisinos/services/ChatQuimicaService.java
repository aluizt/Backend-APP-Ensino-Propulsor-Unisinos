package br.com.unisinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisinos.domain.ChatQuimica;
import br.com.unisinos.repository.ChatQuimicaRepository;

@Service
public class ChatQuimicaService {
	
	@Autowired
	private ChatQuimicaRepository repo;
	
	public void save(ChatQuimica obj) {
		System.out.println("ChatFisicaService "+obj);
		repo.save(obj);
	}

	public List<ChatQuimica> findAll(){
		return repo.findAll();
		
	}
}
