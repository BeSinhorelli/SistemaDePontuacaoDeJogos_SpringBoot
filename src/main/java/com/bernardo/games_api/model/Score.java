/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bernardo.games_api.model;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author berna
 */
@Entity

@IdClass(ScoreId.class)
public class Score {

    @Id
    private Long gameId;

    @Id
    private Long playerId;

    private int score;
    private Date data;

    // getters e setters

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

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
        
    }
