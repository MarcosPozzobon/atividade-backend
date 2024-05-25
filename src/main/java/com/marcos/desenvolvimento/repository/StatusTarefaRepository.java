package com.marcos.desenvolvimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.desenvolvimento.entities.StatusTarefa;

public interface StatusTarefaRepository extends JpaRepository<StatusTarefa, Integer> {}