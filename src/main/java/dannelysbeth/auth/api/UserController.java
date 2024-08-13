package dannelysbeth.auth.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/")
    public String home() {
        return "Hello world";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello world secured";
    }


}
