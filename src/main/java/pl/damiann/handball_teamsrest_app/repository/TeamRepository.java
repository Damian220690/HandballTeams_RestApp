package pl.damiann.handball_teamsrest_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.damiann.handball_teamsrest_app.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
