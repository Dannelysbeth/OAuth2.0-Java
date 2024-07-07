package dannelysbeth.auth.service.implementation;

import dannelysbeth.auth.repository.UserRepository;
import dannelysbeth.auth.service.declaration.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

}
