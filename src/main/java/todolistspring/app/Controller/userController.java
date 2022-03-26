package todolistspring.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todolistspring.app.Model.User;
import todolistspring.app.Service.UserService;

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
