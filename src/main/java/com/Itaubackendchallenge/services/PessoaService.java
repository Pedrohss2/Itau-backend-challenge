package com.Itaubackendchallenge.services;

import com.Itaubackendchallenge.dto.PessoaDTO;
import com.Itaubackendchallenge.entities.Pessoa;
import com.Itaubackendchallenge.exceptions.ApExceptionHandler;
import com.Itaubackendchallenge.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Transactional
    public Pessoa insert(PessoaDTO pessoaDTO)    {

        Pessoa pessoa = new Pessoa();

        if(pessoaDTO == null || pessoaDTO.primeiroNome() == null) {
            throw new NullPointerException();
        }

        pessoa.setPrimeiroNome(pessoaDTO.primeiroNome());
        pessoa.setSegundoNome(pessoaDTO.segundoNome());
        pessoa.setParticipação(pessoaDTO.participação());

        return repository.save(pessoa);
    }


    @Transactional(readOnly = true)
    public List<Pessoa> buscaTodos() {
        return repository.findAll();
    }




}
