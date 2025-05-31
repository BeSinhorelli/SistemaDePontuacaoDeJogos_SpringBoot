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
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_score, score;
    @Temporal(TemporalType.DATE)
    private Date data;
    @ManyToOne
    @JoinColumn(name = "id_player")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "id_game")
    private Jogo jogo;

    public int getId_score() {
        return id_score;
    }

    public void setId_score(int id_score) {
        this.id_score = id_score;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    
}
