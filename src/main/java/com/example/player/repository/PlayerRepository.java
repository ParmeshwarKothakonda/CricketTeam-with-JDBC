package com.example.player.repository;


import com.example.player.model.Player;
import java.util.*;
public interface PlayerRepository{
    //Add all the methods here!
    ArrayList<Player> getPlayers(); //get for All

    Player getPlayerById(int playerId); //get for specific player

    Player addPlayer(Player player); // add a player details

    Player updatePlayer(int playerId, Player player); // update a player details

    void deletePlayer(int playerId); //delete a player details

}