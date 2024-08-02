package dannelysbeth.auth.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;


    ///method to implement data
    @GetMapping("/login")
    public void login(){

    }

    @GetMapping("/register")
    public void register(){

    }



}
