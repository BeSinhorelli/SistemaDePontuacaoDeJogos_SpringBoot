package com.bernardo.games_api.controller;

import com.bernardo.games_api.model.Jogo;
import com.bernardo.games_api.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @PostMapping
    public Jogo salvar(@RequestBody Jogo jogo) {
        return jogoService.salvar(jogo);
    }

    @GetMapping
    public List<Jogo> listarTodos() {
        return jogoService.listarTodos();
    }

    @GetMapping("/{codigo}")
    public Jogo buscarPorId(@PathVariable int codigo) {
        return jogoService.buscarPorId(codigo).orElse(null);
    }

    @PutMapping("/{codigo}")
    public Jogo atualizar(@PathVariable int codigo, @RequestBody Jogo jogo) {
        return jogoService.atualizar(codigo, jogo);
    }

    @DeleteMapping("/{codigo}")
    public void deletar(@PathVariable int codigo) {
        jogoService.deletar(codigo);
    }
}
