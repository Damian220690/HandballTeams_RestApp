package pl.damiann.handball_teamsrest_app.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Player> teamPlayers;

    public Team() {
    }

    public Team(String name, List<Player> teamPlayers) {
        this.name = name;
        this.teamPlayers = teamPlayers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(List<Player> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }
}
