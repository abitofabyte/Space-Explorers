package yes.no.spaceempires.entities.ships;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;
import yes.no.spaceempires.entities.GameEntity;
import yes.no.spaceempires.entities.users.User;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class Ship extends GameEntity {
    @ManyToOne
    private User owner;
}


