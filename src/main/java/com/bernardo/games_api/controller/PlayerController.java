package com.bernardo.games_api.controller;

import com.bernardo.games_api.model.Player;
import com.bernardo.games_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    public Player salvar(@RequestBody Player player) {
        return playerService.salvar(player);
    }

    @GetMapping
    public List<Player> listarTodos() {
        return playerService.listarTodos();
    }

    @GetMapping("/{id}")
    public Player buscarPorId(@PathVariable int id) {
        return playerService.buscarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Player atualizar(@PathVariable int id, @RequestBody Player player) {
        return playerService.atualizar(id, player);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        playerService.deletar(id);
    }
}
