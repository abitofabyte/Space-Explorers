package yes.no.spaceempires.services.users;

import lombok.Builder;
import yes.no.spaceempires.entities.users.User;
import yes.no.spaceempires.security.Authority;

import java.util.Set;

@Builder
public record UserPrincipalContext(User user, String password, Set<Authority> authorities) {
}
