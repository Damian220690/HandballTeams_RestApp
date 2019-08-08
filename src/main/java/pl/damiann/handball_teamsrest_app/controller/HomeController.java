package pl.damiann.handball_teamsrest_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.damiann.handball_teamsrest_app.model.Player;
import pl.damiann.handball_teamsrest_app.service.PlayerService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public List<Player> showTeamPlayers(){
        return playerService.showTeamPlayers(1L);
    }

    @GetMapping("/players/{number}")
    public Player getPlayerByNumber(@PathVariable int number, HttpServletResponse response) {
        Player player = playerService.getPlayerByNumber(number);
        return player;
    }

}
