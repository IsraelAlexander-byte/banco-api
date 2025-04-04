package com.projetoapi.bancoapi.banco_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contas_bancarias") // Isso é opcional, mas bom pra manter o nome da tabela explícito
public class ContaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titular;
    private Double saldo;

    public ContaBancaria() {}

    public ContaBancaria(Long id, String titular, Double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
