package br.com.unisinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unisinos.domain.Areas;

public interface AreasRepository extends JpaRepository<Areas,Integer> {

}
