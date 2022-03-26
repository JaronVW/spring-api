package todolistspring.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todolistspring.app.Models.User;
import todolistspring.app.Services.UserService;

@RestController
@RequestMapping("/user")
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

    @PostMapping
    public void registerNewUse(@RequestBody User user){
        userService.addNewUser(user);
    }
    

}
