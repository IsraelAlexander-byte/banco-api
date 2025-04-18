package com.projetoapi.bancoapi.banco_api.repository;

import com.projetoapi.bancoapi.banco_api.model.ContaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Long> {
}
