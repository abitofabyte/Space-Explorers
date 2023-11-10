package yes.no.spaceempires.services.ships;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yes.no.spaceempires.entities.ships.Ship;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipService {
    private final ShipRepository shipRepository;

    public List<Ship> getAll() {
        return shipRepository.findAll();
    }

    @Transactional
    public Ship create(Ship ship) {
        return shipRepository.save(ship);
    }

    @Transactional
    public List<Ship> create(Iterable<Ship> ships) {
        return shipRepository.saveAll(ships);
    }
}
