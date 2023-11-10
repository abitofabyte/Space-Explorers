package yes.no.spaceempires.population;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import yes.no.spaceempires.entities.users.User;
import yes.no.spaceempires.security.Authority;
import yes.no.spaceempires.services.ships.ShipService;
import yes.no.spaceempires.services.users.UserPrincipalContext;
import yes.no.spaceempires.services.users.UserPrincipalService;
import yes.no.spaceempires.services.users.UserService;

import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class PolpulationRunner implements ApplicationRunner {

    private final UserService userService;
    private final UserPrincipalService userPrincipalService;
    private final ShipService shipService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        var users = userService.create(List.of(User.builder()
                                                   .name("yes")
                                                   .email("marcus.migotti@gmail.com")
                                                   .build(),
                                               User.builder()
                                                   .name("no")
                                                   .email("marcus.migotti@gmx.net")
                                                   .build()));

        var securityUsers = userPrincipalService.createAll(users.stream()
                                                                .map(user -> UserPrincipalContext.builder()
                                                                                                .user(user)
                                                                                                .password(user.getName() == "yes" ? "admin" : "123")
                                                                                                .authorities(Set.of(Authority.ADMIN))
                                                                                                .build())
                                                                .toList());

    }
}
