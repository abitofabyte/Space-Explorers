package yes.no.spaceempires.entities;

import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
