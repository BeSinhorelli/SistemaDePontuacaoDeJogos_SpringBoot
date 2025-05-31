package com.bernardo.games_api.repository;

import com.bernardo.games_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
