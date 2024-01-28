package com.Itaubackendchallenge.entities;

import jakarta.persistence.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String primeiroNome;
    private String segundoNome;
    private BigDecimal participação;


    public Pessoa() {
        super();
    }
    public Pessoa(String primeiroNome, String segundoNome, BigDecimal participação) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.participação = participação;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public BigDecimal getParticipação() {
        return participação;
    }

    public void setParticipação(BigDecimal participação) {
        this.participação = participação;
    }


}
