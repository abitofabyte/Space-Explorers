package yes.no.spaceempires.entities.ships;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;
import yes.no.spaceempires.entities.GameEntity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class Ship extends GameEntity {
    @ManyToOne
    private Ship owner;
}


