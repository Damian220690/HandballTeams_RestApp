package pl.damiann.handball_teamsrest_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.damiann.handball_teamsrest_app.model.Player;
import pl.damiann.handball_teamsrest_app.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> showTeamPlayers(long teamNumber){
        return playerRepository.findAllByTeamId(teamNumber);
    }
}
