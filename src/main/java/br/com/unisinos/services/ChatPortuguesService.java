package br.com.unisinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.unisinos.domain.ChatPortugues;
import br.com.unisinos.repository.ChatPortuguesRepository;

@Service
public class ChatPortuguesService {
	
	@Autowired
	private ChatPortuguesRepository repo;
	
	public void save(ChatPortugues obj) {
		System.out.println("ChatPortuguesService "+obj);
		repo.save(obj);
	}

	public List<ChatPortugues> findAll(){
		return repo.findAll();
		
	}
}
