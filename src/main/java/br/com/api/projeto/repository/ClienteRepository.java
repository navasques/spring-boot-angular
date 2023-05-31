package br.com.api.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.projeto.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
