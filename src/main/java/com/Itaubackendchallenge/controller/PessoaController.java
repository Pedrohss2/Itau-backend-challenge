package com.Itaubackendchallenge.controller;

import com.Itaubackendchallenge.dto.PessoaDTO;
import com.Itaubackendchallenge.entities.Pessoa;
import com.Itaubackendchallenge.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;


    @PostMapping
    public ResponseEntity<Pessoa> insert(@RequestBody PessoaDTO pessoaDTO) {
        Pessoa pessoa = pessoaService.insert(pessoaDTO);
        return ResponseEntity.ok().body(pessoa);
    }
}

