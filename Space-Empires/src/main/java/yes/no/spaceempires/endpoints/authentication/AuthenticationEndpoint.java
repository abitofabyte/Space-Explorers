package yes.no.spaceempires.endpoints.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yes.no.spaceempires.services.security.JsonWebTokenGenerator;
import yes.no.spaceempires.services.users.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("authentication")
public class AuthenticationEndpoint {
    private final UserService userService;
    private final JsonWebTokenGenerator jsonWebTokenGenerator;

    @GetMapping()
    private AuthenticationResponse getToken(Authentication authentication) {
        var user = userService.getByEmail(authentication.getName());
        return AuthenticationResponse.builder()
                                     .name(user.getName())
                                     .email(user.getEmail())
                                     .token(jsonWebTokenGenerator.generate(authentication))
                                     .build();
    }
}
