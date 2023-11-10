package yes.no.spaceempires.services.users;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import yes.no.spaceempires.entities.users.UserPrincipal;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserPrincipalService {
    private final PasswordEncoder passwordEncoder;
    private final UserPrincipalRepository securityUserRepository;

    public UserPrincipal findByEmail(String email) {
        return securityUserRepository.findByUserEmail(email)
                                     .orElseThrow();
    }

    private UserPrincipal fromContext(UserPrincipalContext context) {
        return UserPrincipal.builder()
                            .user(context.user())
                            .authorities(context.authorities())
                            .password(passwordEncoder.encode(context.password()))
                            .build();
    }

    public UserPrincipal create(UserPrincipalContext context) {
        var securityUser = fromContext(context);
        return securityUserRepository.save(securityUser);
    }

    public List<UserPrincipal> createAll(List<UserPrincipalContext> contexts) {
        var securityUsers = contexts.stream()
                                    .map(this::fromContext)
                                    .toList();
        return securityUserRepository.saveAll(securityUsers);
    }
}
