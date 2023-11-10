package yes.no.spaceempires.services.mapper;

public interface Mapper<TMappable, TTarget> {
    TTarget map(TMappable object);
}
