package com.bernardo.games_api.model;

import java.io.Serializable;
import java.util.Objects;

public class ScoreId implements Serializable {

    private Long gameId;
    private Long playerId;

    public ScoreId() {}

    public ScoreId(Long gameId, Long playerId) {
        this.gameId = gameId;
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScoreId)) return false;
        ScoreId that = (ScoreId) o;
        return Objects.equals(gameId, that.gameId) &&
               Objects.equals(playerId, that.playerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, playerId);
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

 
}
