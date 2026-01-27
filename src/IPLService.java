package com.service;

import com.IPLDao.PlayerDao;
import com.entity.Players;

import java.util.List;

public class IPLService {
    PlayerDao playerDao = null;
    public IPLService(){
        playerDao = new PlayerDao();
    }
    public List<Players> getAllPlayers() {
        List<Players> playersList = playerDao.getAllPlayers();
        return playersList;
    }
}
