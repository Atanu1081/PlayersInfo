package com.espninfo.service;

import com.espninfo.model.PlayersInfo;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PlayersInfoService {

    private static List<PlayersInfo> players = new LinkedList<>();

    static  {
        PlayersInfo messi = new PlayersInfo(33, "Lionel", "Messi",
                                        "Rosario", "Argentina", "06/24/1987", "Singing");
        players.add(messi);

        PlayersInfo ronaldo = new PlayersInfo(35, "Christiano", "Ronaldo",
                "Sao Padro", "Portugal", "02/25/1985", "Dancing");
        players.add(ronaldo);

    }

    public List<PlayersInfo> findAll() {
        return players;
    }

    public PlayersInfo findByName(String name) {
        for (PlayersInfo player : players) {
            if (player.getLastName().equalsIgnoreCase(name))
                return player;
        }
        return null;
    }
}
