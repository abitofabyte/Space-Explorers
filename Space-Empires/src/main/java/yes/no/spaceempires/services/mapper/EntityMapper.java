package yes.no.spaceempires.services.mapper;

import org.springframework.stereotype.Service;

@Service
public class EntityMapper {
    <TEntity, TTarget> TTarget map(TEntity entity, Mapper<TEntity, TTarget> mapper) {
        return mapper.map(entity);
    }
}
