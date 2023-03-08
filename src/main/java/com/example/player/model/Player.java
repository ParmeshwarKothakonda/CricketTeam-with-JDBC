package com.example.player.model;


public class Player{
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role){
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getPlayerId(){ //getter playerId
        return this.playerId;
    }

    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public String getPlayerName(){ //getter playerName
        return this.playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public int getJerseyNumber(){ //getter jerseyNumber
        return this.jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole(){ //getter role
        return this.role;
    }

    public void setRole(String role){
        this.role = role;
    }

}