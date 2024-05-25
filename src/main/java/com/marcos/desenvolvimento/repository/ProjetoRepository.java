package com.marcos.desenvolvimento.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.desenvolvimento.entities.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
	Optional<Projeto> findByProjetoDescricao(String projetoDescricao);
}