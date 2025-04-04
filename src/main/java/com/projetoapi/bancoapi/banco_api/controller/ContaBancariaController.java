package com.projetoapi.bancoapi.banco_api.controller;

import com.projetoapi.bancoapi.banco_api.model.ContaBancaria;
import com.projetoapi.bancoapi.banco_api.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contas")
public class ContaBancariaController {

    @Autowired
    private ContaBancariaService service;

    @GetMapping
    public List<ContaBancaria> listarContas() {
        return service.listarTodas();
    }

    @PostMapping
    public ContaBancaria criarConta(@RequestBody ContaBancaria conta) {
        return service.salvar(conta);
    }

    @GetMapping("/{id}")
    public Optional<ContaBancaria> buscarConta(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarConta(@PathVariable Long id) {
        service.deletar(id);
    }
}
