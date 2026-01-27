package com.controller;

import com.entity.Players;
import com.service.IPLService;

import java.util.List;

public class IPLController {

    IPLService service = null;
    public IPLController(){
        service = new IPLService();
    }
    public List<Players> getAllPlayers() {
        List<Players> playersList = service.getAllPlayers();
        return playersList;
    }
}
