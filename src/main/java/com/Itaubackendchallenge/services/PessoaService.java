package com.Itaubackendchallenge.services;

import com.Itaubackendchallenge.dto.PessoaDTO;
import com.Itaubackendchallenge.entities.Pessoa;
import com.Itaubackendchallenge.exceptions.ApExceptionHandler;
import com.Itaubackendchallenge.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;


    public Pessoa insert(PessoaDTO pessoaDTO)    {
        Pessoa pessoa = new Pessoa();

        if(pessoa == null || pessoa.getPrimeiroNome() == null) {
            throw new NullPointerException();
        }

        pessoa.setPrimeiroNome(pessoaDTO.primeiroNome());
        pessoa.setSegundoNome(pessoaDTO.segundoNome());
        pessoa.setParticipação(pessoaDTO.participação());

        return repository.save(pessoa);
    }

}
