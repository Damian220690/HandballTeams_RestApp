package pl.damiann.handball_teamsrest_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.damiann.handball_teamsrest_app.model.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
