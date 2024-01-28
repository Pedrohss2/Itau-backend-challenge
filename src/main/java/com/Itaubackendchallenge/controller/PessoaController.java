package com.Itaubackendchallenge.controller;

import com.Itaubackendchallenge.dto.PessoaDTO;
import com.Itaubackendchallenge.entities.Pessoa;
import com.Itaubackendchallenge.services.PessoaService;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Limit;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Pessoa>> buscaTodos() {
        return ResponseEntity.ok().body(pessoaService.buscaTodos());
    }

}

