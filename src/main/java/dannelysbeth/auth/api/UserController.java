package dannelysbeth.auth.api;

import dannelysbeth.auth.service.declaration.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


}
