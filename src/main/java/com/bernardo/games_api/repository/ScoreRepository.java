package com.bernardo.games_api.repository;

import com.bernardo.games_api.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
