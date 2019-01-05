package br.com.unisinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisinos.domain.ChatFisica;
import br.com.unisinos.repository.ChatFisicaRepository;

@Service
public class ChatFisicaService {
	
	@Autowired
	private ChatFisicaRepository repo;
	
	public void save(ChatFisica obj) {
		System.out.println("ChatFisicaService "+obj);
		repo.save(obj);
	}

	public List<ChatFisica> findAll(){
		return repo.findAll();
		
	}
}
