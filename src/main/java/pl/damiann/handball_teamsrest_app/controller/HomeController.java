package pl.damiann.handball_teamsrest_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/players/{number}")
    public Player getPlayerByNumber(@PathVariable int number) {
        Player player = playerService.getPlayerByNumber(number);
        return player;
    }

    @PostMapping("/players")
    public void addPlayer(@RequestBody Player player){
        int number = player.getNumber();
        Player playerByNumber = playerService.getPlayerByNumber(number);
        if(playerByNumber==null) {
            playerService.addPlayer(player);
        }
    }

    @PutMapping("/players/{number}")
    public void modifyPlayer(@PathVariable int number, @RequestBody Player player){
        Player playerBeforeModification = playerService.getPlayerByNumber(number);
        playerBeforeModification.setFirstName(player.getFirstName());
        playerBeforeModification.setLastName(player.getLastName());
        playerBeforeModification.setAge(player.getAge());
        playerBeforeModification.setPosition(player.getPosition());

        playerService.addPlayer(player);
    }

    @DeleteMapping("/players/{number}")
    public void removePlayer(@PathVariable int number){
        playerService.removePlayer(number);
    }

}
