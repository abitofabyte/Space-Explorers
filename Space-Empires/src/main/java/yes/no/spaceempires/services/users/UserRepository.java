package yes.no.spaceempires.services.users;

import org.springframework.data.jpa.repository.JpaRepository;
import yes.no.spaceempires.entities.users.User;
import yes.no.spaceempires.services.BaseRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends BaseRepository<User> {
    Optional<User> findByEmail(String email);
}
