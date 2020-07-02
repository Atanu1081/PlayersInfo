package com.espninfo.controller;


import com.espninfo.exception.PlayerInfoNotFoundException;
import com.espninfo.model.PlayersInfo;
import com.espninfo.service.PlayersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayersInfoController {

    @Autowired
    private PlayersInfoService service;

    @GetMapping(path = "/getAll")
    public ResponseEntity<Object> getAllPlayersInfo () {
        List<PlayersInfo> players = service.findAll();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @GetMapping(path = "/getByName/{name}")
    public ResponseEntity<Object> getPlayerByName (@PathVariable String name) {
        PlayersInfo player = service.findByName(name);
        if (player == null)
            throw new PlayerInfoNotFoundException("No info found for " + name);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

}
