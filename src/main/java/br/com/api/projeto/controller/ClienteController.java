package br.com.api.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
=======
>>>>>>> bd44433054e561231d15e572526e6731da76849f
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.projeto.model.Cliente;
import br.com.api.projeto.repository.ClienteRepository;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c) {
        return acao.save(c);
    }

    @GetMapping("/")
    public Iterable<Cliente> listar() {
        return acao.findAll();
    }
}
