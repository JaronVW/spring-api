package todolistspring.app.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/get")
public class userController {
    private final UserService userService;

    @Autowired
    public userController(UserService userService) {
        this.userService =  userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
    

}
