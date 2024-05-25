package com.marcos.desenvolvimento.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.desenvolvimento.entities.Recurso;

public interface RecursoRepository extends JpaRepository<Recurso, Integer> {
	Optional<Recurso> findByRecursoNome(String recursoNome);
}