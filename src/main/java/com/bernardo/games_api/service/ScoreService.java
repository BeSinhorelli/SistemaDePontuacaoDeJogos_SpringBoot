package com.bernardo.games_api.service;

import com.bernardo.games_api.model.Score;
import com.bernardo.games_api.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public Score salvar(Score score) {
        return scoreRepository.save(score);
    }

    public List<Score> listarTodos() {
        return scoreRepository.findAll();
    }

    public Optional<Score> buscarPorId(int id) {
        return scoreRepository.findById(id);
    }

public Score atualizar(int id, Score scoreAtualizado) {
    return scoreRepository.findById(id).map(score -> {
        score.setScore(scoreAtualizado.getScore());
        score.setData(scoreAtualizado.getData());
        return scoreRepository.save(score);
    }).orElse(null);
}


    public void deletar(int id) {
        scoreRepository.deleteById(id);
    }

}
