package br.com.unisinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unisinos.domain.Evento;

public interface EventoRepository extends JpaRepository<Evento,Integer> {

}
