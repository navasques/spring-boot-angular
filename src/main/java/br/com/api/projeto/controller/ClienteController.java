package br.com.api.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public String teste() {
        return "Hello World!";
    }
}
