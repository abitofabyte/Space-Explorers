package yes.no.spaceempires.entities.buildings;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import yes.no.spaceempires.entities.GameEntity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
public class Building extends GameEntity {
}
