package yes.no.spaceempires.services.users;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yes.no.spaceempires.entities.users.User;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
   }

    public User getByNameContainingIgnoreCase(String name) {
        return userRepository.findByNameContainingIgnoreCase(name)
                             .orElseThrow();
    }

    public User getByEmail(String email) {
        return userRepository.findByEmail(email)
                             .orElseThrow();
    }

    @Transactional
    public User create(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public List<User> create(Iterable<User> users) {
        return userRepository.saveAll(users);
    }
}
