package yes.no.spaceempires.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;


@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GameEntity extends BaseEntity {
    @Lob
    protected String description;

    protected Integer currentLevel;

    protected Long basePrice;

    protected Long baseEnergyRequired;
}
