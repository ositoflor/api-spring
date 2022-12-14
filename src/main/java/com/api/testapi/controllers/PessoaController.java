package com.api.testapi.controllers;

import com.api.testapi.pessoa.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PessoaController {

    @GetMapping("/{name}")
    public  String index(@PathVariable(value = "name") String name) {
        Pessoa pessoa = new Pessoa();
        pessoa.name = name;
        return pessoa.comprimentar();
    }
}
