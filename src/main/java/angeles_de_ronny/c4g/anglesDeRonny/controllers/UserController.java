package angeles_de_ronny.c4g.anglesDeRonny.controllers;

import angeles_de_ronny.c4g.anglesDeRonny.services.UserService;
import angeles_de_ronny.c4g.anglesDeRonny.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(@Qualifier("userService") UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/user/new")
    public User newUser(@RequestBody @Valid User aUser){
        return userService.create(aUser);
    }

}
