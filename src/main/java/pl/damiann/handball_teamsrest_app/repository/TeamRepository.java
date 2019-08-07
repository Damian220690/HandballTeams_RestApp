package pl.damiann.handball_teamsrest_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.damiann.handball_teamsrest_app.model.Player;
import pl.damiann.handball_teamsrest_app.model.Team;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
