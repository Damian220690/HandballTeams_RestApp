package pl.damiann.handball_teamsrest_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.damiann.handball_teamsrest_app.model.Player;
import pl.damiann.handball_teamsrest_app.service.PlayerService;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public List<Player> showTeamPlayers(){
        return playerService.showTeamPlayers(1L);
    }

}
