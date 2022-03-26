package todolistspring.app.Service;

import java.time.LocalDate;

import java.util.List;

import org.springframework.stereotype.Service;
import todolistspring.app.Model.User;

@Service
public class UserService {
    public List<User>getUsers(){
        
        return List.of(new User(
            1,
            "Jaron",
            "Geheim",
            LocalDate.now()
        ));
    }
}
