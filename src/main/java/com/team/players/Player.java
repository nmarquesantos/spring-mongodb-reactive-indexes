package com.team.players;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Player {

    @Id
    private String id;

    private String playerName;

    @Indexed(unique = true)
    private String nickname;


    public Player(String playerName, String nickname) {
        this.id = UUID.randomUUID().toString();
        this.playerName = playerName;
        this.nickname = nickname;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
