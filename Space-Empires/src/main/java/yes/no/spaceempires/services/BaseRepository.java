package yes.no.spaceempires.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import yes.no.spaceempires.entities.BaseEntity;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, UUID> {
    Optional<T> findByName(String name);
    Optional<T> findByNameContainingIgnoreCase(String name);
}
