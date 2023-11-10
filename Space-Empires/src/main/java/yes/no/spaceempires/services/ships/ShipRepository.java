package yes.no.spaceempires.services.ships;

import org.springframework.data.jpa.repository.JpaRepository;
import yes.no.spaceempires.entities.ships.Ship;
import yes.no.spaceempires.services.BaseRepository;

import java.util.UUID;

public interface ShipRepository extends BaseRepository<Ship> {
}
