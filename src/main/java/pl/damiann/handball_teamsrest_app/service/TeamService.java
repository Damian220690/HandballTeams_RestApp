package pl.damiann.handball_teamsrest_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.damiann.handball_teamsrest_app.repository.TeamRepository;

public class TeamService {

    @Autowired
    private TeamRepository teamRepository;
}
