package com.unicesumar.ProjetoCrud.repository;

import com.unicesumar.ProjetoCrud.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}