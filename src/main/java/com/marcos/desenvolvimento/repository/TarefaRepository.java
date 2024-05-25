package com.marcos.desenvolvimento.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.desenvolvimento.entities.StatusTarefa;
import com.marcos.desenvolvimento.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
	Optional<Tarefa> findByStatusTarefa(StatusTarefa statusTarefa);
}