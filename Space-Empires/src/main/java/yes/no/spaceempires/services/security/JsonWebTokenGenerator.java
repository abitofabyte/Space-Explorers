package yes.no.spaceempires.services.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;
import yes.no.spaceempires.services.users.UserPrincipalService;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JsonWebTokenGenerator {
    private final JwtEncoder jwtEncoder;
    private final UserPrincipalService userPrincipalService;

    public String generate(Authentication authentication) {
        var now = Instant.now();
        var user = userPrincipalService.findByEmail(authentication.getName());
        var scope = user.getAuthorities()
                        .stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "));
        var claims = JwtClaimsSet.builder()
                                 .issuer("self")
                                 .issuedAt(now)
                                 .expiresAt(now.plus(1, ChronoUnit.DAYS))
                                 .subject(user.getUser().getEmail())
                                 .claim("scope", scope)
                                 .build();
        return jwtEncoder.encode(JwtEncoderParameters.from(claims))
                         .getTokenValue();
    }
}
