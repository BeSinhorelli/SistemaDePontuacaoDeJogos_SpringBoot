package com.bernardo.games_api.repository;

import com.bernardo.games_api.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {
}
