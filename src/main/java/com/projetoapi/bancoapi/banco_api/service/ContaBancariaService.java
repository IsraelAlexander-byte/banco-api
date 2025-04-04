package com.projetoapi.bancoapi.banco_api.service;

import com.projetoapi.bancoapi.banco_api.model.ContaBancaria;
import com.projetoapi.bancoapi.banco_api.repository.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository repository;

    public List<ContaBancaria> listarTodas() {
        return repository.findAll();
    }

    public ContaBancaria salvar(ContaBancaria conta) {
        return repository.save(conta);
    }

    public Optional<ContaBancaria> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
