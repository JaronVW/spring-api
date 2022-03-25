package todolistspring.app.User;

import java.time.LocalDate;

import java.util.List;

import org.springframework.stereotype.Service;

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
