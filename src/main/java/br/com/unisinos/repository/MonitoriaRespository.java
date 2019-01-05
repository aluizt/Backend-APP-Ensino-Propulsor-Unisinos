package br.com.unisinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unisinos.domain.Monitoria;

public interface MonitoriaRespository extends JpaRepository<Monitoria,Integer> {

}