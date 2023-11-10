package yes.no.spaceempires.services.users;

import org.springframework.data.jpa.repository.JpaRepository;
import yes.no.spaceempires.entities.users.UserPrincipal;

import java.util.Optional;
import java.util.UUID;

public interface UserPrincipalRepository extends JpaRepository<UserPrincipal, UUID> {
    Optional<UserPrincipal> findByUserEmail(String email);
}
