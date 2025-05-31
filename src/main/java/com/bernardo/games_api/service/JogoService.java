package com.bernardo.games_api.service;

import com.bernardo.games_api.model.Jogo;
import com.bernardo.games_api.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public Jogo salvar(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    public List<Jogo> listarTodos() {
        return jogoRepository.findAll();
    }

    public Optional<Jogo> buscarPorId(int codigo) {
        return jogoRepository.findById(codigo);
    }

    public Jogo atualizar(int codigo, Jogo jogoAtualizado) {
        return jogoRepository.findById(codigo).map(jogo -> {
            jogo.setNome(jogoAtualizado.getNome());
            jogo.setTipo(jogoAtualizado.getTipo());
            return jogoRepository.save(jogo);
        }).orElse(null);
    }

    public void deletar(int codigo) {
        jogoRepository.deleteById(codigo);
    }
}
