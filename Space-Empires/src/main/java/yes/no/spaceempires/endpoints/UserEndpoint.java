package yes.no.spaceempires.endpoints;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yes.no.spaceempires.entities.users.User;
import yes.no.spaceempires.services.users.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserEndpoint {

    private final UserService userService;

    @GetMapping
    private List<User> getAll() {
        return userService.getAll();
    }

}
