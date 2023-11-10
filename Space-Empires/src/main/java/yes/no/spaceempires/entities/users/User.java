package yes.no.spaceempires.entities.users;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import yes.no.spaceempires.entities.BaseEntity;
import yes.no.spaceempires.entities.GameEntity;
import yes.no.spaceempires.entities.ships.Ship;
import yes.no.spaceempires.security.Authority;

import java.util.Set;
import java.util.UUID;

@Table(name="USERS")
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class User extends BaseEntity {
    private String email;
}


