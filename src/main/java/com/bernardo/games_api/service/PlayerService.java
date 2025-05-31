package com.bernardo.games_api.service;

import com.bernardo.games_api.model.Player;
import com.bernardo.games_api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player salvar(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> listarTodos() {
        return playerRepository.findAll();
    }

    public Optional<Player> buscarPorId(int id) {
        return playerRepository.findById(id);
    }

    public Player atualizar(int id, Player playerAtualizado) {
        return playerRepository.findById(id).map(player -> {
            player.setEmail(playerAtualizado.getEmail());
            player.setNickname(playerAtualizado.getNickname());
            player.setPlataforma(playerAtualizado.getPlataforma());
            return playerRepository.save(player);
        }).orElse(null);
    }

    public void deletar(int id) {
        playerRepository.deleteById(id);
    }
}
