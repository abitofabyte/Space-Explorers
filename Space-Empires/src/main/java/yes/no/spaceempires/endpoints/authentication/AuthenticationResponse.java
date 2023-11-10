package yes.no.spaceempires.endpoints.authentication;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public final class AuthenticationResponse {
    private final String name;
    private final String email;
    private final String token;
}