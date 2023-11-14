package yes.no.spaceempires.entities.ships;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import yes.no.spaceempires.entities.GameEntity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class Thruster extends GameEntity {
    protected Double baseVelocity;
}

