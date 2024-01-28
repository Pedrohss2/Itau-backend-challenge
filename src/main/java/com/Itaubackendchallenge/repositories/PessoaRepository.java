package com.Itaubackendchallenge.repositories;

import com.Itaubackendchallenge.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
